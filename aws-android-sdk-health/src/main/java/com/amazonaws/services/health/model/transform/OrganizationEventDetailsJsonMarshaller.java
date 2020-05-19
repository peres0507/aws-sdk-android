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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OrganizationEventDetails
 */
class OrganizationEventDetailsJsonMarshaller {

    public void marshall(OrganizationEventDetails organizationEventDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (organizationEventDetails.getAwsAccountId() != null) {
            String awsAccountId = organizationEventDetails.getAwsAccountId();
            jsonWriter.name("awsAccountId");
            jsonWriter.value(awsAccountId);
        }
        if (organizationEventDetails.getEvent() != null) {
            Event event = organizationEventDetails.getEvent();
            jsonWriter.name("event");
            EventJsonMarshaller.getInstance().marshall(event, jsonWriter);
        }
        if (organizationEventDetails.getEventDescription() != null) {
            EventDescription eventDescription = organizationEventDetails.getEventDescription();
            jsonWriter.name("eventDescription");
            EventDescriptionJsonMarshaller.getInstance().marshall(eventDescription, jsonWriter);
        }
        if (organizationEventDetails.getEventMetadata() != null) {
            java.util.Map<String, String> eventMetadata = organizationEventDetails
                    .getEventMetadata();
            jsonWriter.name("eventMetadata");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> eventMetadataEntry : eventMetadata.entrySet()) {
                String eventMetadataValue = eventMetadataEntry.getValue();
                if (eventMetadataValue != null) {
                    jsonWriter.name(eventMetadataEntry.getKey());
                    jsonWriter.value(eventMetadataValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static OrganizationEventDetailsJsonMarshaller instance;

    public static OrganizationEventDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventDetailsJsonMarshaller();
        return instance;
    }
}
