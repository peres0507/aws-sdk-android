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

package com.amazonaws.services.imagebuilder.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateComponentRequest
 */
public class CreateComponentRequestMarshaller implements
        Marshaller<Request<CreateComponentRequest>, CreateComponentRequest> {

    public Request<CreateComponentRequest> marshall(CreateComponentRequest createComponentRequest) {
        if (createComponentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateComponentRequest)");
        }

        Request<CreateComponentRequest> request = new DefaultRequest<CreateComponentRequest>(
                createComponentRequest, "EC2ImageBuilder");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/CreateComponent";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createComponentRequest.getName() != null) {
                String name = createComponentRequest.getName();
                jsonWriter.name("name");
                jsonWriter.value(name);
            }
            if (createComponentRequest.getSemanticVersion() != null) {
                String semanticVersion = createComponentRequest.getSemanticVersion();
                jsonWriter.name("semanticVersion");
                jsonWriter.value(semanticVersion);
            }
            if (createComponentRequest.getDescription() != null) {
                String description = createComponentRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (createComponentRequest.getChangeDescription() != null) {
                String changeDescription = createComponentRequest.getChangeDescription();
                jsonWriter.name("changeDescription");
                jsonWriter.value(changeDescription);
            }
            if (createComponentRequest.getPlatform() != null) {
                String platform = createComponentRequest.getPlatform();
                jsonWriter.name("platform");
                jsonWriter.value(platform);
            }
            if (createComponentRequest.getSupportedOsVersions() != null) {
                java.util.List<String> supportedOsVersions = createComponentRequest
                        .getSupportedOsVersions();
                jsonWriter.name("supportedOsVersions");
                jsonWriter.beginArray();
                for (String supportedOsVersionsItem : supportedOsVersions) {
                    if (supportedOsVersionsItem != null) {
                        jsonWriter.value(supportedOsVersionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createComponentRequest.getData() != null) {
                String data = createComponentRequest.getData();
                jsonWriter.name("data");
                jsonWriter.value(data);
            }
            if (createComponentRequest.getUri() != null) {
                String uri = createComponentRequest.getUri();
                jsonWriter.name("uri");
                jsonWriter.value(uri);
            }
            if (createComponentRequest.getKmsKeyId() != null) {
                String kmsKeyId = createComponentRequest.getKmsKeyId();
                jsonWriter.name("kmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createComponentRequest.getTags() != null) {
                java.util.Map<String, String> tags = createComponentRequest.getTags();
                jsonWriter.name("tags");
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
            if (createComponentRequest.getClientToken() != null) {
                String clientToken = createComponentRequest.getClientToken();
                jsonWriter.name("clientToken");
                jsonWriter.value(clientToken);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}