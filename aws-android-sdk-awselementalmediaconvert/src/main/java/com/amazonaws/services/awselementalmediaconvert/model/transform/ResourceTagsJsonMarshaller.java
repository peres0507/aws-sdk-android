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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceTags
 */
class ResourceTagsJsonMarshaller {

    public void marshall(ResourceTags resourceTags, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceTags.getArn() != null) {
            String arn = resourceTags.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (resourceTags.getTags() != null) {
            java.util.Map<String, String> tags = resourceTags.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ResourceTagsJsonMarshaller instance;

    public static ResourceTagsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceTagsJsonMarshaller();
        return instance;
    }
}
