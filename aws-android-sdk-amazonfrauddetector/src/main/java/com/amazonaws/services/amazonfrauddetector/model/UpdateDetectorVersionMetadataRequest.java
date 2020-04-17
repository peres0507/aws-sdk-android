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
 * Updates the detector version's description. You can update the metadata for
 * any detector version (<code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
 * </p>
 */
public class UpdateDetectorVersionMetadataRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String detectorVersionId;

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
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The detector ID.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param detectorId <p>
     *            The detector ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDetectorVersionMetadataRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The detector version ID.
     *         </p>
     */
    public String getDetectorVersionId() {
        return detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     */
    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param detectorVersionId <p>
     *            The detector version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDetectorVersionMetadataRequest withDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
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
    public UpdateDetectorVersionMetadataRequest withDescription(String description) {
        this.description = description;
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
            sb.append("detectorId: " + getDetectorId() + ",");
        if (getDetectorVersionId() != null)
            sb.append("detectorVersionId: " + getDetectorVersionId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDetectorVersionMetadataRequest == false)
            return false;
        UpdateDetectorVersionMetadataRequest other = (UpdateDetectorVersionMetadataRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null
                && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
