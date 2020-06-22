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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeDBSecurityGroupsRequest
 */
public class DescribeDBSecurityGroupsRequestMarshaller implements
        Marshaller<Request<DescribeDBSecurityGroupsRequest>, DescribeDBSecurityGroupsRequest> {

    public Request<DescribeDBSecurityGroupsRequest> marshall(
            DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) {
        if (describeDBSecurityGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBSecurityGroupsRequest)");
        }

        Request<DescribeDBSecurityGroupsRequest> request = new DefaultRequest<DescribeDBSecurityGroupsRequest>(
                describeDBSecurityGroupsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBSecurityGroups");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBSecurityGroupsRequest.getDBSecurityGroupName() != null) {
            prefix = "DBSecurityGroupName";
            String dBSecurityGroupName = describeDBSecurityGroupsRequest.getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }
        if (describeDBSecurityGroupsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBSecurityGroupsRequest.getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (Filter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    FilterStaxMarshaller.getInstance().marshall(filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeDBSecurityGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBSecurityGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBSecurityGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBSecurityGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}