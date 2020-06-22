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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * A key/value pair containing user-defined metadata that you can associate with
 * an Amazon EMR resource. Tags make it easier to associate clusters in various
 * ways, such as grouping clusters to track your Amazon EMR resource allocation
 * costs. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
 * >Tag Clusters</a>.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid
     * tag. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag </a>.
     * </p>
     */
    private String key;

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid
     * tag. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag </a>.
     * </p>
     *
     * @return <p>
     *         A user-defined key, which is the minimum required information for
     *         a valid tag. For more information, see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *         >Tag </a>.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid
     * tag. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag </a>.
     * </p>
     *
     * @param key <p>
     *            A user-defined key, which is the minimum required information
     *            for a valid tag. For more information, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *            >Tag </a>.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A user-defined key, which is the minimum required information for a valid
     * tag. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag </a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            A user-defined key, which is the minimum required information
     *            for a valid tag. For more information, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *            >Tag </a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     *
     * @return <p>
     *         A user-defined value, which is optional in a tag. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *         >Tag Clusters</a>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     *
     * @param value <p>
     *            A user-defined value, which is optional in a tag. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *            >Tag Clusters</a>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A user-defined value, which is optional in a tag. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            A user-defined value, which is optional in a tag. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     *            >Tag Clusters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withValue(String value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
