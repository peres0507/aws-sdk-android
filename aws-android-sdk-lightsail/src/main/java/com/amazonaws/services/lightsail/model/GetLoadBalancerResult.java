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

public class GetLoadBalancerResult implements Serializable {
    /**
     * <p>
     * An object containing information about your load balancer.
     * </p>
     */
    private LoadBalancer loadBalancer;

    /**
     * <p>
     * An object containing information about your load balancer.
     * </p>
     *
     * @return <p>
     *         An object containing information about your load balancer.
     *         </p>
     */
    public LoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    /**
     * <p>
     * An object containing information about your load balancer.
     * </p>
     *
     * @param loadBalancer <p>
     *            An object containing information about your load balancer.
     *            </p>
     */
    public void setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    /**
     * <p>
     * An object containing information about your load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancer <p>
     *            An object containing information about your load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLoadBalancerResult withLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
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
        if (getLoadBalancer() != null)
            sb.append("loadBalancer: " + getLoadBalancer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancer() == null) ? 0 : getLoadBalancer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancerResult == false)
            return false;
        GetLoadBalancerResult other = (GetLoadBalancerResult) obj;

        if (other.getLoadBalancer() == null ^ this.getLoadBalancer() == null)
            return false;
        if (other.getLoadBalancer() != null
                && other.getLoadBalancer().equals(this.getLoadBalancer()) == false)
            return false;
        return true;
    }
}