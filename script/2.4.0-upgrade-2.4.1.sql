-- Licensed to the Apache Software Foundation (ASF) under one
-- or more contributor license agreements.  See the NOTICE file
-- distributed with this work for additional information
-- regarding copyright ownership.  The ASF licenses this file
-- to you under the Apache License, Version 2.0 (the
-- "License"); you may not use this file except in compliance
-- with the License.  You may obtain a copy of the License at
--
--     http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.

-- upgrade plguin
-- name & role
UPDATE plugin SET name = 'Sign', role = 'Authentication' WHERE name = 'sign';
UPDATE plugin SET name = 'Sentinel', role = 'FaultTolerance' WHERE name = 'sentinel';
UPDATE plugin SET name = 'Sofa', role = 'Proxy' WHERE name = 'sofa';
UPDATE plugin SET name = 'Resilience4j', role = 'FaultTolerance' WHERE name = 'resilience4j';
UPDATE plugin SET name = 'Tars', role = 'Proxy' WHERE name = 'tars';
UPDATE plugin SET name = 'ContextPath', role = 'HttpProcess' WHERE name = 'context_path';
UPDATE plugin SET name = 'Grpc', role = 'Proxy' WHERE name = 'grpc';
UPDATE plugin SET name = 'Redirect', role = 'HttpProcess' WHERE name = 'redirect';
UPDATE plugin SET name = 'Motan', role = 'Proxy' WHERE name = 'motan';
UPDATE plugin SET name = 'Logging', role = 'Logging' WHERE name = 'logging';
UPDATE plugin SET name = 'JWT', role = 'Authentication' WHERE name = 'jwt';
UPDATE plugin SET name = 'Waf', role = 'Authentication' WHERE name = 'waf';
UPDATE plugin SET name = 'Request', role = 'HttpProcess' WHERE name = 'request';
UPDATE plugin SET name = 'OAuth2', role = 'Authentication' WHERE name = 'oauth2';
UPDATE plugin SET name = 'ParamMapping', role = 'HttpProcess' WHERE name = 'param_mapping';
UPDATE plugin SET name = 'ModifyResponse', role = 'HttpProcess' WHERE name = 'modifyResponse';
UPDATE plugin SET name = 'CryptorRequest', role = 'Cryptor' WHERE name = 'cryptor_request';
UPDATE plugin SET name = 'CryptorResponse', role = 'Cryptor' WHERE name = 'cryptor_response';
UPDATE plugin SET name = 'Websocket', role = 'HttpProcess' WHERE name = 'websocket';
UPDATE plugin SET name = 'Rewrite', role = 'HttpProcess' WHERE name = 'rewrite';
UPDATE plugin SET name = 'RateLimiter', role = 'FaultTolerance' WHERE name = 'rate_limiter';
UPDATE plugin SET name = 'Divide', role = 'Proxy' WHERE name = 'divide';
UPDATE plugin SET name = 'Dubbo', role = 'Proxy' WHERE name = 'dubbo';
UPDATE plugin SET name = 'Monitor', role = 'Monitor' WHERE name = 'monitor';
UPDATE plugin SET name = 'SpringCloud', role = 'Proxy' WHERE name = 'springCloud';
UPDATE plugin SET name = 'Hystrix', role = 'FaultTolerance' WHERE name = 'hystrix';

