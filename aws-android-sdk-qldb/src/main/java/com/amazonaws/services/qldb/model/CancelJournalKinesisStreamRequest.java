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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Ends a given Amazon QLDB journal stream. Before a stream can be canceled, its
 * current status must be <code>ACTIVE</code>.
 * </p>
 * <p>
 * You can't restart a stream after you cancel it. Canceled QLDB stream
 * resources are subject to a 7-day retention period, so they are automatically
 * deleted after this limit expires.
 * </p>
 */
public class CancelJournalKinesisStreamRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String ledgerName;

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String streamId;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getLedgerName() {
        return ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJournalKinesisStreamRequest withLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The unique ID that QLDB assigns to each QLDB journal stream.
     *         </p>
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param streamId <p>
     *            The unique ID that QLDB assigns to each QLDB journal stream.
     *            </p>
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param streamId <p>
     *            The unique ID that QLDB assigns to each QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJournalKinesisStreamRequest withStreamId(String streamId) {
        this.streamId = streamId;
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
        if (getLedgerName() != null)
            sb.append("LedgerName: " + getLedgerName() + ",");
        if (getStreamId() != null)
            sb.append("StreamId: " + getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJournalKinesisStreamRequest == false)
            return false;
        CancelJournalKinesisStreamRequest other = (CancelJournalKinesisStreamRequest) obj;

        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null
                && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }
}