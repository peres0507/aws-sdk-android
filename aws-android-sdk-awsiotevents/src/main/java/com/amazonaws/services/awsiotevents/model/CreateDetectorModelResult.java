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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class CreateDetectorModelResult implements Serializable {
    /**
     * <p>
     * Information about how the detector model is configured.
     * </p>
     */
    private DetectorModelConfiguration detectorModelConfiguration;

    /**
     * <p>
     * Information about how the detector model is configured.
     * </p>
     *
     * @return <p>
     *         Information about how the detector model is configured.
     *         </p>
     */
    public DetectorModelConfiguration getDetectorModelConfiguration() {
        return detectorModelConfiguration;
    }

    /**
     * <p>
     * Information about how the detector model is configured.
     * </p>
     *
     * @param detectorModelConfiguration <p>
     *            Information about how the detector model is configured.
     *            </p>
     */
    public void setDetectorModelConfiguration(DetectorModelConfiguration detectorModelConfiguration) {
        this.detectorModelConfiguration = detectorModelConfiguration;
    }

    /**
     * <p>
     * Information about how the detector model is configured.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelConfiguration <p>
     *            Information about how the detector model is configured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorModelResult withDetectorModelConfiguration(
            DetectorModelConfiguration detectorModelConfiguration) {
        this.detectorModelConfiguration = detectorModelConfiguration;
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
        if (getDetectorModelConfiguration() != null)
            sb.append("detectorModelConfiguration: " + getDetectorModelConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDetectorModelConfiguration() == null) ? 0 : getDetectorModelConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorModelResult == false)
            return false;
        CreateDetectorModelResult other = (CreateDetectorModelResult) obj;

        if (other.getDetectorModelConfiguration() == null
                ^ this.getDetectorModelConfiguration() == null)
            return false;
        if (other.getDetectorModelConfiguration() != null
                && other.getDetectorModelConfiguration().equals(
                        this.getDetectorModelConfiguration()) == false)
            return false;
        return true;
    }
}
