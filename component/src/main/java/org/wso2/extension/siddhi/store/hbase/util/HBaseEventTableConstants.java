/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.extension.siddhi.store.hbase.util;

/**
 * Class for maintaining constants used by the HBase table implementation.
 */
public class HBaseEventTableConstants {

    public static final String ANNOTATION_ELEMENT_TABLE_NAME = "table.name";
    public static final String ANNOTATION_ELEMENT_CF_NAME = "column.family";
    public static final String DEFAULT_CF_NAME = "wso2.sp";
    public static final String KEY_SEPARATOR = "::";

}
