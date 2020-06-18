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

public class DescribeEngineDefaultParametersResult implements Serializable {
    /**
     * <p>
     * Contains the result of a successful invocation of the
     * <code>DescribeEngineDefaultParameters</code> action.
     * </p>
     */
    private EngineDefaults engineDefaults;

    /**
     * <p>
     * Contains the result of a successful invocation of the
     * <code>DescribeEngineDefaultParameters</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the result of a successful invocation of the
     *         <code>DescribeEngineDefaultParameters</code> action.
     *         </p>
     */
    public EngineDefaults getEngineDefaults() {
        return engineDefaults;
    }

    /**
     * <p>
     * Contains the result of a successful invocation of the
     * <code>DescribeEngineDefaultParameters</code> action.
     * </p>
     *
     * @param engineDefaults <p>
     *            Contains the result of a successful invocation of the
     *            <code>DescribeEngineDefaultParameters</code> action.
     *            </p>
     */
    public void setEngineDefaults(EngineDefaults engineDefaults) {
        this.engineDefaults = engineDefaults;
    }

    /**
     * <p>
     * Contains the result of a successful invocation of the
     * <code>DescribeEngineDefaultParameters</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineDefaults <p>
     *            Contains the result of a successful invocation of the
     *            <code>DescribeEngineDefaultParameters</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEngineDefaultParametersResult withEngineDefaults(EngineDefaults engineDefaults) {
        this.engineDefaults = engineDefaults;
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
        if (getEngineDefaults() != null)
            sb.append("EngineDefaults: " + getEngineDefaults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEngineDefaults() == null) ? 0 : getEngineDefaults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEngineDefaultParametersResult == false)
            return false;
        DescribeEngineDefaultParametersResult other = (DescribeEngineDefaultParametersResult) obj;

        if (other.getEngineDefaults() == null ^ this.getEngineDefaults() == null)
            return false;
        if (other.getEngineDefaults() != null
                && other.getEngineDefaults().equals(this.getEngineDefaults()) == false)
            return false;
        return true;
    }
}
