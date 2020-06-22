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
 * Contains the result of a successful invocation of the
 * <code>DescribeDBSubnetGroups</code> action.
 * </p>
 */
public class DescribeDBSubnetGroupsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of <code>DBSubnetGroup</code> instances.
     * </p>
     */
    private java.util.List<DBSubnetGroup> dBSubnetGroups;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of <code>DBSubnetGroup</code> instances.
     * </p>
     *
     * @return <p>
     *         A list of <code>DBSubnetGroup</code> instances.
     *         </p>
     */
    public java.util.List<DBSubnetGroup> getDBSubnetGroups() {
        return dBSubnetGroups;
    }

    /**
     * <p>
     * A list of <code>DBSubnetGroup</code> instances.
     * </p>
     *
     * @param dBSubnetGroups <p>
     *            A list of <code>DBSubnetGroup</code> instances.
     *            </p>
     */
    public void setDBSubnetGroups(java.util.Collection<DBSubnetGroup> dBSubnetGroups) {
        if (dBSubnetGroups == null) {
            this.dBSubnetGroups = null;
            return;
        }

        this.dBSubnetGroups = new java.util.ArrayList<DBSubnetGroup>(dBSubnetGroups);
    }

    /**
     * <p>
     * A list of <code>DBSubnetGroup</code> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroups <p>
     *            A list of <code>DBSubnetGroup</code> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSubnetGroupsResult withDBSubnetGroups(DBSubnetGroup... dBSubnetGroups) {
        if (getDBSubnetGroups() == null) {
            this.dBSubnetGroups = new java.util.ArrayList<DBSubnetGroup>(dBSubnetGroups.length);
        }
        for (DBSubnetGroup value : dBSubnetGroups) {
            this.dBSubnetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DBSubnetGroup</code> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroups <p>
     *            A list of <code>DBSubnetGroup</code> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBSubnetGroupsResult withDBSubnetGroups(
            java.util.Collection<DBSubnetGroup> dBSubnetGroups) {
        setDBSubnetGroups(dBSubnetGroups);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getDBSubnetGroups() != null)
            sb.append("DBSubnetGroups: " + getDBSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroups() == null) ? 0 : getDBSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBSubnetGroupsResult == false)
            return false;
        DescribeDBSubnetGroupsResult other = (DescribeDBSubnetGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBSubnetGroups() == null ^ this.getDBSubnetGroups() == null)
            return false;
        if (other.getDBSubnetGroups() != null
                && other.getDBSubnetGroups().equals(this.getDBSubnetGroups()) == false)
            return false;
        return true;
    }
}