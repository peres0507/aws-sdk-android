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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a rule version resulting in a new rule version.
 * </p>
 */
public class UpdateRuleVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The rule to update.
     * </p>
     */
    private Rule rule;

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String expression;

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     */
    private String language;

    /**
     * <p>
     * The outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;

    /**
     * <p>
     * The rule to update.
     * </p>
     *
     * @return <p>
     *         The rule to update.
     *         </p>
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * <p>
     * The rule to update.
     * </p>
     *
     * @param rule <p>
     *            The rule to update.
     *            </p>
     */
    public void setRule(Rule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * The rule to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rule <p>
     *            The rule to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleVersionRequest withRule(Rule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The rule expression.
     *         </p>
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            The rule expression.
     *            </p>
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The rule expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param expression <p>
     *            The rule expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleVersionRequest withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @return <p>
     *         The language.
     *         </p>
     * @see Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The language.
     *            </p>
     * @see Language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public UpdateRuleVersionRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The language.
     *            </p>
     * @see Language
     */
    public void setLanguage(Language language) {
        this.language = language.toString();
    }

    /**
     * <p>
     * The language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DETECTORPL
     *
     * @param language <p>
     *            The language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Language
     */
    public UpdateRuleVersionRequest withLanguage(Language language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     *
     * @return <p>
     *         The outcomes.
     *         </p>
     */
    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     */
    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleVersionRequest withOutcomes(String... outcomes) {
        if (getOutcomes() == null) {
            this.outcomes = new java.util.ArrayList<String>(outcomes.length);
        }
        for (String value : outcomes) {
            this.outcomes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleVersionRequest withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
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
        if (getRule() != null)
            sb.append("rule: " + getRule() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getExpression() != null)
            sb.append("expression: " + getExpression() + ",");
        if (getLanguage() != null)
            sb.append("language: " + getLanguage() + ",");
        if (getOutcomes() != null)
            sb.append("outcomes: " + getOutcomes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleVersionRequest == false)
            return false;
        UpdateRuleVersionRequest other = (UpdateRuleVersionRequest) obj;

        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        return true;
    }
}
