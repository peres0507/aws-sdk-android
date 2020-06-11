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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Attribute
 */
class AttributeJsonMarshaller {

    public void marshall(Attribute attribute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attribute.getName() != null) {
            String name = attribute.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (attribute.getValue() != null) {
            String value = attribute.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        if (attribute.getTargetType() != null) {
            String targetType = attribute.getTargetType();
            jsonWriter.name("targetType");
            jsonWriter.value(targetType);
        }
        if (attribute.getTargetId() != null) {
            String targetId = attribute.getTargetId();
            jsonWriter.name("targetId");
            jsonWriter.value(targetId);
        }
        jsonWriter.endObject();
    }

    private static AttributeJsonMarshaller instance;

    public static AttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeJsonMarshaller();
        return instance;
    }
}
