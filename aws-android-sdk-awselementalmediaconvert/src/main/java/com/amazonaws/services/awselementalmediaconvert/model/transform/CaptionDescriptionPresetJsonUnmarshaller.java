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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CaptionDescriptionPreset
 */
class CaptionDescriptionPresetJsonUnmarshaller implements
        Unmarshaller<CaptionDescriptionPreset, JsonUnmarshallerContext> {

    public CaptionDescriptionPreset unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CaptionDescriptionPreset captionDescriptionPreset = new CaptionDescriptionPreset();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CustomLanguageCode")) {
                captionDescriptionPreset.setCustomLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationSettings")) {
                captionDescriptionPreset
                        .setDestinationSettings(CaptionDestinationSettingsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                captionDescriptionPreset.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageDescription")) {
                captionDescriptionPreset.setLanguageDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return captionDescriptionPreset;
    }

    private static CaptionDescriptionPresetJsonUnmarshaller instance;

    public static CaptionDescriptionPresetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CaptionDescriptionPresetJsonUnmarshaller();
        return instance;
    }
}
