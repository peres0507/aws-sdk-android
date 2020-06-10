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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the connection notifications for VPC endpoints and VPC endpoint
 * services.
 * </p>
 */
public class DescribeVpcEndpointConnectionNotificationsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the notification.
     * </p>
     */
    private String connectionNotificationId;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection-notification-arn</code> - The ARN of the SNS topic for
     * the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-id</code> - The ID of the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-state</code> - The state of the
     * notification (<code>Enabled</code> | <code>Disabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-type</code> - The type of notification (
     * <code>Topic</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the endpoint service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another request with the returned
     * <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     *
     * @return <p>
     *         The ID of the notification.
     *         </p>
     */
    public String getConnectionNotificationId() {
        return connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     *
     * @param connectionNotificationId <p>
     *            The ID of the notification.
     *            </p>
     */
    public void setConnectionNotificationId(String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNotificationId <p>
     *            The ID of the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withConnectionNotificationId(
            String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection-notification-arn</code> - The ARN of the SNS topic for
     * the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-id</code> - The ID of the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-state</code> - The state of the
     * notification (<code>Enabled</code> | <code>Disabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-type</code> - The type of notification (
     * <code>Topic</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the endpoint service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>connection-notification-arn</code> - The ARN of the SNS
     *         topic for the notification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection-notification-id</code> - The ID of the
     *         notification.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection-notification-state</code> - The state of the
     *         notification (<code>Enabled</code> | <code>Disabled</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection-notification-type</code> - The type of
     *         notification (<code>Topic</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>service-id</code> - The ID of the endpoint service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection-notification-arn</code> - The ARN of the SNS topic for
     * the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-id</code> - The ID of the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-state</code> - The state of the
     * notification (<code>Enabled</code> | <code>Disabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-type</code> - The type of notification (
     * <code>Topic</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the endpoint service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>connection-notification-arn</code> - The ARN of the SNS
     *            topic for the notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-id</code> - The ID of the
     *            notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-state</code> - The state of the
     *            notification (<code>Enabled</code> | <code>Disabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-type</code> - The type of
     *            notification (<code>Topic</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>service-id</code> - The ID of the endpoint service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection-notification-arn</code> - The ARN of the SNS topic for
     * the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-id</code> - The ID of the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-state</code> - The state of the
     * notification (<code>Enabled</code> | <code>Disabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-type</code> - The type of notification (
     * <code>Topic</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the endpoint service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>connection-notification-arn</code> - The ARN of the SNS
     *            topic for the notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-id</code> - The ID of the
     *            notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-state</code> - The state of the
     *            notification (<code>Enabled</code> | <code>Disabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-type</code> - The type of
     *            notification (<code>Topic</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>service-id</code> - The ID of the endpoint service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection-notification-arn</code> - The ARN of the SNS topic for
     * the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-id</code> - The ID of the notification.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-state</code> - The state of the
     * notification (<code>Enabled</code> | <code>Disabled</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection-notification-type</code> - The type of notification (
     * <code>Topic</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the endpoint service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>connection-notification-arn</code> - The ARN of the SNS
     *            topic for the notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-id</code> - The ID of the
     *            notification.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-state</code> - The state of the
     *            notification (<code>Enabled</code> | <code>Disabled</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>connection-notification-type</code> - The type of
     *            notification (<code>Topic</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>service-id</code> - The ID of the endpoint service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>vpc-endpoint-id</code> - The ID of the VPC endpoint.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another request with the returned
     * <code>NextToken</code> value.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another request with the
     *         returned <code>NextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another request with the returned
     * <code>NextToken</code> value.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another request with the
     *            returned <code>NextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another request with the returned
     * <code>NextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another request with the
     *            returned <code>NextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionNotificationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getConnectionNotificationId() != null)
            sb.append("ConnectionNotificationId: " + getConnectionNotificationId() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationId() == null) ? 0 : getConnectionNotificationId()
                        .hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcEndpointConnectionNotificationsRequest == false)
            return false;
        DescribeVpcEndpointConnectionNotificationsRequest other = (DescribeVpcEndpointConnectionNotificationsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getConnectionNotificationId() == null
                ^ this.getConnectionNotificationId() == null)
            return false;
        if (other.getConnectionNotificationId() != null
                && other.getConnectionNotificationId().equals(this.getConnectionNotificationId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
