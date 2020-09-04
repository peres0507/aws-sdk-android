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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Set the default version of a document. </p>
 */
public class UpdateDocumentDefaultVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The version of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>The name of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of a custom document that you want to set as the default version.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of a custom document that you want to set as the default version.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of a custom document that you want to set as the default version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of a custom document that you want to set as the default version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentDefaultVersionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The version of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[1-9][0-9]*$)<br/>
     *
     * @return <p>The version of a custom document that you want to set as the default version.</p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>The version of a custom document that you want to set as the default version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The version of a custom document that you want to set as the default version.</p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>The version of a custom document that you want to set as the default version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The version of a custom document that you want to set as the default version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateDocumentDefaultVersionRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDocumentDefaultVersionRequest == false) return false;
        UpdateDocumentDefaultVersionRequest other = (UpdateDocumentDefaultVersionRequest)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        return true;
    }
}
