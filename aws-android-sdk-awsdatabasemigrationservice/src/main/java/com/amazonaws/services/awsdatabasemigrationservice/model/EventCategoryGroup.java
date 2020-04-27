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
 * <p>
 * Lists categories of events subscribed to, and generated by, the applicable
 * AWS DMS resource type.
 * </p>
 */
public class EventCategoryGroup implements Serializable {
    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * A list of event categories from a source type that you've chosen.
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     *
     * @return <p>
     *         The type of AWS DMS resource that generates events.
     *         </p>
     *         <p>
     *         Valid values: replication-instance | replication-server |
     *         security-group | replication-task
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
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-server |
     *            security-group | replication-task
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
     * Valid values: replication-instance | replication-server | security-group
     * | replication-task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceType <p>
     *            The type of AWS DMS resource that generates events.
     *            </p>
     *            <p>
     *            Valid values: replication-instance | replication-server |
     *            security-group | replication-task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventCategoryGroup withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * A list of event categories from a source type that you've chosen.
     * </p>
     *
     * @return <p>
     *         A list of event categories from a source type that you've chosen.
     *         </p>
     */
    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories from a source type that you've chosen.
     * </p>
     *
     * @param eventCategories <p>
     *            A list of event categories from a source type that you've
     *            chosen.
     *            </p>
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories from a source type that you've chosen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories from a source type that you've
     *            chosen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventCategoryGroup withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) {
            this.eventCategories = new java.util.ArrayList<String>(eventCategories.length);
        }
        for (String value : eventCategories) {
            this.eventCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories from a source type that you've chosen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories from a source type that you've
     *            chosen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventCategoryGroup withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
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
        if (getEventCategories() != null)
            sb.append("EventCategories: " + getEventCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventCategoryGroup == false)
            return false;
        EventCategoryGroup other = (EventCategoryGroup) obj;

        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null
                && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        return true;
    }
}
