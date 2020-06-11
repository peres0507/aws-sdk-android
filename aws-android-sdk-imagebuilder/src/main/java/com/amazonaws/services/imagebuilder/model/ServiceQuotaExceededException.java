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

package com.amazonaws.services.imagebuilder.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You have exceeded the number of permitted resources or operations for this
 * service. For service quotas, see <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/imagebuilder.html#limits_imagebuilder"
 * >EC2 Image Builder endpoints and quotas</a>.
 * </p>
 */
public class ServiceQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }
}