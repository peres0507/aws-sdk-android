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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detaches a static IP from the Amazon Lightsail instance to which it is
 * attached.
 * </p>
 */
public class DetachStaticIpRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the static IP to detach from the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String staticIpName;

    /**
     * <p>
     * The name of the static IP to detach from the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the static IP to detach from the instance.
     *         </p>
     */
    public String getStaticIpName() {
        return staticIpName;
    }

    /**
     * <p>
     * The name of the static IP to detach from the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param staticIpName <p>
     *            The name of the static IP to detach from the instance.
     *            </p>
     */
    public void setStaticIpName(String staticIpName) {
        this.staticIpName = staticIpName;
    }

    /**
     * <p>
     * The name of the static IP to detach from the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param staticIpName <p>
     *            The name of the static IP to detach from the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachStaticIpRequest withStaticIpName(String staticIpName) {
        this.staticIpName = staticIpName;
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
        if (getStaticIpName() != null)
            sb.append("staticIpName: " + getStaticIpName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStaticIpName() == null) ? 0 : getStaticIpName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachStaticIpRequest == false)
            return false;
        DetachStaticIpRequest other = (DetachStaticIpRequest) obj;

        if (other.getStaticIpName() == null ^ this.getStaticIpName() == null)
            return false;
        if (other.getStaticIpName() != null
                && other.getStaticIpName().equals(this.getStaticIpName()) == false)
            return false;
        return true;
    }
}