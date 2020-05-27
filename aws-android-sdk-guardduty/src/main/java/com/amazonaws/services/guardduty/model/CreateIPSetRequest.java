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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new IPSet, which is called a trusted IP list in the console user
 * interface. An IPSet is a list of IP addresses that are trusted for secure
 * communication with AWS infrastructure and applications. GuardDuty doesn't
 * generate findings for IP addresses that are included in IPSets. Only users
 * from the master account can use this operation.
 * </p>
 */
public class CreateIPSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The user-friendly name to identify the IPSet.
     * </p>
     * <p>
     * Allowed characters are alphanumerics, spaces, hyphens (-), and
     * underscores (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String name;

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     */
    private String format;

    /**
     * <p>
     * The URI of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String location;

    /**
     * <p>
     * A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded IPSet.
     * </p>
     */
    private Boolean activate;

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector of the GuardDuty account that you
     *         want to create an IPSet for.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to create an IPSet for.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account that you want to
     * create an IPSet for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector of the GuardDuty account that
     *            you want to create an IPSet for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The user-friendly name to identify the IPSet.
     * </p>
     * <p>
     * Allowed characters are alphanumerics, spaces, hyphens (-), and
     * underscores (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The user-friendly name to identify the IPSet.
     *         </p>
     *         <p>
     *         Allowed characters are alphanumerics, spaces, hyphens (-), and
     *         underscores (_).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The user-friendly name to identify the IPSet.
     * </p>
     * <p>
     * Allowed characters are alphanumerics, spaces, hyphens (-), and
     * underscores (_).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The user-friendly name to identify the IPSet.
     *            </p>
     *            <p>
     *            Allowed characters are alphanumerics, spaces, hyphens (-), and
     *            underscores (_).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name to identify the IPSet.
     * </p>
     * <p>
     * Allowed characters are alphanumerics, spaces, hyphens (-), and
     * underscores (_).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param name <p>
     *            The user-friendly name to identify the IPSet.
     *            </p>
     *            <p>
     *            Allowed characters are alphanumerics, spaces, hyphens (-), and
     *            underscores (_).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @return <p>
     *         The format of the file that contains the IPSet.
     *         </p>
     * @see IpSetFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @see IpSetFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetFormat
     */
    public CreateIPSetRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @see IpSetFormat
     */
    public void setFormat(IpSetFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the file that contains the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     * <b>Allowed Values: </b>TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT,
     * FIRE_EYE
     *
     * @param format <p>
     *            The format of the file that contains the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpSetFormat
     */
    public CreateIPSetRequest withFormat(IpSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The URI of the file that contains the IPSet.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The URI of the file that contains the IPSet.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI of the file that contains the IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param location <p>
     *            The URI of the file that contains the IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded IPSet.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether GuardDuty is to start
     *         using the uploaded IPSet.
     *         </p>
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * <p>
     * A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded IPSet.
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether GuardDuty is to start
     *         using the uploaded IPSet.
     *         </p>
     */
    public Boolean getActivate() {
        return activate;
    }

    /**
     * <p>
     * A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded IPSet.
     * </p>
     *
     * @param activate <p>
     *            A Boolean value that indicates whether GuardDuty is to start
     *            using the uploaded IPSet.
     *            </p>
     */
    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * <p>
     * A Boolean value that indicates whether GuardDuty is to start using the
     * uploaded IPSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activate <p>
     *            A Boolean value that indicates whether GuardDuty is to start
     *            using the uploaded IPSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withActivate(Boolean activate) {
        this.activate = activate;
        return this;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return <p>
     *         The idempotency token for the create request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     *
     * @return <p>
     *         The tags to be added to a new IP set resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     *
     * @param tags <p>
     *            The tags to be added to a new IP set resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be added to a new IP set resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new IP set resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIPSetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getActivate() != null)
            sb.append("Activate: " + getActivate() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIPSetRequest == false)
            return false;
        CreateIPSetRequest other = (CreateIPSetRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
