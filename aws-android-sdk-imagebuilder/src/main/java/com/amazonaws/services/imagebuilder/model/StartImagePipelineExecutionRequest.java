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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Manually triggers a pipeline to create an image.
 * </p>
 */
public class StartImagePipelineExecutionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * manually invoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     */
    private String imagePipelineArn;

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * manually invoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image pipeline that you
     *         want to manually invoke.
     *         </p>
     */
    public String getImagePipelineArn() {
        return imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * manually invoke.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @param imagePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that you
     *            want to manually invoke.
     *            </p>
     */
    public void setImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * manually invoke.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @param imagePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that you
     *            want to manually invoke.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImagePipelineExecutionRequest withImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The idempotency token used to make this request idempotent.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImagePipelineExecutionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImagePipelineArn() != null)
            sb.append("imagePipelineArn: " + getImagePipelineArn() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImagePipelineArn() == null) ? 0 : getImagePipelineArn().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImagePipelineExecutionRequest == false)
            return false;
        StartImagePipelineExecutionRequest other = (StartImagePipelineExecutionRequest) obj;

        if (other.getImagePipelineArn() == null ^ this.getImagePipelineArn() == null)
            return false;
        if (other.getImagePipelineArn() != null
                && other.getImagePipelineArn().equals(this.getImagePipelineArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}