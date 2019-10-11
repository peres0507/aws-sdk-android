/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the status and settings of the GCM channel for an application. This
 * channel enables Amazon Pinpoint to send push notifications through the
 * Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
 * service.
 * </p>
 */
public class GCMChannelRequest implements Serializable {
    /**
     * <p>
     * The Web API Key, also referred to as an <i>API_KEY</i> or <i>server
     * key</i>, that you received from Google to communicate with Google
     * services.
     * </p>
     */
    private String apiKey;

    /**
     * <p>
     * Specifies whether to enable the GCM channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The Web API Key, also referred to as an <i>API_KEY</i> or <i>server
     * key</i>, that you received from Google to communicate with Google
     * services.
     * </p>
     *
     * @return <p>
     *         The Web API Key, also referred to as an <i>API_KEY</i> or
     *         <i>server key</i>, that you received from Google to communicate
     *         with Google services.
     *         </p>
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * <p>
     * The Web API Key, also referred to as an <i>API_KEY</i> or <i>server
     * key</i>, that you received from Google to communicate with Google
     * services.
     * </p>
     *
     * @param apiKey <p>
     *            The Web API Key, also referred to as an <i>API_KEY</i> or
     *            <i>server key</i>, that you received from Google to
     *            communicate with Google services.
     *            </p>
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The Web API Key, also referred to as an <i>API_KEY</i> or <i>server
     * key</i>, that you received from Google to communicate with Google
     * services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiKey <p>
     *            The Web API Key, also referred to as an <i>API_KEY</i> or
     *            <i>server key</i>, that you received from Google to
     *            communicate with Google services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelRequest withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the GCM channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the GCM channel for the application.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the GCM channel for the application.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable the GCM channel for the application.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the GCM channel for the application.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether to enable the GCM channel for the
     *            application.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the GCM channel for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether to enable the GCM channel for the
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GCMChannelRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getApiKey() != null)
            sb.append("ApiKey: " + getApiKey() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GCMChannelRequest == false)
            return false;
        GCMChannelRequest other = (GCMChannelRequest) obj;

        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
