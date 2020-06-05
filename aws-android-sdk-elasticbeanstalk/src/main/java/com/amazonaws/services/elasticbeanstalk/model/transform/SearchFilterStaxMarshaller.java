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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SearchFilter
 */
class SearchFilterStaxMarshaller {

    public void marshall(SearchFilter _searchFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_searchFilter.getAttribute() != null) {
            prefix = _prefix + "Attribute";
            String attribute = _searchFilter.getAttribute();
            request.addParameter(prefix, StringUtils.fromString(attribute));
        }
        if (_searchFilter.getOperator() != null) {
            prefix = _prefix + "Operator";
            String operator = _searchFilter.getOperator();
            request.addParameter(prefix, StringUtils.fromString(operator));
        }
        if (_searchFilter.getValues() != null) {
            prefix = _prefix + "Values";
            java.util.List<String> values = _searchFilter.getValues();
            int valuesIndex = 1;
            String valuesPrefix = prefix;
            for (String valuesItem : values) {
                prefix = valuesPrefix + ".member." + valuesIndex;
                if (valuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valuesItem));
                }
                valuesIndex++;
            }
            prefix = valuesPrefix;
        }
    }

    private static SearchFilterStaxMarshaller instance;

    public static SearchFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SearchFilterStaxMarshaller();
        return instance;
    }
}
