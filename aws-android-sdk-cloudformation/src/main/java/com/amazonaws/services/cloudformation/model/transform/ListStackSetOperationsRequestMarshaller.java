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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListStackSetOperationsRequest
 */
public class ListStackSetOperationsRequestMarshaller implements
        Marshaller<Request<ListStackSetOperationsRequest>, ListStackSetOperationsRequest> {

    public Request<ListStackSetOperationsRequest> marshall(
            ListStackSetOperationsRequest listStackSetOperationsRequest) {
        if (listStackSetOperationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStackSetOperationsRequest)");
        }

        Request<ListStackSetOperationsRequest> request = new DefaultRequest<ListStackSetOperationsRequest>(
                listStackSetOperationsRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListStackSetOperations");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listStackSetOperationsRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = listStackSetOperationsRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (listStackSetOperationsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listStackSetOperationsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listStackSetOperationsRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listStackSetOperationsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }

        return request;
    }
}
