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

package com.amazonaws.services.applicationautoscaling.model.transform;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response RegisterScalableTargetResult
 */
public class RegisterScalableTargetResultJsonUnmarshaller implements
        Unmarshaller<RegisterScalableTargetResult, JsonUnmarshallerContext> {

    public RegisterScalableTargetResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        RegisterScalableTargetResult registerScalableTargetResult = new RegisterScalableTargetResult();

        return registerScalableTargetResult;
    }

    private static RegisterScalableTargetResultJsonUnmarshaller instance;

    public static RegisterScalableTargetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterScalableTargetResultJsonUnmarshaller();
        return instance;
    }
}