-- upgrade resource
-- title & name & component &url
UPDATE resource SET title = 'Divide', name = 'Divide', component = 'Divide', url = REPLACE(url, 'divide', 'Divide') WHERE title = 'divide';
UPDATE resource SET title = 'Hystrix', name = 'Hystrix', component = 'Hystrix', url = REPLACE(url, 'hystrix', 'Hystrix') WHERE title = 'hystrix';
UPDATE resource SET title = 'Rewrite', name = 'Rewrite', component = 'Rewrite', url = REPLACE(url, 'rewrite', 'Rewrite') WHERE title = 'rewrite';
UPDATE resource SET title = 'Redirect', name = 'Redirect', component = 'Redirect', url = REPLACE(url, 'redirect', 'Redirect') WHERE title = 'redirect';
UPDATE resource SET title = 'SpringCloud', name = 'SpringCloud', component = 'SpringCloud', url = REPLACE(url, 'springCloud', 'SpringCloud') WHERE title = 'springCloud';
UPDATE resource SET title = 'Sign', name = 'Sign', component = 'Sign', url = REPLACE(url, 'sign', 'Sign') WHERE title = 'sign';
UPDATE resource SET title = 'Waf', name = 'Waf', component = 'Waf', url = REPLACE(url, 'waf', 'Waf') WHERE title = 'waf';
UPDATE resource SET title = 'RateLimiter', name = 'RateLimiter', component = 'RateLimiter', url = REPLACE(url, 'rate_limiter', 'RateLimiter') WHERE title = 'rate_limiter';
UPDATE resource SET title = 'Dubbo', name = 'Dubbo', component = 'Dubbo', url = REPLACE(url, 'dubbo', 'Dubbo') WHERE title = 'dubbo';
UPDATE resource SET title = 'Monitor', name = 'Monitor', component = 'Monitor', url = REPLACE(url, 'monitor', 'Monitor') WHERE title = 'monitor';
UPDATE resource SET title = 'Sentinel', name = 'Sentinel', component = 'Sentinel', url = REPLACE(url, 'sentinel', 'Sentinel') WHERE title = 'sentinel';
UPDATE resource SET title = 'Resilience4j', name = 'Resilience4j', component = 'Resilience4j', url = REPLACE(url, 'resilience4j', 'Resilience4j') WHERE title = 'resilience4j';
UPDATE resource SET title = 'Tars', name = 'Tars', component = 'Tars', url = REPLACE(url, 'tars', 'Tars') WHERE title = 'tars';
UPDATE resource SET title = 'ContextPath', name = 'ContextPath', component = 'ContextPath', url = REPLACE(url, 'context_path', 'ContextPath') WHERE title = 'context_path';
UPDATE resource SET title = 'Grpc', name = 'Grpc', component = 'Grpc', url = REPLACE(url, 'grpc', 'Grpc') WHERE title = 'grpc';
UPDATE resource SET title = 'JWT', name = 'JWT', component = 'JWT', url = REPLACE(url, 'jwt', 'JWT') WHERE title = 'jwt';
UPDATE resource SET title = 'OAuth2', name = 'OAuth2', component = 'OAuth2', url = REPLACE(url, 'oauth2', 'OAuth2') WHERE title = 'oauth2';
UPDATE resource SET title = 'Sofa', name = 'Sofa', component = 'Sofa', url = REPLACE(url, 'sofa', 'Sofa') WHERE title = 'sofa';
UPDATE resource SET title = 'Motan', name = 'Motan', component = 'Motan', url = REPLACE(url, 'motan', 'Motan') WHERE title = 'motan';
UPDATE resource SET title = 'Logging', name = 'Logging', component = 'Logging', url = REPLACE(url, 'logging', 'Logging') WHERE title = 'logging';
UPDATE resource SET title = 'CryptorRequest', name = 'CryptorRequest', component = 'CryptorRequest', url = REPLACE(url, 'cryptor_request', 'CryptorRequest') WHERE title = 'cryptor_request';
UPDATE resource SET title = 'CryptorResponse', name = 'CryptorResponse', component = 'CryptorResponse', url = REPLACE(url, 'cryptor_response', 'CryptorResponse') WHERE title = 'cryptor_response';
UPDATE resource SET title = 'Request', name = 'Request', component = 'Request', url = REPLACE(url, 'request', 'Request') WHERE title = 'request';
UPDATE resource SET title = 'ModifyResponse', name = 'ModifyResponse', component = 'ModifyResponse', url = REPLACE(url, 'modifyResponse', 'ModifyResponse') WHERE title = 'modifyResponse';
UPDATE resource SET title = 'ParamMapping', name = 'ParamMapping', component = 'ParamMapping', url = REPLACE(url, 'param_mapping', 'ParamMapping') WHERE title = 'param_mapping';
UPDATE resource SET title = 'Websocket', name = 'Websocket', component = 'Websocket', url = REPLACE(url, 'websocket', 'Websocket') WHERE title = 'websocket';

