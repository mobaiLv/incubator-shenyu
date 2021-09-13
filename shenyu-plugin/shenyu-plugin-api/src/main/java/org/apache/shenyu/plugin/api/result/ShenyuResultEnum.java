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

package org.apache.shenyu.plugin.api.result;

import org.apache.shenyu.common.constant.Constants;
import org.springframework.http.HttpStatus;

/**
 * The enum shenyu result enum.
 */
public enum ShenyuResultEnum {

    /**
     * Fail shenyu result enum.
     */
    FAIL(HttpStatus.INTERNAL_SERVER_ERROR, -1, "Internal exception in gateway. Please try again later!"),

    /**
     * Success shenyu result enum.
     */
    SUCCESS(HttpStatus.OK, 200, "Access to success!"),

    /**
     * Forbidden shenyu result enum.
     */
    FORBIDDEN(HttpStatus.FORBIDDEN, HttpStatus.FORBIDDEN.value(), Constants.REJECT_MSG),

    /**
     * Sign is not pass shenyu result enum.
     */
    SIGN_IS_NOT_PASS(HttpStatus.UNAUTHORIZED, 401, "Sign is not pass shenyu!"),

    /**
     * Authorization is incorrect.
     */
    ERROR_TOKEN(HttpStatus.UNAUTHORIZED, 401, "Illegal authorization"),

    /**
     * Payload too large shenyu result enum.
     */
    PAYLOAD_TOO_LARGE(HttpStatus.PAYLOAD_TOO_LARGE, 403, "Payload too large!"),

