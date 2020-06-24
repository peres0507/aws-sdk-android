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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an OpenID Connect identity provider (IdP) resource object in IAM.
 * </p>
 * <p>
 * Deleting an IAM OIDC provider resource does not update any roles that
 * reference the provider as a principal in their trust policies. Any attempt to
 * assume a role that references a deleted provider fails.
 * </p>
 * <p>
 * This operation is idempotent; it does not fail or return an error if you call
 * the operation for a provider that does not exist.
 * </p>
 */
public class DeleteOpenIDConnectProviderRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider
     * resource object to delete. You can get a list of OpenID Connect provider
     * resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String openIDConnectProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider
     * resource object to delete. You can get a list of OpenID Connect provider
     * resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM OpenID Connect provider
     *         resource object to delete. You can get a list of OpenID Connect
     *         provider resource ARNs by using the
     *         <a>ListOpenIDConnectProviders</a> operation.
     *         </p>
     */
    public String getOpenIDConnectProviderArn() {
        return openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider
     * resource object to delete. You can get a list of OpenID Connect provider
     * resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn <p>
     *            The Amazon Resource Name (ARN) of the IAM OpenID Connect
     *            provider resource object to delete. You can get a list of
     *            OpenID Connect provider resource ARNs by using the
     *            <a>ListOpenIDConnectProviders</a> operation.
     *            </p>
     */
    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider
     * resource object to delete. You can get a list of OpenID Connect provider
     * resource ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn <p>
     *            The Amazon Resource Name (ARN) of the IAM OpenID Connect
     *            provider resource object to delete. You can get a list of
     *            OpenID Connect provider resource ARNs by using the
     *            <a>ListOpenIDConnectProviders</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteOpenIDConnectProviderRequest withOpenIDConnectProviderArn(
            String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
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
        if (getOpenIDConnectProviderArn() != null)
            sb.append("OpenIDConnectProviderArn: " + getOpenIDConnectProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOpenIDConnectProviderRequest == false)
            return false;
        DeleteOpenIDConnectProviderRequest other = (DeleteOpenIDConnectProviderRequest) obj;

        if (other.getOpenIDConnectProviderArn() == null
                ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null
                && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        return true;
    }
}
