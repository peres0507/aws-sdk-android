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

public class CreateDBClusterParameterGroupResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon RDS DB cluster parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterParameterGroups</code> action.
     * </p>
     */
    private DBClusterParameterGroup dBClusterParameterGroup;

    /**
     * <p>
     * Contains the details of an Amazon RDS DB cluster parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterParameterGroups</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon RDS DB cluster parameter group.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBClusterParameterGroups</code> action.
     *         </p>
     */
    public DBClusterParameterGroup getDBClusterParameterGroup() {
        return dBClusterParameterGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB cluster parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterParameterGroups</code> action.
     * </p>
     *
     * @param dBClusterParameterGroup <p>
     *            Contains the details of an Amazon RDS DB cluster parameter
     *            group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusterParameterGroups</code> action.
     *            </p>
     */
    public void setDBClusterParameterGroup(DBClusterParameterGroup dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB cluster parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBClusterParameterGroups</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroup <p>
     *            Contains the details of an Amazon RDS DB cluster parameter
     *            group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBClusterParameterGroups</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterParameterGroupResult withDBClusterParameterGroup(
            DBClusterParameterGroup dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
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
        if (getDBClusterParameterGroup() != null)
            sb.append("DBClusterParameterGroup: " + getDBClusterParameterGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroup() == null) ? 0 : getDBClusterParameterGroup()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterParameterGroupResult == false)
            return false;
        CreateDBClusterParameterGroupResult other = (CreateDBClusterParameterGroupResult) obj;

        if (other.getDBClusterParameterGroup() == null ^ this.getDBClusterParameterGroup() == null)
            return false;
        if (other.getDBClusterParameterGroup() != null
                && other.getDBClusterParameterGroup().equals(this.getDBClusterParameterGroup()) == false)
            return false;
        return true;
    }
}