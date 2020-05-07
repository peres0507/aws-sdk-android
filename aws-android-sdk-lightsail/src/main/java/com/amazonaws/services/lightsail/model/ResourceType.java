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

package com.amazonaws.services.lightsail.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Resource Type
 */
public enum ResourceType {

    Instance("Instance"),
    StaticIp("StaticIp"),
    KeyPair("KeyPair"),
    InstanceSnapshot("InstanceSnapshot"),
    Domain("Domain"),
    PeeredVpc("PeeredVpc"),
    LoadBalancer("LoadBalancer"),
    LoadBalancerTlsCertificate("LoadBalancerTlsCertificate"),
    Disk("Disk"),
    DiskSnapshot("DiskSnapshot"),
    RelationalDatabase("RelationalDatabase"),
    RelationalDatabaseSnapshot("RelationalDatabaseSnapshot"),
    ExportSnapshotRecord("ExportSnapshotRecord"),
    CloudFormationStackRecord("CloudFormationStackRecord"),
    Alarm("Alarm"),
    ContactMethod("ContactMethod");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceType> enumMap;
    static {
        enumMap = new HashMap<String, ResourceType>();
        enumMap.put("Instance", Instance);
        enumMap.put("StaticIp", StaticIp);
        enumMap.put("KeyPair", KeyPair);
        enumMap.put("InstanceSnapshot", InstanceSnapshot);
        enumMap.put("Domain", Domain);
        enumMap.put("PeeredVpc", PeeredVpc);
        enumMap.put("LoadBalancer", LoadBalancer);
        enumMap.put("LoadBalancerTlsCertificate", LoadBalancerTlsCertificate);
        enumMap.put("Disk", Disk);
        enumMap.put("DiskSnapshot", DiskSnapshot);
        enumMap.put("RelationalDatabase", RelationalDatabase);
        enumMap.put("RelationalDatabaseSnapshot", RelationalDatabaseSnapshot);
        enumMap.put("ExportSnapshotRecord", ExportSnapshotRecord);
        enumMap.put("CloudFormationStackRecord", CloudFormationStackRecord);
        enumMap.put("Alarm", Alarm);
        enumMap.put("ContactMethod", ContactMethod);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}