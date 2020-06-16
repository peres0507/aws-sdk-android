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

package com.amazonaws.services.dataexchange.model.transform;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AssetSourceEntry
 */
class AssetSourceEntryJsonUnmarshaller implements
        Unmarshaller<AssetSourceEntry, JsonUnmarshallerContext> {

    public AssetSourceEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssetSourceEntry assetSourceEntry = new AssetSourceEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Bucket")) {
                assetSourceEntry.setBucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Key")) {
                assetSourceEntry.setKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return assetSourceEntry;
    }

    private static AssetSourceEntryJsonUnmarshaller instance;

    public static AssetSourceEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetSourceEntryJsonUnmarshaller();
        return instance;
    }
}
