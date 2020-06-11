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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new infrastructure configuration. An infrastructure configuration
 * defines the environment in which your image will be built and tested.
 * </p>
 */
public class CreateInfrastructureConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify
     * one or more instance types to use for this build. The service will pick
     * one of these instance types based on availability.
     * </p>
     */
    private java.util.List<String> instanceTypes;

    /**
     * <p>
     * The instance profile to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String instanceProfileName;

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2
     * AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     */
    private Logging logging;

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log
     * on to and debug the instance used to create your image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String keyPair;

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure
     * configuration. Set to false if you want Image Builder to retain the
     * instance used to configure your AMI if the build or test phase of your
     * workflow fails.
     * </p>
     */
    private Boolean terminateInstanceOnFailure;

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws[^:]*:sns:[^:]+:\d{12}:[a-zA-Z0-9-_]{1,256}$<br/>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The tags attached to the resource created by Image Builder.
     * </p>
     */
    private java.util.Map<String, String> resourceTags;

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the infrastructure configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the infrastructure configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the infrastructure configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the infrastructure configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify
     * one or more instance types to use for this build. The service will pick
     * one of these instance types based on availability.
     * </p>
     *
     * @return <p>
     *         The instance types of the infrastructure configuration. You can
     *         specify one or more instance types to use for this build. The
     *         service will pick one of these instance types based on
     *         availability.
     *         </p>
     */
    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify
     * one or more instance types to use for this build. The service will pick
     * one of these instance types based on availability.
     * </p>
     *
     * @param instanceTypes <p>
     *            The instance types of the infrastructure configuration. You
     *            can specify one or more instance types to use for this build.
     *            The service will pick one of these instance types based on
     *            availability.
     *            </p>
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify
     * one or more instance types to use for this build. The service will pick
     * one of these instance types based on availability.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            The instance types of the infrastructure configuration. You
     *            can specify one or more instance types to use for this build.
     *            The service will pick one of these instance types based on
     *            availability.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withInstanceTypes(String... instanceTypes) {
        if (getInstanceTypes() == null) {
            this.instanceTypes = new java.util.ArrayList<String>(instanceTypes.length);
        }
        for (String value : instanceTypes) {
            this.instanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify
     * one or more instance types to use for this build. The service will pick
     * one of these instance types based on availability.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTypes <p>
     *            The instance types of the infrastructure configuration. You
     *            can specify one or more instance types to use for this build.
     *            The service will pick one of these instance types based on
     *            availability.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withInstanceTypes(
            java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The instance profile to associate with the instance used to
     *         customize your EC2 AMI.
     *         </p>
     */
    public String getInstanceProfileName() {
        return instanceProfileName;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param instanceProfileName <p>
     *            The instance profile to associate with the instance used to
     *            customize your EC2 AMI.
     *            </p>
     */
    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param instanceProfileName <p>
     *            The instance profile to associate with the instance used to
     *            customize your EC2 AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withInstanceProfileName(
            String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
        return this;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     *
     * @return <p>
     *         The security group IDs to associate with the instance used to
     *         customize your EC2 AMI.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     *
     * @param securityGroupIds <p>
     *            The security group IDs to associate with the instance used to
     *            customize your EC2 AMI.
     *            </p>
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security group IDs to associate with the instance used to
     *            customize your EC2 AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) {
            this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds.length);
        }
        for (String value : securityGroupIds) {
            this.securityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize
     * your EC2 AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIds <p>
     *            The security group IDs to associate with the instance used to
     *            customize your EC2 AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withSecurityGroupIds(
            java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2
     * AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The subnet ID in which to place the instance used to customize
     *         your EC2 AMI.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2
     * AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param subnetId <p>
     *            The subnet ID in which to place the instance used to customize
     *            your EC2 AMI.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2
     * AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param subnetId <p>
     *            The subnet ID in which to place the instance used to customize
     *            your EC2 AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     *
     * @return <p>
     *         The logging configuration of the infrastructure configuration.
     *         </p>
     */
    public Logging getLogging() {
        return logging;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     *
     * @param logging <p>
     *            The logging configuration of the infrastructure configuration.
     *            </p>
     */
    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logging <p>
     *            The logging configuration of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log
     * on to and debug the instance used to create your image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The key pair of the infrastructure configuration. This can be
     *         used to log on to and debug the instance used to create your
     *         image.
     *         </p>
     */
    public String getKeyPair() {
        return keyPair;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log
     * on to and debug the instance used to create your image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param keyPair <p>
     *            The key pair of the infrastructure configuration. This can be
     *            used to log on to and debug the instance used to create your
     *            image.
     *            </p>
     */
    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log
     * on to and debug the instance used to create your image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param keyPair <p>
     *            The key pair of the infrastructure configuration. This can be
     *            used to log on to and debug the instance used to create your
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure
     * configuration. Set to false if you want Image Builder to retain the
     * instance used to configure your AMI if the build or test phase of your
     * workflow fails.
     * </p>
     *
     * @return <p>
     *         The terminate instance on failure setting of the infrastructure
     *         configuration. Set to false if you want Image Builder to retain
     *         the instance used to configure your AMI if the build or test
     *         phase of your workflow fails.
     *         </p>
     */
    public Boolean isTerminateInstanceOnFailure() {
        return terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure
     * configuration. Set to false if you want Image Builder to retain the
     * instance used to configure your AMI if the build or test phase of your
     * workflow fails.
     * </p>
     *
     * @return <p>
     *         The terminate instance on failure setting of the infrastructure
     *         configuration. Set to false if you want Image Builder to retain
     *         the instance used to configure your AMI if the build or test
     *         phase of your workflow fails.
     *         </p>
     */
    public Boolean getTerminateInstanceOnFailure() {
        return terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure
     * configuration. Set to false if you want Image Builder to retain the
     * instance used to configure your AMI if the build or test phase of your
     * workflow fails.
     * </p>
     *
     * @param terminateInstanceOnFailure <p>
     *            The terminate instance on failure setting of the
     *            infrastructure configuration. Set to false if you want Image
     *            Builder to retain the instance used to configure your AMI if
     *            the build or test phase of your workflow fails.
     *            </p>
     */
    public void setTerminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure
     * configuration. Set to false if you want Image Builder to retain the
     * instance used to configure your AMI if the build or test phase of your
     * workflow fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstanceOnFailure <p>
     *            The terminate instance on failure setting of the
     *            infrastructure configuration. Set to false if you want Image
     *            Builder to retain the instance used to configure your AMI if
     *            the build or test phase of your workflow fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withTerminateInstanceOnFailure(
            Boolean terminateInstanceOnFailure) {
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
        return this;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws[^:]*:sns:[^:]+:\d{12}:[a-zA-Z0-9-_]{1,256}$<br/>
     *
     * @return <p>
     *         The SNS topic on which to send image build events.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws[^:]*:sns:[^:]+:\d{12}:[a-zA-Z0-9-_]{1,256}$<br/>
     *
     * @param snsTopicArn <p>
     *            The SNS topic on which to send image build events.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws[^:]*:sns:[^:]+:\d{12}:[a-zA-Z0-9-_]{1,256}$<br/>
     *
     * @param snsTopicArn <p>
     *            The SNS topic on which to send image build events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The tags attached to the resource created by Image Builder.
     * </p>
     *
     * @return <p>
     *         The tags attached to the resource created by Image Builder.
     *         </p>
     */
    public java.util.Map<String, String> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The tags attached to the resource created by Image Builder.
     * </p>
     *
     * @param resourceTags <p>
     *            The tags attached to the resource created by Image Builder.
     *            </p>
     */
    public void setResourceTags(java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
    }

    /**
     * <p>
     * The tags attached to the resource created by Image Builder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            The tags attached to the resource created by Image Builder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withResourceTags(
            java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    /**
     * <p>
     * The tags attached to the resource created by Image Builder.
     * </p>
     * <p>
     * The method adds a new key-value pair into resourceTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into resourceTags.
     * @param value The corresponding value of the entry to be added into
     *            resourceTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest addresourceTagsEntry(String key, String value) {
        if (null == this.resourceTags) {
            this.resourceTags = new java.util.HashMap<String, String>();
        }
        if (this.resourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.resourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into resourceTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateInfrastructureConfigurationRequest clearresourceTagsEntries() {
        this.resourceTags = null;
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     *
     * @return <p>
     *         The tags of the infrastructure configuration.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     *
     * @param tags <p>
     *            The tags of the infrastructure configuration.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the infrastructure configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateInfrastructureConfigurationRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The idempotency token used to make this request idempotent.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInfrastructureConfigurationRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getInstanceTypes() != null)
            sb.append("instanceTypes: " + getInstanceTypes() + ",");
        if (getInstanceProfileName() != null)
            sb.append("instanceProfileName: " + getInstanceProfileName() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("securityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSubnetId() != null)
            sb.append("subnetId: " + getSubnetId() + ",");
        if (getLogging() != null)
            sb.append("logging: " + getLogging() + ",");
        if (getKeyPair() != null)
            sb.append("keyPair: " + getKeyPair() + ",");
        if (getTerminateInstanceOnFailure() != null)
            sb.append("terminateInstanceOnFailure: " + getTerminateInstanceOnFailure() + ",");
        if (getSnsTopicArn() != null)
            sb.append("snsTopicArn: " + getSnsTopicArn() + ",");
        if (getResourceTags() != null)
            sb.append("resourceTags: " + getResourceTags() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminateInstanceOnFailure() == null) ? 0 : getTerminateInstanceOnFailure()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInfrastructureConfigurationRequest == false)
            return false;
        CreateInfrastructureConfigurationRequest other = (CreateInfrastructureConfigurationRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null
                && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null
                && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null
                && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getTerminateInstanceOnFailure() == null
                ^ this.getTerminateInstanceOnFailure() == null)
            return false;
        if (other.getTerminateInstanceOnFailure() != null
                && other.getTerminateInstanceOnFailure().equals(
                        this.getTerminateInstanceOnFailure()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null
                && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}