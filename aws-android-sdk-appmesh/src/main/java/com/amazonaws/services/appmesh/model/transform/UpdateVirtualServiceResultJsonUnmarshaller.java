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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateVirtualServiceResult
 */
public class UpdateVirtualServiceResultJsonUnmarshaller implements
        Unmarshaller<UpdateVirtualServiceResult, JsonUnmarshallerContext> {

    public UpdateVirtualServiceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateVirtualServiceResult updateVirtualServiceResult = new UpdateVirtualServiceResult();

        return updateVirtualServiceResult;
    }

    private static UpdateVirtualServiceResultJsonUnmarshaller instance;

    public static UpdateVirtualServiceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateVirtualServiceResultJsonUnmarshaller();
        return instance;
    }
}
