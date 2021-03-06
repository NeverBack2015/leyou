/**
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
package com.leyou.common.util;

/**
 * 乐优商城常量类
 */
public final class LeyouConstants {

    /**
     * service name list
     */
    public static final String SERVICE_ITEM = "item-service";
    public static final String SERVICE_SEARCH = "search-service";
    public static final String SERVICE_PAGE = "page-service";
    public static final String SERVICE_SMS = "sms-service";
    public static final String SERVICE_USER = "user-service";

    /**
     * reabbitmq queue name, exchange name and routingKey
     */
    public static final String EXCHANGE_DEFAULT_ITEM = "ly.item.exchange";
    public static final String EXCHANGE_SMS = "ly.sms.exchange";

    public static final String ROUTING_KEY_INSERT_ITEM = "ly.item.insert";
    public static final String ROUTING_KEY_UPDATE_ITEM = "ly.item.update";
    public static final String ROUTING_KEY_DELETE_ITEM = "ly.item.delete";
    public static final String ROUTING_KEY_VERIFY_CODE_SMS = "sms.verify.code";


}
