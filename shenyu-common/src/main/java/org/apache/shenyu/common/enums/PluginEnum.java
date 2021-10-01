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

package org.apache.shenyu.common.enums;

import org.apache.shenyu.common.constant.RpcConstants;

import java.util.Arrays;
import java.util.List;

/**
 * PluginEnum.
 */
public enum PluginEnum {
    
    /**
     * Global plugin enum.
     */
    GLOBAL(10, 0, "Global"),
    
    /**
     * Sign plugin enum.
     */
    SIGN(20, 0, "Sign"),
    
    /**
     * Jwt plugin enum.
     */
    JWT(30, 0, "JWT"),
    
    /**
     * OAuth2 plugin enum.
     */
    OAUTH2(40, 0, "OAuth2"),
    
    /**
     * Waf plugin enum.
     */
    WAF(50, 0, "Waf"),
    
    /**
     * Rate limiter plugin enum.
     */
    RATE_LIMITER(60, 0, "RateLimiter"),
    
    /**
     * Param mapping plugin enum.
     */
    PARAM_MAPPING(70, 0, "ParamMapping"),
    
    /**
     * Context path plugin enum.
     */
    CONTEXT_PATH(80, 0, "ContextPath"),
    
    /**
     * Rewrite plugin enum.
     */
    REWRITE(90, 0, "Rewrite"),
    
    /**
     * Cryptor request plugin enum.
     */
    CRYPTOR_REQUEST(100, 0, "CryptorRequest"),
    
    /**
     * Redirect plugin enum.
     */
    REDIRECT(110, 0, "Redirect"),
    
    /**
     * Request plugin enum.
     */
    REQUEST(120, 0, "Request"),
    
    /**
     * Hystrix plugin enum.
     */
    HYSTRIX(130, 0, "Hystrix"),
    
    /**
     * Sentinel plugin enum.
     */
    SENTINEL(140, 0, "Sentinel"),
    
    /**
     * Resilence4J plugin enum.
     */
    RESILIENCE4J(150, 0, "Resilience4j"),
    
    /**
     * Logging plugin enum.
     */
    LOGGING(160, 0, "Logging"),
    
    /**
     * Monitor plugin enum.
     */
    MONITOR(170, 0, "Monitor"),
    
    /**
     * Divide plugin enum.
     */
    DIVIDE(200, 0, "Divide"),
    
    /**
     * springCloud plugin enum.
     */
    SPRING_CLOUD(200, 0, RpcConstants.SPRING_CLOUD),
    
    /**
     * webSocket plugin enum.
     */
    WEB_SOCKET(200, 0, RpcConstants.WEB_SOCKET),
    
    /**
     * Web client plugin enum.
     */
    WEB_CLIENT(210, 0, "WebClient"),
    
    /**
     * Netty http client plugin enum.
     */
    NETTY_HTTP_CLIENT(210, 0, "NettyHttpClient"),

    /**
     * ModifyResponse plugin enum.
     */
    MODIFY_RESPONSE(220, 0, "ModifyResponse"),
    
    /**
     * Param transform plugin enum.
     */
    RPC_PARAM_TRANSFORM(300, 0, "ParamTransform"),
    
    /**
     * Dubbo plugin enum.
     */
    DUBBO(310, 0, RpcConstants.DUBBO),
    
    /**
     * Sofa plugin enum.
     */
    SOFA(310, 0, RpcConstants.SOFA),
    
    /**
     * Tars plugin enum.
     */
    TARS(310, 0, RpcConstants.TARS),
    
    /**
     * GPRC plugin enum.
     */
    GRPC(310, 0, RpcConstants.GRPC),
    
    /**
     * Motan plugin enum.
     */
    MOTAN(310, 0, RpcConstants.MOTAN),
    
    /**
     * Cryptor response plugin enum.
     */
    CRYPTOR_RESPONSE(410, 0, "CryptorResponse"),
    
    /**
     * Response plugin enum.
     */
    RESPONSE(420, 0, "Response");

    private final int code;

    private final int role;

    private final String name;

    /**
     * all args constructor.
     *
     * @param code code
     * @param role role
     * @param name name
     */
    PluginEnum(final int code, final int role, final String name) {
        this.code = code;
        this.role = role;
        this.name = name;
    }
    
    /**
     * get code.
     *
     * @return code code
     */
    public int getCode() {
        return code;
    }
    
    /**
     * get role.
     *
     * @return role role
     */
    public int getRole() {
        return role;
    }
    
    /**
     * get name.
     *
     * @return name name
     */
    public String getName() {
        return name;
    }
    
    /**
     * get plugin enum by name.
     *
     * @param name plugin name.
     * @return plugin enum.
     */
    public static PluginEnum getPluginEnumByName(final String name) {
        return Arrays.stream(PluginEnum.values())
                .filter(pluginEnum -> pluginEnum.getName().equals(name))
                .findFirst().orElse(PluginEnum.GLOBAL);
    }
    
    /**
     * get upstream plugin names.
     *
     * @return List string
     */
    public static List<String> getUpstreamNames() {
        return Arrays.asList(DIVIDE.name, GRPC.name, TARS.name, SPRING_CLOUD.name);
    }
}
