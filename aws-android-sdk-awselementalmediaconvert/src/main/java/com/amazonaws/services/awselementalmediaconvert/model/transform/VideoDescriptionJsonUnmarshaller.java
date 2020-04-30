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
 * JSON unmarshaller for POJO VideoDescription
 */
class VideoDescriptionJsonUnmarshaller implements
        Unmarshaller<VideoDescription, JsonUnmarshallerContext> {

    public VideoDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VideoDescription videoDescription = new VideoDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AfdSignaling")) {
                videoDescription.setAfdSignaling(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AntiAlias")) {
                videoDescription.setAntiAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecSettings")) {
                videoDescription.setCodecSettings(VideoCodecSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColorMetadata")) {
                videoDescription.setColorMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Crop")) {
                videoDescription.setCrop(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DropFrameTimecode")) {
                videoDescription.setDropFrameTimecode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FixedAfd")) {
                videoDescription.setFixedAfd(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Height")) {
                videoDescription.setHeight(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                videoDescription.setPosition(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RespondToAfd")) {
                videoDescription.setRespondToAfd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScalingBehavior")) {
                videoDescription.setScalingBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sharpness")) {
                videoDescription.setSharpness(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeInsertion")) {
                videoDescription.setTimecodeInsertion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoPreprocessors")) {
                videoDescription.setVideoPreprocessors(VideoPreprocessorJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Width")) {
                videoDescription.setWidth(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return videoDescription;
    }

    private static VideoDescriptionJsonUnmarshaller instance;

    public static VideoDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoDescriptionJsonUnmarshaller();
        return instance;
    }
}
