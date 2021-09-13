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

import org.apache.shenyu.plugin.api.utils.SpringBeanUtils;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * The type shenyu result warp.
 */
public final class ShenyuResultWrap<T> {

    /**
     * Success object.
     *
     * @param resultEnum  the result enum
     * @param object  the object
     * @return the object
     */
    public static ShenyuResultData success(final ShenyuResultEnum resultEnum, final Serializable object) {
        final Serializable data = SpringBeanUtils.getInstance().getBean(ShenyuResult.class).success(resultEnum, object);
        return ShenyuResultData.result(resultEnum.getHttpStatus(), data);
    }

    /**
     * Error object.
     *
     * @param resultEnum  the result enum
     * @param object  the object
     * @return the object
     */
    public static ShenyuResultData error(final ShenyuResultEnum resultEnum, final Serializable object) {
        final Serializable data = SpringBeanUtils.getInstance().getBean(ShenyuResult.class).error(resultEnum, object);
        return ShenyuResultData.result(resultEnum.getHttpStatus(), data);
    }

    /**
     * Error object.
     *
     * @param httpStatus the status
     * @param code    the code
     * @param message the message
     * @param object  the object
     * @return the object
     */
    public static ShenyuResultData error(final HttpStatus httpStatus, final int code, final String message, final Serializable object) {
        final Serializable data = SpringBeanUtils.getInstance().getBean(ShenyuResult.class).error(code, message, object);
        return ShenyuResultData.result(httpStatus, data);
    }
}
