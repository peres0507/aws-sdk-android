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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the criteria and other settings for a findings filter.
 * </p>
 */
public class UpdateFindingsFilterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     */
    private String action;

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users might be able to see the filter's
     * description, depending on the actions that they're allowed to perform in
     * Amazon Macie.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     */
    private FindingCriteria findingCriteria;

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     */
    private String id;

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users might be able to see the filter's name,
     * depending on the actions that they're allowed to perform in Amazon Macie.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     */
    private Integer position;

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @return <p>
     *         The action to perform on findings that meet the filter criteria
     *         (findingCriteria). Valid values are: ARCHIVE, automatically
     *         archive the findings; and, NOOP, don't perform any action on the
     *         findings.
     *         </p>
     * @see FindingsFilterAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @see FindingsFilterAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public UpdateFindingsFilterRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @see FindingsFilterAction
     */
    public void setAction(FindingsFilterAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to perform on findings that meet the filter criteria
     * (findingCriteria). Valid values are: ARCHIVE, automatically archive the
     * findings; and, NOOP, don't perform any action on the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARCHIVE, NOOP
     *
     * @param action <p>
     *            The action to perform on findings that meet the filter
     *            criteria (findingCriteria). Valid values are: ARCHIVE,
     *            automatically archive the findings; and, NOOP, don't perform
     *            any action on the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingsFilterAction
     */
    public UpdateFindingsFilterRequest withAction(FindingsFilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users might be able to see the filter's
     * description, depending on the actions that they're allowed to perform in
     * Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom description of the filter. The description can contain
     *         as many as 512 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the description of a filter. Other users might be able to see
     *         the filter's description, depending on the actions that they're
     *         allowed to perform in Amazon Macie.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users might be able to see the filter's
     * description, depending on the actions that they're allowed to perform in
     * Amazon Macie.
     * </p>
     *
     * @param description <p>
     *            A custom description of the filter. The description can
     *            contain as many as 512 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a filter. Other users might be able
     *            to see the filter's description, depending on the actions that
     *            they're allowed to perform in Amazon Macie.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the filter. The description can contain as many
     * as 512 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * description of a filter. Other users might be able to see the filter's
     * description, depending on the actions that they're allowed to perform in
     * Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A custom description of the filter. The description can
     *            contain as many as 512 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the description of a filter. Other users might be able
     *            to see the filter's description, depending on the actions that
     *            they're allowed to perform in Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFilterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter findings.
     *         </p>
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter findings.
     *            </p>
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingCriteria <p>
     *            The criteria to use to filter findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the Amazon Macie resource or account
     *         that the request applies to.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the Amazon Macie resource or account
     *            that the request applies to.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Macie resource or account that the
     * request applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the Amazon Macie resource or account
     *            that the request applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFilterRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users might be able to see the filter's name,
     * depending on the actions that they're allowed to perform in Amazon Macie.
     * </p>
     *
     * @return <p>
     *         A custom name for the filter. The name must contain at least 3
     *         characters and can contain as many as 64 characters.
     *         </p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data
     *         in the name of a filter. Other users might be able to see the
     *         filter's name, depending on the actions that they're allowed to
     *         perform in Amazon Macie.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users might be able to see the filter's name,
     * depending on the actions that they're allowed to perform in Amazon Macie.
     * </p>
     *
     * @param name <p>
     *            A custom name for the filter. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a filter. Other users might be able to see
     *            the filter's name, depending on the actions that they're
     *            allowed to perform in Amazon Macie.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the filter. The name must contain at least 3 characters
     * and can contain as many as 64 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the
     * name of a filter. Other users might be able to see the filter's name,
     * depending on the actions that they're allowed to perform in Amazon Macie.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A custom name for the filter. The name must contain at least 3
     *            characters and can contain as many as 64 characters.
     *            </p>
     *            <p>
     *            We strongly recommend that you avoid including any sensitive
     *            data in the name of a filter. Other users might be able to see
     *            the filter's name, depending on the actions that they're
     *            allowed to perform in Amazon Macie.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFilterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     *
     * @return <p>
     *         The position of the filter in the list of saved filters on the
     *         Amazon Macie console. This value also determines the order in
     *         which the filter is applied to findings, relative to other
     *         filters that are also applied to the findings.
     *         </p>
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     *
     * @param position <p>
     *            The position of the filter in the list of saved filters on the
     *            Amazon Macie console. This value also determines the order in
     *            which the filter is applied to findings, relative to other
     *            filters that are also applied to the findings.
     *            </p>
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the filter in the list of saved filters on the Amazon
     * Macie console. This value also determines the order in which the filter
     * is applied to findings, relative to other filters that are also applied
     * to the findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The position of the filter in the list of saved filters on the
     *            Amazon Macie console. This value also determines the order in
     *            which the filter is applied to findings, relative to other
     *            filters that are also applied to the findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsFilterRequest withPosition(Integer position) {
        this.position = position;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getFindingCriteria() != null)
            sb.append("findingCriteria: " + getFindingCriteria() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsFilterRequest == false)
            return false;
        UpdateFindingsFilterRequest other = (UpdateFindingsFilterRequest) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null
                && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }
}
