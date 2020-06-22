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

public class DeleteEventSubscriptionResult implements Serializable {
    /**
     * <p>
     * Contains the results of a successful invocation of the
     * <code>DescribeEventSubscriptions</code> action.
     * </p>
     */
    private EventSubscription eventSubscription;

    /**
     * <p>
     * Contains the results of a successful invocation of the
     * <code>DescribeEventSubscriptions</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the results of a successful invocation of the
     *         <code>DescribeEventSubscriptions</code> action.
     *         </p>
     */
    public EventSubscription getEventSubscription() {
        return eventSubscription;
    }

    /**
     * <p>
     * Contains the results of a successful invocation of the
     * <code>DescribeEventSubscriptions</code> action.
     * </p>
     *
     * @param eventSubscription <p>
     *            Contains the results of a successful invocation of the
     *            <code>DescribeEventSubscriptions</code> action.
     *            </p>
     */
    public void setEventSubscription(EventSubscription eventSubscription) {
        this.eventSubscription = eventSubscription;
    }

    /**
     * <p>
     * Contains the results of a successful invocation of the
     * <code>DescribeEventSubscriptions</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventSubscription <p>
     *            Contains the results of a successful invocation of the
     *            <code>DescribeEventSubscriptions</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteEventSubscriptionResult withEventSubscription(EventSubscription eventSubscription) {
        this.eventSubscription = eventSubscription;
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
        if (getEventSubscription() != null)
            sb.append("EventSubscription: " + getEventSubscription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventSubscription() == null) ? 0 : getEventSubscription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventSubscriptionResult == false)
            return false;
        DeleteEventSubscriptionResult other = (DeleteEventSubscriptionResult) obj;

        if (other.getEventSubscription() == null ^ this.getEventSubscription() == null)
            return false;
        if (other.getEventSubscription() != null
                && other.getEventSubscription().equals(this.getEventSubscription()) == false)
            return false;
        return true;
    }
}