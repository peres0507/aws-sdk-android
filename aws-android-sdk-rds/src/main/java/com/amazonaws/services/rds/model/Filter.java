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
 * A filter name and value pair that is used to return a more specific list of
 * results from a describe operation. Filters can be used to match a set of
 * resources by specific criteria, such as IDs. The filters supported by a
 * describe operation are documented with the describe operation.
 * </p>
 * <note>
 * <p>
 * Currently, wildcards are not supported in filters.
 * </p>
 * </note>
 * <p>
 * The following actions can be filtered:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeDBClusterBacktracks</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBClusterEndpoints</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBClusters</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBInstances</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribePendingMaintenanceActions</code>
 * </p>
 * </li>
 * </ul>
 */
public class Filter implements Serializable {
    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     */
    private String name;

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the filter. Filter names are case-sensitive.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     *
     * @param name <p>
     *            The name of the filter. Filter names are case-sensitive.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. Filter names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the filter. Filter names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     *
     * @return <p>
     *         One or more filter values. Filter values are case-sensitive.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     *
     * @param values <p>
     *            One or more filter values. Filter values are case-sensitive.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            One or more filter values. Filter values are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filter values. Filter values are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            One or more filter values. Filter values are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}