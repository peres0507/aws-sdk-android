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

package com.amazonaws.services.amazontranscribestreamingservice.model.transform;

import com.amazonaws.services.amazontranscribestreamingservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Transcript
 */
class TranscriptJsonMarshaller {

    public void marshall(Transcript transcript, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transcript.getResults() != null) {
            java.util.List<Result> results = transcript.getResults();
            jsonWriter.name("Results");
            jsonWriter.beginArray();
            for (Result resultsItem : results) {
                if (resultsItem != null) {
                    ResultJsonMarshaller.getInstance().marshall(resultsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TranscriptJsonMarshaller instance;

    public static TranscriptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptJsonMarshaller();
        return instance;
    }
}
