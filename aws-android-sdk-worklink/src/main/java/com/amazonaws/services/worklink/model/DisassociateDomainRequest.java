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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates a domain from Amazon WorkLink. End users lose the ability to
 * access the domain with Amazon WorkLink.
 * </p>
 */
public class DisassociateDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String fleetArn;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the fleet.
     *         </p>
     */
    public String getFleetArn() {
        return fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     */
    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDomainRequest withFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getFleetArn() != null)
            sb.append("FleetArn: " + getFleetArn() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDomainRequest == false)
            return false;
        DisassociateDomainRequest other = (DisassociateDomainRequest) obj;

        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }
}
