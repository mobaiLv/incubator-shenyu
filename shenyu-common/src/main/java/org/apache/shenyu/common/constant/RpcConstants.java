/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.common.constant;

/**
 * RpcConstants.
 */
public interface RpcConstants {

    /**
     * Http rpc type constant.
     */
    String HTTP = "Http";

    /**
     * Dubbo rpc type constant.
     */
    String DUBBO = "Dubbo";

    /**
     * Sofa rpc type constant.
     */
    String SOFA = "Sofa";

    /**
     * Tars rpc type constant.
     */
    String TARS = "Tars";

    /**
     * Websocket rpc type constant.
     */
    String WEB_SOCKET = "Websocket";

    /**
     * SpringCloud rpc type constant.
     */
    String SPRING_CLOUD = "SpringCloud";

    /**
     * Motan.
     */
    String MOTAN = "Motan";

    /**
     * Grpc.
     */
    String GRPC = "Grpc";

    /**
     * String q.
     */
    default void findConstants() {
    }
}
