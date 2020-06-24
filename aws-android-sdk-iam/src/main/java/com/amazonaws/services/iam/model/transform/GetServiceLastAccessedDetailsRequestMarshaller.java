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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetServiceLastAccessedDetailsRequest
 */
public class GetServiceLastAccessedDetailsRequestMarshaller
        implements
        Marshaller<Request<GetServiceLastAccessedDetailsRequest>, GetServiceLastAccessedDetailsRequest> {

    public Request<GetServiceLastAccessedDetailsRequest> marshall(
            GetServiceLastAccessedDetailsRequest getServiceLastAccessedDetailsRequest) {
        if (getServiceLastAccessedDetailsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetServiceLastAccessedDetailsRequest)");
        }

        Request<GetServiceLastAccessedDetailsRequest> request = new DefaultRequest<GetServiceLastAccessedDetailsRequest>(
                getServiceLastAccessedDetailsRequest, "AWSIdentityandAccessManagement");
        request.addParameter("Action", "GetServiceLastAccessedDetails");
        request.addParameter("Version", "2010-05-08");

        String prefix;
        if (getServiceLastAccessedDetailsRequest.getJobId() != null) {
            prefix = "JobId";
            String jobId = getServiceLastAccessedDetailsRequest.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (getServiceLastAccessedDetailsRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = getServiceLastAccessedDetailsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }
        if (getServiceLastAccessedDetailsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = getServiceLastAccessedDetailsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
