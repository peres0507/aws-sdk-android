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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AcceleratorType
 */
class AcceleratorTypeJsonUnmarshaller implements
        Unmarshaller<AcceleratorType, JsonUnmarshallerContext> {

    public AcceleratorType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AcceleratorType acceleratorType = new AcceleratorType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("acceleratorTypeName")) {
                acceleratorType.setAcceleratorTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("memoryInfo")) {
                acceleratorType.setMemoryInfo(MemoryInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("throughputInfo")) {
                acceleratorType.setThroughputInfo(new ListUnmarshaller<KeyValuePair>(
                        KeyValuePairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return acceleratorType;
    }

    private static AcceleratorTypeJsonUnmarshaller instance;

    public static AcceleratorTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceleratorTypeJsonUnmarshaller();
        return instance;
    }
}