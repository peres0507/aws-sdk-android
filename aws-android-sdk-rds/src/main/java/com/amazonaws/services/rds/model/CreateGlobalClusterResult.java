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

public class CreateGlobalClusterResult implements Serializable {
    /**
     * <p>
     * A data type representing an Aurora global database.
     * </p>
     */
    private GlobalCluster globalCluster;

    /**
     * <p>
     * A data type representing an Aurora global database.
     * </p>
     *
     * @return <p>
     *         A data type representing an Aurora global database.
     *         </p>
     */
    public GlobalCluster getGlobalCluster() {
        return globalCluster;
    }

    /**
     * <p>
     * A data type representing an Aurora global database.
     * </p>
     *
     * @param globalCluster <p>
     *            A data type representing an Aurora global database.
     *            </p>
     */
    public void setGlobalCluster(GlobalCluster globalCluster) {
        this.globalCluster = globalCluster;
    }

    /**
     * <p>
     * A data type representing an Aurora global database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalCluster <p>
     *            A data type representing an Aurora global database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterResult withGlobalCluster(GlobalCluster globalCluster) {
        this.globalCluster = globalCluster;
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
        if (getGlobalCluster() != null)
            sb.append("GlobalCluster: " + getGlobalCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalCluster() == null) ? 0 : getGlobalCluster().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalClusterResult == false)
            return false;
        CreateGlobalClusterResult other = (CreateGlobalClusterResult) obj;

        if (other.getGlobalCluster() == null ^ this.getGlobalCluster() == null)
            return false;
        if (other.getGlobalCluster() != null
                && other.getGlobalCluster().equals(this.getGlobalCluster()) == false)
            return false;
        return true;
    }
}