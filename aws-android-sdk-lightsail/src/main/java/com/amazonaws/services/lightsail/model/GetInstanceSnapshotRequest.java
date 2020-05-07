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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about a specific instance snapshot.
 * </p>
 */
public class GetInstanceSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the snapshot for which you are requesting information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceSnapshotName;

    /**
     * <p>
     * The name of the snapshot for which you are requesting information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the snapshot for which you are requesting
     *         information.
     *         </p>
     */
    public String getInstanceSnapshotName() {
        return instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the snapshot for which you are requesting information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceSnapshotName <p>
     *            The name of the snapshot for which you are requesting
     *            information.
     *            </p>
     */
    public void setInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
    }

    /**
     * <p>
     * The name of the snapshot for which you are requesting information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceSnapshotName <p>
     *            The name of the snapshot for which you are requesting
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceSnapshotRequest withInstanceSnapshotName(String instanceSnapshotName) {
        this.instanceSnapshotName = instanceSnapshotName;
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
        if (getInstanceSnapshotName() != null)
            sb.append("instanceSnapshotName: " + getInstanceSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceSnapshotName() == null) ? 0 : getInstanceSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceSnapshotRequest == false)
            return false;
        GetInstanceSnapshotRequest other = (GetInstanceSnapshotRequest) obj;

        if (other.getInstanceSnapshotName() == null ^ this.getInstanceSnapshotName() == null)
            return false;
        if (other.getInstanceSnapshotName() != null
                && other.getInstanceSnapshotName().equals(this.getInstanceSnapshotName()) == false)
            return false;
        return true;
    }
}