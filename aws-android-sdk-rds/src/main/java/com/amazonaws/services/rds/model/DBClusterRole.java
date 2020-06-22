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
 * Describes an AWS Identity and Access Management (IAM) role that is associated
 * with a DB cluster.
 * </p>
 */
public class DBClusterRole implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with
     * the DB cluster.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Describes the state of association between the IAM role and the DB
     * cluster. The Status property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - the IAM role ARN is associated with the DB cluster
     * and can be used to access other AWS services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - the IAM role ARN is being associated with the DB
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - the IAM role ARN is associated with the DB
     * cluster, but the DB cluster is unable to assume the IAM role in order to
     * access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The name of the feature associated with the AWS Identity and Access
     * Management (IAM) role. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with
     * the DB cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that is associated
     *         with the DB cluster.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with
     * the DB cluster.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that is
     *            associated with the DB cluster.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that is associated with
     * the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that is
     *            associated with the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterRole withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the DB
     * cluster. The Status property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - the IAM role ARN is associated with the DB cluster
     * and can be used to access other AWS services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - the IAM role ARN is being associated with the DB
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - the IAM role ARN is associated with the DB
     * cluster, but the DB cluster is unable to assume the IAM role in order to
     * access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Describes the state of association between the IAM role and the
     *         DB cluster. The Status property returns one of the following
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - the IAM role ARN is associated with the DB
     *         cluster and can be used to access other AWS services on your
     *         behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - the IAM role ARN is being associated with
     *         the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID</code> - the IAM role ARN is associated with the DB
     *         cluster, but the DB cluster is unable to assume the IAM role in
     *         order to access other AWS services on your behalf.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the DB
     * cluster. The Status property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - the IAM role ARN is associated with the DB cluster
     * and can be used to access other AWS services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - the IAM role ARN is being associated with the DB
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - the IAM role ARN is associated with the DB
     * cluster, but the DB cluster is unable to assume the IAM role in order to
     * access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            Describes the state of association between the IAM role and
     *            the DB cluster. The Status property returns one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - the IAM role ARN is associated with the
     *            DB cluster and can be used to access other AWS services on
     *            your behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - the IAM role ARN is being associated
     *            with the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID</code> - the IAM role ARN is associated with the
     *            DB cluster, but the DB cluster is unable to assume the IAM
     *            role in order to access other AWS services on your behalf.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the state of association between the IAM role and the DB
     * cluster. The Status property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> - the IAM role ARN is associated with the DB cluster
     * and can be used to access other AWS services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - the IAM role ARN is being associated with the DB
     * cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID</code> - the IAM role ARN is associated with the DB
     * cluster, but the DB cluster is unable to assume the IAM role in order to
     * access other AWS services on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Describes the state of association between the IAM role and
     *            the DB cluster. The Status property returns one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - the IAM role ARN is associated with the
     *            DB cluster and can be used to access other AWS services on
     *            your behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - the IAM role ARN is being associated
     *            with the DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID</code> - the IAM role ARN is associated with the
     *            DB cluster, but the DB cluster is unable to assume the IAM
     *            role in order to access other AWS services on your behalf.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterRole withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The name of the feature associated with the AWS Identity and Access
     * Management (IAM) role. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     *
     * @return <p>
     *         The name of the feature associated with the AWS Identity and
     *         Access Management (IAM) role. For the list of supported feature
     *         names, see <a>DBEngineVersion</a>.
     *         </p>
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the AWS Identity and Access
     * Management (IAM) role. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     *
     * @param featureName <p>
     *            The name of the feature associated with the AWS Identity and
     *            Access Management (IAM) role. For the list of supported
     *            feature names, see <a>DBEngineVersion</a>.
     *            </p>
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature associated with the AWS Identity and Access
     * Management (IAM) role. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureName <p>
     *            The name of the feature associated with the AWS Identity and
     *            Access Management (IAM) role. For the list of supported
     *            feature names, see <a>DBEngineVersion</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterRole withFeatureName(String featureName) {
        this.featureName = featureName;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFeatureName() != null)
            sb.append("FeatureName: " + getFeatureName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterRole == false)
            return false;
        DBClusterRole other = (DBClusterRole) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null
                && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        return true;
    }
}