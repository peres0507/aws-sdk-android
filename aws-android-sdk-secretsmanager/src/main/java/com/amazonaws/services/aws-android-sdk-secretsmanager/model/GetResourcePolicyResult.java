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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class GetResourcePolicyResult implements Serializable {
    /**
     * <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String name;

    /**
     * <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20480<br/>
     */
    private String resourcePolicy;

    /**
     * <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that the resource-based policy was retrieved for.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetResourcePolicyResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param name <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param name <p>The friendly name of the secret that the resource-based policy was retrieved for.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetResourcePolicyResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20480<br/>
     *
     * @return <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     */
    public String getResourcePolicy() {
        return resourcePolicy;
    }

    /**
     * <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20480<br/>
     *
     * @param resourcePolicy <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     */
    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20480<br/>
     *
     * @param resourcePolicy <p>A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see <a href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html">Authentication and Access Control for AWS Secrets Manager</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetResourcePolicyResult withResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getResourcePolicy() != null) sb.append("ResourcePolicy: " + getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetResourcePolicyResult == false) return false;
        GetResourcePolicyResult other = (GetResourcePolicyResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null) return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false) return false;
        return true;
    }
}
