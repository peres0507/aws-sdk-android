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

package com.amazonaws.services.comprehendmedical.model.transform;

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
import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartPHIDetectionJobRequest
 */
public class StartPHIDetectionJobRequestMarshaller implements
        Marshaller<Request<StartPHIDetectionJobRequest>, StartPHIDetectionJobRequest> {

    public Request<StartPHIDetectionJobRequest> marshall(
            StartPHIDetectionJobRequest startPHIDetectionJobRequest) {
        if (startPHIDetectionJobRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartPHIDetectionJobRequest)");
        }

        Request<StartPHIDetectionJobRequest> request = new DefaultRequest<StartPHIDetectionJobRequest>(
                startPHIDetectionJobRequest, "AWSComprehendMedical");
        String target = "ComprehendMedical_20181030.StartPHIDetectionJob";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startPHIDetectionJobRequest.getInputDataConfig() != null) {
                InputDataConfig inputDataConfig = startPHIDetectionJobRequest.getInputDataConfig();
                jsonWriter.name("InputDataConfig");
                InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
            }
            if (startPHIDetectionJobRequest.getOutputDataConfig() != null) {
                OutputDataConfig outputDataConfig = startPHIDetectionJobRequest
                        .getOutputDataConfig();
                jsonWriter.name("OutputDataConfig");
                OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
            }
            if (startPHIDetectionJobRequest.getDataAccessRoleArn() != null) {
                String dataAccessRoleArn = startPHIDetectionJobRequest.getDataAccessRoleArn();
                jsonWriter.name("DataAccessRoleArn");
                jsonWriter.value(dataAccessRoleArn);
            }
            if (startPHIDetectionJobRequest.getJobName() != null) {
                String jobName = startPHIDetectionJobRequest.getJobName();
                jsonWriter.name("JobName");
                jsonWriter.value(jobName);
            }
            if (startPHIDetectionJobRequest.getClientRequestToken() != null) {
                String clientRequestToken = startPHIDetectionJobRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startPHIDetectionJobRequest.getKMSKey() != null) {
                String kMSKey = startPHIDetectionJobRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (startPHIDetectionJobRequest.getLanguageCode() != null) {
                String languageCode = startPHIDetectionJobRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
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
