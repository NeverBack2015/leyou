# Leyou

## 项目介绍

- 乐优商城是一个全品类的电商购物网站（`B2C`）。
- 用户可以在线购买商品、加入购物车、下单、秒杀商品
- 可以评论已购买商品
- 管理员可以在后台管理商品的上下架、促销活动
- 管理员可以监控商品销售状况
- 客服可以在后台处理退款操作

> 某培训机构JAVAEE科目中的实战项目之一

## 系统架构

![](https://imxushuai-01.coding.net/p/pic/d/pic/git/raw/master/1525703759035.png)

### 后台管理

- 商品管理，包括商品分类、品牌、商品规格等信息的管理
- 销售管理，包括订单统计、订单退款处理、促销活动生成等
- 用户管理，包括用户控制、冻结、解锁等
- 权限管理，整个网站的权限控制，采用JWT鉴权方案，对用户及API进行权限控制
- 统计，各种数据的统计分析展示

> 后台系统会采用前后端分离开发，而且整个后台管理系统会使用`Vue.js`框架搭建出单页应用（SPA）。

### 前台门户

- 搜索商品
- 加入购物车
- 下单
- 评价商品等等

>  前台系统我们会使用`Thymeleaf`模板引擎技术来完成页面开发。出于SEO优化的考虑，我们将不采用单页应用。

### 微服务模块

- 商品微服务：商品及商品分类、品牌、库存等的服务
- 搜索微服务：实现搜索功能
- 订单微服务：实现订单相关
- 购物车微服务：实现购物车相关功能
- 用户中心：用户的登录注册等功能
- Eureka注册中心
- Zuul网关服务
- Spring Cloud Config配置中心
- ...

> 无论是前台还是后台系统，都共享相同的微服务集群

## 技术选型

### 前端技术

- 基础的HTML、CSS、JavaScript（基于ES6标准）
- JQuery
- Vue.js 2.0以及基于Vue的框架：Vuetify
- 前端构建工具：WebPack
- 前端安装包工具：NPM
- Vue脚手架：Vue-cli
- Vue路由：vue-router
- ajax框架：axios
- 基于Vue的富文本框架：quill-editor

### 后端技术

- 基础的SpringMVC、Spring 5.0和MyBatis3
- Spring Boot 2.0.1版本
- Spring Cloud 最新版 Finchley.RC1
- Redis-4.0
- RabbitMQ-3.4
- Elasticsearch-5.6.8
- nginx-1.10.2：
- FastDFS - 5.0.8
- MyCat
- Thymeleaf
