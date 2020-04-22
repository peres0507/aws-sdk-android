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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of changes to HSM settings.
 * </p>
 */
public class HsmStatus implements Serializable {
    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     */
    private String hsmClientCertificateIdentifier;

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     */
    private String hsmConfigurationIdentifier;

    /**
     * <p>
     * Reports whether the Amazon Redshift cluster has finished applying any HSM
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the HSM client certificate the Amazon
     *         Redshift cluster uses to retrieve the data encryption keys stored
     *         in an HSM.
     *         </p>
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     *
     * @param hsmClientCertificateIdentifier <p>
     *            Specifies the name of the HSM client certificate the Amazon
     *            Redshift cluster uses to retrieve the data encryption keys
     *            stored in an HSM.
     *            </p>
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmClientCertificateIdentifier <p>
     *            Specifies the name of the HSM client certificate the Amazon
     *            Redshift cluster uses to retrieve the data encryption keys
     *            stored in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HsmStatus withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and
     *         store keys in an HSM.
     *         </p>
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     *
     * @param hsmConfigurationIdentifier <p>
     *            Specifies the name of the HSM configuration that contains the
     *            information the Amazon Redshift cluster can use to retrieve
     *            and store keys in an HSM.
     *            </p>
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * Specifies the name of the HSM configuration that contains the information
     * the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hsmConfigurationIdentifier <p>
     *            Specifies the name of the HSM configuration that contains the
     *            information the Amazon Redshift cluster can use to retrieve
     *            and store keys in an HSM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HsmStatus withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * <p>
     * Reports whether the Amazon Redshift cluster has finished applying any HSM
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     *
     * @return <p>
     *         Reports whether the Amazon Redshift cluster has finished applying
     *         any HSM settings changes specified in a modify cluster command.
     *         </p>
     *         <p>
     *         Values: active, applying
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Reports whether the Amazon Redshift cluster has finished applying any HSM
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     *
     * @param status <p>
     *            Reports whether the Amazon Redshift cluster has finished
     *            applying any HSM settings changes specified in a modify
     *            cluster command.
     *            </p>
     *            <p>
     *            Values: active, applying
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Reports whether the Amazon Redshift cluster has finished applying any HSM
     * settings changes specified in a modify cluster command.
     * </p>
     * <p>
     * Values: active, applying
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Reports whether the Amazon Redshift cluster has finished
     *            applying any HSM settings changes specified in a modify
     *            cluster command.
     *            </p>
     *            <p>
     *            Values: active, applying
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HsmStatus withStatus(String status) {
        this.status = status;
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
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier()
                    + ",");
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHsmClientCertificateIdentifier() == null) ? 0
                        : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HsmStatus == false)
            return false;
        HsmStatus other = (HsmStatus) obj;

        if (other.getHsmClientCertificateIdentifier() == null
                ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(
                        this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getHsmConfigurationIdentifier() == null
                ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null
                && other.getHsmConfigurationIdentifier().equals(
                        this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
