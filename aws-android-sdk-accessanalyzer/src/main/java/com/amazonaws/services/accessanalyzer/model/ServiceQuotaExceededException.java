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

package com.amazonaws.services.accessanalyzer.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Service quote met error.
 * </p>
 */
public class ServiceQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource ID.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     *
     * @return <p>
     *         The resource ID.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     *
     * @param resourceId <p>
     *            The resource ID.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
