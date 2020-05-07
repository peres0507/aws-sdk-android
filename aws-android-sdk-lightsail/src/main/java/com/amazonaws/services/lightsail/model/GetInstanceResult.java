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

public class GetInstanceResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about the specified
     * instance.
     * </p>
     */
    private Instance instance;

    /**
     * <p>
     * An array of key-value pairs containing information about the specified
     * instance.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the
     *         specified instance.
     *         </p>
     */
    public Instance getInstance() {
        return instance;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the specified
     * instance.
     * </p>
     *
     * @param instance <p>
     *            An array of key-value pairs containing information about the
     *            specified instance.
     *            </p>
     */
    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the specified
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instance <p>
     *            An array of key-value pairs containing information about the
     *            specified instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceResult withInstance(Instance instance) {
        this.instance = instance;
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
        if (getInstance() != null)
            sb.append("instance: " + getInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstance() == null) ? 0 : getInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceResult == false)
            return false;
        GetInstanceResult other = (GetInstanceResult) obj;

        if (other.getInstance() == null ^ this.getInstance() == null)
            return false;
        if (other.getInstance() != null && other.getInstance().equals(this.getInstance()) == false)
            return false;
        return true;
    }
}