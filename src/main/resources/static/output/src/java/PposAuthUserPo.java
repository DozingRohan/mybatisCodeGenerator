package com.hundsun.ppos.ds.mybatis.po;

import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-16 13:36:04
 * @Version: 1.0
 */
public class PposAuthUserPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "PPOS_AUTH_USER";
	//column alias
	public static final String ALIAS_USER_CODE = "USER_CODE";
	public static final String ALIAS_USER_NAME = "USER_NAME";
	public static final String ALIAS_MOBILE = "MOBILE";
	public static final String ALIAS_PHONE = "PHONE";
	public static final String ALIAS_EMAIL = "EMAIL";
	public static final String ALIAS_ADDRESS = "ADDRESS";
	public static final String ALIAS_USER_STATUS = "USER_STATUS";
	public static final String ALIAS_USER_TYPE = "USER_TYPE";
	public static final String ALIAS_LAST_LOGIN_TIME = "LAST_LOGIN_TIME";
	public static final String ALIAS_CANCEL_DATE = "CANCEL_DATE";
	public static final String ALIAS_GMT_CREATED = "GMT_CREATED";
	public static final String ALIAS_GMT_MODIFIED = "GMT_MODIFIED";
	public static final String ALIAS_CREATOR = "CREATOR";
	public static final String ALIAS_OPERATOR = "OPERATOR";
	public static final String ALIAS_STATUS = "STATUS";
	public static final String ALIAS_LOCK_STATUS = "LOCK_STATUS";
	public static final String ALIAS_USER_PWD = "USER_PWD";
	public static final String ALIAS_MANAGER_CODE = "MANAGER_CODE";
	public static final String ALIAS_LOCK_DATE = "LOCK_DATE";
	public static final String ALIAS_LOCK_OPERATOR = "LOCK_OPERATOR";
	public static final String ALIAS_CANCEL_OPERATOR = "CANCEL_OPERATOR";
	public static final String ALIAS_CREATE_INST = "CREATE_INST";
	public static final String ALIAS_C_IDENTITYTYPE = "C_IDENTITYTYPE";
	public static final String ALIAS_C_IDENTITYNO = "C_IDENTITYNO";
	public static final String ALIAS_REMARK = "REMARK";

	/**
	 * USER_CODE
	 */
	private java.lang.String userCode;
	/**
	 * USER_NAME
	 */
	private java.lang.String userName;
	/**
	 * MOBILE
	 */
	private java.lang.String mobile;
	/**
	 * PHONE
	 */
	private java.lang.String phone;
	/**
	 * EMAIL
	 */
	private java.lang.String email;
	/**
	 * ADDRESS
	 */
	private java.lang.String address;
	/**
	 * USER_STATUS
	 */
	private java.lang.String userStatus;
	/**
	 * USER_TYPE
	 */
	private java.lang.String userType;
	/**
	 * LAST_LOGIN_TIME
	 */
	private java.util.Date lastLoginTime;

	/**
	 * LastLoginTime条件字段 ( >= )
	 */
	private java.util.Date greaterAndLastLoginTime;
	/**
	 * LastLoginTime条件字段 ( <= )
	 */
	private java.util.Date lessAndLastLoginTime;
	/**
	 * LastLoginTime条件字段 ( > )
	 */
	private java.util.Date greaterThanLastLoginTime;
	/**
	 * LastLoginTime条件字段 ( < )
	 */
	private java.util.Date lessThanLastLoginTime;

	/**
	 * CANCEL_DATE
	 */
	private java.util.Date cancelDate;

	/**
	 * CancelDate条件字段 ( >= )
	 */
	private java.util.Date greaterAndCancelDate;
	/**
	 * CancelDate条件字段 ( <= )
	 */
	private java.util.Date lessAndCancelDate;
	/**
	 * CancelDate条件字段 ( > )
	 */
	private java.util.Date greaterThanCancelDate;
	/**
	 * CancelDate条件字段 ( < )
	 */
	private java.util.Date lessThanCancelDate;

	/**
	 * GMT_CREATED
	 */
	private java.util.Date gmtCreated;

	/**
	 * GmtCreated条件字段 ( >= )
	 */
	private java.util.Date greaterAndGmtCreated;
	/**
	 * GmtCreated条件字段 ( <= )
	 */
	private java.util.Date lessAndGmtCreated;
	/**
	 * GmtCreated条件字段 ( > )
	 */
	private java.util.Date greaterThanGmtCreated;
	/**
	 * GmtCreated条件字段 ( < )
	 */
	private java.util.Date lessThanGmtCreated;

	/**
	 * GMT_MODIFIED
	 */
	private java.util.Date gmtModified;

	/**
	 * GmtModified条件字段 ( >= )
	 */
	private java.util.Date greaterAndGmtModified;
	/**
	 * GmtModified条件字段 ( <= )
	 */
	private java.util.Date lessAndGmtModified;
	/**
	 * GmtModified条件字段 ( > )
	 */
	private java.util.Date greaterThanGmtModified;
	/**
	 * GmtModified条件字段 ( < )
	 */
	private java.util.Date lessThanGmtModified;

	/**
	 * CREATOR
	 */
	private java.lang.String creator;
	/**
	 * OPERATOR
	 */
	private java.lang.String operator;
	/**
	 * STATUS
	 */
	private java.math.BigDecimal status;

	/**
	 * Status条件字段 ( >= )
	 */
	private java.math.BigDecimal greaterAndStatus;
	/**
	 * Status条件字段 ( <= )
	 */
	private java.math.BigDecimal lessAndStatus;
	/**
	 * Status条件字段 ( > )
	 */
	private java.math.BigDecimal greaterThanStatus;
	/**
	 * Status条件字段 ( < )
	 */
	private java.math.BigDecimal lessThanStatus;

	/**
	 * LOCK_STATUS
	 */
	private java.lang.String lockStatus;
	/**
	 * USER_PWD
	 */
	private java.lang.String userPwd;
	/**
	 * MANAGER_CODE
	 */
	private java.lang.String managerCode;
	/**
	 * LOCK_DATE
	 */
	private java.util.Date lockDate;

	/**
	 * LockDate条件字段 ( >= )
	 */
	private java.util.Date greaterAndLockDate;
	/**
	 * LockDate条件字段 ( <= )
	 */
	private java.util.Date lessAndLockDate;
	/**
	 * LockDate条件字段 ( > )
	 */
	private java.util.Date greaterThanLockDate;
	/**
	 * LockDate条件字段 ( < )
	 */
	private java.util.Date lessThanLockDate;

	/**
	 * LOCK_OPERATOR
	 */
	private java.lang.String lockOperator;
	/**
	 * CANCEL_OPERATOR
	 */
	private java.lang.String cancelOperator;
	/**
	 * CREATE_INST
	 */
	private java.lang.String createInst;
	/**
	 * C_IDENTITYTYPE
	 */
	private java.lang.String cIdentitytype;
	/**
	 * C_IDENTITYNO
	 */
	private java.lang.String cIdentityno;
	/**
	 * REMARK
	 */
	private java.lang.String remark;

	public java.lang.String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(java.lang.String value) {
		this.userCode = value;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}

	public void setUserName(java.lang.String value) {
		this.userName = value;
	}

	public java.lang.String getMobile() {
		return this.mobile;
	}

	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String value) {
		this.phone = value;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String value) {
		this.email = value;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String value) {
		this.address = value;
	}

	public java.lang.String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(java.lang.String value) {
		this.userStatus = value;
	}

	public java.lang.String getUserType() {
		return this.userType;
	}

	public void setUserType(java.lang.String value) {
		this.userType = value;
	}

	public java.util.Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(java.util.Date value) {
		this.lastLoginTime = value;
	}


	public java.util.Date getGreaterAndLastLoginTime() {
		return this.greaterAndLastLoginTime;
	}

	public void setGreaterAndLastLoginTime(java.util.Date value) {
		this.greaterAndLastLoginTime = value;
	}

	public java.util.Date getGreaterThanLastLoginTime() {
		return this.greaterThanLastLoginTime;
	}

	public void setGreaterThanLastLoginTime(java.util.Date value) {
		this.greaterThanLastLoginTime = value;
	}

	public java.util.Date getLessAndLastLoginTime() {
		return this.lessAndLastLoginTime;
	}

	public void setLessAndLastLoginTime(java.util.Date value) {
		this.lessAndLastLoginTime = value;
	}

	public java.util.Date getLessThanLastLoginTime() {
		return this.lessThanLastLoginTime;
	}

	public void setLessThanLastLoginTime(java.util.Date value) {
		this.lessThanLastLoginTime = value;
	}

	public java.util.Date getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(java.util.Date value) {
		this.cancelDate = value;
	}


	public java.util.Date getGreaterAndCancelDate() {
		return this.greaterAndCancelDate;
	}

	public void setGreaterAndCancelDate(java.util.Date value) {
		this.greaterAndCancelDate = value;
	}

	public java.util.Date getGreaterThanCancelDate() {
		return this.greaterThanCancelDate;
	}

	public void setGreaterThanCancelDate(java.util.Date value) {
		this.greaterThanCancelDate = value;
	}

	public java.util.Date getLessAndCancelDate() {
		return this.lessAndCancelDate;
	}

	public void setLessAndCancelDate(java.util.Date value) {
		this.lessAndCancelDate = value;
	}

	public java.util.Date getLessThanCancelDate() {
		return this.lessThanCancelDate;
	}

	public void setLessThanCancelDate(java.util.Date value) {
		this.lessThanCancelDate = value;
	}

	public java.util.Date getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(java.util.Date value) {
		this.gmtCreated = value;
	}


	public java.util.Date getGreaterAndGmtCreated() {
		return this.greaterAndGmtCreated;
	}

	public void setGreaterAndGmtCreated(java.util.Date value) {
		this.greaterAndGmtCreated = value;
	}

	public java.util.Date getGreaterThanGmtCreated() {
		return this.greaterThanGmtCreated;
	}

	public void setGreaterThanGmtCreated(java.util.Date value) {
		this.greaterThanGmtCreated = value;
	}

	public java.util.Date getLessAndGmtCreated() {
		return this.lessAndGmtCreated;
	}

	public void setLessAndGmtCreated(java.util.Date value) {
		this.lessAndGmtCreated = value;
	}

	public java.util.Date getLessThanGmtCreated() {
		return this.lessThanGmtCreated;
	}

	public void setLessThanGmtCreated(java.util.Date value) {
		this.lessThanGmtCreated = value;
	}

	public java.util.Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(java.util.Date value) {
		this.gmtModified = value;
	}


	public java.util.Date getGreaterAndGmtModified() {
		return this.greaterAndGmtModified;
	}

	public void setGreaterAndGmtModified(java.util.Date value) {
		this.greaterAndGmtModified = value;
	}

	public java.util.Date getGreaterThanGmtModified() {
		return this.greaterThanGmtModified;
	}

	public void setGreaterThanGmtModified(java.util.Date value) {
		this.greaterThanGmtModified = value;
	}

	public java.util.Date getLessAndGmtModified() {
		return this.lessAndGmtModified;
	}

	public void setLessAndGmtModified(java.util.Date value) {
		this.lessAndGmtModified = value;
	}

	public java.util.Date getLessThanGmtModified() {
		return this.lessThanGmtModified;
	}

	public void setLessThanGmtModified(java.util.Date value) {
		this.lessThanGmtModified = value;
	}

	public java.lang.String getCreator() {
		return this.creator;
	}

	public void setCreator(java.lang.String value) {
		this.creator = value;
	}

	public java.lang.String getOperator() {
		return this.operator;
	}

	public void setOperator(java.lang.String value) {
		this.operator = value;
	}

	public java.math.BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(java.math.BigDecimal value) {
		this.status = value;
	}


	public java.math.BigDecimal getGreaterAndStatus() {
		return this.greaterAndStatus;
	}

	public void setGreaterAndStatus(java.math.BigDecimal value) {
		this.greaterAndStatus = value;
	}

	public java.math.BigDecimal getGreaterThanStatus() {
		return this.greaterThanStatus;
	}

	public void setGreaterThanStatus(java.math.BigDecimal value) {
		this.greaterThanStatus = value;
	}

	public java.math.BigDecimal getLessAndStatus() {
		return this.lessAndStatus;
	}

	public void setLessAndStatus(java.math.BigDecimal value) {
		this.lessAndStatus = value;
	}

	public java.math.BigDecimal getLessThanStatus() {
		return this.lessThanStatus;
	}

	public void setLessThanStatus(java.math.BigDecimal value) {
		this.lessThanStatus = value;
	}

	public java.lang.String getLockStatus() {
		return this.lockStatus;
	}

	public void setLockStatus(java.lang.String value) {
		this.lockStatus = value;
	}

	public java.lang.String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(java.lang.String value) {
		this.userPwd = value;
	}

	public java.lang.String getManagerCode() {
		return this.managerCode;
	}

	public void setManagerCode(java.lang.String value) {
		this.managerCode = value;
	}

	public java.util.Date getLockDate() {
		return this.lockDate;
	}

	public void setLockDate(java.util.Date value) {
		this.lockDate = value;
	}


	public java.util.Date getGreaterAndLockDate() {
		return this.greaterAndLockDate;
	}

	public void setGreaterAndLockDate(java.util.Date value) {
		this.greaterAndLockDate = value;
	}

	public java.util.Date getGreaterThanLockDate() {
		return this.greaterThanLockDate;
	}

	public void setGreaterThanLockDate(java.util.Date value) {
		this.greaterThanLockDate = value;
	}

	public java.util.Date getLessAndLockDate() {
		return this.lessAndLockDate;
	}

	public void setLessAndLockDate(java.util.Date value) {
		this.lessAndLockDate = value;
	}

	public java.util.Date getLessThanLockDate() {
		return this.lessThanLockDate;
	}

	public void setLessThanLockDate(java.util.Date value) {
		this.lessThanLockDate = value;
	}

	public java.lang.String getLockOperator() {
		return this.lockOperator;
	}

	public void setLockOperator(java.lang.String value) {
		this.lockOperator = value;
	}

	public java.lang.String getCancelOperator() {
		return this.cancelOperator;
	}

	public void setCancelOperator(java.lang.String value) {
		this.cancelOperator = value;
	}

	public java.lang.String getCreateInst() {
		return this.createInst;
	}

	public void setCreateInst(java.lang.String value) {
		this.createInst = value;
	}

	public java.lang.String getCIdentitytype() {
		return this.cIdentitytype;
	}

	public void setCIdentitytype(java.lang.String value) {
		this.cIdentitytype = value;
	}

	public java.lang.String getCIdentityno() {
		return this.cIdentityno;
	}

	public void setCIdentityno(java.lang.String value) {
		this.cIdentityno = value;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}

}

