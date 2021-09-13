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

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * ShenyuResultData.
 */
public final class ShenyuResultData {

    /**
     * response status.
     */
    private final HttpStatus httpStatus;

    /**
     * response data.
     */
    private final Serializable data;

    /**
     * ShenyuResultData constructor.
     *
     * @param httpStatus the response status
     * @param data the response data
     */
    private ShenyuResultData(final HttpStatus httpStatus, final Serializable data) {
        this.httpStatus = httpStatus;
        this.data = data;
    }

    /**
     * ShenyuResultData static handler.
     *
     * @param httpStatus the response status
     * @param data the response data
     * @return the shenyu result data
     */
    public static ShenyuResultData result(final HttpStatus httpStatus, final Serializable data) {
        return new ShenyuResultData(httpStatus, data);
    }

    /**
     * Gets response status.
     *
     * @return the response status
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * Gets response data.
     *
     * @return the response data
     */
    public Serializable getData() {
        return data;
    }
}
