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
 * <code>DescribeDBInstanceAutomatedBackups</code> action.
 * </p>
 */
public class DescribeDBInstanceAutomatedBackupsResult implements Serializable {
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of <code>DBInstanceAutomatedBackup</code> instances.
     * </p>
     */
    private java.util.List<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code> .
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code> .
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of <code>DBInstanceAutomatedBackup</code> instances.
     * </p>
     *
     * @return <p>
     *         A list of <code>DBInstanceAutomatedBackup</code> instances.
     *         </p>
     */
    public java.util.List<DBInstanceAutomatedBackup> getDBInstanceAutomatedBackups() {
        return dBInstanceAutomatedBackups;
    }

    /**
     * <p>
     * A list of <code>DBInstanceAutomatedBackup</code> instances.
     * </p>
     *
     * @param dBInstanceAutomatedBackups <p>
     *            A list of <code>DBInstanceAutomatedBackup</code> instances.
     *            </p>
     */
    public void setDBInstanceAutomatedBackups(
            java.util.Collection<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups) {
        if (dBInstanceAutomatedBackups == null) {
            this.dBInstanceAutomatedBackups = null;
            return;
        }

        this.dBInstanceAutomatedBackups = new java.util.ArrayList<DBInstanceAutomatedBackup>(
                dBInstanceAutomatedBackups);
    }

    /**
     * <p>
     * A list of <code>DBInstanceAutomatedBackup</code> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceAutomatedBackups <p>
     *            A list of <code>DBInstanceAutomatedBackup</code> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsResult withDBInstanceAutomatedBackups(
            DBInstanceAutomatedBackup... dBInstanceAutomatedBackups) {
        if (getDBInstanceAutomatedBackups() == null) {
            this.dBInstanceAutomatedBackups = new java.util.ArrayList<DBInstanceAutomatedBackup>(
                    dBInstanceAutomatedBackups.length);
        }
        for (DBInstanceAutomatedBackup value : dBInstanceAutomatedBackups) {
            this.dBInstanceAutomatedBackups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DBInstanceAutomatedBackup</code> instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceAutomatedBackups <p>
     *            A list of <code>DBInstanceAutomatedBackup</code> instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBInstanceAutomatedBackupsResult withDBInstanceAutomatedBackups(
            java.util.Collection<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups) {
        setDBInstanceAutomatedBackups(dBInstanceAutomatedBackups);
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
        if (getDBInstanceAutomatedBackups() != null)
            sb.append("DBInstanceAutomatedBackups: " + getDBInstanceAutomatedBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBInstanceAutomatedBackups() == null) ? 0 : getDBInstanceAutomatedBackups()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBInstanceAutomatedBackupsResult == false)
            return false;
        DescribeDBInstanceAutomatedBackupsResult other = (DescribeDBInstanceAutomatedBackupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBInstanceAutomatedBackups() == null
                ^ this.getDBInstanceAutomatedBackups() == null)
            return false;
        if (other.getDBInstanceAutomatedBackups() != null
                && other.getDBInstanceAutomatedBackups().equals(
                        this.getDBInstanceAutomatedBackups()) == false)
            return false;
        return true;
    }
}