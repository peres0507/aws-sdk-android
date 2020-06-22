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
 * Adds an attribute and values to, or removes an attribute and values from, a
 * manual DB snapshot.
 * </p>
 * <p>
 * To share a manual DB snapshot with other AWS accounts, specify
 * <code>restore</code> as the <code>AttributeName</code> and use the
 * <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS accounts
 * that are authorized to restore the manual DB snapshot. Uses the value
 * <code>all</code> to make the manual DB snapshot public, which means it can be
 * copied or restored by all AWS accounts.
 * </p>
 * <note>
 * <p>
 * Don't add the <code>all</code> value for any manual DB snapshots that contain
 * private information that you don't want available to all AWS accounts.
 * </p>
 * </note>
 * <p>
 * If the manual DB snapshot is encrypted, it can be shared, but only by
 * specifying a list of authorized AWS account IDs for the
 * <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value
 * for that parameter in this case.
 * </p>
 * <p>
 * To view which AWS accounts have access to copy or restore a manual DB
 * snapshot, or whether a manual DB snapshot public or private, use the
 * <a>DescribeDBSnapshotAttributes</a> API action. The accounts are returned as
 * values for the <code>restore</code> attribute.
 * </p>
 */
public class ModifyDBSnapshotAttributeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a
     * manual DB snapshot, set this value to <code>restore</code>.
     * </p>
     * <note>
     * <p>
     * To view the list of attributes available to modify, use the
     * <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * </note>
     */
    private String attributeName;

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set
     * this list to include one or more AWS account IDs, or <code>all</code> to
     * make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private
     * information that you don't want available to all AWS accounts.
     * </p>
     */
    private java.util.List<String> valuesToAdd;

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified
     * by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a
     * manual snapshot, set this list to include one or more AWS account
     * identifiers, or <code>all</code> to remove authorization for any AWS
     * account to copy or restore the DB snapshot. If you specify
     * <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual
     * DB snapshot.
     * </p>
     */
    private java.util.List<String> valuesToRemove;

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     *
     * @return <p>
     *         The identifier for the DB snapshot to modify the attributes for.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier for the DB snapshot to modify the attributes
     *            for.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot to modify the attributes for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier for the DB snapshot to modify the attributes
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a
     * manual DB snapshot, set this value to <code>restore</code>.
     * </p>
     * <note>
     * <p>
     * To view the list of attributes available to modify, use the
     * <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of the DB snapshot attribute to modify.
     *         </p>
     *         <p>
     *         To manage authorization for other AWS accounts to copy or restore
     *         a manual DB snapshot, set this value to <code>restore</code>.
     *         </p>
     *         <note>
     *         <p>
     *         To view the list of attributes available to modify, use the
     *         <a>DescribeDBSnapshotAttributes</a> API action.
     *         </p>
     *         </note>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a
     * manual DB snapshot, set this value to <code>restore</code>.
     * </p>
     * <note>
     * <p>
     * To view the list of attributes available to modify, use the
     * <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * </note>
     *
     * @param attributeName <p>
     *            The name of the DB snapshot attribute to modify.
     *            </p>
     *            <p>
     *            To manage authorization for other AWS accounts to copy or
     *            restore a manual DB snapshot, set this value to
     *            <code>restore</code>.
     *            </p>
     *            <note>
     *            <p>
     *            To view the list of attributes available to modify, use the
     *            <a>DescribeDBSnapshotAttributes</a> API action.
     *            </p>
     *            </note>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the DB snapshot attribute to modify.
     * </p>
     * <p>
     * To manage authorization for other AWS accounts to copy or restore a
     * manual DB snapshot, set this value to <code>restore</code>.
     * </p>
     * <note>
     * <p>
     * To view the list of attributes available to modify, use the
     * <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the DB snapshot attribute to modify.
     *            </p>
     *            <p>
     *            To manage authorization for other AWS accounts to copy or
     *            restore a manual DB snapshot, set this value to
     *            <code>restore</code>.
     *            </p>
     *            <note>
     *            <p>
     *            To view the list of attributes available to modify, use the
     *            <a>DescribeDBSnapshotAttributes</a> API action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set
     * this list to include one or more AWS account IDs, or <code>all</code> to
     * make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private
     * information that you don't want available to all AWS accounts.
     * </p>
     *
     * @return <p>
     *         A list of DB snapshot attributes to add to the attribute
     *         specified by <code>AttributeName</code>.
     *         </p>
     *         <p>
     *         To authorize other AWS accounts to copy or restore a manual
     *         snapshot, set this list to include one or more AWS account IDs,
     *         or <code>all</code> to make the manual DB snapshot restorable by
     *         any AWS account. Do not add the <code>all</code> value for any
     *         manual DB snapshots that contain private information that you
     *         don't want available to all AWS accounts.
     *         </p>
     */
    public java.util.List<String> getValuesToAdd() {
        return valuesToAdd;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set
     * this list to include one or more AWS account IDs, or <code>all</code> to
     * make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private
     * information that you don't want available to all AWS accounts.
     * </p>
     *
     * @param valuesToAdd <p>
     *            A list of DB snapshot attributes to add to the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To authorize other AWS accounts to copy or restore a manual
     *            snapshot, set this list to include one or more AWS account
     *            IDs, or <code>all</code> to make the manual DB snapshot
     *            restorable by any AWS account. Do not add the <code>all</code>
     *            value for any manual DB snapshots that contain private
     *            information that you don't want available to all AWS accounts.
     *            </p>
     */
    public void setValuesToAdd(java.util.Collection<String> valuesToAdd) {
        if (valuesToAdd == null) {
            this.valuesToAdd = null;
            return;
        }

        this.valuesToAdd = new java.util.ArrayList<String>(valuesToAdd);
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set
     * this list to include one or more AWS account IDs, or <code>all</code> to
     * make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private
     * information that you don't want available to all AWS accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valuesToAdd <p>
     *            A list of DB snapshot attributes to add to the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To authorize other AWS accounts to copy or restore a manual
     *            snapshot, set this list to include one or more AWS account
     *            IDs, or <code>all</code> to make the manual DB snapshot
     *            restorable by any AWS account. Do not add the <code>all</code>
     *            value for any manual DB snapshots that contain private
     *            information that you don't want available to all AWS accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToAdd(String... valuesToAdd) {
        if (getValuesToAdd() == null) {
            this.valuesToAdd = new java.util.ArrayList<String>(valuesToAdd.length);
        }
        for (String value : valuesToAdd) {
            this.valuesToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to add to the attribute specified by
     * <code>AttributeName</code>.
     * </p>
     * <p>
     * To authorize other AWS accounts to copy or restore a manual snapshot, set
     * this list to include one or more AWS account IDs, or <code>all</code> to
     * make the manual DB snapshot restorable by any AWS account. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private
     * information that you don't want available to all AWS accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valuesToAdd <p>
     *            A list of DB snapshot attributes to add to the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To authorize other AWS accounts to copy or restore a manual
     *            snapshot, set this list to include one or more AWS account
     *            IDs, or <code>all</code> to make the manual DB snapshot
     *            restorable by any AWS account. Do not add the <code>all</code>
     *            value for any manual DB snapshots that contain private
     *            information that you don't want available to all AWS accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToAdd(java.util.Collection<String> valuesToAdd) {
        setValuesToAdd(valuesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified
     * by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a
     * manual snapshot, set this list to include one or more AWS account
     * identifiers, or <code>all</code> to remove authorization for any AWS
     * account to copy or restore the DB snapshot. If you specify
     * <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual
     * DB snapshot.
     * </p>
     *
     * @return <p>
     *         A list of DB snapshot attributes to remove from the attribute
     *         specified by <code>AttributeName</code>.
     *         </p>
     *         <p>
     *         To remove authorization for other AWS accounts to copy or restore
     *         a manual snapshot, set this list to include one or more AWS
     *         account identifiers, or <code>all</code> to remove authorization
     *         for any AWS account to copy or restore the DB snapshot. If you
     *         specify <code>all</code>, an AWS account whose account ID is
     *         explicitly added to the <code>restore</code> attribute can still
     *         copy or restore the manual DB snapshot.
     *         </p>
     */
    public java.util.List<String> getValuesToRemove() {
        return valuesToRemove;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified
     * by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a
     * manual snapshot, set this list to include one or more AWS account
     * identifiers, or <code>all</code> to remove authorization for any AWS
     * account to copy or restore the DB snapshot. If you specify
     * <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual
     * DB snapshot.
     * </p>
     *
     * @param valuesToRemove <p>
     *            A list of DB snapshot attributes to remove from the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To remove authorization for other AWS accounts to copy or
     *            restore a manual snapshot, set this list to include one or
     *            more AWS account identifiers, or <code>all</code> to remove
     *            authorization for any AWS account to copy or restore the DB
     *            snapshot. If you specify <code>all</code>, an AWS account
     *            whose account ID is explicitly added to the
     *            <code>restore</code> attribute can still copy or restore the
     *            manual DB snapshot.
     *            </p>
     */
    public void setValuesToRemove(java.util.Collection<String> valuesToRemove) {
        if (valuesToRemove == null) {
            this.valuesToRemove = null;
            return;
        }

        this.valuesToRemove = new java.util.ArrayList<String>(valuesToRemove);
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified
     * by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a
     * manual snapshot, set this list to include one or more AWS account
     * identifiers, or <code>all</code> to remove authorization for any AWS
     * account to copy or restore the DB snapshot. If you specify
     * <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual
     * DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valuesToRemove <p>
     *            A list of DB snapshot attributes to remove from the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To remove authorization for other AWS accounts to copy or
     *            restore a manual snapshot, set this list to include one or
     *            more AWS account identifiers, or <code>all</code> to remove
     *            authorization for any AWS account to copy or restore the DB
     *            snapshot. If you specify <code>all</code>, an AWS account
     *            whose account ID is explicitly added to the
     *            <code>restore</code> attribute can still copy or restore the
     *            manual DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToRemove(String... valuesToRemove) {
        if (getValuesToRemove() == null) {
            this.valuesToRemove = new java.util.ArrayList<String>(valuesToRemove.length);
        }
        for (String value : valuesToRemove) {
            this.valuesToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB snapshot attributes to remove from the attribute specified
     * by <code>AttributeName</code>.
     * </p>
     * <p>
     * To remove authorization for other AWS accounts to copy or restore a
     * manual snapshot, set this list to include one or more AWS account
     * identifiers, or <code>all</code> to remove authorization for any AWS
     * account to copy or restore the DB snapshot. If you specify
     * <code>all</code>, an AWS account whose account ID is explicitly added to
     * the <code>restore</code> attribute can still copy or restore the manual
     * DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valuesToRemove <p>
     *            A list of DB snapshot attributes to remove from the attribute
     *            specified by <code>AttributeName</code>.
     *            </p>
     *            <p>
     *            To remove authorization for other AWS accounts to copy or
     *            restore a manual snapshot, set this list to include one or
     *            more AWS account identifiers, or <code>all</code> to remove
     *            authorization for any AWS account to copy or restore the DB
     *            snapshot. If you specify <code>all</code>, an AWS account
     *            whose account ID is explicitly added to the
     *            <code>restore</code> attribute can still copy or restore the
     *            manual DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeRequest withValuesToRemove(
            java.util.Collection<String> valuesToRemove) {
        setValuesToRemove(valuesToRemove);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getValuesToAdd() != null)
            sb.append("ValuesToAdd: " + getValuesToAdd() + ",");
        if (getValuesToRemove() != null)
            sb.append("ValuesToRemove: " + getValuesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getValuesToAdd() == null) ? 0 : getValuesToAdd().hashCode());
        hashCode = prime * hashCode
                + ((getValuesToRemove() == null) ? 0 : getValuesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotAttributeRequest == false)
            return false;
        ModifyDBSnapshotAttributeRequest other = (ModifyDBSnapshotAttributeRequest) obj;

        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getValuesToAdd() == null ^ this.getValuesToAdd() == null)
            return false;
        if (other.getValuesToAdd() != null
                && other.getValuesToAdd().equals(this.getValuesToAdd()) == false)
            return false;
        if (other.getValuesToRemove() == null ^ this.getValuesToRemove() == null)
            return false;
        if (other.getValuesToRemove() != null
                && other.getValuesToRemove().equals(this.getValuesToRemove()) == false)
            return false;
        return true;
    }
}