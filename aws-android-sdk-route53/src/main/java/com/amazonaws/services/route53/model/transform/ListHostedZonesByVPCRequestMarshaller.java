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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListHostedZonesByVPCRequest
 */
public class ListHostedZonesByVPCRequestMarshaller implements
        Marshaller<Request<ListHostedZonesByVPCRequest>, ListHostedZonesByVPCRequest> {

    public Request<ListHostedZonesByVPCRequest> marshall(
            ListHostedZonesByVPCRequest listHostedZonesByVPCRequest) {
        if (listHostedZonesByVPCRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListHostedZonesByVPCRequest)");
        }

        Request<ListHostedZonesByVPCRequest> request = new DefaultRequest<ListHostedZonesByVPCRequest>(
                listHostedZonesByVPCRequest, "AmazonRoute53");
        request.addParameter("Action", "ListHostedZonesByVPC");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (listHostedZonesByVPCRequest.getVPCId() != null) {
            prefix = "vpcid";
            String vPCId = listHostedZonesByVPCRequest.getVPCId();
            request.addParameter(prefix, StringUtils.fromString(vPCId));
        }
        if (listHostedZonesByVPCRequest.getVPCRegion() != null) {
            prefix = "vpcregion";
            String vPCRegion = listHostedZonesByVPCRequest.getVPCRegion();
            request.addParameter(prefix, StringUtils.fromString(vPCRegion));
        }
        if (listHostedZonesByVPCRequest.getMaxItems() != null) {
            prefix = "maxitems";
            String maxItems = listHostedZonesByVPCRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }
        if (listHostedZonesByVPCRequest.getNextToken() != null) {
            prefix = "nexttoken";
            String nextToken = listHostedZonesByVPCRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
