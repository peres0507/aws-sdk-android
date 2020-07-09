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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class PutSecretValueResult implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret for which you just created or updated a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>The unique identifier of the version of the secret you just created or updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String versionId;

    /**
     * <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) for the secret for which you just created a version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret for which you just created or updated a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The friendly name of the secret for which you just created or updated a version.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret for which you just created or updated a version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret for which you just created or updated a version.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret for which you just created or updated a version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret for which you just created or updated a version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The unique identifier of the version of the secret you just created or updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>The unique identifier of the version of the secret you just created or updated.</p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>The unique identifier of the version of the secret you just created or updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique identifier of the version of the secret you just created or updated.</p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>The unique identifier of the version of the secret you just created or updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique identifier of the version of the secret you just created or updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueResult withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     *
     * @return <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     */
    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     *
     * @param versionStages <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     */
    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueResult withVersionStages(String... versionStages) {
        if (getVersionStages() == null) {
            this.versionStages = new java.util.ArrayList<String>(versionStages.length);
        }
        for (String value : versionStages) {
            this.versionStages.add(value);
        }
        return this;
    }

    /**
     * <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutSecretValueResult withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
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
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId() + ",");
        if (getVersionStages() != null) sb.append("VersionStages: " + getVersionStages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutSecretValueResult == false) return false;
        PutSecretValueResult other = (PutSecretValueResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null) return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false) return false;
        return true;
    }
}