    /**
     * Too many requests shenyu result enum.
     */
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, 429, "You have been restricted, please try again later!"),

    /**
     * Hystrix plugin fallback, due to a circuit break.
     */
    HYSTRIX_PLUGIN_FALLBACK(HttpStatus.INTERNAL_SERVER_ERROR, 429, "HystrixPlugin fallback success, please check your service status!"),

    /**
     * Resilience4J plugin fallback, due to a circuit break.
     */
    RESILIENCE4J_PLUGIN_FALLBACK(HttpStatus.INTERNAL_SERVER_ERROR, 429, "Resilience4JPlugin fallback success, please check your service status!"),

    /**
     * Meta data error shenyu result enum.
     */
    META_DATA_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 430, "Meta data error!"),

    /**
     * Dubbo have body param shenyu result enum.
     */
    DUBBO_HAVE_BODY_PARAM(HttpStatus.INTERNAL_SERVER_ERROR, 431, "Dubbo must have body param, please enter the JSON format in the body!"),

    /**
     * Sofa have body param shenyu result enum.
     */
    SOFA_HAVE_BODY_PARAM(HttpStatus.INTERNAL_SERVER_ERROR, 432, "Sofa must have body param, please enter the JSON format in the body!"),

    /**
     * Tars have body param shenyu result enum.
     */
    TARS_HAVE_BODY_PARAM(HttpStatus.INTERNAL_SERVER_ERROR, 433, "Tars must have body param, please enter the JSON format in the body!"),

    /**
     * Tars invoke shenyu result enum.
     */
    TARS_INVOKE(HttpStatus.INTERNAL_SERVER_ERROR, 434, "Tars invoke error!"),

    /**
     * Grpc have body param shenyu result enum.
     */
    GRPC_HAVE_BODY_PARAM(HttpStatus.INTERNAL_SERVER_ERROR, 435, "Grpc must have body param, please enter the JSON format in the body!"),

    /**
     * Grpc client resultenum.
     */
    GRPC_CLIENT_NULL(HttpStatus.INTERNAL_SERVER_ERROR, 436, "Grpc client is null, please check the context path!"),

    /**
     * Motan have body param shenyu result enum.
     */
    MOTAN_HAVE_BODY_PARAM(HttpStatus.INTERNAL_SERVER_ERROR, 437, "Motan must have body param, please enter the JSON format in the body!"),

    /**
     * full selector type enum.
     */
    PARAM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -100, "Your parameter error, please check the relevant documentation!"),

    /**
     * Or match mode enum.
     */
    TIME_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -101, "Your time parameter is incorrect or has expired!"),

    /**
     * Rule not find shenyu result enum.
     */
    RULE_NOT_FOUND(HttpStatus.INTERNAL_SERVER_ERROR, -102, "Rule not found!"),

    /**
     * Service result error shenyu result enum.
     */
    SERVICE_RESULT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -103, "Service invocation exception, or no result is returned!"),

    /**
     * Service timeout shenyu result enum.
     */
    SERVICE_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT, -104, "Service call timeout!"),

    /**
     * Sign time is timeout shenyu result enum.
     */
    SIGN_TIME_IS_TIMEOUT(HttpStatus.INTERNAL_SERVER_ERROR, -105, "The signature timestamp has exceeded %s minutes!"),

    /**
     * Cannot find url shenyu result enum.
     */
    CANNOT_FIND_URL(HttpStatus.INTERNAL_SERVER_ERROR, -106, "Can not find url, please check your configuration!"),

    /**
     * Cannot find selector shenyu result enum.
     */
    SELECTOR_NOT_FOUND(HttpStatus.INTERNAL_SERVER_ERROR, -107, "Can not find selector, please check your configuration!"),

    /**
     * Can not config springcloud serviceid.
     */
    CANNOT_CONFIG_SPRINGCLOUD_SERVICEID(HttpStatus.INTERNAL_SERVER_ERROR, -108, "You are not configured or do not match springcloud serviceId!"),

    /**
     * The Springcloud serviceid is error.
     */
    SPRINGCLOUD_SERVICEID_IS_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -109, "SpringCloud serviceId does not exist or is configured incorrectly!"),

    /**
     * The Sentinel block error.
     */
    SENTINEL_BLOCK_ERROR(HttpStatus.TOO_MANY_REQUESTS, -110, "The request block by sentinel!"),

    /**
     * The Context path error.
     */
    CONTEXT_PATH_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -111, "The context path illegal, please check the context path mapping plugin!"),

    /**
     * SecretKey must be configured.
     */
    SECRET_KEY_MUST_BE_CONFIGURED(HttpStatus.INTERNAL_SERVER_ERROR, -112, "SecretKey must be configured"),

    /**
     * Response error.
     */
    RESPONSE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -113, "Response error, please check your configuration!"),

    /**
     * Cryptor request field error.
     */
    CRYPTOR_REQUEST_ERROR_CONFIGURATION(HttpStatus.INTERNAL_SERVER_ERROR, -114, "Please check Cryptor request plugin's "),

    /**
     * Cryptor response field error.
     */
    CRYPTOR_RESPONSE_ERROR_CONFIGURATION(HttpStatus.INTERNAL_SERVER_ERROR, -116, "Please check Cryptor response plugin's "),

    /**
     * Decryption error.
     */
    DECRYPTION_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, -117, "Decryption failed, please check the parameters or key, or the data length is too long"),

    /**
     * Request Header Fields Too Large.
     */
    REQUEST_HEADER_TOO_LARGE(HttpStatus.INTERNAL_SERVER_ERROR, 431, "Request Header Fields Too Large"),

    /**
     * Request Entity Too Large.
     */
    REQUEST_ENTITY_TOO_LARGE(HttpStatus.INTERNAL_SERVER_ERROR, 413, "Request Entity Too Large");

    /**
     * the http status code.
     */
    private final HttpStatus httpStatus;

    /**
     * the code.
     */
    private final int code;

    /**
     * the msg.
     */
    private final String msg;

    ShenyuResultEnum(final HttpStatus httpStatus, final int code, final String msg) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.msg = msg;
    }

    /**
     * get http status code.
     *
     * @return http status code
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * get code.
     * @return code
     */
    public int getCode() {
        return code;
    }

    /**
     * get msg.
     * @return msg
     */
    public String getMsg() {
        return msg;
    }
}
