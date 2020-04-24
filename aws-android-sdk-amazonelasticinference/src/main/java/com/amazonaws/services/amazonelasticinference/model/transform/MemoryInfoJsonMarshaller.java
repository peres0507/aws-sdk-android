/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.amazonelasticinference.model.transform;

import com.amazonaws.services.amazonelasticinference.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MemoryInfo
 */
class MemoryInfoJsonMarshaller {

    public void marshall(MemoryInfo memoryInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (memoryInfo.getSizeInMiB() != null) {
            Integer sizeInMiB = memoryInfo.getSizeInMiB();
            jsonWriter.name("sizeInMiB");
            jsonWriter.value(sizeInMiB);
        }
        jsonWriter.endObject();
    }

    private static MemoryInfoJsonMarshaller instance;

    public static MemoryInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MemoryInfoJsonMarshaller();
        return instance;
    }
}