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

package com.amazonaws.services.amazonfsx.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for the Amazon FSx for Lustre file system.
 * </p>
 */
public class LustreFileSystemConfiguration implements Serializable {
    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     */
    private String weeklyMaintenanceStartTime;

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     */
    private DataRepositoryConfiguration dataRepositoryConfiguration;

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     */
    private String deploymentType;

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     */
    private Integer perUnitStorageThroughput;

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     */
    private String mountName;

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @return <p>
     *         The UTC time that you want to begin your weekly maintenance
     *         window.
     *         </p>
     */
    public String getWeeklyMaintenanceStartTime() {
        return weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The UTC time that you want to begin your weekly maintenance
     *            window.
     *            </p>
     */
    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 7<br/>
     * <b>Pattern: </b>^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$<br/>
     *
     * @param weeklyMaintenanceStartTime <p>
     *            The UTC time that you want to begin your weekly maintenance
     *            window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withWeeklyMaintenanceStartTime(
            String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
        return this;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The data repository configuration object for Lustre file systems
     *         returned in the response of the <code>CreateFileSystem</code>
     *         operation.
     *         </p>
     */
    public DataRepositoryConfiguration getDataRepositoryConfiguration() {
        return dataRepositoryConfiguration;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     *
     * @param dataRepositoryConfiguration <p>
     *            The data repository configuration object for Lustre file
     *            systems returned in the response of the
     *            <code>CreateFileSystem</code> operation.
     *            </p>
     */
    public void setDataRepositoryConfiguration(
            DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
    }

    /**
     * <p>
     * The data repository configuration object for Lustre file systems returned
     * in the response of the <code>CreateFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRepositoryConfiguration <p>
     *            The data repository configuration object for Lustre file
     *            systems returned in the response of the
     *            <code>CreateFileSystem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withDataRepositoryConfiguration(
            DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @return <p>
     *         The deployment type of the FSX for Lustre file system.
     *         </p>
     * @see LustreDeploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public LustreFileSystemConfiguration withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            </p>
     * @see LustreDeploymentType
     */
    public void setDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCRATCH_1, SCRATCH_2, PERSISTENT_1
     *
     * @param deploymentType <p>
     *            The deployment type of the FSX for Lustre file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LustreDeploymentType
     */
    public LustreFileSystemConfiguration withDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @return <p>
     *         Per unit storage throughput represents the megabytes per second
     *         of read or write throughput per 1 tebibyte of storage
     *         provisioned. File system throughput capacity is equal to Storage
     *         capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). This option
     *         is only valid for <code>PERSISTENT_1</code> deployment types.
     *         Valid values are 50, 100, 200.
     *         </p>
     */
    public Integer getPerUnitStorageThroughput() {
        return perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Per unit storage throughput represents the megabytes per
     *            second of read or write throughput per 1 tebibyte of storage
     *            provisioned. File system throughput capacity is equal to
     *            Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB).
     *            This option is only valid for <code>PERSISTENT_1</code>
     *            deployment types. Valid values are 50, 100, 200.
     *            </p>
     */
    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read
     * or write throughput per 1 tebibyte of storage provisioned. File system
     * throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for
     * <code>PERSISTENT_1</code> deployment types. Valid values are 50, 100,
     * 200.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 200<br/>
     *
     * @param perUnitStorageThroughput <p>
     *            Per unit storage throughput represents the megabytes per
     *            second of read or write throughput per 1 tebibyte of storage
     *            provisioned. File system throughput capacity is equal to
     *            Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB).
     *            This option is only valid for <code>PERSISTENT_1</code>
     *            deployment types. Valid values are 50, 100, 200.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withPerUnitStorageThroughput(
            Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
        return this;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @return <p>
     *         You use the <code>MountName</code> value when mounting the file
     *         system.
     *         </p>
     *         <p>
     *         For the <code>SCRATCH_1</code> deployment type, this value is
     *         always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *         <code>PERSISTENT_1</code> deployment types, this value is a
     *         string that is unique within an AWS Region.
     *         </p>
     */
    public String getMountName() {
        return mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @param mountName <p>
     *            You use the <code>MountName</code> value when mounting the
     *            file system.
     *            </p>
     *            <p>
     *            For the <code>SCRATCH_1</code> deployment type, this value is
     *            always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types, this value is a
     *            string that is unique within an AWS Region.
     *            </p>
     */
    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "
     * <code>fsx</code>". For <code>SCRATCH_2</code> and
     * <code>PERSISTENT_1</code> deployment types, this value is a string that
     * is unique within an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     * <b>Pattern: </b>^([A-Za-z0-9_-]{1,8})$<br/>
     *
     * @param mountName <p>
     *            You use the <code>MountName</code> value when mounting the
     *            file system.
     *            </p>
     *            <p>
     *            For the <code>SCRATCH_1</code> deployment type, this value is
     *            always "<code>fsx</code>". For <code>SCRATCH_2</code> and
     *            <code>PERSISTENT_1</code> deployment types, this value is a
     *            string that is unique within an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LustreFileSystemConfiguration withMountName(String mountName) {
        this.mountName = mountName;
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: " + getWeeklyMaintenanceStartTime() + ",");
        if (getDataRepositoryConfiguration() != null)
            sb.append("DataRepositoryConfiguration: " + getDataRepositoryConfiguration() + ",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: " + getDeploymentType() + ",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: " + getPerUnitStorageThroughput() + ",");
        if (getMountName() != null)
            sb.append("MountName: " + getMountName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataRepositoryConfiguration() == null) ? 0
                        : getDataRepositoryConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput()
                        .hashCode());
        hashCode = prime * hashCode + ((getMountName() == null) ? 0 : getMountName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LustreFileSystemConfiguration == false)
            return false;
        LustreFileSystemConfiguration other = (LustreFileSystemConfiguration) obj;

        if (other.getWeeklyMaintenanceStartTime() == null
                ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null
                && other.getWeeklyMaintenanceStartTime().equals(
                        this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDataRepositoryConfiguration() == null
                ^ this.getDataRepositoryConfiguration() == null)
            return false;
        if (other.getDataRepositoryConfiguration() != null
                && other.getDataRepositoryConfiguration().equals(
                        this.getDataRepositoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null
                && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null
                ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null
                && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getMountName() == null ^ this.getMountName() == null)
            return false;
        if (other.getMountName() != null
                && other.getMountName().equals(this.getMountName()) == false)
            return false;
        return true;
    }
}
