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

/**
 * <p/>
 */
public class DescribeEventCategoriesResult implements Serializable {
    /**
     * <p>
     * A list of event categories.
     * </p>
     */
    private java.util.List<EventCategoryGroup> eventCategoryGroupList;

    /**
     * <p>
     * A list of event categories.
     * </p>
     *
     * @return <p>
     *         A list of event categories.
     *         </p>
     */
    public java.util.List<EventCategoryGroup> getEventCategoryGroupList() {
        return eventCategoryGroupList;
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     *
     * @param eventCategoryGroupList <p>
     *            A list of event categories.
     *            </p>
     */
    public void setEventCategoryGroupList(
            java.util.Collection<EventCategoryGroup> eventCategoryGroupList) {
        if (eventCategoryGroupList == null) {
            this.eventCategoryGroupList = null;
            return;
        }

        this.eventCategoryGroupList = new java.util.ArrayList<EventCategoryGroup>(
                eventCategoryGroupList);
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoryGroupList <p>
     *            A list of event categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesResult withEventCategoryGroupList(
            EventCategoryGroup... eventCategoryGroupList) {
        if (getEventCategoryGroupList() == null) {
            this.eventCategoryGroupList = new java.util.ArrayList<EventCategoryGroup>(
                    eventCategoryGroupList.length);
        }
        for (EventCategoryGroup value : eventCategoryGroupList) {
            this.eventCategoryGroupList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategoryGroupList <p>
     *            A list of event categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventCategoriesResult withEventCategoryGroupList(
            java.util.Collection<EventCategoryGroup> eventCategoryGroupList) {
        setEventCategoryGroupList(eventCategoryGroupList);
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
        if (getEventCategoryGroupList() != null)
            sb.append("EventCategoryGroupList: " + getEventCategoryGroupList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEventCategoryGroupList() == null) ? 0 : getEventCategoryGroupList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesResult == false)
            return false;
        DescribeEventCategoriesResult other = (DescribeEventCategoriesResult) obj;

        if (other.getEventCategoryGroupList() == null ^ this.getEventCategoryGroupList() == null)
            return false;
        if (other.getEventCategoryGroupList() != null
                && other.getEventCategoryGroupList().equals(this.getEventCategoryGroupList()) == false)
            return false;
        return true;
    }
}
