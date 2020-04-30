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

import java.util.HashMap;
import java.util.Map;

/**
 * Use (ProresParControl) to specify how the service determines the pixel aspect
 * ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the pixel aspect
 * ratio from the input. To specify a different pixel aspect ratio: Using the
 * console, choose it from the dropdown menu. Using the API, set
 * ProresParControl to (SPECIFIED) and provide for (ParNumerator) and
 * (ParDenominator).
 */
public enum ProresParControl {

    INITIALIZE_FROM_SOURCE("INITIALIZE_FROM_SOURCE"),
    SPECIFIED("SPECIFIED");

    private String value;

    private ProresParControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProresParControl> enumMap;
    static {
        enumMap = new HashMap<String, ProresParControl>();
        enumMap.put("INITIALIZE_FROM_SOURCE", INITIALIZE_FROM_SOURCE);
        enumMap.put("SPECIFIED", SPECIFIED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProresParControl corresponding to the value
     */
    public static ProresParControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
