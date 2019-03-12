package com.leyou.item.cotroller;

import com.leyou.common.enums.LyExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.service.SpecificationService;
import com.leyou.pojo.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    /**
     * 查询指定分类的规格数据
     *
     * @param categoryId 分类ID
     * @return Specification
     */
    @GetMapping("/{categoryId}")
    public ResponseEntity<String> querySpecificationByCategoryId(@PathVariable("categoryId") Long categoryId) {
        if (categoryId == null) {
            throw new LyException(LyExceptionEnum.PARAM_CANNOT_BE_NULL);
        }
        // 查询规格
        Specification specification = specificationService.queryById(categoryId);
        if (specification == null) {
            throw new LyException(LyExceptionEnum.SPU_NOT_FOUND);
        }
        // 返回存储的规格JSON字符串
        return ResponseEntity.ok(specification.getSpecifications());
    }

    /**
     * 新增规格
     *
     * @param specification 规格
     * @return Specification
     */
    @PostMapping
    public ResponseEntity<Specification> addSpecification(@RequestBody Specification specification) {
        if (specification == null || specification.getCategoryId() == null) {
            throw new LyException(LyExceptionEnum.PARAM_INVALID);
        }
        // 新增
        return ResponseEntity.status(HttpStatus.CREATED).body(specificationService.addSpecification(specification));
    }

    /**
     * 更新规格
     *
     * @param specification 规格
     * @return Specification
     */
    @PutMapping
    public ResponseEntity<Specification> saveSpecification(@RequestBody Specification specification) {
        if (specification == null || specification.getCategoryId() == null) {
            throw new LyException(LyExceptionEnum.PARAM_INVALID);
        }
        // 新增
        return ResponseEntity.ok(specificationService.saveSpecification(specification));
    }

}
