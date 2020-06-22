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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains
 * the DB cluster's metadata, including its endpoints and DB parameter groups.
 * Aurora also retains the transaction logs so you can do a point-in-time
 * restore if necessary.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"
 * > Stopping and Starting an Aurora Cluster</a> in the <i>Amazon Aurora User
 * Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class StopDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier of the Amazon Aurora DB cluster to be
     *         stopped. This parameter is stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the Amazon Aurora DB cluster to
     *            be stopped. This parameter is stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the Amazon Aurora DB cluster to be stopped.
     * This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the Amazon Aurora DB cluster to
     *            be stopped. This parameter is stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDBClusterRequest == false)
            return false;
        StopDBClusterRequest other = (StopDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        return true;
    }
}