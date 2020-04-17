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
 * JSON unmarshaller for POJO Model
 */
class ModelJsonUnmarshaller implements Unmarshaller<Model, JsonUnmarshallerContext> {

    public Model unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Model model = new Model();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("modelId")) {
                model.setModelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelType")) {
                model.setModelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                model.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trainingDataSource")) {
                model.setTrainingDataSource(TrainingDataSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("modelVariables")) {
                model.setModelVariables(new ListUnmarshaller<ModelVariable>(
                        ModelVariableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("labelSchema")) {
                model.setLabelSchema(LabelSchemaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                model.setLastUpdatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdTime")) {
                model.setCreatedTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return model;
    }

    private static ModelJsonUnmarshaller instance;

    public static ModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelJsonUnmarshaller();
        return instance;
    }
}
