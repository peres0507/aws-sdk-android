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
 * StAX marshaller for POJO EnvironmentResourcesDescription
 */
class EnvironmentResourcesDescriptionStaxMarshaller {

    public void marshall(EnvironmentResourcesDescription _environmentResourcesDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_environmentResourcesDescription.getLoadBalancer() != null) {
            prefix = _prefix + "LoadBalancer";
            LoadBalancerDescription loadBalancer = _environmentResourcesDescription
                    .getLoadBalancer();
            LoadBalancerDescriptionStaxMarshaller.getInstance().marshall(loadBalancer, request,
                    prefix + ".");
        }
    }

    private static EnvironmentResourcesDescriptionStaxMarshaller instance;

    public static EnvironmentResourcesDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentResourcesDescriptionStaxMarshaller();
        return instance;
    }
}
