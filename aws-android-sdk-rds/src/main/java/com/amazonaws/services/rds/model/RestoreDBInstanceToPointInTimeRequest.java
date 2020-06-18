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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Restores a DB instance to an arbitrary point in time. You can restore to any
 * point in time before the time identified by the LatestRestorableTime
 * property. You can restore to a point up to the number of days specified by
 * the BackupRetentionPeriod property.
 * </p>
 * <p>
 * The target database is created with most of the original configuration, but
 * in a system-selected Availability Zone, with the default security group, the
 * default subnet group, and the default DB parameter group. By default, the new
 * DB instance is created as a single-AZ deployment except when the instance is
 * a SQL Server instance that has an option group that is associated with
 * mirroring; in this case, the instance becomes a mirrored deployment and not a
 * single-AZ deployment.
 * </p>
 * <note>
 * <p>
 * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora,
 * use <code>RestoreDBClusterToPointInTime</code>.
 * </p>
 * </note>
 */
public class RestoreDBInstanceToPointInTimeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;

    /**
     * <p>
     * The name of the new DB instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String targetDBInstanceIdentifier;

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     */
    private java.util.Date restoreTime;

    /**
     * <p>
     * A value that indicates whether the DB instance is restored from the
     * latest backup time. By default, the DB instance isn't restored from the
     * latest backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if the <code>RestoreTime</code> parameter
     * is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for
     * example, <code>db.m4.large</code>. Not all DB instance classes are
     * available in all AWS Regions, or for all database engines. For the full
     * list of DB instance classes, and availability for your engine, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied
     * automatically to the DB instance during the maintenance window.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter isn't used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     */
    private String dBName;

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine isn't
     * supported.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * instance to snapshots of the DB instance. By default, tags are not
     * copied.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     */
    private String tdeCredentialArn;

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     */
    private String tdeCredentialPassword;

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB instance in.
     * The domain must be created prior to this operation. Currently, only
     * Microsoft SQL Server and Oracle DB instances can be created in an Active
     * Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     */
    private String domainIAMRoleName;

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     */
    private java.util.List<String> enableCloudwatchLogsExports;

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     */
    private java.util.List<ProcessorFeature> processorFeatures;

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     */
    private String sourceDbiResourceId;

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the source DB instance from which to restore.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DB instance.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceDBInstanceIdentifier <p>
     *            The identifier of the source DB instance from which to
     *            restore.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB instance.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBInstanceIdentifier <p>
     *            The identifier of the source DB instance from which to
     *            restore.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DB instance.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withSourceDBInstanceIdentifier(
            String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the new DB instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the new DB instance to be created.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getTargetDBInstanceIdentifier() {
        return targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new DB instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     *
     * @param targetDBInstanceIdentifier <p>
     *            The name of the new DB instance to be created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new DB instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBInstanceIdentifier <p>
     *            The name of the new DB instance to be created.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withTargetDBInstanceIdentifier(
            String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     *
     * @return <p>
     *         The date and time to restore from.
     *         </p>
     *         <p>
     *         Valid Values: Value must be a time in Universal Coordinated Time
     *         (UTC) format
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the DB instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>UseLatestRestorableTime</code>
     *         parameter is enabled
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2009-09-07T23:45:00Z</code>
     *         </p>
     */
    public java.util.Date getRestoreTime() {
        return restoreTime;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     *
     * @param restoreTime <p>
     *            The date and time to restore from.
     *            </p>
     *            <p>
     *            Valid Values: Value must be a time in Universal Coordinated
     *            Time (UTC) format
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the DB instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>UseLatestRestorableTime</code>
     *            parameter is enabled
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2009-09-07T23:45:00Z</code>
     *            </p>
     */
    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreTime <p>
     *            The date and time to restore from.
     *            </p>
     *            <p>
     *            Valid Values: Value must be a time in Universal Coordinated
     *            Time (UTC) format
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the DB instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>UseLatestRestorableTime</code>
     *            parameter is enabled
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2009-09-07T23:45:00Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restored from the
     * latest backup time. By default, the DB instance isn't restored from the
     * latest backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if the <code>RestoreTime</code> parameter
     * is provided.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is restored from
     *         the latest backup time. By default, the DB instance isn't
     *         restored from the latest backup time.
     *         </p>
     *         <p>
     *         Constraints: Can't be specified if the <code>RestoreTime</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restored from the
     * latest backup time. By default, the DB instance isn't restored from the
     * latest backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if the <code>RestoreTime</code> parameter
     * is provided.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is restored from
     *         the latest backup time. By default, the DB instance isn't
     *         restored from the latest backup time.
     *         </p>
     *         <p>
     *         Constraints: Can't be specified if the <code>RestoreTime</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restored from the
     * latest backup time. By default, the DB instance isn't restored from the
     * latest backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if the <code>RestoreTime</code> parameter
     * is provided.
     * </p>
     *
     * @param useLatestRestorableTime <p>
     *            A value that indicates whether the DB instance is restored
     *            from the latest backup time. By default, the DB instance isn't
     *            restored from the latest backup time.
     *            </p>
     *            <p>
     *            Constraints: Can't be specified if the
     *            <code>RestoreTime</code> parameter is provided.
     *            </p>
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is restored from the
     * latest backup time. By default, the DB instance isn't restored from the
     * latest backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if the <code>RestoreTime</code> parameter
     * is provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableTime <p>
     *            A value that indicates whether the DB instance is restored
     *            from the latest backup time. By default, the DB instance isn't
     *            restored from the latest backup time.
     *            </p>
     *            <p>
     *            Constraints: Can't be specified if the
     *            <code>RestoreTime</code> parameter is provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withUseLatestRestorableTime(
            Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for
     * example, <code>db.m4.large</code>. Not all DB instance classes are
     * available in all AWS Regions, or for all database engines. For the full
     * list of DB instance classes, and availability for your engine, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the Amazon RDS DB instance,
     *         for example, <code>db.m4.large</code>. Not all DB instance
     *         classes are available in all AWS Regions, or for all database
     *         engines. For the full list of DB instance classes, and
     *         availability for your engine, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *         >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Default: The same DBInstanceClass as the original DB instance.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for
     * example, <code>db.m4.large</code>. Not all DB instance classes are
     * available in all AWS Regions, or for all database engines. For the full
     * list of DB instance classes, and availability for your engine, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The compute and memory capacity of the Amazon RDS DB instance,
     *            for example, <code>db.m4.large</code>. Not all DB instance
     *            classes are available in all AWS Regions, or for all database
     *            engines. For the full list of DB instance classes, and
     *            availability for your engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *            >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Default: The same DBInstanceClass as the original DB instance.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for
     * example, <code>db.m4.large</code>. Not all DB instance classes are
     * available in all AWS Regions, or for all database engines. For the full
     * list of DB instance classes, and availability for your engine, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     * >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The compute and memory capacity of the Amazon RDS DB instance,
     *            for example, <code>db.m4.large</code>. Not all DB instance
     *            classes are available in all AWS Regions, or for all database
     *            engines. For the full list of DB instance classes, and
     *            availability for your engine, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html"
     *            >DB Instance Class</a> in the <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            Default: The same DBInstanceClass as the original DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     *
     * @return <p>
     *         The port number on which the database accepts connections.
     *         </p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB instance.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            Constraints: Value must be <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Default: The same port as the original DB instance.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            Constraints: Value must be <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Default: The same port as the original DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     *
     * @return <p>
     *         The Availability Zone (AZ) where the DB instance will be created.
     *         </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone.
     *         </p>
     *         <p>
     *         Constraint: You can't specify the <code>AvailabilityZone</code>
     *         parameter if the DB instance is a Multi-AZ deployment.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1a</code>
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone (AZ) where the DB instance will be
     *            created.
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone.
     *            </p>
     *            <p>
     *            Constraint: You can't specify the
     *            <code>AvailabilityZone</code> parameter if the DB instance is
     *            a Multi-AZ deployment.
     *            </p>
     *            <p>
     *            Example: <code>us-east-1a</code>
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone (AZ) where the DB instance will be
     *            created.
     *            </p>
     *            <p>
     *            Default: A random, system-chosen Availability Zone.
     *            </p>
     *            <p>
     *            Constraint: You can't specify the
     *            <code>AvailabilityZone</code> parameter if the DB instance is
     *            a Multi-AZ deployment.
     *            </p>
     *            <p>
     *            Example: <code>us-east-1a</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The DB subnet group name to use for the new instance.
     *         </p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing
     *         DBSubnetGroup.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The DB subnet group name to use for the new instance.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DBSubnetGroup.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The DB subnet group name to use for the new instance.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DBSubnetGroup.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment.
     *         </p>
     *         <p>
     *         Constraint: You can't specify the <code>AvailabilityZone</code>
     *         parameter if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment.
     *         </p>
     *         <p>
     *         Constraint: You can't specify the <code>AvailabilityZone</code>
     *         parameter if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment.
     *            </p>
     *            <p>
     *            Constraint: You can't specify the
     *            <code>AvailabilityZone</code> parameter if the DB instance is
     *            a Multi-AZ deployment.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You can't specify the <code>AvailabilityZone</code> parameter
     * if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment.
     *            </p>
     *            <p>
     *            Constraint: You can't specify the
     *            <code>AvailabilityZone</code> parameter if the DB instance is
     *            a Multi-AZ deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible.
     *         </p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint
     *         resolves to the private IP address from within the DB instance's
     *         VPC, and to the public IP address from outside of the DB
     *         instance's VPC. Access to the DB instance is ultimately
     *         controlled by the security group it uses, and that public access
     *         is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal
     *         DB instance with a DNS name that resolves to a private IP
     *         address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible.
     *         </p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint
     *         resolves to the private IP address from within the DB instance's
     *         VPC, and to the public IP address from outside of the DB
     *         instance's VPC. Access to the DB instance is ultimately
     *         controlled by the security group it uses, and that public access
     *         is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal
     *         DB instance with a DNS name that resolves to a private IP
     *         address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible.
     *            </p>
     *            <p>
     *            When the DB instance is publicly accessible, its DNS endpoint
     *            resolves to the private IP address from within the DB
     *            instance's VPC, and to the public IP address from outside of
     *            the DB instance's VPC. Access to the DB instance is ultimately
     *            controlled by the security group it uses, and that public
     *            access is not permitted if the security group assigned to the
     *            DB instance doesn't permit it.
     *            </p>
     *            <p>
     *            When the DB instance isn't publicly accessible, it is an
     *            internal DB instance with a DNS name that resolves to a
     *            private IP address.
     *            </p>
     *            <p>
     *            For more information, see <a>CreateDBInstance</a>.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible.
     *            </p>
     *            <p>
     *            When the DB instance is publicly accessible, its DNS endpoint
     *            resolves to the private IP address from within the DB
     *            instance's VPC, and to the public IP address from outside of
     *            the DB instance's VPC. Access to the DB instance is ultimately
     *            controlled by the security group it uses, and that public
     *            access is not permitted if the security group assigned to the
     *            DB instance doesn't permit it.
     *            </p>
     *            <p>
     *            When the DB instance isn't publicly accessible, it is an
     *            internal DB instance with a DNS name that resolves to a
     *            private IP address.
     *            </p>
     *            <p>
     *            For more information, see <a>CreateDBInstance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied
     * automatically to the DB instance during the maintenance window.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor version upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied
     * automatically to the DB instance during the maintenance window.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor version upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied
     * automatically to the DB instance during the maintenance window.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor version upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window.
     *            </p>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor version upgrades are applied
     * automatically to the DB instance during the maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor version upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @return <p>
     *         License model information for the restored DB instance.
     *         </p>
     *         <p>
     *         Default: Same as source.
     *         </p>
     *         <p>
     *         Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @param licenseModel <p>
     *            License model information for the restored DB instance.
     *            </p>
     *            <p>
     *            Default: Same as source.
     *            </p>
     *            <p>
     *            Valid values: <code>license-included</code> |
     *            <code>bring-your-own-license</code> |
     *            <code>general-public-license</code>
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            License model information for the restored DB instance.
     *            </p>
     *            <p>
     *            Default: Same as source.
     *            </p>
     *            <p>
     *            Valid values: <code>license-included</code> |
     *            <code>bring-your-own-license</code> |
     *            <code>general-public-license</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter isn't used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     *
     * @return <p>
     *         The database name for the restored DB instance.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter isn't used for the MySQL or MariaDB engines.
     *         </p>
     *         </note>
     */
    public String getDBName() {
        return dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter isn't used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     *
     * @param dBName <p>
     *            The database name for the restored DB instance.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter isn't used for the MySQL or MariaDB engines.
     *            </p>
     *            </note>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter isn't used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The database name for the restored DB instance.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter isn't used for the MySQL or MariaDB engines.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The database engine to use for the new instance.
     *         </p>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>mariadb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param engine <p>
     *            The database engine to use for the new instance.
     *            </p>
     *            <p>
     *            Default: The same as source
     *            </p>
     *            <p>
     *            Constraint: Must be compatible with the engine of the source
     *            </p>
     *            <p>
     *            Valid Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>mariadb</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mysql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se2</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se1</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>postgres</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ex</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-web</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The database engine to use for the new instance.
     *            </p>
     *            <p>
     *            Default: The same as source
     *            </p>
     *            <p>
     *            Constraint: Must be compatible with the engine of the source
     *            </p>
     *            <p>
     *            Valid Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>mariadb</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mysql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se2</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se1</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>postgres</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ex</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-web</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine isn't
     * supported.
     * </p>
     *
     * @return <p>
     *         The amount of Provisioned IOPS (input/output operations per
     *         second) to be initially allocated for the DB instance.
     *         </p>
     *         <p>
     *         Constraints: Must be an integer greater than 1000.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Setting the IOPS value for the SQL Server database engine isn't
     *         supported.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine isn't
     * supported.
     * </p>
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to be initially allocated for the DB instance.
     *            </p>
     *            <p>
     *            Constraints: Must be an integer greater than 1000.
     *            </p>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Setting the IOPS value for the SQL Server database engine
     *            isn't supported.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine isn't
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to be initially allocated for the DB instance.
     *            </p>
     *            <p>
     *            Constraints: Must be an integer greater than 1000.
     *            </p>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Setting the IOPS value for the SQL Server database engine
     *            isn't supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @return <p>
     *         The name of the option group to be used for the restored DB
     *         instance.
     *         </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, can't be removed from an option group, and that
     *         option group can't be removed from a DB instance once it is
     *         associated with a DB instance
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group to be used for the restored DB
     *            instance.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group, and that
     *            option group can't be removed from a DB instance once it is
     *            associated with a DB instance
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group, and that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group to be used for the restored DB
     *            instance.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group, and that
     *            option group can't be removed from a DB instance once it is
     *            associated with a DB instance
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * instance to snapshots of the DB instance. By default, tags are not
     * copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the restored
     *         DB instance to snapshots of the DB instance. By default, tags are
     *         not copied.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * instance to snapshots of the DB instance. By default, tags are not
     * copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the restored
     *         DB instance to snapshots of the DB instance. By default, tags are
     *         not copied.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * instance to snapshots of the DB instance. By default, tags are not
     * copied.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the
     *            restored DB instance to snapshots of the DB instance. By
     *            default, tags are not copied.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB
     * instance to snapshots of the DB instance. By default, tags are not
     * copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy all tags from the
     *            restored DB instance to snapshots of the DB instance. By
     *            default, tags are not copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *         >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     *
     * @return <p>
     *         Specifies the storage type to be associated with the DB instance.
     *         </p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value
     *         for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is
     *         specified, otherwise <code>gp2</code>
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     *            <p>
     *            Valid values: <code>standard | gp2 | io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified, otherwise <code>gp2</code>
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     *            <p>
     *            Valid values: <code>standard | gp2 | io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified, otherwise <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     *
     * @return <p>
     *         The ARN from the key store with which to associate the instance
     *         for TDE encryption.
     *         </p>
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which to associate the
     *            instance for TDE encryption.
     *            </p>
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which to associate the
     *            instance for TDE encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     *
     * @return <p>
     *         The password for the given ARN from the key store in order to
     *         access the device.
     *         </p>
     */
    public String getTdeCredentialPassword() {
        return tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     *
     * @param tdeCredentialPassword <p>
     *            The password for the given ARN from the key store in order to
     *            access the device.
     *            </p>
     */
    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialPassword <p>
     *            The password for the given ARN from the key store in order to
     *            access the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialPassword(
            String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     *
     * @return <p>
     *         A list of EC2 VPC security groups to associate with this DB
     *         instance.
     *         </p>
     *         <p>
     *         Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
     *            </p>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withVpcSecurityGroupIds(
            String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) {
            this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds.length);
        }
        for (String value : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of EC2 VPC security groups to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB instance in.
     * The domain must be created prior to this operation. Currently, only
     * Microsoft SQL Server and Oracle DB instances can be created in an Active
     * Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specify the Active Directory directory ID to restore the DB
     *         instance in. The domain must be created prior to this operation.
     *         Currently, only Microsoft SQL Server and Oracle DB instances can
     *         be created in an Active Directory Domain.
     *         </p>
     *         <p>
     *         For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     *         Authentication to authenticate users that connect to the DB
     *         instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *         > Using Windows Authentication with an Amazon RDS DB Instance
     *         Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For Oracle DB instances, Amazon RDS can use Kerberos
     *         Authentication to authenticate users that connect to the DB
     *         instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *         > Using Kerberos Authentication with Amazon RDS for Oracle</a> in
     *         the <i>Amazon RDS User Guide</i>.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB instance in.
     * The domain must be created prior to this operation. Currently, only
     * Microsoft SQL Server and Oracle DB instances can be created in an Active
     * Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     *
     * @param domain <p>
     *            Specify the Active Directory directory ID to restore the DB
     *            instance in. The domain must be created prior to this
     *            operation. Currently, only Microsoft SQL Server and Oracle DB
     *            instances can be created in an Active Directory Domain.
     *            </p>
     *            <p>
     *            For Microsoft SQL Server DB instances, Amazon RDS can use
     *            Windows Authentication to authenticate users that connect to
     *            the DB instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *            > Using Windows Authentication with an Amazon RDS DB Instance
     *            Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For Oracle DB instances, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *            > Using Kerberos Authentication with Amazon RDS for Oracle</a>
     *            in the <i>Amazon RDS User Guide</i>.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB instance in.
     * The domain must be created prior to this operation. Currently, only
     * Microsoft SQL Server and Oracle DB instances can be created in an Active
     * Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            Specify the Active Directory directory ID to restore the DB
     *            instance in. The domain must be created prior to this
     *            operation. Currently, only Microsoft SQL Server and Oracle DB
     *            instances can be created in an Active Directory Domain.
     *            </p>
     *            <p>
     *            For Microsoft SQL Server DB instances, Amazon RDS can use
     *            Windows Authentication to authenticate users that connect to
     *            the DB instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *            > Using Windows Authentication with an Amazon RDS DB Instance
     *            Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For Oracle DB instances, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *            > Using Kerberos Authentication with Amazon RDS for Oracle</a>
     *            in the <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @return <p>
     *         Specify the name of the IAM role to be used when making API calls
     *         to the Directory Service.
     *         </p>
     */
    public String getDomainIAMRoleName() {
        return domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @param domainIAMRoleName <p>
     *            Specify the name of the IAM role to be used when making API
     *            calls to the Directory Service.
     *            </p>
     */
    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainIAMRoleName <p>
     *            Specify the name of the IAM role to be used when making API
     *            calls to the Directory Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled. For information about the supported
     *         DB engines, see <a>CreateDBInstance</a>.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     *         <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public Boolean isEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled. For information about the supported
     *         DB engines, see <a>CreateDBInstance</a>.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *         > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     *         <i>Amazon RDS User Guide.</i>
     *         </p>
     */
    public Boolean getEnableIAMDatabaseAuthentication() {
        return enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled. For information
     *            about the supported DB engines, see <a>CreateDBInstance</a>.
     *            </p>
     *            <p>
     *            For more information about IAM database authentication, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication for MySQL and PostgreSQL</a> in
     *            the <i>Amazon RDS User Guide.</i>
     *            </p>
     */
    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled. For information about the supported DB engines, see
     * <a>CreateDBInstance</a>.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled. For information
     *            about the supported DB engines, see <a>CreateDBInstance</a>.
     *            </p>
     *            <p>
     *            For more information about IAM database authentication, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication for MySQL and PostgreSQL</a> in
     *            the <i>Amazon RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withEnableIAMDatabaseAuthentication(
            Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of logs that the restored DB instance is to export to
     *         CloudWatch Logs. The values in the list depend on the DB engine
     *         being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *         <i>Amazon RDS User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     */
    public void setEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(
                enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withEnableCloudwatchLogsExports(
            String... enableCloudwatchLogsExports) {
        if (getEnableCloudwatchLogsExports() == null) {
            this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(
                    enableCloudwatchLogsExports.length);
        }
        for (String value : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB instance is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     *
     * @return <p>
     *         The number of CPU cores and the number of threads per core for
     *         the DB instance class of the DB instance.
     *         </p>
     */
    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     */
    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withProcessorFeatures(
            ProcessorFeature... processorFeatures) {
        if (getProcessorFeatures() == null) {
            this.processorFeatures = new java.util.ArrayList<ProcessorFeature>(
                    processorFeatures.length);
        }
        for (ProcessorFeature value : processorFeatures) {
            this.processorFeatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withProcessorFeatures(
            java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance class of the DB
     *         instance uses its default processor features.
     *         </p>
     */
    public Boolean isUseDefaultProcessorFeatures() {
        return useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance class of the DB
     *         instance uses its default processor features.
     *         </p>
     */
    public Boolean getUseDefaultProcessorFeatures() {
        return useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     *
     * @param useDefaultProcessorFeatures <p>
     *            A value that indicates whether the DB instance class of the DB
     *            instance uses its default processor features.
     *            </p>
     */
    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance
     * uses its default processor features.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useDefaultProcessorFeatures <p>
     *            A value that indicates whether the DB instance class of the DB
     *            instance uses its default processor features.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withUseDefaultProcessorFeatures(
            Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the DB parameter group to associate with this DB
     *         instance.
     *         </p>
     *         <p>
     *         If you do not specify a value for
     *         <code>DBParameterGroupName</code>, then the default
     *         <code>DBParameterGroup</code> for the specified DB engine is
     *         used.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DBParameterGroup.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>DBParameterGroupName</code>, then the default
     *            <code>DBParameterGroup</code> for the specified DB engine is
     *            used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing
     *            DBParameterGroup.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then
     * the default <code>DBParameterGroup</code> for the specified DB engine is
     * used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance.
     *            </p>
     *            <p>
     *            If you do not specify a value for
     *            <code>DBParameterGroupName</code>, then the default
     *            <code>DBParameterGroup</code> for the specified DB engine is
     *            used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If supplied, must match the name of an existing
     *            DBParameterGroup.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDBParameterGroupName(
            String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance has deletion
     *         protection enabled. The database can't be deleted when deletion
     *         protection is enabled. By default, deletion protection is
     *         disabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *         > Deleting a DB Instance</a>.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB instance has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            A value that indicates whether the DB instance has deletion
     *            protection enabled. The database can't be deleted when
     *            deletion protection is enabled. By default, deletion
     *            protection is disabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     *            > Deleting a DB Instance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     *
     * @return <p>
     *         The resource ID of the source DB instance from which to restore.
     *         </p>
     */
    public String getSourceDbiResourceId() {
        return sourceDbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     *
     * @param sourceDbiResourceId <p>
     *            The resource ID of the source DB instance from which to
     *            restore.
     *            </p>
     */
    public void setSourceDbiResourceId(String sourceDbiResourceId) {
        this.sourceDbiResourceId = sourceDbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDbiResourceId <p>
     *            The resource ID of the source DB instance from which to
     *            restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceToPointInTimeRequest withSourceDbiResourceId(String sourceDbiResourceId) {
        this.sourceDbiResourceId = sourceDbiResourceId;
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
        if (getSourceDBInstanceIdentifier() != null)
            sb.append("SourceDBInstanceIdentifier: " + getSourceDBInstanceIdentifier() + ",");
        if (getTargetDBInstanceIdentifier() != null)
            sb.append("TargetDBInstanceIdentifier: " + getTargetDBInstanceIdentifier() + ",");
        if (getRestoreTime() != null)
            sb.append("RestoreTime: " + getRestoreTime() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: " + getEnableIAMDatabaseAuthentication()
                    + ",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: " + getEnableCloudwatchLogsExports() + ",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: " + getProcessorFeatures() + ",");
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: " + getUseDefaultProcessorFeatures() + ",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getSourceDbiResourceId() != null)
            sb.append("SourceDbiResourceId: " + getSourceDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBInstanceIdentifier() == null) ? 0 : getTargetDBInstanceIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRestoreTime() == null) ? 0 : getRestoreTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableIAMDatabaseAuthentication() == null) ? 0
                        : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableCloudwatchLogsExports() == null) ? 0
                        : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseDefaultProcessorFeatures() == null) ? 0
                        : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDbiResourceId() == null) ? 0 : getSourceDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBInstanceToPointInTimeRequest == false)
            return false;
        RestoreDBInstanceToPointInTimeRequest other = (RestoreDBInstanceToPointInTimeRequest) obj;

        if (other.getSourceDBInstanceIdentifier() == null
                ^ this.getSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getSourceDBInstanceIdentifier() != null
                && other.getSourceDBInstanceIdentifier().equals(
                        this.getSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getTargetDBInstanceIdentifier() == null
                ^ this.getTargetDBInstanceIdentifier() == null)
            return false;
        if (other.getTargetDBInstanceIdentifier() != null
                && other.getTargetDBInstanceIdentifier().equals(
                        this.getTargetDBInstanceIdentifier()) == false)
            return false;
        if (other.getRestoreTime() == null ^ this.getRestoreTime() == null)
            return false;
        if (other.getRestoreTime() != null
                && other.getRestoreTime().equals(this.getRestoreTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null
                && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null
                && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null
                && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null
                && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null)
            return false;
        if (other.getTdeCredentialPassword() != null
                && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null
                && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null
                ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(
                        this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null
                ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null
                && other.getEnableCloudwatchLogsExports().equals(
                        this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null
                && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getUseDefaultProcessorFeatures() == null
                ^ this.getUseDefaultProcessorFeatures() == null)
            return false;
        if (other.getUseDefaultProcessorFeatures() != null
                && other.getUseDefaultProcessorFeatures().equals(
                        this.getUseDefaultProcessorFeatures()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getSourceDbiResourceId() == null ^ this.getSourceDbiResourceId() == null)
            return false;
        if (other.getSourceDbiResourceId() != null
                && other.getSourceDbiResourceId().equals(this.getSourceDbiResourceId()) == false)
            return false;
        return true;
    }
}
