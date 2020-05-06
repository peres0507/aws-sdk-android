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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputDataConfig
 */
class InputDataConfigJsonMarshaller {

    public void marshall(InputDataConfig inputDataConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputDataConfig.getS3Bucket() != null) {
            String s3Bucket = inputDataConfig.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (inputDataConfig.getS3Key() != null) {
            String s3Key = inputDataConfig.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        jsonWriter.endObject();
    }

    private static InputDataConfigJsonMarshaller instance;

    public static InputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDataConfigJsonMarshaller();
        return instance;
    }
}
