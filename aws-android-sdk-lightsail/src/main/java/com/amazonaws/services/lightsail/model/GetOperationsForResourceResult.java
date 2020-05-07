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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetOperationsForResourceResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     */
    private java.util.List<Operation> operations;

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned
     * <code>null</code> by the API. It is now deprecated, and the API returns
     * the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     */
    private String nextPageCount;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetOperationsForResource</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the result of the action, such
     *         as the status of the request, the timestamp of the request, and
     *         the resources affected by the request.
     *         </p>
     */
    public java.util.List<Operation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     *
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     */
    public void setOperations(java.util.Collection<Operation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<Operation>(operations);
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOperationsForResourceResult withOperations(Operation... operations) {
        if (getOperations() == null) {
            this.operations = new java.util.ArrayList<Operation>(operations.length);
        }
        for (Operation value : operations) {
            this.operations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the result of the action, such as the
     * status of the request, the timestamp of the request, and the resources
     * affected by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            An array of objects that describe the result of the action,
     *            such as the status of the request, the timestamp of the
     *            request, and the resources affected by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOperationsForResourceResult withOperations(java.util.Collection<Operation> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned
     * <code>null</code> by the API. It is now deprecated, and the API returns
     * the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Deprecated) Returns the number of pages of results that remain.
     *         </p>
     *         <note>
     *         <p>
     *         In releases prior to June 12, 2017, this parameter returned
     *         <code>null</code> by the API. It is now deprecated, and the API
     *         returns the <code>next page token</code> parameter instead.
     *         </p>
     *         </note>
     */
    public String getNextPageCount() {
        return nextPageCount;
    }

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned
     * <code>null</code> by the API. It is now deprecated, and the API returns
     * the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     *
     * @param nextPageCount <p>
     *            (Deprecated) Returns the number of pages of results that
     *            remain.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to June 12, 2017, this parameter returned
     *            <code>null</code> by the API. It is now deprecated, and the
     *            API returns the <code>next page token</code> parameter
     *            instead.
     *            </p>
     *            </note>
     */
    public void setNextPageCount(String nextPageCount) {
        this.nextPageCount = nextPageCount;
    }

    /**
     * <p>
     * (Deprecated) Returns the number of pages of results that remain.
     * </p>
     * <note>
     * <p>
     * In releases prior to June 12, 2017, this parameter returned
     * <code>null</code> by the API. It is now deprecated, and the API returns
     * the <code>next page token</code> parameter instead.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageCount <p>
     *            (Deprecated) Returns the number of pages of results that
     *            remain.
     *            </p>
     *            <note>
     *            <p>
     *            In releases prior to June 12, 2017, this parameter returned
     *            <code>null</code> by the API. It is now deprecated, and the
     *            API returns the <code>next page token</code> parameter
     *            instead.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOperationsForResourceResult withNextPageCount(String nextPageCount) {
        this.nextPageCount = nextPageCount;
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetOperationsForResource</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetOperationsForResource</code> request and specify the
     *         next page token using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetOperationsForResource</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetOperationsForResource</code> request and specify the
     *            next page token using the <code>pageToken</code> parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another
     * <code>GetOperationsForResource</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetOperationsForResource</code> request and specify the
     *            next page token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOperationsForResourceResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getOperations() != null)
            sb.append("operations: " + getOperations() + ",");
        if (getNextPageCount() != null)
            sb.append("nextPageCount: " + getNextPageCount() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageCount() == null) ? 0 : getNextPageCount().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOperationsForResourceResult == false)
            return false;
        GetOperationsForResourceResult other = (GetOperationsForResourceResult) obj;

        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getNextPageCount() == null ^ this.getNextPageCount() == null)
            return false;
        if (other.getNextPageCount() != null
                && other.getNextPageCount().equals(this.getNextPageCount()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}