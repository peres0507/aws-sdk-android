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

package com.amazonaws.services.amazonredshift;

import org.w3c.dom.*;

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.services.amazonredshift.model.transform.*;

/**
 * Client for accessing Amazon Redshift. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon Redshift</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is an interface reference for Amazon Redshift. It contains documentation
 * for one of the programming or command line interfaces you can use to manage
 * Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
 * means that some interfaces may require techniques, such as polling or
 * asynchronous callback handlers, to determine when a command has been applied.
 * In this reference, the parameter descriptions indicate whether a change is
 * applied immediately, on the next instance reboot, or during the next
 * maintenance window. For a summary of the Amazon Redshift cluster management
 * interfaces, go to <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html"
 * >Using the Amazon Redshift Management Interfaces</a>.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a
 * data warehouse: provisioning capacity, monitoring and backing up the cluster,
 * and applying patches and upgrades to the Amazon Redshift engine. You can
 * focus on using your data to acquire new insights for your business and
 * customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin
 * by reading the <a
 * href="https://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html"
 * >Amazon Redshift Getting Started Guide</a>.
 * </p>
 * <p>
 * If you are a database developer, the <a
 * href="https://docs.aws.amazon.com/redshift/latest/dg/welcome.html">Amazon
 * Redshift Database Developer Guide</a> explains how to design, build, query,
 * and maintain the databases that make up your data warehouse.
 * </p>
 */
