package com.hundsun.ppos.ds.mybatis.po;

import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-16 13:36:04
 * @Version: 1.0
 */
public class SysTransLogPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SYS_TRANS_LOG";
	//column alias
	public static final String ALIAS_REQUEST_ID = "REQUEST_ID";
	public static final String ALIAS_SERVICE_ID = "SERVICE_ID";
	public static final String ALIAS_SERVICE_NAME = "SERVICE_NAME";
	public static final String ALIAS_SERVICE_TYPE = "SERVICE_TYPE";
	public static final String ALIAS_SERVICE_DESC = "SERVICE_DESC";
	public static final String ALIAS_OPER_CODE = "OPER_CODE";
	public static final String ALIAS_RESPONSE_CODE = "RESPONSE_CODE";
	public static final String ALIAS_RESPONSE_RESULT = "RESPONSE_RESULT";
	public static final String ALIAS_REQUEST_PARAM = "REQUEST_PARAM";
	public static final String ALIAS_REQUEST_TIME = "REQUEST_TIME";
	public static final String ALIAS_RESPONSE_TIME = "RESPONSE_TIME";
	public static final String ALIAS_USER_NAME = "USER_NAME";
	public static final String ALIAS_REQUEST_IP = "REQUEST_IP";

	/**
	 * REQUEST_ID
	 */
	private java.lang.String requestId;
	/**
	 * SERVICE_ID
	 */
	private java.lang.String serviceId;
	/**
	 * SERVICE_NAME
	 */
	private java.lang.String serviceName;
	/**
	 * SERVICE_TYPE
	 */
	private java.lang.String serviceType;
	/**
	 * SERVICE_DESC
	 */
	private java.lang.String serviceDesc;
	/**
	 * OPER_CODE
	 */
	private java.lang.String operCode;
	/**
	 * RESPONSE_CODE
	 */
	private java.lang.String responseCode;
	/**
	 * RESPONSE_RESULT
	 */
	private java.lang.String responseResult;
	/**
	 * REQUEST_PARAM
	 */
	private java.lang.String requestParam;
	/**
	 * REQUEST_TIME
	 */
	private java.util.Date requestTime;

	/**
	 * RequestTime条件字段 ( >= )
	 */
	private java.util.Date greaterAndRequestTime;
	/**
	 * RequestTime条件字段 ( <= )
	 */
	private java.util.Date lessAndRequestTime;
	/**
	 * RequestTime条件字段 ( > )
	 */
	private java.util.Date greaterThanRequestTime;
	/**
	 * RequestTime条件字段 ( < )
	 */
	private java.util.Date lessThanRequestTime;

	/**
	 * RESPONSE_TIME
	 */
	private java.util.Date responseTime;

	/**
	 * ResponseTime条件字段 ( >= )
	 */
	private java.util.Date greaterAndResponseTime;
	/**
	 * ResponseTime条件字段 ( <= )
	 */
	private java.util.Date lessAndResponseTime;
	/**
	 * ResponseTime条件字段 ( > )
	 */
	private java.util.Date greaterThanResponseTime;
	/**
	 * ResponseTime条件字段 ( < )
	 */
	private java.util.Date lessThanResponseTime;

	/**
	 * USER_NAME
	 */
	private java.lang.String userName;
	/**
	 * REQUEST_IP
	 */
	private java.lang.String requestIp;

	public java.lang.String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(java.lang.String value) {
		this.requestId = value;
	}

	public java.lang.String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(java.lang.String value) {
		this.serviceId = value;
	}

	public java.lang.String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(java.lang.String value) {
		this.serviceName = value;
	}

	public java.lang.String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(java.lang.String value) {
		this.serviceType = value;
	}

	public java.lang.String getServiceDesc() {
		return this.serviceDesc;
	}

	public void setServiceDesc(java.lang.String value) {
		this.serviceDesc = value;
	}

	public java.lang.String getOperCode() {
		return this.operCode;
	}

	public void setOperCode(java.lang.String value) {
		this.operCode = value;
	}

	public java.lang.String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(java.lang.String value) {
		this.responseCode = value;
	}

	public java.lang.String getResponseResult() {
		return this.responseResult;
	}

	public void setResponseResult(java.lang.String value) {
		this.responseResult = value;
	}

	public java.lang.String getRequestParam() {
		return this.requestParam;
	}

	public void setRequestParam(java.lang.String value) {
		this.requestParam = value;
	}

	public java.util.Date getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(java.util.Date value) {
		this.requestTime = value;
	}


	public java.util.Date getGreaterAndRequestTime() {
		return this.greaterAndRequestTime;
	}

	public void setGreaterAndRequestTime(java.util.Date value) {
		this.greaterAndRequestTime = value;
	}

	public java.util.Date getGreaterThanRequestTime() {
		return this.greaterThanRequestTime;
	}

	public void setGreaterThanRequestTime(java.util.Date value) {
		this.greaterThanRequestTime = value;
	}

	public java.util.Date getLessAndRequestTime() {
		return this.lessAndRequestTime;
	}

	public void setLessAndRequestTime(java.util.Date value) {
		this.lessAndRequestTime = value;
	}

	public java.util.Date getLessThanRequestTime() {
		return this.lessThanRequestTime;
	}

	public void setLessThanRequestTime(java.util.Date value) {
		this.lessThanRequestTime = value;
	}

	public java.util.Date getResponseTime() {
		return this.responseTime;
	}

	public void setResponseTime(java.util.Date value) {
		this.responseTime = value;
	}


	public java.util.Date getGreaterAndResponseTime() {
		return this.greaterAndResponseTime;
	}

	public void setGreaterAndResponseTime(java.util.Date value) {
		this.greaterAndResponseTime = value;
	}

	public java.util.Date getGreaterThanResponseTime() {
		return this.greaterThanResponseTime;
	}

	public void setGreaterThanResponseTime(java.util.Date value) {
		this.greaterThanResponseTime = value;
	}

	public java.util.Date getLessAndResponseTime() {
		return this.lessAndResponseTime;
	}

	public void setLessAndResponseTime(java.util.Date value) {
		this.lessAndResponseTime = value;
	}

	public java.util.Date getLessThanResponseTime() {
		return this.lessThanResponseTime;
	}

	public void setLessThanResponseTime(java.util.Date value) {
		this.lessThanResponseTime = value;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}

	public void setUserName(java.lang.String value) {
		this.userName = value;
	}

	public java.lang.String getRequestIp() {
		return this.requestIp;
	}

	public void setRequestIp(java.lang.String value) {
		this.requestIp = value;
	}

}

