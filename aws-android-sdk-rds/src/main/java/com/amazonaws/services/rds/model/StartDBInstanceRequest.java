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
 * Starts an Amazon RDS DB instance that was stopped using the AWS console, the
 * stop-db-instance AWS CLI command, or the StopDBInstance action.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"
 * > Starting an Amazon RDS DB instance That Was Previously Stopped</a> in the
 * <i>Amazon RDS User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora
 * DB clusters, use <code>StartDBCluster</code> instead.
 * </p>
 * </note>
 */
public class StartDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     *
     * @return <p>
     *         The user-supplied instance identifier.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The user-supplied instance identifier.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The user-supplied instance identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDBInstanceRequest == false)
            return false;
        StartDBInstanceRequest other = (StartDBInstanceRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        return true;
    }
}