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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CanaryRunStatus
 */
class CanaryRunStatusJsonUnmarshaller implements
        Unmarshaller<CanaryRunStatus, JsonUnmarshallerContext> {

    public CanaryRunStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CanaryRunStatus canaryRunStatus = new CanaryRunStatus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("State")) {
                canaryRunStatus.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateReason")) {
                canaryRunStatus.setStateReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateReasonCode")) {
                canaryRunStatus.setStateReasonCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return canaryRunStatus;
    }

    private static CanaryRunStatusJsonUnmarshaller instance;

    public static CanaryRunStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunStatusJsonUnmarshaller();
        return instance;
    }
}
