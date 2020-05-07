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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the data points for the specified Amazon Lightsail instance metric,
 * given an instance name.
 * </p>
 */
public class GetInstanceMetricDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     */
    private String metricName;

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available
     * in 1-minute (60 seconds) granularity. All other instance metric data is
     * available in 5-minute (300 seconds) granularity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     */
    private Integer period;

    /**
     * <p>
     * The start time of the time period.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time of the time period.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     */
    private String unit;

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> statistics;

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance for which you want to get metrics data.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance for which you want to get metrics
     *            data.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance for which you want to get metrics
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     *
     * @return <p>
     *         The metric for which you want to return information.
     *         </p>
     *         <p>
     *         Valid instance metric names are listed below, along with the most
     *         useful <code>statistics</code> to include in your request, and
     *         the published <code>unit</code> value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>CPUUtilization</code> </b> - The percentage of
     *         allocated compute units that are currently in use on the
     *         instance. This metric identifies the processing power to run the
     *         applications on the instance. Tools in your operating system can
     *         show a lower percentage than Lightsail when the instance is not
     *         allocated a full processor core.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistics are
     *         <code>Maximum</code> and <code>Average</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkIn</code> </b> - The number of bytes received on
     *         all network interfaces by the instance. This metric identifies
     *         the volume of incoming network traffic to the instance. The
     *         number reported is the number of bytes received during the
     *         period. Because this metric is reported in 5-minute intervals,
     *         divide the reported number by 300 to find Bytes/second.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is
     *         <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Bytes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkOut</code> </b> - The number of bytes sent out
     *         on all network interfaces by the instance. This metric identifies
     *         the volume of outgoing network traffic from the instance. The
     *         number reported is the number of bytes sent during the period.
     *         Because this metric is reported in 5-minute intervals, divide the
     *         reported number by 300 to find Bytes/second.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is
     *         <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Bytes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed</code> </b> - Reports whether the
     *         instance passed or failed both the instance status check and the
     *         system status check. This metric can be either 0 (passed) or 1
     *         (failed). This metric data is available in 1-minute (60 seconds)
     *         granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is
     *         <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed_Instance</code> </b> - Reports
     *         whether the instance passed or failed the instance status check.
     *         This metric can be either 0 (passed) or 1 (failed). This metric
     *         data is available in 1-minute (60 seconds) granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is
     *         <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed_System</code> </b> - Reports whether
     *         the instance passed or failed the system status check. This
     *         metric can be either 0 (passed) or 1 (failed). This metric data
     *         is available in 1-minute (60 seconds) granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is
     *         <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceMetricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     *
     * @param metricName <p>
     *            The metric for which you want to return information.
     *            </p>
     *            <p>
     *            Valid instance metric names are listed below, along with the
     *            most useful <code>statistics</code> to include in your
     *            request, and the published <code>unit</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>CPUUtilization</code> </b> - The percentage of
     *            allocated compute units that are currently in use on the
     *            instance. This metric identifies the processing power to run
     *            the applications on the instance. Tools in your operating
     *            system can show a lower percentage than Lightsail when the
     *            instance is not allocated a full processor core.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistics are
     *            <code>Maximum</code> and <code>Average</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Percent</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkIn</code> </b> - The number of bytes received
     *            on all network interfaces by the instance. This metric
     *            identifies the volume of incoming network traffic to the
     *            instance. The number reported is the number of bytes received
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkOut</code> </b> - The number of bytes sent
     *            out on all network interfaces by the instance. This metric
     *            identifies the volume of outgoing network traffic from the
     *            instance. The number reported is the number of bytes sent
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed</code> </b> - Reports whether the
     *            instance passed or failed both the instance status check and
     *            the system status check. This metric can be either 0 (passed)
     *            or 1 (failed). This metric data is available in 1-minute (60
     *            seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_Instance</code> </b> - Reports
     *            whether the instance passed or failed the instance status
     *            check. This metric can be either 0 (passed) or 1 (failed).
     *            This metric data is available in 1-minute (60 seconds)
     *            granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_System</code> </b> - Reports
     *            whether the instance passed or failed the system status check.
     *            This metric can be either 0 (passed) or 1 (failed). This
     *            metric data is available in 1-minute (60 seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceMetricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     *
     * @param metricName <p>
     *            The metric for which you want to return information.
     *            </p>
     *            <p>
     *            Valid instance metric names are listed below, along with the
     *            most useful <code>statistics</code> to include in your
     *            request, and the published <code>unit</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>CPUUtilization</code> </b> - The percentage of
     *            allocated compute units that are currently in use on the
     *            instance. This metric identifies the processing power to run
     *            the applications on the instance. Tools in your operating
     *            system can show a lower percentage than Lightsail when the
     *            instance is not allocated a full processor core.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistics are
     *            <code>Maximum</code> and <code>Average</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Percent</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkIn</code> </b> - The number of bytes received
     *            on all network interfaces by the instance. This metric
     *            identifies the volume of incoming network traffic to the
     *            instance. The number reported is the number of bytes received
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkOut</code> </b> - The number of bytes sent
     *            out on all network interfaces by the instance. This metric
     *            identifies the volume of outgoing network traffic from the
     *            instance. The number reported is the number of bytes sent
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed</code> </b> - Reports whether the
     *            instance passed or failed both the instance status check and
     *            the system status check. This metric can be either 0 (passed)
     *            or 1 (failed). This metric data is available in 1-minute (60
     *            seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_Instance</code> </b> - Reports
     *            whether the instance passed or failed the instance status
     *            check. This metric can be either 0 (passed) or 1 (failed).
     *            This metric data is available in 1-minute (60 seconds)
     *            granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_System</code> </b> - Reports
     *            whether the instance passed or failed the system status check.
     *            This metric can be either 0 (passed) or 1 (failed). This
     *            metric data is available in 1-minute (60 seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetricName
     */
    public GetInstanceMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     *
     * @param metricName <p>
     *            The metric for which you want to return information.
     *            </p>
     *            <p>
     *            Valid instance metric names are listed below, along with the
     *            most useful <code>statistics</code> to include in your
     *            request, and the published <code>unit</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>CPUUtilization</code> </b> - The percentage of
     *            allocated compute units that are currently in use on the
     *            instance. This metric identifies the processing power to run
     *            the applications on the instance. Tools in your operating
     *            system can show a lower percentage than Lightsail when the
     *            instance is not allocated a full processor core.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistics are
     *            <code>Maximum</code> and <code>Average</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Percent</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkIn</code> </b> - The number of bytes received
     *            on all network interfaces by the instance. This metric
     *            identifies the volume of incoming network traffic to the
     *            instance. The number reported is the number of bytes received
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkOut</code> </b> - The number of bytes sent
     *            out on all network interfaces by the instance. This metric
     *            identifies the volume of outgoing network traffic from the
     *            instance. The number reported is the number of bytes sent
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed</code> </b> - Reports whether the
     *            instance passed or failed both the instance status check and
     *            the system status check. This metric can be either 0 (passed)
     *            or 1 (failed). This metric data is available in 1-minute (60
     *            seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_Instance</code> </b> - Reports
     *            whether the instance passed or failed the instance status
     *            check. This metric can be either 0 (passed) or 1 (failed).
     *            This metric data is available in 1-minute (60 seconds)
     *            granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_System</code> </b> - Reports
     *            whether the instance passed or failed the system status check.
     *            This metric can be either 0 (passed) or 1 (failed). This
     *            metric data is available in 1-minute (60 seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceMetricName
     */
    public void setMetricName(InstanceMetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful
     * <code>statistics</code> to include in your request, and the published
     * <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> - The percentage of allocated
     * compute units that are currently in use on the instance. This metric
     * identifies the processing power to run the applications on the instance.
     * Tools in your operating system can show a lower percentage than Lightsail
     * when the instance is not allocated a full processor core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are
     * <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> - The number of bytes received on all
     * network interfaces by the instance. This metric identifies the volume of
     * incoming network traffic to the instance. The number reported is the
     * number of bytes received during the period. Because this metric is
     * reported in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> - The number of bytes sent out on all
     * network interfaces by the instance. This metric identifies the volume of
     * outgoing network traffic from the instance. The number reported is the
     * number of bytes sent during the period. Because this metric is reported
     * in 5-minute intervals, divide the reported number by 300 to find
     * Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> - Reports whether the instance
     * passed or failed both the instance status check and the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric
     * data is available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> - Reports whether the
     * instance passed or failed the instance status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> - Reports whether the
     * instance passed or failed the system status check. This metric can be
     * either 0 (passed) or 1 (failed). This metric data is available in
     * 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CPUUtilization, NetworkIn, NetworkOut,
     * StatusCheckFailed, StatusCheckFailed_Instance, StatusCheckFailed_System
     *
     * @param metricName <p>
     *            The metric for which you want to return information.
     *            </p>
     *            <p>
     *            Valid instance metric names are listed below, along with the
     *            most useful <code>statistics</code> to include in your
     *            request, and the published <code>unit</code> value.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>CPUUtilization</code> </b> - The percentage of
     *            allocated compute units that are currently in use on the
     *            instance. This metric identifies the processing power to run
     *            the applications on the instance. Tools in your operating
     *            system can show a lower percentage than Lightsail when the
     *            instance is not allocated a full processor core.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistics are
     *            <code>Maximum</code> and <code>Average</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Percent</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkIn</code> </b> - The number of bytes received
     *            on all network interfaces by the instance. This metric
     *            identifies the volume of incoming network traffic to the
     *            instance. The number reported is the number of bytes received
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>NetworkOut</code> </b> - The number of bytes sent
     *            out on all network interfaces by the instance. This metric
     *            identifies the volume of outgoing network traffic from the
     *            instance. The number reported is the number of bytes sent
     *            during the period. Because this metric is reported in 5-minute
     *            intervals, divide the reported number by 300 to find
     *            Bytes/second.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Bytes</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed</code> </b> - Reports whether the
     *            instance passed or failed both the instance status check and
     *            the system status check. This metric can be either 0 (passed)
     *            or 1 (failed). This metric data is available in 1-minute (60
     *            seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_Instance</code> </b> - Reports
     *            whether the instance passed or failed the instance status
     *            check. This metric can be either 0 (passed) or 1 (failed).
     *            This metric data is available in 1-minute (60 seconds)
     *            granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StatusCheckFailed_System</code> </b> - Reports
     *            whether the instance passed or failed the system status check.
     *            This metric can be either 0 (passed) or 1 (failed). This
     *            metric data is available in 1-minute (60 seconds) granularity.
     *            </p>
     *            <p>
     *            <code>Statistics</code>: The most useful statistic is
     *            <code>Sum</code>.
     *            </p>
     *            <p>
     *            <code>Unit</code>: The published unit is <code>Count</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceMetricName
     */
    public GetInstanceMetricDataRequest withMetricName(InstanceMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available
     * in 1-minute (60 seconds) granularity. All other instance metric data is
     * available in 5-minute (300 seconds) granularity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @return <p>
     *         The granularity, in seconds, of the returned data points.
     *         </p>
     *         <p>
     *         The <code>StatusCheckFailed</code>,
     *         <code>StatusCheckFailed_Instance</code>, and
     *         <code>StatusCheckFailed_System</code> instance metric data is
     *         available in 1-minute (60 seconds) granularity. All other
     *         instance metric data is available in 5-minute (300 seconds)
     *         granularity.
     *         </p>
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available
     * in 1-minute (60 seconds) granularity. All other instance metric data is
     * available in 5-minute (300 seconds) granularity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The granularity, in seconds, of the returned data points.
     *            </p>
     *            <p>
     *            The <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code> instance metric data is
     *            available in 1-minute (60 seconds) granularity. All other
     *            instance metric data is available in 5-minute (300 seconds)
     *            granularity.
     *            </p>
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>,
     * <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available
     * in 1-minute (60 seconds) granularity. All other instance metric data is
     * available in 5-minute (300 seconds) granularity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 86400<br/>
     *
     * @param period <p>
     *            The granularity, in seconds, of the returned data points.
     *            </p>
     *            <p>
     *            The <code>StatusCheckFailed</code>,
     *            <code>StatusCheckFailed_Instance</code>, and
     *            <code>StatusCheckFailed_System</code> instance metric data is
     *            available in 1-minute (60 seconds) granularity. All other
     *            instance metric data is available in 5-minute (300 seconds)
     *            granularity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     *
     * @return <p>
     *         The start time of the time period.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     *
     * @param startTime <p>
     *            The start time of the time period.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time of the time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     *
     * @return <p>
     *         The end time of the time period.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     *
     * @param endTime <p>
     *            The end time of the time period.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time of the time period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @return <p>
     *         The unit for the metric data request. Valid units depend on the
     *         metric data being requested. For the valid units to specify with
     *         each available metric, see the <code>metricName</code> parameter.
     *         </p>
     * @see MetricUnit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit for the metric data request. Valid units depend on
     *            the metric data being requested. For the valid units to
     *            specify with each available metric, see the
     *            <code>metricName</code> parameter.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit for the metric data request. Valid units depend on
     *            the metric data being requested. For the valid units to
     *            specify with each available metric, see the
     *            <code>metricName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public GetInstanceMetricDataRequest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit for the metric data request. Valid units depend on
     *            the metric data being requested. For the valid units to
     *            specify with each available metric, see the
     *            <code>metricName</code> parameter.
     *            </p>
     * @see MetricUnit
     */
    public void setUnit(MetricUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric
     * data being requested. For the valid units to specify with each available
     * metric, see the <code>metricName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Seconds, Microseconds, Milliseconds, Bytes,
     * Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits,
     * Gigabits, Terabits, Percent, Count, Bytes/Second, Kilobytes/Second,
     * Megabytes/Second, Gigabytes/Second, Terabytes/Second, Bits/Second,
     * Kilobits/Second, Megabits/Second, Gigabits/Second, Terabits/Second,
     * Count/Second, None
     *
     * @param unit <p>
     *            The unit for the metric data request. Valid units depend on
     *            the metric data being requested. For the valid units to
     *            specify with each available metric, see the
     *            <code>metricName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MetricUnit
     */
    public GetInstanceMetricDataRequest withUnit(MetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The statistic for the metric.
     *         </p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> - The lowest value observed during the
     *         specified period. Use this value to determine low volumes of
     *         activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> - The highest value observed during the
     *         specified period. Use this value to determine high volumes of
     *         activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> - All values submitted for the matching metric
     *         added together. You can use this statistic to determine the total
     *         volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> - The value of Sum / SampleCount during the
     *         specified period. By comparing this statistic with the Minimum
     *         and Maximum values, you can determine the full scope of a metric
     *         and how close the average use is to the Minimum and Maximum
     *         values. This comparison helps you to know when to increase or
     *         decrease your resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> - The count, or number, of data points
     *         used for the statistical calculation.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     *
     * @param statistics <p>
     *            The statistic for the metric.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The statistic for the metric.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withStatistics(String... statistics) {
        if (getStatistics() == null) {
            this.statistics = new java.util.ArrayList<String>(statistics.length);
        }
        for (String value : statistics) {
            this.statistics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified
     * period. Use this value to determine low volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified
     * period. Use this value to determine high volumes of activity for your
     * application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added
     * together. You can use this statistic to determine the total volume of a
     * metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the
     * specified period. By comparing this statistic with the Minimum and
     * Maximum values, you can determine the full scope of a metric and how
     * close the average use is to the Minimum and Maximum values. This
     * comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for
     * the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The statistic for the metric.
     *            </p>
     *            <p>
     *            The following statistics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Minimum</code> - The lowest value observed during the
     *            specified period. Use this value to determine low volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Maximum</code> - The highest value observed during the
     *            specified period. Use this value to determine high volumes of
     *            activity for your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Sum</code> - All values submitted for the matching
     *            metric added together. You can use this statistic to determine
     *            the total volume of a metric.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Average</code> - The value of Sum / SampleCount during
     *            the specified period. By comparing this statistic with the
     *            Minimum and Maximum values, you can determine the full scope
     *            of a metric and how close the average use is to the Minimum
     *            and Maximum values. This comparison helps you to know when to
     *            increase or decrease your resources.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SampleCount</code> - The count, or number, of data
     *            points used for the statistical calculation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getPeriod() != null)
            sb.append("period: " + getPeriod() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getUnit() != null)
            sb.append("unit: " + getUnit() + ",");
        if (getStatistics() != null)
            sb.append("statistics: " + getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceMetricDataRequest == false)
            return false;
        GetInstanceMetricDataRequest other = (GetInstanceMetricDataRequest) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }
}
