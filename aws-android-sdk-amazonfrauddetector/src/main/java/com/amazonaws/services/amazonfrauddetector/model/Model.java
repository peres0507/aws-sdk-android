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

/**
 * <p>
 * The model.
 * </p>
 */
public class Model implements Serializable {
    /**
     * <p>
     * The model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String modelId;

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     */
    private String modelType;

    /**
     * <p>
     * The model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The model training data source in Amazon S3.
     * </p>
     */
    private TrainingDataSource trainingDataSource;

    /**
     * <p>
     * The model input variables.
     * </p>
     */
    private java.util.List<ModelVariable> modelVariables;

    /**
     * <p>
     * The model label schema.
     * </p>
     */
    private LabelSchema labelSchema;

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The model ID.
     *         </p>
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param modelId <p>
     *            The model ID.
     *            </p>
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param modelId <p>
     *            The model ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @return <p>
     *         The model type.
     *         </p>
     * @see ModelTypeEnum
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelTypeEnum
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelTypeEnum
     */
    public Model withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelTypeEnum
     */
    public void setModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelTypeEnum
     */
    public Model withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The model description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The model description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The model description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The model training data source in Amazon S3.
     * </p>
     *
     * @return <p>
     *         The model training data source in Amazon S3.
     *         </p>
     */
    public TrainingDataSource getTrainingDataSource() {
        return trainingDataSource;
    }

    /**
     * <p>
     * The model training data source in Amazon S3.
     * </p>
     *
     * @param trainingDataSource <p>
     *            The model training data source in Amazon S3.
     *            </p>
     */
    public void setTrainingDataSource(TrainingDataSource trainingDataSource) {
        this.trainingDataSource = trainingDataSource;
    }

    /**
     * <p>
     * The model training data source in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingDataSource <p>
     *            The model training data source in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withTrainingDataSource(TrainingDataSource trainingDataSource) {
        this.trainingDataSource = trainingDataSource;
        return this;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     *
     * @return <p>
     *         The model input variables.
     *         </p>
     */
    public java.util.List<ModelVariable> getModelVariables() {
        return modelVariables;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     *
     * @param modelVariables <p>
     *            The model input variables.
     *            </p>
     */
    public void setModelVariables(java.util.Collection<ModelVariable> modelVariables) {
        if (modelVariables == null) {
            this.modelVariables = null;
            return;
        }

        this.modelVariables = new java.util.ArrayList<ModelVariable>(modelVariables);
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVariables <p>
     *            The model input variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withModelVariables(ModelVariable... modelVariables) {
        if (getModelVariables() == null) {
            this.modelVariables = new java.util.ArrayList<ModelVariable>(modelVariables.length);
        }
        for (ModelVariable value : modelVariables) {
            this.modelVariables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVariables <p>
     *            The model input variables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withModelVariables(java.util.Collection<ModelVariable> modelVariables) {
        setModelVariables(modelVariables);
        return this;
    }

    /**
     * <p>
     * The model label schema.
     * </p>
     *
     * @return <p>
     *         The model label schema.
     *         </p>
     */
    public LabelSchema getLabelSchema() {
        return labelSchema;
    }

    /**
     * <p>
     * The model label schema.
     * </p>
     *
     * @param labelSchema <p>
     *            The model label schema.
     *            </p>
     */
    public void setLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
    }

    /**
     * <p>
     * The model label schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelSchema <p>
     *            The model label schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
        return this;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     *
     * @return <p>
     *         Timestamp of last time the model was updated.
     *         </p>
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of last time the model was updated.
     *            </p>
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of last time the model was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     *
     * @return <p>
     *         Timestamp of when the model was created.
     *         </p>
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     *
     * @param createdTime <p>
     *            Timestamp of when the model was created.
     *            </p>
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            Timestamp of when the model was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Model withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
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
        if (getModelId() != null)
            sb.append("modelId: " + getModelId() + ",");
        if (getModelType() != null)
            sb.append("modelType: " + getModelType() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTrainingDataSource() != null)
            sb.append("trainingDataSource: " + getTrainingDataSource() + ",");
        if (getModelVariables() != null)
            sb.append("modelVariables: " + getModelVariables() + ",");
        if (getLabelSchema() != null)
            sb.append("labelSchema: " + getLabelSchema() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getCreatedTime() != null)
            sb.append("createdTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingDataSource() == null) ? 0 : getTrainingDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getModelVariables() == null) ? 0 : getModelVariables().hashCode());
        hashCode = prime * hashCode
                + ((getLabelSchema() == null) ? 0 : getLabelSchema().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Model == false)
            return false;
        Model other = (Model) obj;

        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null
                && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTrainingDataSource() == null ^ this.getTrainingDataSource() == null)
            return false;
        if (other.getTrainingDataSource() != null
                && other.getTrainingDataSource().equals(this.getTrainingDataSource()) == false)
            return false;
        if (other.getModelVariables() == null ^ this.getModelVariables() == null)
            return false;
        if (other.getModelVariables() != null
                && other.getModelVariables().equals(this.getModelVariables()) == false)
            return false;
        if (other.getLabelSchema() == null ^ this.getLabelSchema() == null)
            return false;
        if (other.getLabelSchema() != null
                && other.getLabelSchema().equals(this.getLabelSchema()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
