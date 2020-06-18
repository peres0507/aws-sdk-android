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

public class StartDBClusterResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon Aurora DB cluster.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
     * <code>StartDBCluster</code> actions.
     * </p>
     */
    private DBCluster dBCluster;

    /**
     * <p>
     * Contains the details of an Amazon Aurora DB cluster.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
     * <code>StartDBCluster</code> actions.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon Aurora DB cluster.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
     *         <code>StartDBCluster</code> actions.
     *         </p>
     */
    public DBCluster getDBCluster() {
        return dBCluster;
    }

    /**
     * <p>
     * Contains the details of an Amazon Aurora DB cluster.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
     * <code>StartDBCluster</code> actions.
     * </p>
     *
     * @param dBCluster <p>
     *            Contains the details of an Amazon Aurora DB cluster.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusters</code>, <code>StopDBCluster</code>,
     *            and <code>StartDBCluster</code> actions.
     *            </p>
     */
    public void setDBCluster(DBCluster dBCluster) {
        this.dBCluster = dBCluster;
    }

    /**
     * <p>
     * Contains the details of an Amazon Aurora DB cluster.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusters</code>, <code>StopDBCluster</code>, and
     * <code>StartDBCluster</code> actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBCluster <p>
     *            Contains the details of an Amazon Aurora DB cluster.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusters</code>, <code>StopDBCluster</code>,
     *            and <code>StartDBCluster</code> actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDBClusterResult withDBCluster(DBCluster dBCluster) {
        this.dBCluster = dBCluster;
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
        if (getDBCluster() != null)
            sb.append("DBCluster: " + getDBCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBCluster() == null) ? 0 : getDBCluster().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDBClusterResult == false)
            return false;
        StartDBClusterResult other = (StartDBClusterResult) obj;

        if (other.getDBCluster() == null ^ this.getDBCluster() == null)
            return false;
        if (other.getDBCluster() != null
                && other.getDBCluster().equals(this.getDBCluster()) == false)
            return false;
        return true;
    }
}
