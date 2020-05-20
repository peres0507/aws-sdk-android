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

package com.amazonaws.services.securityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists and describes insights for the specified insight ARNs.
 * </p>
 */
public class GetInsightsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARNs of the insights to describe. If you do not provide any insight
     * ARNs, then <code>GetInsights</code> returns all of your custom insights.
     * It does not return any managed insights.
     * </p>
     */
    private java.util.List<String> insightArns;

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetInsights</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARNs of the insights to describe. If you do not provide any insight
     * ARNs, then <code>GetInsights</code> returns all of your custom insights.
     * It does not return any managed insights.
     * </p>
     *
     * @return <p>
     *         The ARNs of the insights to describe. If you do not provide any
     *         insight ARNs, then <code>GetInsights</code> returns all of your
     *         custom insights. It does not return any managed insights.
     *         </p>
     */
    public java.util.List<String> getInsightArns() {
        return insightArns;
    }

    /**
     * <p>
     * The ARNs of the insights to describe. If you do not provide any insight
     * ARNs, then <code>GetInsights</code> returns all of your custom insights.
     * It does not return any managed insights.
     * </p>
     *
     * @param insightArns <p>
     *            The ARNs of the insights to describe. If you do not provide
     *            any insight ARNs, then <code>GetInsights</code> returns all of
     *            your custom insights. It does not return any managed insights.
     *            </p>
     */
    public void setInsightArns(java.util.Collection<String> insightArns) {
        if (insightArns == null) {
            this.insightArns = null;
            return;
        }

        this.insightArns = new java.util.ArrayList<String>(insightArns);
    }

    /**
     * <p>
     * The ARNs of the insights to describe. If you do not provide any insight
     * ARNs, then <code>GetInsights</code> returns all of your custom insights.
     * It does not return any managed insights.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insightArns <p>
     *            The ARNs of the insights to describe. If you do not provide
     *            any insight ARNs, then <code>GetInsights</code> returns all of
     *            your custom insights. It does not return any managed insights.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsRequest withInsightArns(String... insightArns) {
        if (getInsightArns() == null) {
            this.insightArns = new java.util.ArrayList<String>(insightArns.length);
        }
        for (String value : insightArns) {
            this.insightArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the insights to describe. If you do not provide any insight
     * ARNs, then <code>GetInsights</code> returns all of your custom insights.
     * It does not return any managed insights.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param insightArns <p>
     *            The ARNs of the insights to describe. If you do not provide
     *            any insight ARNs, then <code>GetInsights</code> returns all of
     *            your custom insights. It does not return any managed insights.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsRequest withInsightArns(java.util.Collection<String> insightArns) {
        setInsightArns(insightArns);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetInsights</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @return <p>
     *         The token that is required for pagination. On your first call to
     *         the <code>GetInsights</code> operation, set the value of this
     *         parameter to <code>NULL</code>.
     *         </p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data,
     *         set the value of this parameter to the value returned from the
     *         previous response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetInsights</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>GetInsights</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetInsights</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>GetInsights</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return in the response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInsightsRequest withMaxResults(Integer maxResults) {
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
        if (getInsightArns() != null)
            sb.append("InsightArns: " + getInsightArns() + ",");
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

        hashCode = prime * hashCode
                + ((getInsightArns() == null) ? 0 : getInsightArns().hashCode());
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

        if (obj instanceof GetInsightsRequest == false)
            return false;
        GetInsightsRequest other = (GetInsightsRequest) obj;

        if (other.getInsightArns() == null ^ this.getInsightArns() == null)
            return false;
        if (other.getInsightArns() != null
                && other.getInsightArns().equals(this.getInsightArns()) == false)
            return false;
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
