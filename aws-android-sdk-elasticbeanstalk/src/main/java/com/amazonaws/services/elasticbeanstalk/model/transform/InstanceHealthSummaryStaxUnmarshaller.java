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

import java.util.Map;
import java.util.Map.Entry;

import org.xmlpull.v1.XmlPullParser;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StAX unmarshaller for model InstanceHealthSummary
 */
class InstanceHealthSummaryStaxUnmarshaller implements
        Unmarshaller<InstanceHealthSummary, StaxUnmarshallerContext> {

    public InstanceHealthSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceHealthSummary instanceHealthSummary = new InstanceHealthSummary();

        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            int xmlEvent = context.nextEvent();
            if (xmlEvent == XmlPullParser.END_DOCUMENT)
                break;

            if (xmlEvent == XmlPullParser.START_TAG) {
                if (context.testExpression("NoData", targetDepth)) {
                    instanceHealthSummary.setNoData(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Unknown", targetDepth)) {
                    instanceHealthSummary.setUnknown(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Pending", targetDepth)) {
                    instanceHealthSummary.setPending(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Ok", targetDepth)) {
                    instanceHealthSummary.setOk(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Info", targetDepth)) {
                    instanceHealthSummary.setInfo(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
                if (context.testExpression("Warning", targetDepth)) {
                    instanceHealthSummary.setWarning(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Degraded", targetDepth)) {
                    instanceHealthSummary.setDegraded(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
                if (context.testExpression("Severe", targetDepth)) {
                    instanceHealthSummary.setSevere(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent == XmlPullParser.END_TAG) {
                if (context.getCurrentDepth() < originalDepth) {
                    break;
                }
            }
        }
        return instanceHealthSummary;
    }

    private static InstanceHealthSummaryStaxUnmarshaller instance;

    public static InstanceHealthSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceHealthSummaryStaxUnmarshaller();
        return instance;
    }
}
