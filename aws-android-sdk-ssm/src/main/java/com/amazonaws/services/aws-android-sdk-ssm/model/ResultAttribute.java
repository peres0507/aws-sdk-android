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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>The inventory item result attribute.</p>
 */
public class ResultAttribute implements Serializable {
    /**
     * <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResultAttribute withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTypeName() != null) sb.append("TypeName: " + getTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResultAttribute == false) return false;
        ResultAttribute other = (ResultAttribute)obj;

        if (other.getTypeName() == null ^ this.getTypeName() == null) return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false) return false;
        return true;
    }
}
