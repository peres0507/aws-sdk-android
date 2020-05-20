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

package com.amazonaws.services.securityhub.model.transform;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContainerDetails
 */
class ContainerDetailsJsonMarshaller {

    public void marshall(ContainerDetails containerDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (containerDetails.getName() != null) {
            String name = containerDetails.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (containerDetails.getImageId() != null) {
            String imageId = containerDetails.getImageId();
            jsonWriter.name("ImageId");
            jsonWriter.value(imageId);
        }
        if (containerDetails.getImageName() != null) {
            String imageName = containerDetails.getImageName();
            jsonWriter.name("ImageName");
            jsonWriter.value(imageName);
        }
        if (containerDetails.getLaunchedAt() != null) {
            String launchedAt = containerDetails.getLaunchedAt();
            jsonWriter.name("LaunchedAt");
            jsonWriter.value(launchedAt);
        }
        jsonWriter.endObject();
    }

    private static ContainerDetailsJsonMarshaller instance;

    public static ContainerDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDetailsJsonMarshaller();
        return instance;
    }
}
