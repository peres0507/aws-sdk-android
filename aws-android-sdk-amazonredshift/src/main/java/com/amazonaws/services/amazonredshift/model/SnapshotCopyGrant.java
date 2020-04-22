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
 * The snapshot copy grant that grants Amazon Redshift permission to encrypt
 * copied snapshots with the specified customer master key (CMK) from AWS KMS in
 * the destination region.
 * </p>
 * <p>
 * For more information about managing snapshot copy grants, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
 * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift Cluster
 * Management Guide</i>.
 * </p>
 */
public class SnapshotCopyGrant implements Serializable {
    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     */
    private String snapshotCopyGrantName;

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     *
     * @return <p>
     *         The name of the snapshot copy grant.
     *         </p>
     */
    public String getSnapshotCopyGrantName() {
        return snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     *
     * @param snapshotCopyGrantName <p>
     *            The name of the snapshot copy grant.
     *            </p>
     */
    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCopyGrantName <p>
     *            The name of the snapshot copy grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotCopyGrant withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the customer master key (CMK) in AWS KMS
     *         to which Amazon Redshift is granted permission.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The unique identifier of the customer master key (CMK) in AWS
     *            KMS to which Amazon Redshift is granted permission.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) in AWS KMS to
     * which Amazon Redshift is granted permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The unique identifier of the customer master key (CMK) in AWS
     *            KMS to which Amazon Redshift is granted permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotCopyGrant withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @return <p>
     *         A list of tag instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotCopyGrant withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tag instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotCopyGrant withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotCopyGrant == false)
            return false;
        SnapshotCopyGrant other = (SnapshotCopyGrant) obj;

        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null
                && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
