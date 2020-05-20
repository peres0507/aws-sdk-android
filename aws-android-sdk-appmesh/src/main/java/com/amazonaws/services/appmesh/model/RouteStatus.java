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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the current status of a route.
 * </p>
 */
public class RouteStatus implements Serializable {
    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     *
     * @return <p>
     *         The current status for the route.
     *         </p>
     * @see RouteStatusCode
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     *
     * @param status <p>
     *            The current status for the route.
     *            </p>
     * @see RouteStatusCode
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     *
     * @param status <p>
     *            The current status for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteStatusCode
     */
    public RouteStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     *
     * @param status <p>
     *            The current status for the route.
     *            </p>
     * @see RouteStatusCode
     */
    public void setStatus(RouteStatusCode status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status for the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED, INACTIVE
     *
     * @param status <p>
     *            The current status for the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteStatusCode
     */
    public RouteStatus withStatus(RouteStatusCode status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteStatus == false)
            return false;
        RouteStatus other = (RouteStatus) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}