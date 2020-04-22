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
 * StAX request marshaller for ModifyClusterSnapshotScheduleRequest
 */
public class ModifyClusterSnapshotScheduleRequestMarshaller
        implements
        Marshaller<Request<ModifyClusterSnapshotScheduleRequest>, ModifyClusterSnapshotScheduleRequest> {

    public Request<ModifyClusterSnapshotScheduleRequest> marshall(
            ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest) {
        if (modifyClusterSnapshotScheduleRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyClusterSnapshotScheduleRequest)");
        }

        Request<ModifyClusterSnapshotScheduleRequest> request = new DefaultRequest<ModifyClusterSnapshotScheduleRequest>(
                modifyClusterSnapshotScheduleRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterSnapshotSchedule");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyClusterSnapshotScheduleRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifyClusterSnapshotScheduleRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifyClusterSnapshotScheduleRequest.getScheduleIdentifier() != null) {
            prefix = "ScheduleIdentifier";
            String scheduleIdentifier = modifyClusterSnapshotScheduleRequest
                    .getScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(scheduleIdentifier));
        }
        if (modifyClusterSnapshotScheduleRequest.getDisassociateSchedule() != null) {
            prefix = "DisassociateSchedule";
            Boolean disassociateSchedule = modifyClusterSnapshotScheduleRequest
                    .getDisassociateSchedule();
            request.addParameter(prefix, StringUtils.fromBoolean(disassociateSchedule));
        }

        return request;
    }
}