public class AmazonRedshiftClient extends AmazonWebServiceClient implements AmazonRedshift {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Redshift exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRedshiftClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRedshift (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonRedshiftClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRedshiftClient client = new AmazonRedshiftClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRedshiftClient client = new AmazonRedshiftClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRedshift (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRedshiftClient client = new AmazonRedshiftClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRedshiftClient client = new AmazonRedshiftClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRedshift (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRedshift (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonRedshift using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonRedshiftClient client = new AmazonRedshiftClient(AWSMobileClient.getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonRedshift (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AccessToSnapshotDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchDeleteRequestSizeExceededExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new BatchModifyClusterSnapshotsLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BucketNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterOnLatestRevisionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CopyToRegionDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependentServiceRequestThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependentServiceUnavailableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventSubscriptionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InProgressTableRestoreQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IncompatibleOrderableOptionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientS3BucketPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotScheduleStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterTrackExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidElasticIpExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHsmClientCertificateStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHsmConfigurationStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReservedNodeStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRetentionPeriodExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3KeyPrefixExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidScheduleExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidScheduledActionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotCopyGrantStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubscriptionStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTableRestoreArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTagExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidUsageLimitExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesPerClusterLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeAlreadyMigratedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResizeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSTopicArnNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduleDefinitionTypeUnsupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduledActionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduledActionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduledActionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduledActionTypeUnsupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyEnabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleUpdateInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionAlreadyExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionCategoryNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionEventIdNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionSeverityNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TableLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TableRestoreNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnauthorizedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnknownSnapshotCopyRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOptionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UsageLimitAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UsageLimitNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("redshift.us-east-1.amazonaws.com");
        this.endpointPrefix = "redshift";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonredshift/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonredshift/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to
     * the configuration (term, payment type, or number of nodes) and no
     * additional costs.
     * </p>
     * 
     * @param acceptReservedNodeExchangeRequest
     * @return acceptReservedNodeExchangeResult The response from the
     *         AcceptReservedNodeExchange service method, as returned by Amazon
     *         Redshift.
     * @throws ReservedNodeNotFoundException
     * @throws InvalidReservedNodeStateException
     * @throws ReservedNodeAlreadyMigratedException
     * @throws ReservedNodeOfferingNotFoundException
     * @throws UnsupportedOperationException
     * @throws DependentServiceUnavailableException
     * @throws ReservedNodeAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AcceptReservedNodeExchangeResult acceptReservedNodeExchange(
            AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(acceptReservedNodeExchangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptReservedNodeExchangeRequest> request = null;
        Response<AcceptReservedNodeExchangeResult> response = null;
        try {
            request = new AcceptReservedNodeExchangeRequestMarshaller()
                    .marshall(acceptReservedNodeExchangeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AcceptReservedNodeExchangeResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group.
     * Depending on whether the application accessing your cluster is running on
     * the Internet or an Amazon EC2 instance, you can authorize inbound access
     * to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP)
     * range or to an Amazon EC2 security group. You can add as many as 20
     * ingress rules to an Amazon Redshift security group.
     * </p>
     * <p>
     * If you authorize access to an Amazon EC2 security group, specify
     * <i>EC2SecurityGroupName</i> and <i>EC2SecurityGroupOwnerId</i>. The
     * Amazon EC2 security group and Amazon Redshift cluster must be in the same
     * AWS Region.
     * </p>
     * <p>
     * If you authorize access to a CIDR/IP address range, specify
     * <i>CIDRIP</i>. For an overview of CIDR blocks, see the Wikipedia article
     * on <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">
     * Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that clients
     * running on these IP addresses or the EC2 instance are authorized to
     * connect to the cluster. For information about managing security groups,
     * go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
     * >Working with Security Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param authorizeClusterSecurityGroupIngressRequest <p/>
     * @return authorizeClusterSecurityGroupIngressResult The response from the
     *         AuthorizeClusterSecurityGroupIngress service method, as returned
     *         by Amazon Redshift.
     * @throws ClusterSecurityGroupNotFoundException
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AuthorizeClusterSecurityGroupIngressResult authorizeClusterSecurityGroupIngress(
            AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(authorizeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeClusterSecurityGroupIngressRequest> request = null;
        Response<AuthorizeClusterSecurityGroupIngressResult> response = null;
        try {
            request = new AuthorizeClusterSecurityGroupIngressRequestMarshaller()
                    .marshall(authorizeClusterSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new AuthorizeClusterSecurityGroupIngressResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the specified
     * snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
     * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param authorizeSnapshotAccessRequest <p/>
     * @return authorizeSnapshotAccessResult The response from the
     *         AuthorizeSnapshotAccess service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSnapshotNotFoundException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidClusterSnapshotStateException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public AuthorizeSnapshotAccessResult authorizeSnapshotAccess(
            AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(authorizeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeSnapshotAccessRequest> request = null;
        Response<AuthorizeSnapshotAccessResult> response = null;
        try {
            request = new AuthorizeSnapshotAccessRequestMarshaller()
                    .marshall(authorizeSnapshotAccessRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new AuthorizeSnapshotAccessResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a set of cluster snapshots.
     * </p>
     * 
     * @param batchDeleteClusterSnapshotsRequest
     * @return batchDeleteClusterSnapshotsResult The response from the
     *         BatchDeleteClusterSnapshots service method, as returned by Amazon
     *         Redshift.
     * @throws BatchDeleteRequestSizeExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteClusterSnapshotsResult batchDeleteClusterSnapshots(
            BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteClusterSnapshotsRequest> request = null;
        Response<BatchDeleteClusterSnapshotsResult> response = null;
        try {
            request = new BatchDeleteClusterSnapshotsRequestMarshaller()
                    .marshall(batchDeleteClusterSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BatchDeleteClusterSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a set of cluster snapshots.
     * </p>
     * 
     * @param batchModifyClusterSnapshotsRequest
     * @return batchModifyClusterSnapshotsResult The response from the
     *         BatchModifyClusterSnapshots service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidRetentionPeriodException
     * @throws BatchModifyClusterSnapshotsLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchModifyClusterSnapshotsResult batchModifyClusterSnapshots(
            BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchModifyClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchModifyClusterSnapshotsRequest> request = null;
        Response<BatchModifyClusterSnapshotsResult> response = null;
        try {
            request = new BatchModifyClusterSnapshotsRequestMarshaller()
                    .marshall(batchModifyClusterSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new BatchModifyClusterSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a resize operation for a cluster.
     * </p>
     * 
     * @param cancelResizeRequest
     * @return cancelResizeResult The response from the CancelResize service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws ResizeNotFoundException
     * @throws InvalidClusterStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CancelResizeResult cancelResize(CancelResizeRequest cancelResizeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelResizeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelResizeRequest> request = null;
        Response<CancelResizeResult> response = null;
        try {
            request = new CancelResizeRequestMarshaller().marshall(cancelResizeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CancelResizeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual cluster
     * snapshot. The source must be an automated snapshot and it must be in the
     * available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated
     * snapshots of the cluster. Also, when the retention period of the snapshot
     * expires, Amazon Redshift automatically deletes it. If you want to keep an
     * automated snapshot for a longer period, you can make a manual copy of the
     * snapshot. Manual snapshots are retained until you delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
     * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param copyClusterSnapshotRequest <p/>
     * @return copyClusterSnapshotResult The response from the
     *         CopyClusterSnapshot service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidClusterSnapshotStateException
     * @throws ClusterSnapshotQuotaExceededException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CopyClusterSnapshotResult copyClusterSnapshot(
            CopyClusterSnapshotRequest copyClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(copyClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyClusterSnapshotRequest> request = null;
        Response<CopyClusterSnapshotResult> response = null;
        try {
            request = new CopyClusterSnapshotRequestMarshaller()
                    .marshall(copyClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CopyClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cluster with the specified parameters.
     * </p>
     * <p>
     * To create a cluster in Virtual Private Cloud (VPC), you must provide a
     * cluster subnet group name. The cluster subnet group identifies the
     * subnets of your VPC that Amazon Redshift uses when creating the cluster.
     * For more information about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param createClusterRequest <p/>
     * @return createClusterResult The response from the CreateCluster service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterAlreadyExistsException
     * @throws InsufficientClusterCapacityException
     * @throws ClusterParameterGroupNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws ClusterQuotaExceededException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws HsmClientCertificateNotFoundException
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidElasticIpException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws LimitExceededException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidClusterTrackException
     * @throws SnapshotScheduleNotFoundException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;
        try {
            request = new CreateClusterRequestMarshaller().marshall(createClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can
     * associate a cluster with a parameter group when you create the cluster.
     * You can also associate an existing cluster with a parameter group after
     * the cluster is created by using <a>ModifyCluster</a>.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that applies
     * to the databases you create on the cluster. For more information about
     * parameters and parameter groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param createClusterParameterGroupRequest <p/>
     * @return createClusterParameterGroupResult The response from the
     *         CreateClusterParameterGroup service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterParameterGroupQuotaExceededException
     * @throws ClusterParameterGroupAlreadyExistsException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClusterParameterGroupResult createClusterParameterGroup(
            CreateClusterParameterGroupRequest createClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterParameterGroupRequest> request = null;
        Response<CreateClusterParameterGroupResult> response = null;
        try {
            request = new CreateClusterParameterGroupRequestMarshaller()
                    .marshall(createClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups to
     * control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
     * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSecurityGroupRequest <p/>
     * @return createClusterSecurityGroupResult The response from the
     *         CreateClusterSecurityGroup service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSecurityGroupAlreadyExistsException
     * @throws ClusterSecurityGroupQuotaExceededException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClusterSecurityGroupResult createClusterSecurityGroup(
            CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSecurityGroupRequest> request = null;
        Response<CreateClusterSecurityGroupResult> response = null;
        try {
            request = new CreateClusterSecurityGroupRequestMarshaller()
                    .marshall(createClusterSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateClusterSecurityGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must be
     * in the <code>available</code> state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
     * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param createClusterSnapshotRequest <p/>
     * @return createClusterSnapshotResult The response from the
     *         CreateClusterSnapshot service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClusterSnapshotResult createClusterSnapshot(
            CreateClusterSnapshotRequest createClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSnapshotRequest> request = null;
        Response<CreateClusterSnapshotResult> response = null;
        try {
            request = new CreateClusterSnapshotRequestMarshaller()
                    .marshall(createClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list of
     * one or more subnets in your existing Amazon Virtual Private Cloud (Amazon
     * VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html"
     * >Amazon Redshift Cluster Subnet Groups</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSubnetGroupRequest <p/>
     * @return createClusterSubnetGroupResult The response from the
     *         CreateClusterSubnetGroup service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSubnetGroupAlreadyExistsException
     * @throws ClusterSubnetGroupQuotaExceededException
     * @throws ClusterSubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws DependentServiceRequestThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClusterSubnetGroupResult createClusterSubnetGroup(
            CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSubnetGroupRequest> request = null;
        Response<CreateClusterSubnetGroupResult> response = null;
        try {
            request = new CreateClusterSubnetGroupRequestMarshaller()
                    .marshall(createClusterSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateClusterSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This action
     * requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by
     * either the Amazon Redshift console, the Amazon SNS console, or the Amazon
     * SNS API. To obtain an ARN with Amazon SNS, you must create a topic in
     * Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS
     * console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source IDs,
     * event categories, and event severities. Notifications will be sent for
     * all events you want that match those criteria. For example, you can
     * specify source type = cluster, source ID = my-cluster-1 and mycluster2,
     * event categories = Availability, Backup, and severity = ERROR. The
     * subscription will only send notifications for those ERROR events in the
     * Availability and Backup categories for the specified clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source type =
     * cluster and source identifier = my-cluster-1, notifications will be sent
     * for all the cluster events for my-cluster-1. If you specify a source type
     * but do not specify a source identifier, you will receive notice of the
     * events for the objects of that type in your AWS account. If you do not
     * specify either the SourceType nor the SourceIdentifier, you will be
     * notified of events generated from all Amazon Redshift sources belonging
     * to your AWS account. You must specify a source type if you specify a
     * source ID.
     * </p>
     * 
     * @param createEventSubscriptionRequest <p/>
     * @return createEventSubscriptionResult The response from the
     *         CreateEventSubscription service method, as returned by Amazon
     *         Redshift.
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionAlreadyExistException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionEventIdNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SubscriptionSeverityNotFoundException
     * @throws SourceNotFoundException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateEventSubscriptionResult createEventSubscription(
            CreateEventSubscriptionRequest createEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<CreateEventSubscriptionResult> response = null;
        try {
            request = new CreateEventSubscriptionRequestMarshaller()
                    .marshall(createEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateEventSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will
     * use to connect to the client's HSM in order to store and retrieve the
     * keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM. In
     * addition to creating the HSM certificate, you must create an Amazon
     * Redshift HSM configuration that provides a cluster the information needed
     * to store and use encryption keys in the HSM. For more information, go to
     * <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"
     * >Hardware Security Modules</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * 
     * @param createHsmClientCertificateRequest <p/>
     * @return createHsmClientCertificateResult The response from the
     *         CreateHsmClientCertificate service method, as returned by Amazon
     *         Redshift.
     * @throws HsmClientCertificateAlreadyExistsException
     * @throws HsmClientCertificateQuotaExceededException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateHsmClientCertificateResult createHsmClientCertificate(
            CreateHsmClientCertificateRequest createHsmClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmClientCertificateRequest> request = null;
        Response<CreateHsmClientCertificateResult> response = null;
        try {
            request = new CreateHsmClientCertificateRequestMarshaller()
                    .marshall(createHsmClientCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateHsmClientCertificateResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an HSM configuration that contains the information required by an
     * Amazon Redshift cluster to store and use database encryption keys in a
     * Hardware Security Module (HSM). After creating the HSM configuration, you
     * can specify it as a parameter when creating a cluster. The cluster will
     * then store its encryption keys in the HSM.
     * </p>
     * <p>
     * In addition to creating an HSM configuration, you must also create an HSM
     * client certificate. For more information, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"
     * >Hardware Security Modules</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * 
     * @param createHsmConfigurationRequest <p/>
     * @return createHsmConfigurationResult The response from the
     *         CreateHsmConfiguration service method, as returned by Amazon
     *         Redshift.
     * @throws HsmConfigurationAlreadyExistsException
     * @throws HsmConfigurationQuotaExceededException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateHsmConfigurationResult createHsmConfiguration(
            CreateHsmConfigurationRequest createHsmConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmConfigurationRequest> request = null;
        Response<CreateHsmConfigurationResult> response = null;
        try {
            request = new CreateHsmConfigurationRequestMarshaller()
                    .marshall(createHsmConfigurationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateHsmConfigurationResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a scheduled action. A scheduled action contains a schedule and an
     * Amazon Redshift API action. For example, you can create a schedule of
     * when to run the <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @param createScheduledActionRequest
     * @return createScheduledActionResult The response from the
     *         CreateScheduledAction service method, as returned by Amazon
     *         Redshift.
     * @throws ScheduledActionAlreadyExistsException
     * @throws ScheduledActionQuotaExceededException
     * @throws ScheduledActionTypeUnsupportedException
     * @throws InvalidScheduleException
     * @throws InvalidScheduledActionException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateScheduledActionResult createScheduledAction(
            CreateScheduledActionRequest createScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduledActionRequest> request = null;
        Response<CreateScheduledActionResult> response = null;
        try {
            request = new CreateScheduledActionRequestMarshaller()
                    .marshall(createScheduledActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateScheduledActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot copy grant that permits Amazon Redshift to use a
     * customer master key (CMK) from AWS Key Management Service (AWS KMS) to
     * encrypt copied snapshots in a destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param createSnapshotCopyGrantRequest <p>
     *            The result of the <code>CreateSnapshotCopyGrant</code> action.
     *            </p>
     * @return createSnapshotCopyGrantResult The response from the
     *         CreateSnapshotCopyGrant service method, as returned by Amazon
     *         Redshift.
     * @throws SnapshotCopyGrantAlreadyExistsException
     * @throws SnapshotCopyGrantQuotaExceededException
     * @throws LimitExceededException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws DependentServiceRequestThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSnapshotCopyGrantResult createSnapshotCopyGrant(
            CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotCopyGrantRequest> request = null;
        Response<CreateSnapshotCopyGrantResult> response = null;
        try {
            request = new CreateSnapshotCopyGrantRequestMarshaller()
                    .marshall(createSnapshotCopyGrantRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateSnapshotCopyGrantResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a snapshot schedule that can be associated to a cluster and which
     * overrides the default system backup schedule.
     * </p>
     * 
     * @param createSnapshotScheduleRequest
     * @return createSnapshotScheduleResult The response from the
     *         CreateSnapshotSchedule service method, as returned by Amazon
     *         Redshift.
     * @throws SnapshotScheduleAlreadyExistsException
     * @throws InvalidScheduleException
     * @throws SnapshotScheduleQuotaExceededException
     * @throws TagLimitExceededException
     * @throws ScheduleDefinitionTypeUnsupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSnapshotScheduleResult createSnapshotSchedule(
            CreateSnapshotScheduleRequest createSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotScheduleRequest> request = null;
        Response<CreateSnapshotScheduleResult> response = null;
        try {
            request = new CreateSnapshotScheduleRequestMarshaller()
                    .marshall(createSnapshotScheduleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateSnapshotScheduleResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a cluster.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags
     * for a resource, you will receive an error and the attempt will fail.
     * </p>
     * <p>
     * If you specify a key that already exists for the resource, the value for
     * that key will be updated with the new value.
     * </p>
     * 
     * @param createTagsRequest <p>
     *            Contains the output from the <code>CreateTags</code> action.
     *            </p>
     * @throws TagLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new CreateTagsRequestMarshaller().marshall(createTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a usage limit for a specified Amazon Redshift feature on a
     * cluster. The usage limit is identified by the returned usage limit
     * identifier.
     * </p>
     * 
     * @param createUsageLimitRequest
     * @return createUsageLimitResult The response from the CreateUsageLimit
     *         service method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws LimitExceededException
     * @throws UsageLimitAlreadyExistsException
     * @throws InvalidUsageLimitException
     * @throws TagLimitExceededException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUsageLimitResult createUsageLimit(CreateUsageLimitRequest createUsageLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsageLimitRequest> request = null;
        Response<CreateUsageLimitResult> response = null;
        try {
            request = new CreateUsageLimitRequestMarshaller().marshall(createUsageLimitRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateUsageLimitResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned cluster without its final snapshot being
     * created. A successful response from the web service indicates that the
     * request was received correctly. Use <a>DescribeClusters</a> to monitor
     * the status of the deletion. The delete operation cannot be canceled or
     * reverted once submitted. For more information about managing clusters, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * If you want to shut down the cluster and retain it for future use, set
     * <i>SkipFinalClusterSnapshot</i> to <code>false</code> and specify a name
     * for <i>FinalClusterSnapshotIdentifier</i>. You can later restore this
     * snapshot to resume using the cluster. If a final cluster snapshot is
     * requested, the status of the cluster will be "final-snapshot" while the
     * snapshot is being taken, then it's "deleting" once Amazon Redshift begins
     * deleting the cluster.
     * </p>
     * <p>
     * For more information about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterRequest <p/>
     * @return deleteClusterResult The response from the DeleteCluster service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws ClusterSnapshotQuotaExceededException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;
        try {
            request = new DeleteClusterRequestMarshaller().marshall(deleteClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a parameter group if it is associated with a cluster.
     * </p>
     * </note>
     * 
     * @param deleteClusterParameterGroupRequest <p/>
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteClusterParameterGroup(
            DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterParameterGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteClusterParameterGroupRequestMarshaller()
                    .marshall(deleteClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a security group that is associated with any clusters.
     * You cannot delete the default security group.
     * </p>
     * </note>
     * <p>
     * For information about managing security groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
     * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterSecurityGroupRequest <p/>
     * @throws InvalidClusterSecurityGroupStateException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteClusterSecurityGroup(
            DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSecurityGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteClusterSecurityGroupRequestMarshaller()
                    .marshall(deleteClusterSecurityGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the
     * <code>available</code> state, with no other users authorized to access
     * the snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after you
     * delete your cluster. Amazon Redshift does not delete your manual
     * snapshots. You must delete manual snapshot explicitly to avoid getting
     * charged. If other accounts are authorized to access the snapshot, you
     * must revoke all of the authorizations before you can delete the snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest <p/>
     * @return deleteClusterSnapshotResult The response from the
     *         DeleteClusterSnapshot service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidClusterSnapshotStateException
     * @throws ClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteClusterSnapshotResult deleteClusterSnapshot(
            DeleteClusterSnapshotRequest deleteClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSnapshotRequest> request = null;
        Response<DeleteClusterSnapshotResult> response = null;
        try {
            request = new DeleteClusterSnapshotRequestMarshaller()
                    .marshall(deleteClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     * 
     * @param deleteClusterSubnetGroupRequest <p/>
     * @throws InvalidClusterSubnetGroupStateException
     * @throws InvalidClusterSubnetStateException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteClusterSubnetGroup(
            DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSubnetGroupRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteClusterSubnetGroupRequestMarshaller()
                    .marshall(deleteClusterSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest <p/>
     * @throws SubscriptionNotFoundException
     * @throws InvalidSubscriptionStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteEventSubscription(
            DeleteEventSubscriptionRequest deleteEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteEventSubscriptionRequestMarshaller()
                    .marshall(deleteEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     * 
     * @param deleteHsmClientCertificateRequest <p/>
     * @throws InvalidHsmClientCertificateStateException
     * @throws HsmClientCertificateNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteHsmClientCertificate(
            DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmClientCertificateRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteHsmClientCertificateRequestMarshaller()
                    .marshall(deleteHsmClientCertificateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param deleteHsmConfigurationRequest <p/>
     * @throws InvalidHsmConfigurationStateException
     * @throws HsmConfigurationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteHsmConfiguration(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteHsmConfigurationRequestMarshaller()
                    .marshall(deleteHsmConfigurationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @throws ScheduledActionNotFoundException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledActionRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteScheduledActionRequestMarshaller()
                    .marshall(deleteScheduledActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     * 
     * @param deleteSnapshotCopyGrantRequest <p>
     *            The result of the <code>DeleteSnapshotCopyGrant</code> action.
     *            </p>
     * @throws InvalidSnapshotCopyGrantStateException
     * @throws SnapshotCopyGrantNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSnapshotCopyGrant(
            DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotCopyGrantRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteSnapshotCopyGrantRequestMarshaller()
                    .marshall(deleteSnapshotCopyGrantRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a snapshot schedule.
     * </p>
     * 
     * @param deleteSnapshotScheduleRequest
     * @throws InvalidClusterSnapshotScheduleStateException
     * @throws SnapshotScheduleNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteSnapshotScheduleRequestMarshaller()
                    .marshall(deleteSnapshotScheduleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes tags from a resource. You must provide the ARN of the resource
     * from which you want to delete the tag or tags.
     * </p>
     * 
     * @param deleteTagsRequest <p>
     *            Contains the output from the <code>DeleteTags</code> action.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a usage limit from a cluster.
     * </p>
     * 
     * @param deleteUsageLimitRequest
     * @throws UsageLimitNotFoundException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteUsageLimit(DeleteUsageLimitRequest deleteUsageLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsageLimitRequest> request = null;
        Response<Void> response = null;
        try {
            request = new DeleteUsageLimitRequestMarshaller().marshall(deleteUsageLimitRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of attributes attached to an account
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return describeAccountAttributesResult The response from the
     *         DescribeAccountAttributes service method, as returned by Amazon
     *         Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;
        try {
            request = new DescribeAccountAttributesRequestMarshaller()
                    .marshall(describeAccountAttributesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeAccountAttributesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>ClusterDbRevision</code> objects.
     * </p>
     * 
     * @param describeClusterDbRevisionsRequest
     * @return describeClusterDbRevisionsResult The response from the
     *         DescribeClusterDbRevisions service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterDbRevisionsResult describeClusterDbRevisions(
            DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterDbRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterDbRevisionsRequest> request = null;
        Response<DescribeClusterDbRevisionsResult> response = null;
        try {
            request = new DescribeClusterDbRevisionsRequestMarshaller()
                    .marshall(describeClusterDbRevisionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterDbRevisionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including parameter
     * groups you created and the default parameter group. For each parameter
     * group, the response includes the parameter group name, description, and
     * parameter group family name. You can optionally specify a name to
     * retrieve the description of a specific parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all parameter groups that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all parameter groups that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @param describeClusterParameterGroupsRequest <p/>
     * @return describeClusterParameterGroupsResult The response from the
     *         DescribeClusterParameterGroups service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterParameterGroupNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(
            DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParameterGroupsRequest> request = null;
        Response<DescribeClusterParameterGroupsResult> response = null;
        try {
            request = new DescribeClusterParameterGroupsRequestMarshaller()
                    .marshall(describeClusterParameterGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterParameterGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified
     * Amazon Redshift parameter group. For each parameter the response includes
     * information such as parameter name, description, data type, value,
     * whether the parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only
     * specific type. For example, to retrieve parameters that were modified by
     * a user action such as from <a>ModifyClusterParameterGroup</a>, you can
     * specify <i>source</i> equal to <i>user</i>.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param describeClusterParametersRequest <p/>
     * @return describeClusterParametersResult The response from the
     *         DescribeClusterParameters service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterParametersResult describeClusterParameters(
            DescribeClusterParametersRequest describeClusterParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParametersRequest> request = null;
        Response<DescribeClusterParametersResult> response = null;
        try {
            request = new DescribeClusterParametersRequestMarshaller()
                    .marshall(describeClusterParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterParametersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the name of
     * a security group is specified, the response will contain only information
     * about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
     * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all security groups that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all security groups that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security groups
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @param describeClusterSecurityGroupsRequest <p/>
     * @return describeClusterSecurityGroupsResult The response from the
     *         DescribeClusterSecurityGroups service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterSecurityGroupNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(
            DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSecurityGroupsRequest> request = null;
        Response<DescribeClusterSecurityGroupsResult> response = null;
        try {
            request = new DescribeClusterSecurityGroupsRequestMarshaller()
                    .marshall(describeClusterSecurityGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterSecurityGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about your
     * cluster snapshots. By default, this operation returns information about
     * all snapshots of all clusters that are owned by you AWS customer account.
     * No information is returned for snapshots owned by inactive AWS customer
     * accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all snapshots that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all snapshots that have any combination
     * of those values are returned. Only snapshots that you own are returned in
     * the response; shared snapshots are not returned with the tag key and tag
     * value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots are
     * returned regardless of whether they have tag keys or values associated
     * with them.
     * </p>
     * 
     * @param describeClusterSnapshotsRequest <p/>
     * @return describeClusterSnapshotsResult The response from the
     *         DescribeClusterSnapshots service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterSnapshotsResult describeClusterSnapshots(
            DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSnapshotsRequest> request = null;
        Response<DescribeClusterSnapshotsResult> response = null;
        try {
            request = new DescribeClusterSnapshotsRequestMarshaller()
                    .marshall(describeClusterSnapshotsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterSnapshotsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain metadata
     * about your cluster subnet groups. By default, this operation returns
     * information about all cluster subnet groups that are defined in you AWS
     * account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all subnet groups that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all subnet groups that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet groups
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @param describeClusterSubnetGroupsRequest <p/>
     * @return describeClusterSubnetGroupsResult The response from the
     *         DescribeClusterSubnetGroups service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(
            DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSubnetGroupsRequest> request = null;
        Response<DescribeClusterSubnetGroupsResult> response = null;
        try {
            request = new DescribeClusterSubnetGroupsRequestMarshaller()
                    .marshall(describeClusterSubnetGroupsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterSubnetGroupsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the available maintenance tracks.
     * </p>
     * 
     * @param describeClusterTracksRequest
     * @return describeClusterTracksResult The response from the
     *         DescribeClusterTracks service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidClusterTrackException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterTracksResult describeClusterTracks(
            DescribeClusterTracksRequest describeClusterTracksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterTracksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterTracksRequest> request = null;
        Response<DescribeClusterTracksResult> response = null;
        try {
            request = new DescribeClusterTracksRequestMarshaller()
                    .marshall(describeClusterTracksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterTracksResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster versions.
     * You can call this operation even before creating any clusters to learn
     * more about the Amazon Redshift versions. For more information about
     * managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param describeClusterVersionsRequest <p/>
     * @return describeClusterVersionsResult The response from the
     *         DescribeClusterVersions service method, as returned by Amazon
     *         Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClusterVersionsResult describeClusterVersions(
            DescribeClusterVersionsRequest describeClusterVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterVersionsRequest> request = null;
        Response<DescribeClusterVersionsResult> response = null;
        try {
            request = new DescribeClusterVersionsRequestMarshaller()
                    .marshall(describeClusterVersionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClusterVersionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster
     * properties, cluster database properties, maintenance and backup
     * properties, and security and access properties. This operation supports
     * pagination. For more information about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all clusters that match any combination of the specified
     * keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all clusters that have any combination
     * of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters are
     * returned regardless of whether they have tag keys or values associated
     * with them.
     * </p>
     * 
     * @param describeClustersRequest <p/>
     * @return describeClustersResult The response from the DescribeClusters
     *         service method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;
        try {
            request = new DescribeClustersRequestMarshaller().marshall(describeClustersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeClustersResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter group
     * family.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param describeDefaultClusterParametersRequest <p/>
     * @return describeDefaultClusterParametersResult The response from the
     *         DescribeDefaultClusterParameters service method, as returned by
     *         Amazon Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDefaultClusterParametersResult describeDefaultClusterParameters(
            DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDefaultClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultClusterParametersRequest> request = null;
        Response<DescribeDefaultClusterParametersResult> response = null;
        try {
            request = new DescribeDefaultClusterParametersRequestMarshaller()
                    .marshall(describeDefaultClusterParametersRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeDefaultClusterParametersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays a list of event categories for all event source types, or for a
     * specified source type. For a list of the event categories and source
     * types, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html"
     * >Amazon Redshift Event Notifications</a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest <p/>
     * @return describeEventCategoriesResult The response from the
     *         DescribeEventCategories service method, as returned by Amazon
     *         Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories(
            DescribeEventCategoriesRequest describeEventCategoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;
        try {
            request = new DescribeEventCategoriesRequestMarshaller()
                    .marshall(describeEventCategoriesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventCategoriesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notification
     * subscriptions for a customer account. If you specify a subscription name,
     * lists the description for that subscription.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all event notification subscriptions that match any
     * combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all
     * subscriptions that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subscriptions
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest <p/>
     * @return describeEventSubscriptionsResult The response from the
     *         DescribeEventSubscriptions service method, as returned by Amazon
     *         Redshift.
     * @throws SubscriptionNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;
        try {
            request = new DescribeEventSubscriptionsRequestMarshaller()
                    .marshall(describeEventSubscriptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventSubscriptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained by
     * providing the name as a parameter. By default, the past hour of events
     * are returned.
     * </p>
     * 
     * @param describeEventsRequest <p/>
     * @return describeEventsResult The response from the DescribeEvents service
     *         method, as returned by Amazon Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        try {
            request = new DescribeEventsRequestMarshaller().marshall(describeEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no
     * certificate ID is specified, returns information about all the HSM
     * certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all HSM client certificates that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all HSM client
     * certificates that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client
     * certificates are returned regardless of whether they have tag keys or
     * values associated with them.
     * </p>
     * 
     * @param describeHsmClientCertificatesRequest <p/>
     * @return describeHsmClientCertificatesResult The response from the
     *         DescribeHsmClientCertificates service method, as returned by
     *         Amazon Redshift.
     * @throws HsmClientCertificateNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates(
            DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHsmClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmClientCertificatesRequest> request = null;
        Response<DescribeHsmClientCertificatesResult> response = null;
        try {
            request = new DescribeHsmClientCertificatesRequestMarshaller()
                    .marshall(describeHsmClientCertificatesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeHsmClientCertificatesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM
     * configuration. If no configuration ID is specified, returns information
     * about all the HSM configurations owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all HSM connections that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all HSM connections that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM connections
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @param describeHsmConfigurationsRequest <p/>
     * @return describeHsmConfigurationsResult The response from the
     *         DescribeHsmConfigurations service method, as returned by Amazon
     *         Redshift.
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeHsmConfigurationsResult describeHsmConfigurations(
            DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeHsmConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmConfigurationsRequest> request = null;
        Response<DescribeHsmConfigurationsResult> response = null;
        try {
            request = new DescribeHsmConfigurationsRequestMarshaller()
                    .marshall(describeHsmConfigurationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeHsmConfigurationsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes whether information, such as queries and connection attempts,
     * is being logged for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param describeLoggingStatusRequest <p/>
     * @return describeLoggingStatusResult The response from the
     *         DescribeLoggingStatus service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeLoggingStatusResult describeLoggingStatus(
            DescribeLoggingStatusRequest describeLoggingStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeLoggingStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingStatusRequest> request = null;
        Response<DescribeLoggingStatusResult> response = null;
        try {
            request = new DescribeLoggingStatusRequestMarshaller()
                    .marshall(describeLoggingStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeLoggingStatusResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns properties of possible node configurations such as node type,
     * number of nodes, and disk usage for the specified action type.
     * </p>
     * 
     * @param describeNodeConfigurationOptionsRequest
     * @return describeNodeConfigurationOptionsResult The response from the
     *         DescribeNodeConfigurationOptions service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidClusterSnapshotStateException
     * @throws ClusterNotFoundException
     * @throws AccessToSnapshotDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeNodeConfigurationOptionsResult describeNodeConfigurationOptions(
            DescribeNodeConfigurationOptionsRequest describeNodeConfigurationOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeNodeConfigurationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNodeConfigurationOptionsRequest> request = null;
        Response<DescribeNodeConfigurationOptionsResult> response = null;
        try {
            request = new DescribeNodeConfigurationOptionsRequestMarshaller()
                    .marshall(describeNodeConfigurationOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new DescribeNodeConfigurationOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new
     * cluster you can use this operation to find what options are available,
     * such as the EC2 Availability Zones (AZ) in the specific AWS Region that
     * you can specify, and the node types you can request. The node types
     * differ by available storage, memory, CPU and price. With the cost
     * involved you might want to obtain a list of cluster options in the
     * specific region and specify values when creating a cluster. For more
     * information about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param describeOrderableClusterOptionsRequest <p/>
     * @return describeOrderableClusterOptionsResult The response from the
     *         DescribeOrderableClusterOptions service method, as returned by
     *         Amazon Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(
            DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOrderableClusterOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableClusterOptionsRequest> request = null;
        Response<DescribeOrderableClusterOptionsResult> response = null;
        try {
            request = new DescribeOrderableClusterOptionsRequestMarshaller()
                    .marshall(describeOrderableClusterOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeOrderableClusterOptionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon
     * Redshift with their descriptions including the node type, the fixed and
     * recurring costs of reserving the node and duration the node will be
     * reserved for you. These descriptions help you determine which reserve
     * node offering you want to purchase. You then use the unique offering ID
     * in you call to <a>PurchaseReservedNodeOffering</a> to reserve one or more
     * nodes for your Amazon Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"
     * >Purchasing Reserved Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param describeReservedNodeOfferingsRequest <p/>
     * @return describeReservedNodeOfferingsResult The response from the
     *         DescribeReservedNodeOfferings service method, as returned by
     *         Amazon Redshift.
     * @throws ReservedNodeOfferingNotFoundException
     * @throws UnsupportedOperationException
     * @throws DependentServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(
            DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedNodeOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodeOfferingsRequest> request = null;
        Response<DescribeReservedNodeOfferingsResult> response = null;
        try {
            request = new DescribeReservedNodeOfferingsRequestMarshaller()
                    .marshall(describeReservedNodeOfferingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeReservedNodeOfferingsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @param describeReservedNodesRequest <p/>
     * @return describeReservedNodesResult The response from the
     *         DescribeReservedNodes service method, as returned by Amazon
     *         Redshift.
     * @throws ReservedNodeNotFoundException
     * @throws DependentServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeReservedNodesResult describeReservedNodes(
            DescribeReservedNodesRequest describeReservedNodesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservedNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodesRequest> request = null;
        Response<DescribeReservedNodesResult> response = null;
        try {
            request = new DescribeReservedNodesRequestMarshaller()
                    .marshall(describeReservedNodesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeReservedNodesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the last resize operation for the specified
     * cluster. If no resize operation has ever been initiated for the specified
     * cluster, a <code>HTTP 404</code> error is returned. If a resize operation
     * was initiated and completed, the status of the resize remains as
     * <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using <a>ModifyCluster</a> and
     * specifying a different number or type of nodes for the cluster.
     * </p>
     * 
     * @param describeResizeRequest <p/>
     * @return describeResizeResult The response from the DescribeResize service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws ResizeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeResizeResult describeResize(DescribeResizeRequest describeResizeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeResizeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResizeRequest> request = null;
        Response<DescribeResizeResult> response = null;
        try {
            request = new DescribeResizeRequestMarshaller().marshall(describeResizeRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeResizeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes properties of scheduled actions.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return describeScheduledActionsResult The response from the
     *         DescribeScheduledActions service method, as returned by Amazon
     *         Redshift.
     * @throws ScheduledActionNotFoundException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeScheduledActionsResult describeScheduledActions(
            DescribeScheduledActionsRequest describeScheduledActionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledActionsRequest> request = null;
        Response<DescribeScheduledActionsResult> response = null;
        try {
            request = new DescribeScheduledActionsRequestMarshaller()
                    .marshall(describeScheduledActionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeScheduledActionsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in the
     * destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"
     * >Amazon Redshift Database Encryption</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeSnapshotCopyGrantsRequest <p>
     *            The result of the <code>DescribeSnapshotCopyGrants</code>
     *            action.
     *            </p>
     * @return describeSnapshotCopyGrantsResult The response from the
     *         DescribeSnapshotCopyGrants service method, as returned by Amazon
     *         Redshift.
     * @throws SnapshotCopyGrantNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(
            DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotCopyGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotCopyGrantsRequest> request = null;
        Response<DescribeSnapshotCopyGrantsResult> response = null;
        try {
            request = new DescribeSnapshotCopyGrantsRequestMarshaller()
                    .marshall(describeSnapshotCopyGrantsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeSnapshotCopyGrantsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of snapshot schedules.
     * </p>
     * 
     * @param describeSnapshotSchedulesRequest
     * @return describeSnapshotSchedulesResult The response from the
     *         DescribeSnapshotSchedules service method, as returned by Amazon
     *         Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSnapshotSchedulesResult describeSnapshotSchedules(
            DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotSchedulesRequest> request = null;
        Response<DescribeSnapshotSchedulesResult> response = null;
        try {
            request = new DescribeSnapshotSchedulesRequestMarshaller()
                    .marshall(describeSnapshotSchedulesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeSnapshotSchedulesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns account level backups storage size and provisional storage.
     * </p>
     * 
     * @param describeStorageRequest
     * @return describeStorageResult The response from the DescribeStorage
     *         service method, as returned by Amazon Redshift.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeStorageResult describeStorage(DescribeStorageRequest describeStorageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorageRequest> request = null;
        Response<DescribeStorageResult> response = null;
        try {
            request = new DescribeStorageRequestMarshaller().marshall(describeStorageRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStorageResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the status of one or more table restore requests made using the
     * <a>RestoreTableFromClusterSnapshot</a> API action. If you don't specify a
     * value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all table
     * restore requests ordered by the date and time of the request in ascending
     * order. Otherwise <code>DescribeTableRestoreStatus</code> returns the
     * status of the table specified by <code>TableRestoreRequestId</code>.
     * </p>
     * 
     * @param describeTableRestoreStatusRequest <p/>
     * @return describeTableRestoreStatusResult The response from the
     *         DescribeTableRestoreStatus service method, as returned by Amazon
     *         Redshift.
     * @throws TableRestoreNotFoundException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTableRestoreStatusResult describeTableRestoreStatus(
            DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTableRestoreStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRestoreStatusRequest> request = null;
        Response<DescribeTableRestoreStatusResult> response = null;
        try {
            request = new DescribeTableRestoreStatusRequestMarshaller()
                    .marshall(describeTableRestoreStatusRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTableRestoreStatusResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource by
     * specifying an ARN, or you can return all tags for a given type of
     * resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot specify an ARN and a resource-type value together in the same
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use the <code>MaxRecords</code> and <code>Marker</code>
     * parameters together with the ARN parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxRecords</code> parameter can be a range from 10 to 50
     * results to return in a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon
     * Redshift returns all resources that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all resources that have any combination
     * of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources are
     * returned regardless of whether they have tag keys or values associated
     * with them.
     * </p>
     * 
     * @param describeTagsRequest <p/>
     * @return describeTagsResult The response from the DescribeTags service
     *         method, as returned by Amazon Redshift.
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        try {
            request = new DescribeTagsRequestMarshaller().marshall(describeTagsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shows usage limits on a cluster. Results are filtered based on the
     * combination of input usage limit identifier, cluster identifier, and
     * feature type parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If usage limit identifier, cluster identifier, and feature type are not
     * provided, then all usage limit objects for the current account in the
     * current region are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If usage limit identifier is provided, then the corresponding usage limit
     * object is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If cluster identifier is provided, then all usage limit objects for the
     * specified cluster are returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * If cluster identifier and feature type are provided, then all usage limit
     * objects for the combination of cluster and feature are returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeUsageLimitsRequest
     * @return describeUsageLimitsResult The response from the
     *         DescribeUsageLimits service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUsageLimitsResult describeUsageLimits(
            DescribeUsageLimitsRequest describeUsageLimitsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUsageLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUsageLimitsRequest> request = null;
        Response<DescribeUsageLimitsResult> response = null;
        try {
            request = new DescribeUsageLimitsRequestMarshaller()
                    .marshall(describeUsageLimitsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeUsageLimitsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts, for
     * the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param disableLoggingRequest <p/>
     * @return disableLoggingResult The response from the DisableLogging service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableLoggingResult disableLogging(DisableLoggingRequest disableLoggingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableLoggingRequest> request = null;
        Response<DisableLoggingResult> response = null;
        try {
            request = new DisableLoggingRequestMarshaller().marshall(disableLoggingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DisableLoggingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     * <p>
     * If your cluster and its snapshots are encrypted using a customer master
     * key (CMK) from AWS KMS, use <a>DeleteSnapshotCopyGrant</a> to delete the
     * grant that grants Amazon Redshift permission to the CMK in the
     * destination region.
     * </p>
     * 
     * @param disableSnapshotCopyRequest <p/>
     * @return disableSnapshotCopyResult The response from the
     *         DisableSnapshotCopy service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws SnapshotCopyAlreadyDisabledException
     * @throws InvalidClusterStateException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DisableSnapshotCopyResult disableSnapshotCopy(
            DisableSnapshotCopyRequest disableSnapshotCopyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSnapshotCopyRequest> request = null;
        Response<DisableSnapshotCopyResult> response = null;
        try {
            request = new DisableSnapshotCopyRequestMarshaller()
                    .marshall(disableSnapshotCopyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DisableSnapshotCopyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts, for
     * the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param enableLoggingRequest <p/>
     * @return enableLoggingResult The response from the EnableLogging service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws BucketNotFoundException
     * @throws InsufficientS3BucketPolicyException
     * @throws InvalidS3KeyPrefixException
     * @throws InvalidS3BucketNameException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableLoggingResult enableLogging(EnableLoggingRequest enableLoggingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableLoggingRequest> request = null;
        Response<EnableLoggingResult> response = null;
        try {
            request = new EnableLoggingRequestMarshaller().marshall(enableLoggingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EnableLoggingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another region
     * for a specified cluster.
     * </p>
     * 
     * @param enableSnapshotCopyRequest <p/>
     * @return enableSnapshotCopyResult The response from the EnableSnapshotCopy
     *         service method, as returned by Amazon Redshift.
     * @throws IncompatibleOrderableOptionsException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws CopyToRegionDisabledException
     * @throws SnapshotCopyAlreadyEnabledException
     * @throws UnknownSnapshotCopyRegionException
     * @throws UnauthorizedOperationException
     * @throws SnapshotCopyGrantNotFoundException
     * @throws LimitExceededException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public EnableSnapshotCopyResult enableSnapshotCopy(
            EnableSnapshotCopyRequest enableSnapshotCopyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(enableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSnapshotCopyRequest> request = null;
        Response<EnableSnapshotCopyResult> response = null;
        try {
            request = new EnableSnapshotCopyRequestMarshaller().marshall(enableSnapshotCopyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EnableSnapshotCopyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a database user name and temporary password with temporary
     * authorization to log on to an Amazon Redshift database. The action
     * returns the database user name prefixed with <code>IAM:</code> if
     * <code>AutoCreate</code> is <code>False</code> or <code>IAMA:</code> if
     * <code>AutoCreate</code> is <code>True</code>. You can optionally specify
     * one or more database user groups that the user will join at log on. By
     * default, the temporary credentials expire in 900 seconds. You can
     * optionally specify a duration between 900 seconds (15 minutes) and 3600
     * seconds (60 minutes). For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/generating-user-credentials.html"
     * >Using IAM Authentication to Generate Database User Credentials</a> in
     * the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * The AWS Identity and Access Management (IAM)user or role that executes
     * GetClusterCredentials must have an IAM policy attached that allows access
     * to all necessary actions and resources. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html#redshift-policy-resources.getclustercredentials-resources"
     * >Resource Policies for GetClusterCredentials</a> in the Amazon Redshift
     * Cluster Management Guide.
     * </p>
     * <p>
     * If the <code>DbGroups</code> parameter is specified, the IAM policy must
     * allow the <code>redshift:JoinGroup</code> action with access to the
     * listed <code>dbgroups</code>.
     * </p>
     * <p>
     * In addition, if the <code>AutoCreate</code> parameter is set to
     * <code>True</code>, then the policy must include the
     * <code>redshift:CreateClusterUser</code> privilege.
     * </p>
     * <p>
     * If the <code>DbName</code> parameter is specified, the IAM policy must
     * allow access to the resource <code>dbname</code> for the specified
     * database name.
     * </p>
     * 
     * @param getClusterCredentialsRequest <p>
     *            The request parameters to get cluster credentials.
     *            </p>
     * @return getClusterCredentialsResult The response from the
     *         GetClusterCredentials service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClusterCredentialsResult getClusterCredentials(
            GetClusterCredentialsRequest getClusterCredentialsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClusterCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClusterCredentialsRequest> request = null;
        Response<GetClusterCredentialsResult> response = null;
        try {
            request = new GetClusterCredentialsRequestMarshaller()
                    .marshall(getClusterCredentialsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetClusterCredentialsResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment
     * type, term, and usage price of the given DC1 reserved node.
     * </p>
     * 
     * @param getReservedNodeExchangeOfferingsRequest <p/>
     * @return getReservedNodeExchangeOfferingsResult The response from the
     *         GetReservedNodeExchangeOfferings service method, as returned by
     *         Amazon Redshift.
     * @throws ReservedNodeNotFoundException
     * @throws InvalidReservedNodeStateException
     * @throws ReservedNodeAlreadyMigratedException
     * @throws ReservedNodeOfferingNotFoundException
     * @throws UnsupportedOperationException
     * @throws DependentServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetReservedNodeExchangeOfferingsResult getReservedNodeExchangeOfferings(
            GetReservedNodeExchangeOfferingsRequest getReservedNodeExchangeOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getReservedNodeExchangeOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservedNodeExchangeOfferingsRequest> request = null;
        Response<GetReservedNodeExchangeOfferingsResult> response = null;
        try {
            request = new GetReservedNodeExchangeOfferingsRequestMarshaller()
                    .marshall(getReservedNodeExchangeOfferingsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new GetReservedNodeExchangeOfferingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a cluster.
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or down
     * the cluster. When resizing a cluster, you must specify both the number of
     * nodes and the node type even if one of the parameters does not change.
     * </p>
     * <p>
     * You can add another security or parameter group, or change the master
     * user password. Resetting a cluster password or modifying the security
     * groups associated with a cluster do not need a reboot. However, modifying
     * a parameter group requires a reboot for parameters to take effect. For
     * more information about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param modifyClusterRequest <p/>
     * @return modifyClusterResult The response from the ModifyCluster service
     *         method, as returned by Amazon Redshift.
     * @throws InvalidClusterStateException
     * @throws InvalidClusterSecurityGroupStateException
     * @throws ClusterNotFoundException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws ClusterParameterGroupNotFoundException
     * @throws InsufficientClusterCapacityException
     * @throws UnsupportedOptionException
     * @throws UnauthorizedOperationException
     * @throws HsmClientCertificateNotFoundException
     * @throws HsmConfigurationNotFoundException
     * @throws ClusterAlreadyExistsException
     * @throws LimitExceededException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidElasticIpException
     * @throws TableLimitExceededException
     * @throws InvalidClusterTrackException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterResult modifyCluster(ModifyClusterRequest modifyClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterRequest> request = null;
        Response<ModifyClusterResult> response = null;
        try {
            request = new ModifyClusterRequestMarshaller().marshall(modifyClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the database revision of a cluster. The database revision is a
     * unique revision of the database running in a cluster.
     * </p>
     * 
     * @param modifyClusterDbRevisionRequest
     * @return modifyClusterDbRevisionResult The response from the
     *         ModifyClusterDbRevision service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws ClusterOnLatestRevisionException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterDbRevisionResult modifyClusterDbRevision(
            ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterDbRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterDbRevisionRequest> request = null;
        Response<ModifyClusterDbRevisionResult> response = null;
        try {
            request = new ModifyClusterDbRevisionRequestMarshaller()
                    .marshall(modifyClusterDbRevisionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterDbRevisionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the list of AWS Identity and Access Management (IAM) roles that
     * can be used by the cluster to access other AWS services.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param modifyClusterIamRolesRequest <p/>
     * @return modifyClusterIamRolesResult The response from the
     *         ModifyClusterIamRoles service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterIamRolesResult modifyClusterIamRoles(
            ModifyClusterIamRolesRequest modifyClusterIamRolesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterIamRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterIamRolesRequest> request = null;
        Response<ModifyClusterIamRolesResult> response = null;
        try {
            request = new ModifyClusterIamRolesRequestMarshaller()
                    .marshall(modifyClusterIamRolesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterIamRolesResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the maintenance settings of a cluster.
     * </p>
     * 
     * @param modifyClusterMaintenanceRequest
     * @return modifyClusterMaintenanceResult The response from the
     *         ModifyClusterMaintenance service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterMaintenanceResult modifyClusterMaintenance(
            ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterMaintenanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterMaintenanceRequest> request = null;
        Response<ModifyClusterMaintenanceResult> response = null;
        try {
            request = new ModifyClusterMaintenanceRequestMarshaller()
                    .marshall(modifyClusterMaintenanceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterMaintenanceResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param modifyClusterParameterGroupRequest <p/>
     * @return modifyClusterParameterGroupResult The response from the
     *         ModifyClusterParameterGroup service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterParameterGroupNotFoundException
     * @throws InvalidClusterParameterGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(
            ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterParameterGroupRequest> request = null;
        Response<ModifyClusterParameterGroupResult> response = null;
        try {
            request = new ModifyClusterParameterGroupRequestMarshaller()
                    .marshall(modifyClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a snapshot.
     * </p>
     * <p>
     * This exanmple modifies the manual retention period setting for a cluster
     * snapshot.
     * </p>
     * 
     * @param modifyClusterSnapshotRequest
     * @return modifyClusterSnapshotResult The response from the
     *         ModifyClusterSnapshot service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidClusterSnapshotStateException
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterSnapshotResult modifyClusterSnapshot(
            ModifyClusterSnapshotRequest modifyClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSnapshotRequest> request = null;
        Response<ModifyClusterSnapshotResult> response = null;
        try {
            request = new ModifyClusterSnapshotRequestMarshaller()
                    .marshall(modifyClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a snapshot schedule for a cluster.
     * </p>
     * 
     * @param modifyClusterSnapshotScheduleRequest
     * @throws ClusterNotFoundException
     * @throws SnapshotScheduleNotFoundException
     * @throws InvalidClusterSnapshotScheduleStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void modifyClusterSnapshotSchedule(
            ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSnapshotScheduleRequest> request = null;
        Response<Void> response = null;
        try {
            request = new ModifyClusterSnapshotScheduleRequestMarshaller()
                    .marshall(modifyClusterSnapshotScheduleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC
     * subnets. The operation replaces the existing list of subnets with the new
     * list of subnets.
     * </p>
     * 
     * @param modifyClusterSubnetGroupRequest <p/>
     * @return modifyClusterSubnetGroupResult The response from the
     *         ModifyClusterSubnetGroup service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterSubnetGroupNotFoundException
     * @throws ClusterSubnetQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws DependentServiceRequestThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyClusterSubnetGroupResult modifyClusterSubnetGroup(
            ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSubnetGroupRequest> request = null;
        Response<ModifyClusterSubnetGroupResult> response = null;
        try {
            request = new ModifyClusterSubnetGroupRequestMarshaller()
                    .marshall(modifyClusterSubnetGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyClusterSubnetGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest <p/>
     * @return modifyEventSubscriptionResult The response from the
     *         ModifyEventSubscription service method, as returned by Amazon
     *         Redshift.
     * @throws SubscriptionNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionEventIdNotFoundException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SubscriptionSeverityNotFoundException
     * @throws SourceNotFoundException
     * @throws InvalidSubscriptionStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyEventSubscriptionResult modifyEventSubscription(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<ModifyEventSubscriptionResult> response = null;
        try {
            request = new ModifyEventSubscriptionRequestMarshaller()
                    .marshall(modifyEventSubscriptionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyEventSubscriptionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a scheduled action.
     * </p>
     * 
     * @param modifyScheduledActionRequest
     * @return modifyScheduledActionResult The response from the
     *         ModifyScheduledAction service method, as returned by Amazon
     *         Redshift.
     * @throws ScheduledActionNotFoundException
     * @throws ScheduledActionTypeUnsupportedException
     * @throws InvalidScheduleException
     * @throws InvalidScheduledActionException
     * @throws UnauthorizedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyScheduledActionResult modifyScheduledAction(
            ModifyScheduledActionRequest modifyScheduledActionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyScheduledActionRequest> request = null;
        Response<ModifyScheduledActionResult> response = null;
        try {
            request = new ModifyScheduledActionRequestMarshaller()
                    .marshall(modifyScheduledActionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyScheduledActionResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the number of days to retain snapshots in the destination AWS
     * Region after they are copied from the source AWS Region. By default, this
     * operation only changes the retention period of copied automated
     * snapshots. The retention periods for both new and existing copied
     * automated snapshots are updated with the new retention period. You can
     * set the manual option to change only the retention periods of copied
     * manual snapshots. If you set this option, only newly copied manual
     * snapshots have the new retention period.
     * </p>
     * 
     * @param modifySnapshotCopyRetentionPeriodRequest <p/>
     * @return modifySnapshotCopyRetentionPeriodResult The response from the
     *         ModifySnapshotCopyRetentionPeriod service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws SnapshotCopyDisabledException
     * @throws UnauthorizedOperationException
     * @throws InvalidClusterStateException
     * @throws InvalidRetentionPeriodException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifySnapshotCopyRetentionPeriodResult modifySnapshotCopyRetentionPeriod(
            ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifySnapshotCopyRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySnapshotCopyRetentionPeriodRequest> request = null;
        Response<ModifySnapshotCopyRetentionPeriodResult> response = null;
        try {
            request = new ModifySnapshotCopyRetentionPeriodRequestMarshaller()
                    .marshall(modifySnapshotCopyRetentionPeriodRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new ModifySnapshotCopyRetentionPeriodResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a snapshot schedule. Any schedule associated with a cluster is
     * modified asynchronously.
     * </p>
     * 
     * @param modifySnapshotScheduleRequest
     * @return modifySnapshotScheduleResult The response from the
     *         ModifySnapshotSchedule service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidScheduleException
     * @throws SnapshotScheduleNotFoundException
     * @throws SnapshotScheduleUpdateInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifySnapshotScheduleResult modifySnapshotSchedule(
            ModifySnapshotScheduleRequest modifySnapshotScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifySnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySnapshotScheduleRequest> request = null;
        Response<ModifySnapshotScheduleResult> response = null;
        try {
            request = new ModifySnapshotScheduleRequestMarshaller()
                    .marshall(modifySnapshotScheduleRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifySnapshotScheduleResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a usage limit in a cluster. You can't modify the feature type or
     * period of a usage limit.
     * </p>
     * 
     * @param modifyUsageLimitRequest
     * @return modifyUsageLimitResult The response from the ModifyUsageLimit
     *         service method, as returned by Amazon Redshift.
     * @throws InvalidUsageLimitException
     * @throws UsageLimitNotFoundException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ModifyUsageLimitResult modifyUsageLimit(ModifyUsageLimitRequest modifyUsageLimitRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(modifyUsageLimitRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyUsageLimitRequest> request = null;
        Response<ModifyUsageLimitResult> response = null;
        try {
            request = new ModifyUsageLimitRequestMarshaller().marshall(modifyUsageLimitRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ModifyUsageLimitResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Pauses a cluster.
     * </p>
     * 
     * @param pauseClusterRequest
     * @return pauseClusterResult The response from the PauseCluster service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PauseClusterResult pauseCluster(PauseClusterRequest pauseClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(pauseClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PauseClusterRequest> request = null;
        Response<PauseClusterResult> response = null;
        try {
            request = new PauseClusterRequestMarshaller().marshall(pauseClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PauseClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a
     * predefined set of reserved node offerings. You can purchase one or more
     * of the offerings. You can call the <a>DescribeReservedNodeOfferings</a>
     * API to obtain the available reserved node offerings. You can call this
     * API by providing a specific reserved node offering and the number of
     * nodes you want to reserve.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"
     * >Purchasing Reserved Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param purchaseReservedNodeOfferingRequest <p/>
     * @return purchaseReservedNodeOfferingResult The response from the
     *         PurchaseReservedNodeOffering service method, as returned by
     *         Amazon Redshift.
     * @throws ReservedNodeOfferingNotFoundException
     * @throws ReservedNodeAlreadyExistsException
     * @throws ReservedNodeQuotaExceededException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PurchaseReservedNodeOfferingResult purchaseReservedNodeOffering(
            PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedNodeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedNodeOfferingRequest> request = null;
        Response<PurchaseReservedNodeOfferingResult> response = null;
        try {
            request = new PurchaseReservedNodeOfferingRequestMarshaller()
                    .marshall(purchaseReservedNodeOfferingRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new PurchaseReservedNodeOfferingResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It results
     * in a momentary outage to the cluster, during which the cluster status is
     * set to <code>rebooting</code>. A cluster event is created when the reboot
     * is completed. Any pending cluster modifications (see
     * <a>ModifyCluster</a>) are applied at this reboot. For more information
     * about managing clusters, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"
     * >Amazon Redshift Clusters</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param rebootClusterRequest <p/>
     * @return rebootClusterResult The response from the RebootCluster service
     *         method, as returned by Amazon Redshift.
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RebootClusterResult rebootCluster(RebootClusterRequest rebootClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rebootClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootClusterRequest> request = null;
        Response<RebootClusterResult> response = null;
        try {
            request = new RebootClusterRequestMarshaller().marshall(rebootClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RebootClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their
     * default values and sets the source values of the parameters to
     * "engine-default". To reset the entire parameter group specify the
     * <i>ResetAllParameters</i> parameter. For parameter changes to take effect
     * you must reboot any associated clusters.
     * </p>
     * 
     * @param resetClusterParameterGroupRequest <p/>
     * @return resetClusterParameterGroupResult The response from the
     *         ResetClusterParameterGroup service method, as returned by Amazon
     *         Redshift.
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResetClusterParameterGroupResult resetClusterParameterGroup(
            ResetClusterParameterGroupRequest resetClusterParameterGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetClusterParameterGroupRequest> request = null;
        Response<ResetClusterParameterGroupResult> response = null;
        try {
            request = new ResetClusterParameterGroupRequestMarshaller()
                    .marshall(resetClusterParameterGroupRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResetClusterParameterGroupResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the size of the cluster. You can change the cluster's type, or
     * change the number or type of nodes. The default behavior is to use the
     * elastic resize method. With an elastic resize, your cluster is available
     * for read and write operations more quickly than with the classic resize
     * method.
     * </p>
     * <p>
     * Elastic resize operations have the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only resize clusters of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * dc2.large
     * </p>
     * </li>
     * <li>
     * <p>
     * dc2.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ra3.4xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ra3.16xlarge
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The type of nodes that you add must match the node type for the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeClusterRequest
     * @return resizeClusterResult The response from the ResizeCluster service
     *         method, as returned by Amazon Redshift.
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws InsufficientClusterCapacityException
     * @throws UnsupportedOptionException
     * @throws UnsupportedOperationException
     * @throws UnauthorizedOperationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResizeClusterResult resizeCluster(ResizeClusterRequest resizeClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resizeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResizeClusterRequest> request = null;
        Response<ResizeClusterResult> response = null;
        try {
            request = new ResizeClusterRequestMarshaller().marshall(resizeClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResizeClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cluster from a snapshot. By default, Amazon Redshift
     * creates the resulting cluster with the same configuration as the original
     * cluster from which the snapshot was created, except that the new cluster
     * is created with the default cluster security and parameter groups. After
     * Amazon Redshift creates the cluster, you can use the <a>ModifyCluster</a>
     * API to associate a different security group and different parameter group
     * with the restored cluster. If you are using a DS node type, you can also
     * choose to change to another DS node type of the same size during restore.
     * </p>
     * <p>
     * If you restore a cluster into a VPC, you must provide a cluster subnet
     * group where you want the cluster restored.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
     * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param restoreFromClusterSnapshotRequest <p/>
     * @return restoreFromClusterSnapshotResult The response from the
     *         RestoreFromClusterSnapshot service method, as returned by Amazon
     *         Redshift.
     * @throws AccessToSnapshotDeniedException
     * @throws ClusterAlreadyExistsException
     * @throws ClusterSnapshotNotFoundException
     * @throws ClusterQuotaExceededException
     * @throws InsufficientClusterCapacityException
     * @throws InvalidClusterSnapshotStateException
     * @throws InvalidRestoreException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws InvalidSubnetException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws UnauthorizedOperationException
     * @throws HsmClientCertificateNotFoundException
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidElasticIpException
     * @throws ClusterParameterGroupNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws LimitExceededException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidClusterTrackException
     * @throws SnapshotScheduleNotFoundException
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RestoreFromClusterSnapshotResult restoreFromClusterSnapshot(
            RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromClusterSnapshotRequest> request = null;
        Response<RestoreFromClusterSnapshotResult> response = null;
        try {
            request = new RestoreFromClusterSnapshotRequestMarshaller()
                    .marshall(restoreFromClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreFromClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new table from a table in an Amazon Redshift cluster snapshot.
     * You must create the new table within the Amazon Redshift cluster that the
     * snapshot was taken from.
     * </p>
     * <p>
     * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore a
     * table with the same name as an existing table in an Amazon Redshift
     * cluster. That is, you cannot overwrite an existing table in a cluster
     * with a restored table. If you want to replace your original table with a
     * new, restored table, then rename or drop your original table before you
     * call <code>RestoreTableFromClusterSnapshot</code>. When you have renamed
     * your original table, then you can pass the original name of the table as
     * the <code>NewTableName</code> parameter value in the call to
     * <code>RestoreTableFromClusterSnapshot</code>. This way, you can replace
     * the original table with the table created from the snapshot.
     * </p>
     * 
     * @param restoreTableFromClusterSnapshotRequest <p/>
     * @return restoreTableFromClusterSnapshotResult The response from the
     *         RestoreTableFromClusterSnapshot service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterSnapshotNotFoundException
     * @throws InProgressTableRestoreQuotaExceededException
     * @throws InvalidClusterSnapshotStateException
     * @throws InvalidTableRestoreArgumentException
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws UnsupportedOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RestoreTableFromClusterSnapshotResult restoreTableFromClusterSnapshot(
            RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(restoreTableFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableFromClusterSnapshotRequest> request = null;
        Response<RestoreTableFromClusterSnapshotResult> response = null;
        try {
            request = new RestoreTableFromClusterSnapshotRequestMarshaller()
                    .marshall(restoreTableFromClusterSnapshotRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RestoreTableFromClusterSnapshotResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes a paused cluster.
     * </p>
     * 
     * @param resumeClusterRequest
     * @return resumeClusterResult The response from the ResumeCluster service
     *         method, as returned by Amazon Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResumeClusterResult resumeCluster(ResumeClusterRequest resumeClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resumeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeClusterRequest> request = null;
        Response<ResumeClusterResult> response = null;
        try {
            request = new ResumeClusterRequestMarshaller().marshall(resumeClusterRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ResumeClusterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a
     * previously authorized IP range or Amazon EC2 security group. To add an
     * ingress rule, see <a>AuthorizeClusterSecurityGroupIngress</a>. For
     * information about managing security groups, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
     * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
     * Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeClusterSecurityGroupIngressRequest <p/>
     * @return revokeClusterSecurityGroupIngressResult The response from the
     *         RevokeClusterSecurityGroupIngress service method, as returned by
     *         Amazon Redshift.
     * @throws ClusterSecurityGroupNotFoundException
     * @throws AuthorizationNotFoundException
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RevokeClusterSecurityGroupIngressResult revokeClusterSecurityGroupIngress(
            RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeClusterSecurityGroupIngressRequest> request = null;
        Response<RevokeClusterSecurityGroupIngressResult> response = null;
        try {
            request = new RevokeClusterSecurityGroupIngressRequestMarshaller()
                    .marshall(revokeClusterSecurityGroupIngressRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request,
                    new RevokeClusterSecurityGroupIngressResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the ability of the specified AWS customer account to restore the
     * specified snapshot. If the account is currently restoring the snapshot,
     * the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
     * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * 
     * @param revokeSnapshotAccessRequest <p/>
     * @return revokeSnapshotAccessResult The response from the
     *         RevokeSnapshotAccess service method, as returned by Amazon
     *         Redshift.
     * @throws AccessToSnapshotDeniedException
     * @throws AuthorizationNotFoundException
     * @throws ClusterSnapshotNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RevokeSnapshotAccessResult revokeSnapshotAccess(
            RevokeSnapshotAccessRequest revokeSnapshotAccessRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(revokeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSnapshotAccessRequest> request = null;
        Response<RevokeSnapshotAccessResult> response = null;
        try {
            request = new RevokeSnapshotAccessRequestMarshaller()
                    .marshall(revokeSnapshotAccessRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RevokeSnapshotAccessResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     * 
     * @param rotateEncryptionKeyRequest <p/>
     * @return rotateEncryptionKeyResult The response from the
     *         RotateEncryptionKey service method, as returned by Amazon
     *         Redshift.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws DependentServiceRequestThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Redshift indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RotateEncryptionKeyResult rotateEncryptionKey(
            RotateEncryptionKeyRequest rotateEncryptionKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(rotateEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateEncryptionKeyRequest> request = null;
        Response<RotateEncryptionKeyResult> response = null;
        try {
            request = new RotateEncryptionKeyRequestMarshaller()
                    .marshall(rotateEncryptionKeyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new RotateEncryptionKeyResultStaxUnmarshaller(),
                    executionContext);
            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
