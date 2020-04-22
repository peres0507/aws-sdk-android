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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about Amazon Redshift security groups. If the name of a
 * security group is specified, the response will contain only information about
 * only that security group.
 * </p>
 * <p>
 * For information about managing security groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"
 * >Amazon Redshift Cluster Security Groups</a> in the <i>Amazon Redshift
 * Cluster Management Guide</i>.
 * </p>
 * <p>
 * If you specify both tag keys and tag values in the same request, Amazon
 * Redshift returns all security groups that match any combination of the
 * specified keys and values. For example, if you have <code>owner</code> and
 * <code>environment</code> for tag keys, and <code>admin</code> and
 * <code>test</code> for tag values, all security groups that have any
 * combination of those values are returned.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, security groups are
 * returned regardless of whether they have tag keys or values associated with
 * them.
 * </p>
 */
public class DescribeClusterSecurityGroupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both.
     * </p>
     * <p>
     * Example: <code>securitygroup1</code>
     * </p>
     */
    private String clusterSecurityGroupName;

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterSecurityGroupName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * security groups that are associated with the specified key or keys. For
     * example, suppose that you have security groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a response
     * with the security groups that have either or both of these tag keys
     * associated with them.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * security groups that are associated with the specified tag value or
     * values. For example, suppose that you have security groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the security groups that have either or both of
     * these tag values associated with them.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both.
     * </p>
     * <p>
     * Example: <code>securitygroup1</code>
     * </p>
     *
     * @return <p>
     *         The name of a cluster security group for which you are requesting
     *         details. You can specify either the <b>Marker</b> parameter or a
     *         <b>ClusterSecurityGroupName</b> parameter, but not both.
     *         </p>
     *         <p>
     *         Example: <code>securitygroup1</code>
     *         </p>
     */
    public String getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both.
     * </p>
     * <p>
     * Example: <code>securitygroup1</code>
     * </p>
     *
     * @param clusterSecurityGroupName <p>
     *            The name of a cluster security group for which you are
     *            requesting details. You can specify either the <b>Marker</b>
     *            parameter or a <b>ClusterSecurityGroupName</b> parameter, but
     *            not both.
     *            </p>
     *            <p>
     *            Example: <code>securitygroup1</code>
     *            </p>
     */
    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of a cluster security group for which you are requesting
     * details. You can specify either the <b>Marker</b> parameter or a
     * <b>ClusterSecurityGroupName</b> parameter, but not both.
     * </p>
     * <p>
     * Example: <code>securitygroup1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterSecurityGroupName <p>
     *            The name of a cluster security group for which you are
     *            requesting details. You can specify either the <b>Marker</b>
     *            parameter or a <b>ClusterSecurityGroupName</b> parameter, but
     *            not both.
     *            </p>
     *            <p>
     *            Example: <code>securitygroup1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withClusterSecurityGroupName(
            String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         marker value.
     *         </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned marker value.
     *            </p>
     *            <p>
     *            Default: <code>100</code>
     *            </p>
     *            <p>
     *            Constraints: minimum 20, maximum 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterSecurityGroupName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point to return
     *         a set of response records. When the results of a
     *         <a>DescribeClusterSecurityGroups</a> request exceed the value
     *         specified in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the
     *         next set of response records by providing the returned marker
     *         value in the <code>Marker</code> parameter and retrying the
     *         request.
     *         </p>
     *         <p>
     *         Constraints: You can specify either the
     *         <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterSecurityGroupName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterSecurityGroups</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *            parameter, but not both.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set
     * of response records. When the results of a
     * <a>DescribeClusterSecurityGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next set
     * of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterSecurityGroupName</b>
     * parameter or the <b>Marker</b> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point to
     *            return a set of response records. When the results of a
     *            <a>DescribeClusterSecurityGroups</a> request exceed the value
     *            specified in <code>MaxRecords</code>, AWS returns a value in
     *            the <code>Marker</code> field of the response. You can
     *            retrieve the next set of response records by providing the
     *            returned marker value in the <code>Marker</code> parameter and
     *            retrying the request.
     *            </p>
     *            <p>
     *            Constraints: You can specify either the
     *            <b>ClusterSecurityGroupName</b> parameter or the <b>Marker</b>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * security groups that are associated with the specified key or keys. For
     * example, suppose that you have security groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a response
     * with the security groups that have either or both of these tag keys
     * associated with them.
     * </p>
     *
     * @return <p>
     *         A tag key or keys for which you want to return all matching
     *         cluster security groups that are associated with the specified
     *         key or keys. For example, suppose that you have security groups
     *         that are tagged with keys called <code>owner</code> and
     *         <code>environment</code>. If you specify both of these tag keys
     *         in the request, Amazon Redshift returns a response with the
     *         security groups that have either or both of these tag keys
     *         associated with them.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * security groups that are associated with the specified key or keys. For
     * example, suppose that you have security groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a response
     * with the security groups that have either or both of these tag keys
     * associated with them.
     * </p>
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster security groups that are associated with the specified
     *            key or keys. For example, suppose that you have security
     *            groups that are tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the security groups that have either or both of these tag keys
     *            associated with them.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * security groups that are associated with the specified key or keys. For
     * example, suppose that you have security groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a response
     * with the security groups that have either or both of these tag keys
     * associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster security groups that are associated with the specified
     *            key or keys. For example, suppose that you have security
     *            groups that are tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the security groups that have either or both of these tag keys
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching cluster
     * security groups that are associated with the specified key or keys. For
     * example, suppose that you have security groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a response
     * with the security groups that have either or both of these tag keys
     * associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            cluster security groups that are associated with the specified
     *            key or keys. For example, suppose that you have security
     *            groups that are tagged with keys called <code>owner</code> and
     *            <code>environment</code>. If you specify both of these tag
     *            keys in the request, Amazon Redshift returns a response with
     *            the security groups that have either or both of these tag keys
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * security groups that are associated with the specified tag value or
     * values. For example, suppose that you have security groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the security groups that have either or both of
     * these tag values associated with them.
     * </p>
     *
     * @return <p>
     *         A tag value or values for which you want to return all matching
     *         cluster security groups that are associated with the specified
     *         tag value or values. For example, suppose that you have security
     *         groups that are tagged with values called <code>admin</code> and
     *         <code>test</code>. If you specify both of these tag values in the
     *         request, Amazon Redshift returns a response with the security
     *         groups that have either or both of these tag values associated
     *         with them.
     *         </p>
     */
    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * security groups that are associated with the specified tag value or
     * values. For example, suppose that you have security groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the security groups that have either or both of
     * these tag values associated with them.
     * </p>
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster security groups that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have security groups that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the security groups that have either or both of
     *            these tag values associated with them.
     *            </p>
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * security groups that are associated with the specified tag value or
     * values. For example, suppose that you have security groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the security groups that have either or both of
     * these tag values associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster security groups that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have security groups that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the security groups that have either or both of
     *            these tag values associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) {
            this.tagValues = new java.util.ArrayList<String>(tagValues.length);
        }
        for (String value : tagValues) {
            this.tagValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching cluster
     * security groups that are associated with the specified tag value or
     * values. For example, suppose that you have security groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the security groups that have either or both of
     * these tag values associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching cluster security groups that are associated with the
     *            specified tag value or values. For example, suppose that you
     *            have security groups that are tagged with values called
     *            <code>admin</code> and <code>test</code>. If you specify both
     *            of these tag values in the request, Amazon Redshift returns a
     *            response with the security groups that have either or both of
     *            these tag values associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeClusterSecurityGroupsRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: " + getClusterSecurityGroupName() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null)
            sb.append("TagValues: " + getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterSecurityGroupsRequest == false)
            return false;
        DescribeClusterSecurityGroupsRequest other = (DescribeClusterSecurityGroupsRequest) obj;

        if (other.getClusterSecurityGroupName() == null
                ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null
                && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }
}
