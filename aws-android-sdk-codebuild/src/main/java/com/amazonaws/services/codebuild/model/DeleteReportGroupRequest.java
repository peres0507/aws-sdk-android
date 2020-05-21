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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * <code>DeleteReportGroup</code>: Deletes a report group. Before you delete a
 * report group, you must delete its reports. Use <a href=
 * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
 * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
 * href=
 * "https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html"
 * >DeleteReport</a> to delete the reports. If you call
 * <code>DeleteReportGroup</code> for a report group that contains one or more
 * reports, an exception is thrown.
 * </p>
 */
public class DeleteReportGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the report group to delete.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report group to delete.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report group to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report group to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteReportGroupRequest withArn(String arn) {
        this.arn = arn;
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
        if (getArn() != null)
            sb.append("arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReportGroupRequest == false)
            return false;
        DeleteReportGroupRequest other = (DeleteReportGroupRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
