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
 * JSON unmarshaller for POJO ResponseDetails
 */
class ResponseDetailsJsonUnmarshaller implements
        Unmarshaller<ResponseDetails, JsonUnmarshallerContext> {

    public ResponseDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResponseDetails responseDetails = new ResponseDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ExportAssetToSignedUrl")) {
                responseDetails
                        .setExportAssetToSignedUrl(ExportAssetToSignedUrlResponseDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ExportAssetsToS3")) {
                responseDetails.setExportAssetsToS3(ExportAssetsToS3ResponseDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportAssetFromSignedUrl")) {
                responseDetails
                        .setImportAssetFromSignedUrl(ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ImportAssetsFromS3")) {
                responseDetails
                        .setImportAssetsFromS3(ImportAssetsFromS3ResponseDetailsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return responseDetails;
    }

    private static ResponseDetailsJsonUnmarshaller instance;

    public static ResponseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResponseDetailsJsonUnmarshaller();
        return instance;
    }
}
