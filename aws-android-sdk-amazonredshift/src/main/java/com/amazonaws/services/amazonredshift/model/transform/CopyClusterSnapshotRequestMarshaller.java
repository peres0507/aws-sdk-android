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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CopyClusterSnapshotRequest
 */
public class CopyClusterSnapshotRequestMarshaller implements
        Marshaller<Request<CopyClusterSnapshotRequest>, CopyClusterSnapshotRequest> {

    public Request<CopyClusterSnapshotRequest> marshall(
            CopyClusterSnapshotRequest copyClusterSnapshotRequest) {
        if (copyClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CopyClusterSnapshotRequest)");
        }

        Request<CopyClusterSnapshotRequest> request = new DefaultRequest<CopyClusterSnapshotRequest>(
                copyClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "CopyClusterSnapshot");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (copyClusterSnapshotRequest.getSourceSnapshotIdentifier() != null) {
            prefix = "SourceSnapshotIdentifier";
            String sourceSnapshotIdentifier = copyClusterSnapshotRequest
                    .getSourceSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceSnapshotIdentifier));
        }
        if (copyClusterSnapshotRequest.getSourceSnapshotClusterIdentifier() != null) {
            prefix = "SourceSnapshotClusterIdentifier";
            String sourceSnapshotClusterIdentifier = copyClusterSnapshotRequest
                    .getSourceSnapshotClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceSnapshotClusterIdentifier));
        }
        if (copyClusterSnapshotRequest.getTargetSnapshotIdentifier() != null) {
            prefix = "TargetSnapshotIdentifier";
            String targetSnapshotIdentifier = copyClusterSnapshotRequest
                    .getTargetSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetSnapshotIdentifier));
        }
        if (copyClusterSnapshotRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = copyClusterSnapshotRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }

        return request;
    }
}
