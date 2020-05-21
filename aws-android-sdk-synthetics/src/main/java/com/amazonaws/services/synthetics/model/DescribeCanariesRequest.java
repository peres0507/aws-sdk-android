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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation returns a list of the canaries in your account, along with
 * full details about each canary.
 * </p>
 * <p>
 * This operation does not have resource-level authorization, so if a user is
 * able to use <code>DescribeCanaries</code>, the user can see all of the
 * canaries in the account. A deny policy can only be used to restrict access to
 * all canaries. It cannot be used on specific resources.
 * </p>
 */
public class DescribeCanariesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent operation to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specify this parameter to limit how many canaries are returned each time
     * you use the <code>DescribeCanaries</code> operation. If you omit this
     * parameter, the default of 100 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent operation to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @return <p>
     *         A token that indicates that there is more data available. You can
     *         use this token in a subsequent operation to retrieve the next set
     *         of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent operation to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent operation to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use
     * this token in a subsequent operation to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9=/+_.-]{4,252}$<br/>
     *
     * @param nextToken <p>
     *            A token that indicates that there is more data available. You
     *            can use this token in a subsequent operation to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specify this parameter to limit how many canaries are returned each time
     * you use the <code>DescribeCanaries</code> operation. If you omit this
     * parameter, the default of 100 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         Specify this parameter to limit how many canaries are returned
     *         each time you use the <code>DescribeCanaries</code> operation. If
     *         you omit this parameter, the default of 100 is used.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many canaries are returned each time
     * you use the <code>DescribeCanaries</code> operation. If you omit this
     * parameter, the default of 100 is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            Specify this parameter to limit how many canaries are returned
     *            each time you use the <code>DescribeCanaries</code> operation.
     *            If you omit this parameter, the default of 100 is used.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many canaries are returned each time
     * you use the <code>DescribeCanaries</code> operation. If you omit this
     * parameter, the default of 100 is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            Specify this parameter to limit how many canaries are returned
     *            each time you use the <code>DescribeCanaries</code> operation.
     *            If you omit this parameter, the default of 100 is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCanariesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCanariesRequest == false)
            return false;
        DescribeCanariesRequest other = (DescribeCanariesRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
