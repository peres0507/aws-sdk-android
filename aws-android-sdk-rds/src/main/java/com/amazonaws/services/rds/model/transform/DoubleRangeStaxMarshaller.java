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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DoubleRange
 */
class DoubleRangeStaxMarshaller {

    public void marshall(DoubleRange _doubleRange, Request<?> request, String _prefix) {
        String prefix;
        if (_doubleRange.getFrom() != null) {
            prefix = _prefix + "From";
            Double from = _doubleRange.getFrom();
            request.addParameter(prefix, StringUtils.fromDouble(from));
        }
        if (_doubleRange.getTo() != null) {
            prefix = _prefix + "To";
            Double to = _doubleRange.getTo();
            request.addParameter(prefix, StringUtils.fromDouble(to));
        }
    }

    private static DoubleRangeStaxMarshaller instance;

    public static DoubleRangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DoubleRangeStaxMarshaller();
        return instance;
    }
}
