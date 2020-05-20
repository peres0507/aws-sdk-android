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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves details for the specified Amazon Chime Voice Connector group, such
 * as timestamps, name, and associated <code>VoiceConnectorItems</code>.
 * </p>
 */
public class GetVoiceConnectorGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String voiceConnectorGroupId;

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime Voice Connector group ID.
     *         </p>
     */
    public String getVoiceConnectorGroupId() {
        return voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     */
    public void setVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connector group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param voiceConnectorGroupId <p>
     *            The Amazon Chime Voice Connector group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVoiceConnectorGroupRequest withVoiceConnectorGroupId(String voiceConnectorGroupId) {
        this.voiceConnectorGroupId = voiceConnectorGroupId;
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
        if (getVoiceConnectorGroupId() != null)
            sb.append("VoiceConnectorGroupId: " + getVoiceConnectorGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVoiceConnectorGroupId() == null) ? 0 : getVoiceConnectorGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceConnectorGroupRequest == false)
            return false;
        GetVoiceConnectorGroupRequest other = (GetVoiceConnectorGroupRequest) obj;

        if (other.getVoiceConnectorGroupId() == null ^ this.getVoiceConnectorGroupId() == null)
            return false;
        if (other.getVoiceConnectorGroupId() != null
                && other.getVoiceConnectorGroupId().equals(this.getVoiceConnectorGroupId()) == false)
            return false;
        return true;
    }
}
