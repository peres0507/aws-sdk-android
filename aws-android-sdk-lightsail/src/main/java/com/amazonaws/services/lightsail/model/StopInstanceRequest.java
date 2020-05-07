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
 * Stops a specific Amazon Lightsail instance that is currently running.
 * </p>
 * <note>
 * <p>
 * When you start a stopped instance, Lightsail assigns a new public IP address
 * to the instance. To use the same IP address after stopping and starting an
 * instance, create a static IP address and attach it to the instance. For more
 * information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/lightsail-create-static-ip"
 * >Lightsail Dev Guide</a>.
 * </p>
 * </note>
 * <p>
 * The <code>stop instance</code> operation supports tag-based access control
 * via resource tags applied to the resource identified by
 * <code>instance name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class StopInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck
     * in a <code>stopping</code> state to stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in
     * the <code>stopping</code> state. In any other state, your instance should
     * stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance (a virtual private server) to stop.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance (a virtual private server) to stop.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance (a virtual private server) to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance (a virtual private server) to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstanceRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck
     * in a <code>stopping</code> state to stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in
     * the <code>stopping</code> state. In any other state, your instance should
     * stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     *
     * @return <p>
     *         When set to <code>True</code>, forces a Lightsail instance that
     *         is stuck in a <code>stopping</code> state to stop.
     *         </p>
     *         <important>
     *         <p>
     *         Only use the <code>force</code> parameter if your instance is
     *         stuck in the <code>stopping</code> state. In any other state,
     *         your instance should stop normally without adding this parameter
     *         to your API request.
     *         </p>
     *         </important>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck
     * in a <code>stopping</code> state to stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in
     * the <code>stopping</code> state. In any other state, your instance should
     * stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     *
     * @return <p>
     *         When set to <code>True</code>, forces a Lightsail instance that
     *         is stuck in a <code>stopping</code> state to stop.
     *         </p>
     *         <important>
     *         <p>
     *         Only use the <code>force</code> parameter if your instance is
     *         stuck in the <code>stopping</code> state. In any other state,
     *         your instance should stop normally without adding this parameter
     *         to your API request.
     *         </p>
     *         </important>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck
     * in a <code>stopping</code> state to stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in
     * the <code>stopping</code> state. In any other state, your instance should
     * stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     *
     * @param force <p>
     *            When set to <code>True</code>, forces a Lightsail instance
     *            that is stuck in a <code>stopping</code> state to stop.
     *            </p>
     *            <important>
     *            <p>
     *            Only use the <code>force</code> parameter if your instance is
     *            stuck in the <code>stopping</code> state. In any other state,
     *            your instance should stop normally without adding this
     *            parameter to your API request.
     *            </p>
     *            </important>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * When set to <code>True</code>, forces a Lightsail instance that is stuck
     * in a <code>stopping</code> state to stop.
     * </p>
     * <important>
     * <p>
     * Only use the <code>force</code> parameter if your instance is stuck in
     * the <code>stopping</code> state. In any other state, your instance should
     * stop normally without adding this parameter to your API request.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            When set to <code>True</code>, forces a Lightsail instance
     *            that is stuck in a <code>stopping</code> state to stop.
     *            </p>
     *            <important>
     *            <p>
     *            Only use the <code>force</code> parameter if your instance is
     *            stuck in the <code>stopping</code> state. In any other state,
     *            your instance should stop normally without adding this
     *            parameter to your API request.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopInstanceRequest withForce(Boolean force) {
        this.force = force;
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getForce() != null)
            sb.append("force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstanceRequest == false)
            return false;
        StopInstanceRequest other = (StopInstanceRequest) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}