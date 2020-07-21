
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:19:07
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

	private java.util.Date greaterThanrequestTime;

	private java.util.Date lessThanrequestTime;

	/**
	 * RESPONSE_TIME
	 */
	private java.util.Date responseTime;

	private java.util.Date greaterThanresponseTime;

	private java.util.Date lessThanresponseTime;

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


	public java.util.Date getGreaterThanRequestTime() {
		return this.requestTime;
	}

	public java.util.Date getLessThanRequestTime() {
		return this.requestTime;
	}

	public void setGreaterThanRequestTime(java.util.Date value) {
		this.requestTime = value;
	}

	public void setLessThanRequestTime(java.util.Date value) {
		this.requestTime = value;
	}

	public java.util.Date getResponseTime() {
		return this.responseTime;
	}

	public void setResponseTime(java.util.Date value) {
		this.responseTime = value;
	}


	public java.util.Date getGreaterThanResponseTime() {
		return this.responseTime;
	}

	public java.util.Date getLessThanResponseTime() {
		return this.responseTime;
	}

	public void setGreaterThanResponseTime(java.util.Date value) {
		this.responseTime = value;
	}

	public void setLessThanResponseTime(java.util.Date value) {
		this.responseTime = value;
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

