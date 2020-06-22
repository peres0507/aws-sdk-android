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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PlacementType
 */
class PlacementTypeJsonMarshaller {

    public void marshall(PlacementType placementType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (placementType.getAvailabilityZone() != null) {
            String availabilityZone = placementType.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (placementType.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = placementType.getAvailabilityZones();
            jsonWriter.name("AvailabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PlacementTypeJsonMarshaller instance;

    public static PlacementTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlacementTypeJsonMarshaller();
        return instance;
    }
}
