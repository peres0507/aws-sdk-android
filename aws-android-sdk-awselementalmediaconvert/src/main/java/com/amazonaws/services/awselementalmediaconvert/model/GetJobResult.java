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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

public class GetJobResult implements Serializable {
    /**
     * Each job converts an input file into an output file or files. For more
     * information, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    private Job job;

    /**
     * Each job converts an input file into an output file or files. For more
     * information, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     *
     * @return Each job converts an input file into an output file or files. For
     *         more information, see the User Guide at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    public Job getJob() {
        return job;
    }

    /**
     * Each job converts an input file into an output file or files. For more
     * information, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     *
     * @param job Each job converts an input file into an output file or files.
     *            For more information, see the User Guide at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * Each job converts an input file into an output file or files. For more
     * information, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param job Each job converts an input file into an output file or files.
     *            For more information, see the User Guide at
     *            http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobResult withJob(Job job) {
        this.job = job;
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
        if (getJob() != null)
            sb.append("Job: " + getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobResult == false)
            return false;
        GetJobResult other = (GetJobResult) obj;

        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }
}
