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

package com.amazonaws.services.securityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about an override action for a rule.
 * </p>
 */
public class WafOverrideAction implements Serializable {
    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> .
     * </p>
     * <p>
     * If set to <code>NONE</code>, the rule's action takes place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> .
     * </p>
     * <p>
     * If set to <code>NONE</code>, the rule's action takes place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         <code>COUNT</code> overrides the action specified by the
     *         individual rule within a <code>RuleGroup</code> .
     *         </p>
     *         <p>
     *         If set to <code>NONE</code>, the rule's action takes place.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> .
     * </p>
     * <p>
     * If set to <code>NONE</code>, the rule's action takes place.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> .
     *            </p>
     *            <p>
     *            If set to <code>NONE</code>, the rule's action takes place.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * <code>COUNT</code> overrides the action specified by the individual rule
     * within a <code>RuleGroup</code> .
     * </p>
     * <p>
     * If set to <code>NONE</code>, the rule's action takes place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            <code>COUNT</code> overrides the action specified by the
     *            individual rule within a <code>RuleGroup</code> .
     *            </p>
     *            <p>
     *            If set to <code>NONE</code>, the rule's action takes place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WafOverrideAction withType(String type) {
        this.type = type;
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
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WafOverrideAction == false)
            return false;
        WafOverrideAction other = (WafOverrideAction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
