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

package com.amazonaws.services.backup.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The required resource already exists.
 * </p>
 */
public class AlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * <p/>
     */
    private String creatorRequestId;

    /**
     * <p/>
     */
    private String arn;

    /**
     * <p/>
     */
    private String type;

    /**
     * <p/>
     */
    private String context;

    /**
     * Constructs a new AlreadyExistsException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public AlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Returns the value of the code property for this object.
     *
     * @return The value of the code property for this object.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of code
     *
     * @param code The new value for the code property for this object.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p/>
     *
     * @param creatorRequestId <p/>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p/>
     *
     * @param arn <p/>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getType() {
        return type;
    }

    /**
     * <p/>
     *
     * @param type <p/>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getContext() {
        return context;
    }

    /**
     * <p/>
     *
     * @param context <p/>
     */
    public void setContext(String context) {
        this.context = context;
    }
}
