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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityAggregate
 */
class EntityAggregateJsonMarshaller {

    public void marshall(EntityAggregate entityAggregate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (entityAggregate.getEventArn() != null) {
            String eventArn = entityAggregate.getEventArn();
            jsonWriter.name("eventArn");
            jsonWriter.value(eventArn);
        }
        if (entityAggregate.getCount() != null) {
            Integer count = entityAggregate.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        jsonWriter.endObject();
    }

    private static EntityAggregateJsonMarshaller instance;

    public static EntityAggregateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityAggregateJsonMarshaller();
        return instance;
    }
}
