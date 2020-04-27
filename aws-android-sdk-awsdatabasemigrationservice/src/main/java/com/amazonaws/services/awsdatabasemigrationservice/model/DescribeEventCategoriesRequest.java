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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists categories for all event source types, or, if specified, for a
 * specified source type. You can see a list of the event categories and source
 * types in <a
 * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html"
 * >Working with Events and Notifications</a> in the <i>AWS Database Migration
 * Service User Guide.</i>
 * </p>
 */
public class DescribeEventCategoriesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-task
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * Filters applied to the action.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-task
     * </p>
     *
     * @return <p>
     *         The type of AWS DMS resource that generates events.
     *         </p>
     *         <p>
     *         Valid values: replication-instance | replication-task
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-task
     * </p>
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-task
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * Filters applied to the action.
     * </p>
     *
     * @return <p>
     *         Filters applied to the action.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters applied to the action.
     * </p>
     *
     * @param filters <p>
     *            Filters applied to the action.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * Filters applied to the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters applied to the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters applied to the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters applied to the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesRequest == false)
            return false;
        DescribeEventCategoriesRequest other = (DescribeEventCategoriesRequest) obj;

        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