-- perms
UPDATE resource SET perms = REPLACE(perms, 'divide', 'Divide') WHERE perms LIKE 'plugin:divide%';
UPDATE resource SET perms = REPLACE(perms, 'hystrix', 'Hystrix') WHERE perms LIKE 'plugin:hystrix%';
UPDATE resource SET perms = REPLACE(perms, 'rewrite', 'Rewrite') WHERE perms LIKE 'plugin:rewrite%';
UPDATE resource SET perms = REPLACE(perms, 'redirect', 'Redirect') WHERE perms LIKE 'plugin:redirect%';
UPDATE resource SET perms = REPLACE(perms, 'springCloud', 'SpringCloud') WHERE perms LIKE 'plugin:springCloud%';
UPDATE resource SET perms = REPLACE(perms, 'sign', 'Sign') WHERE perms LIKE 'plugin:sign%';
UPDATE resource SET perms = REPLACE(perms, 'waf', 'Waf') WHERE perms LIKE 'plugin:waf%';
UPDATE resource SET perms = REPLACE(perms, 'rate_limiter', 'RateLimiter') WHERE perms LIKE 'plugin:rate_limiter%';
UPDATE resource SET perms = REPLACE(perms, 'dubbo', 'Dubbo') WHERE perms LIKE 'plugin:dubbo%';
UPDATE resource SET perms = REPLACE(perms, 'monitor', 'Monitor') WHERE perms LIKE 'plugin:monitor%';
UPDATE resource SET perms = REPLACE(perms, 'sentinel', 'Sentinel') WHERE perms LIKE 'plugin:sentinel%';
UPDATE resource SET perms = REPLACE(perms, 'resilience4j', 'Resilience4j') WHERE perms LIKE 'plugin:resilience4j%';
UPDATE resource SET perms = REPLACE(perms, 'tars', 'Tars') WHERE perms LIKE 'plugin:tars%';
UPDATE resource SET perms = REPLACE(perms, 'context_path', 'ContextPath') WHERE perms LIKE 'plugin:context_path%';
UPDATE resource SET perms = REPLACE(perms, 'grpc', 'Grpc') WHERE perms LIKE 'plugin:grpc%';
UPDATE resource SET perms = REPLACE(perms, 'jwt', 'JWT') WHERE perms LIKE 'plugin:jwt%';
UPDATE resource SET perms = REPLACE(perms, 'oauth2', 'OAuth2') WHERE perms LIKE 'plugin:oauth2%';
UPDATE resource SET perms = REPLACE(perms, 'sofa', 'Sofa') WHERE perms LIKE 'plugin:sofa%';
UPDATE resource SET perms = REPLACE(perms, 'motan', 'Motan') WHERE perms LIKE 'plugin:motan%';
UPDATE resource SET perms = REPLACE(perms, 'logging', 'Logging') WHERE perms LIKE 'plugin:logging%';
UPDATE resource SET perms = REPLACE(perms, 'cryptor_r', 'CryptorR') WHERE perms LIKE 'plugin:cryptor_r%';
UPDATE resource SET perms = REPLACE(perms, 'request', 'Request') WHERE perms LIKE 'plugin:request%';
UPDATE resource SET perms = REPLACE(perms, 'modifyResponse', 'ModifyResponse') WHERE perms LIKE 'plugin:modifyResponse%';
UPDATE resource SET perms = REPLACE(perms, 'param_mapping', 'ParamMapping') WHERE perms LIKE 'plugin:param_mapping%';
UPDATE resource SET perms = REPLACE(perms, 'websocket', 'Websocket') WHERE perms LIKE 'plugin:websocket%';
