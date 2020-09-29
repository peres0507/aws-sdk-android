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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Describes details about the activation, such as the date and time the activation was created, its expiration date, the IAM role assigned to the instances in the activation, and the number of instances registered by using this activation.</p>
 */
public class DescribeActivationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>A filter to view information about your activations.</p>
     */
    private java.util.List<DescribeActivationsFilter> filters;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    private String nextToken;

    /**
     * <p>A filter to view information about your activations.</p>
     *
     * @return <p>A filter to view information about your activations.</p>
     */
    public java.util.List<DescribeActivationsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>A filter to view information about your activations.</p>
     *
     * @param filters <p>A filter to view information about your activations.</p>
     */
    public void setFilters(java.util.Collection<DescribeActivationsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DescribeActivationsFilter>(filters);
    }

    /**
     * <p>A filter to view information about your activations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>A filter to view information about your activations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsRequest withFilters(DescribeActivationsFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<DescribeActivationsFilter>(filters.length);
        }
        for (DescribeActivationsFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>A filter to view information about your activations.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>A filter to view information about your activations.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsRequest withFilters(java.util.Collection<DescribeActivationsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeActivationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeActivationsRequest == false) return false;
        DescribeActivationsRequest other = (DescribeActivationsRequest)obj;

        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
