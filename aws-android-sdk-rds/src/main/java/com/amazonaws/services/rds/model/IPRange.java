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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBSecurityGroups</code> action.
 * </p>
 */
public class IPRange implements Serializable {
    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing",
     * "authorized", "revoking", and "revoked".
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     */
    private String cIDRIP;

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing",
     * "authorized", "revoking", and "revoked".
     * </p>
     *
     * @return <p>
     *         Specifies the status of the IP range. Status can be
     *         "authorizing", "authorized", "revoking", and "revoked".
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing",
     * "authorized", "revoking", and "revoked".
     * </p>
     *
     * @param status <p>
     *            Specifies the status of the IP range. Status can be
     *            "authorizing", "authorized", "revoking", and "revoked".
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the IP range. Status can be "authorizing",
     * "authorized", "revoking", and "revoked".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the status of the IP range. Status can be
     *            "authorizing", "authorized", "revoking", and "revoked".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     *
     * @return <p>
     *         Specifies the IP range.
     *         </p>
     */
    public String getCIDRIP() {
        return cIDRIP;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     *
     * @param cIDRIP <p>
     *            Specifies the IP range.
     *            </p>
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * Specifies the IP range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cIDRIP <p>
     *            Specifies the IP range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCIDRIP() != null)
            sb.append("CIDRIP: " + getCIDRIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPRange == false)
            return false;
        IPRange other = (IPRange) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
            return false;
        return true;
    }
}