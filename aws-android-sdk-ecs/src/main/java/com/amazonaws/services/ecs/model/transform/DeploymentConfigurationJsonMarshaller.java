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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeploymentConfiguration
 */
class DeploymentConfigurationJsonMarshaller {

    public void marshall(DeploymentConfiguration deploymentConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentConfiguration.getMaximumPercent() != null) {
            Integer maximumPercent = deploymentConfiguration.getMaximumPercent();
            jsonWriter.name("maximumPercent");
            jsonWriter.value(maximumPercent);
        }
        if (deploymentConfiguration.getMinimumHealthyPercent() != null) {
            Integer minimumHealthyPercent = deploymentConfiguration.getMinimumHealthyPercent();
            jsonWriter.name("minimumHealthyPercent");
            jsonWriter.value(minimumHealthyPercent);
        }
        jsonWriter.endObject();
    }

    private static DeploymentConfigurationJsonMarshaller instance;

    public static DeploymentConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentConfigurationJsonMarshaller();
        return instance;
    }
}
