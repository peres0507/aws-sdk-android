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
 * Generates a set of credentials consisting of a user name and password that
 * can be used to access the service specified in the request. These credentials
 * are generated by IAM, and can be used only for the specified service.
 * </p>
 * <p>
 * You can have a maximum of two sets of service-specific credentials for each
 * supported service per user.
 * </p>
 * <p>
 * The only supported service at this time is AWS CodeCommit.
 * </p>
 * <p>
 * You can reset the password to a new service-generated value by calling
 * <a>ResetServiceSpecificCredential</a>.
 * </p>
 * <p>
 * For more information about service-specific credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html"
 * >Using IAM with AWS CodeCommit: Git Credentials, SSH Keys, and AWS Access
 * Keys</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class CreateServiceSpecificCredentialRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the IAM user that is to be associated with the credentials.
     * The new service-specific credentials have the same permissions as the
     * associated user except that they can be used only to access the specified
     * service.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The name of the AWS service that is to be associated with the
     * credentials. The service you specify here is the only service that can be
     * accessed using these credentials.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the IAM user that is to be associated with the credentials.
     * The new service-specific credentials have the same permissions as the
     * associated user except that they can be used only to access the specified
     * service.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user that is to be associated with the
     *         credentials. The new service-specific credentials have the same
     *         permissions as the associated user except that they can be used
     *         only to access the specified service.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user that is to be associated with the credentials.
     * The new service-specific credentials have the same permissions as the
     * associated user except that they can be used only to access the specified
     * service.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user that is to be associated with the
     *            credentials. The new service-specific credentials have the
     *            same permissions as the associated user except that they can
     *            be used only to access the specified service.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user that is to be associated with the credentials.
     * The new service-specific credentials have the same permissions as the
     * associated user except that they can be used only to access the specified
     * service.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user that is to be associated with the
     *            credentials. The new service-specific credentials have the
     *            same permissions as the associated user except that they can
     *            be used only to access the specified service.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceSpecificCredentialRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The name of the AWS service that is to be associated with the
     * credentials. The service you specify here is the only service that can be
     * accessed using these credentials.
     * </p>
     *
     * @return <p>
     *         The name of the AWS service that is to be associated with the
     *         credentials. The service you specify here is the only service
     *         that can be accessed using these credentials.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the AWS service that is to be associated with the
     * credentials. The service you specify here is the only service that can be
     * accessed using these credentials.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the AWS service that is to be associated with the
     *            credentials. The service you specify here is the only service
     *            that can be accessed using these credentials.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service that is to be associated with the
     * credentials. The service you specify here is the only service that can be
     * accessed using these credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the AWS service that is to be associated with the
     *            credentials. The service you specify here is the only service
     *            that can be accessed using these credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceSpecificCredentialRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceSpecificCredentialRequest == false)
            return false;
        CreateServiceSpecificCredentialRequest other = (CreateServiceSpecificCredentialRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
