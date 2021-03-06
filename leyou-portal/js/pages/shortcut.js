/*
 * Copyright © 2019-Now imxushuai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
const shortcut = {
    template: "\
    <div class='py-container'> \
        <div class='shortcut'> \
            <ul class='fl'> \
               <li class='f-item'>乐优欢迎您！</li> \
               <li class='f-item' v-if='user && user.username'>\
               尊敬的会员，<span style='color: red;'>{{user.username}}</span>\
               </li>\
               <li v-else class='f-item'> \
                   请<a href='javascript:void(0)' @click='gotoLogin'>登录</a>　 \
                   <span><a href='register.html' target='_blank'>免费注册</a></span> \
               </li> \
           </ul> \
           <ul class='fr'> \
               <li class='f-item'>我的订单</li> \
               <li class='f-item space'></li> \
               <li class='f-item'><a href='home.html' target='_blank'>我的乐优</a></li> \
               <li class='f-item space'></li> \
               <li class='f-item'>乐优会员</li> \
               <li class='f-item space'></li> \
               <li class='f-item'>企业采购</li> \
               <li class='f-item space'></li> \
               <li class='f-item'>关注乐优</li> \
               <li class='f-item space'></li> \
               <li class='f-item' id='service'> \
                   <span>客户服务</span> \
                   <ul class='service'> \
                       <li><a href='cooperation.html' target='_blank'>合作招商</a></li> \
                       <li><a href='shoplogin.html' target='_blank'>商家后台</a></li> \
                       <li><a href='cooperation.html' target='_blank'>合作招商</a></li> \
                       <li><a href='#'>商家后台</a></li> \
                   </ul> \
               </li> \
               <li class='f-item space'></li> \
               <li class='f-item'>网站导航</li> \
           </ul> \
       </div> \
    </div>\
    ",
    name: "shortcut",
    data() {
        return {
            user: null
        }
    },
    created() {
        ly.http("/auth/verify")
            .then(resp => {
                this.user = resp.data;
            })
    },
    methods: {
        gotoLogin() {
            window.location = "login.html?returnUrl=" + window.location;
        }
    }
}
export default shortcut;