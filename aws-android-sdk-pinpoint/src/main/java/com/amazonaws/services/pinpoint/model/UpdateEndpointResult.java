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

public class UpdateEndpointResult implements Serializable {
    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     */
    private MessageBody messageBody;

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     *
     * @return <p>
     *         Provides information about an API request or response.
     *         </p>
     */
    public MessageBody getMessageBody() {
        return messageBody;
    }

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     *
     * @param messageBody <p>
     *            Provides information about an API request or response.
     *            </p>
     */
    public void setMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * Provides information about an API request or response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody <p>
     *            Provides information about an API request or response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointResult withMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
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
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointResult == false)
            return false;
        UpdateEndpointResult other = (UpdateEndpointResult) obj;

        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null
                && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        return true;
    }
}
