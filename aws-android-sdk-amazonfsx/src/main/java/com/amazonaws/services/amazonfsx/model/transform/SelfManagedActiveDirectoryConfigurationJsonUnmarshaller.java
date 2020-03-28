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

package com.amazonaws.services.amazonfsx.model.transform;

import com.amazonaws.services.amazonfsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SelfManagedActiveDirectoryConfiguration
 */
class SelfManagedActiveDirectoryConfigurationJsonUnmarshaller implements
        Unmarshaller<SelfManagedActiveDirectoryConfiguration, JsonUnmarshallerContext> {

    public SelfManagedActiveDirectoryConfiguration unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration = new SelfManagedActiveDirectoryConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainName")) {
                selfManagedActiveDirectoryConfiguration.setDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OrganizationalUnitDistinguishedName")) {
                selfManagedActiveDirectoryConfiguration
                        .setOrganizationalUnitDistinguishedName(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("FileSystemAdministratorsGroup")) {
                selfManagedActiveDirectoryConfiguration
                        .setFileSystemAdministratorsGroup(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("UserName")) {
                selfManagedActiveDirectoryConfiguration.setUserName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Password")) {
                selfManagedActiveDirectoryConfiguration.setPassword(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsIps")) {
                selfManagedActiveDirectoryConfiguration.setDnsIps(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return selfManagedActiveDirectoryConfiguration;
    }

    private static SelfManagedActiveDirectoryConfigurationJsonUnmarshaller instance;

    public static SelfManagedActiveDirectoryConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SelfManagedActiveDirectoryConfigurationJsonUnmarshaller();
        return instance;
    }
}
