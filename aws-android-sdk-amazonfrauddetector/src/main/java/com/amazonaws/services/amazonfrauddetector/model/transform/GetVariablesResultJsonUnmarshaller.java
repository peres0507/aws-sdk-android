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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetVariablesResult
 */
public class GetVariablesResultJsonUnmarshaller implements
        Unmarshaller<GetVariablesResult, JsonUnmarshallerContext> {

    public GetVariablesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetVariablesResult getVariablesResult = new GetVariablesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("variables")) {
                getVariablesResult.setVariables(new ListUnmarshaller<Variable>(
                        VariableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                getVariablesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getVariablesResult;
    }

    private static GetVariablesResultJsonUnmarshaller instance;

    public static GetVariablesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVariablesResultJsonUnmarshaller();
        return instance;
    }
}
