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


public class ListDocumentsResult implements Serializable {
    /**
     * <p>The names of the Systems Manager documents.</p>
     */
    private java.util.List<DocumentIdentifier> documentIdentifiers;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>The names of the Systems Manager documents.</p>
     *
     * @return <p>The names of the Systems Manager documents.</p>
     */
    public java.util.List<DocumentIdentifier> getDocumentIdentifiers() {
        return documentIdentifiers;
    }

    /**
     * <p>The names of the Systems Manager documents.</p>
     *
     * @param documentIdentifiers <p>The names of the Systems Manager documents.</p>
     */
    public void setDocumentIdentifiers(java.util.Collection<DocumentIdentifier> documentIdentifiers) {
        if (documentIdentifiers == null) {
            this.documentIdentifiers = null;
            return;
        }

        this.documentIdentifiers = new java.util.ArrayList<DocumentIdentifier>(documentIdentifiers);
    }

    /**
     * <p>The names of the Systems Manager documents.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param documentIdentifiers <p>The names of the Systems Manager documents.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListDocumentsResult withDocumentIdentifiers(DocumentIdentifier... documentIdentifiers) {
        if (getDocumentIdentifiers() == null) {
            this.documentIdentifiers = new java.util.ArrayList<DocumentIdentifier>(documentIdentifiers.length);
        }
        for (DocumentIdentifier value : documentIdentifiers) {
            this.documentIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>The names of the Systems Manager documents.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param documentIdentifiers <p>The names of the Systems Manager documents.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListDocumentsResult withDocumentIdentifiers(java.util.Collection<DocumentIdentifier> documentIdentifiers) {
        setDocumentIdentifiers(documentIdentifiers);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListDocumentsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDocumentIdentifiers() != null) sb.append("DocumentIdentifiers: " + getDocumentIdentifiers() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentIdentifiers() == null) ? 0 : getDocumentIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDocumentsResult == false) return false;
        ListDocumentsResult other = (ListDocumentsResult)obj;

        if (other.getDocumentIdentifiers() == null ^ this.getDocumentIdentifiers() == null) return false;
        if (other.getDocumentIdentifiers() != null && other.getDocumentIdentifiers().equals(this.getDocumentIdentifiers()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
