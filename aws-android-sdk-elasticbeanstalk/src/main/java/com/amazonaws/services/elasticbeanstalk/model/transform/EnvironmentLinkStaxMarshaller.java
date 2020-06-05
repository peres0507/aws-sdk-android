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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EnvironmentLink
 */
class EnvironmentLinkStaxMarshaller {

    public void marshall(EnvironmentLink _environmentLink, Request<?> request, String _prefix) {
        String prefix;
        if (_environmentLink.getLinkName() != null) {
            prefix = _prefix + "LinkName";
            String linkName = _environmentLink.getLinkName();
            request.addParameter(prefix, StringUtils.fromString(linkName));
        }
        if (_environmentLink.getEnvironmentName() != null) {
            prefix = _prefix + "EnvironmentName";
            String environmentName = _environmentLink.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
    }

    private static EnvironmentLinkStaxMarshaller instance;

    public static EnvironmentLinkStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentLinkStaxMarshaller();
        return instance;
    }
}
