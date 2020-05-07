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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetAutoSnapshotsResult
 */
public class GetAutoSnapshotsResultJsonUnmarshaller implements
        Unmarshaller<GetAutoSnapshotsResult, JsonUnmarshallerContext> {

    public GetAutoSnapshotsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAutoSnapshotsResult getAutoSnapshotsResult = new GetAutoSnapshotsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("resourceName")) {
                getAutoSnapshotsResult.setResourceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                getAutoSnapshotsResult.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoSnapshots")) {
                getAutoSnapshotsResult.setAutoSnapshots(new ListUnmarshaller<AutoSnapshotDetails>(
                        AutoSnapshotDetailsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getAutoSnapshotsResult;
    }

    private static GetAutoSnapshotsResultJsonUnmarshaller instance;

    public static GetAutoSnapshotsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAutoSnapshotsResultJsonUnmarshaller();
        return instance;
    }
}