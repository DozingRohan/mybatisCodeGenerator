package com.hundsun.ppos.ds.mybatis.po;

import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-16 13:36:04
 * @Version: 1.0
 */
public class AmopSysUserPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_USER";
	//column alias
	public static final String ALIAS_USER_CODE = "用户代码,登录账号，主键";
	public static final String ALIAS_USER_NAME = "用户名称";
	public static final String ALIAS_MOBILE = "手机号码";
	public static final String ALIAS_PHONE = "固定电话";
	public static final String ALIAS_EMAIL = "电子邮箱";
	public static final String ALIAS_ADDRESS = "联系地址";
	public static final String ALIAS_USER_STATUS = "用于表示此用户状态取数据字典[sys_biz_user_status] 0-正常 1-注销 2-锁定";
	public static final String ALIAS_USER_TYPE = "取数据字典[sys_biz_user_cate] 0-柜员 1-用户";
	public static final String ALIAS_LAST_LOGIN_TIME = "最后登录时间";
	public static final String ALIAS_CANCEL_DATE = "停用时间";
	public static final String ALIAS_GMT_CREATED = "创建时间";
	public static final String ALIAS_GMT_MODIFIED = "修改时间";
	public static final String ALIAS_CREATOR = "创建人";
	public static final String ALIAS_OPERATOR = "修改人";
	public static final String ALIAS_STATUS = "状态（-1删除，0，无效，1有效）";
	public static final String ALIAS_LOCK_STATUS = "用于表示此用户是否被锁定取数据字典[sys_biz_lock_status] 0-签退 1-登录 2-非正常签退 3-锁定";
	public static final String ALIAS_USER_PWD = "用户密码";
	public static final String ALIAS_CARD_TYPE = "证件类型";
	public static final String ALIAS_CARD_NO = "证件号码";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_LOCK_OPERATOR = "锁定经办";
	public static final String ALIAS_LOGOUT_OPERATOR = "注销经办";
	public static final String ALIAS_LOCK_LAST_DATE = "最后一次锁定时间";
	public static final String ALIAS_LOGOUT_LAST_DATE = "最后一次注销时间";

	/**
	 * 用户代码,登录账号，主键
	 */
	private java.lang.String userCode;
	/**
	 * 用户名称
	 */
	private java.lang.String userName;
	/**
	 * 手机号码
	 */
	private java.lang.String mobile;
	/**
	 * 固定电话
	 */
	private java.lang.String phone;
	/**
	 * 电子邮箱
	 */
	private java.lang.String email;
	/**
	 * 联系地址
	 */
	private java.lang.String address;
	/**
	 * 用于表示此用户状态取数据字典[sys_biz_user_status] 0-正常 1-注销 2-锁定
	 */
	private java.lang.String userStatus;
	/**
	 * 取数据字典[sys_biz_user_cate] 0-柜员 1-用户
	 */
	private java.lang.String userType;
	/**
	 * 最后登录时间
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
	 * 停用时间
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
	 * 创建时间
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
	 * 修改时间
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
	 * 创建人
	 */
	private java.lang.String creator;
	/**
	 * 修改人
	 */
	private java.lang.String operator;
	/**
	 * 状态（-1删除，0，无效，1有效）
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
	 * 用于表示此用户是否被锁定取数据字典[sys_biz_lock_status] 0-签退 1-登录 2-非正常签退 3-锁定
	 */
	private java.lang.String lockStatus;
	/**
	 * 用户密码
	 */
	private java.lang.String userPwd;
	/**
	 * 证件类型
	 */
	private java.lang.String cardType;
	/**
	 * 证件号码
	 */
	private java.lang.String cardNo;
	/**
	 * 备注
	 */
	private java.lang.String remark;
	/**
	 * 锁定经办
	 */
	private java.lang.String lockOperator;
	/**
	 * 注销经办
	 */
	private java.lang.String logoutOperator;
	/**
	 * 最后一次锁定时间
	 */
	private java.util.Date lockLastDate;

	/**
	 * LockLastDate条件字段 ( >= )
	 */
	private java.util.Date greaterAndLockLastDate;
	/**
	 * LockLastDate条件字段 ( <= )
	 */
	private java.util.Date lessAndLockLastDate;
	/**
	 * LockLastDate条件字段 ( > )
	 */
	private java.util.Date greaterThanLockLastDate;
	/**
	 * LockLastDate条件字段 ( < )
	 */
	private java.util.Date lessThanLockLastDate;

	/**
	 * 最后一次注销时间
	 */
	private java.util.Date logoutLastDate;

	/**
	 * LogoutLastDate条件字段 ( >= )
	 */
	private java.util.Date greaterAndLogoutLastDate;
	/**
	 * LogoutLastDate条件字段 ( <= )
	 */
	private java.util.Date lessAndLogoutLastDate;
	/**
	 * LogoutLastDate条件字段 ( > )
	 */
	private java.util.Date greaterThanLogoutLastDate;
	/**
	 * LogoutLastDate条件字段 ( < )
	 */
	private java.util.Date lessThanLogoutLastDate;


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

	public java.lang.String getCardType() {
		return this.cardType;
	}

	public void setCardType(java.lang.String value) {
		this.cardType = value;
	}

	public java.lang.String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(java.lang.String value) {
		this.cardNo = value;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}

	public java.lang.String getLockOperator() {
		return this.lockOperator;
	}

	public void setLockOperator(java.lang.String value) {
		this.lockOperator = value;
	}

	public java.lang.String getLogoutOperator() {
		return this.logoutOperator;
	}

	public void setLogoutOperator(java.lang.String value) {
		this.logoutOperator = value;
	}

	public java.util.Date getLockLastDate() {
		return this.lockLastDate;
	}

	public void setLockLastDate(java.util.Date value) {
		this.lockLastDate = value;
	}


	public java.util.Date getGreaterAndLockLastDate() {
		return this.greaterAndLockLastDate;
	}

	public void setGreaterAndLockLastDate(java.util.Date value) {
		this.greaterAndLockLastDate = value;
	}

	public java.util.Date getGreaterThanLockLastDate() {
		return this.greaterThanLockLastDate;
	}

	public void setGreaterThanLockLastDate(java.util.Date value) {
		this.greaterThanLockLastDate = value;
	}

	public java.util.Date getLessAndLockLastDate() {
		return this.lessAndLockLastDate;
	}

	public void setLessAndLockLastDate(java.util.Date value) {
		this.lessAndLockLastDate = value;
	}

	public java.util.Date getLessThanLockLastDate() {
		return this.lessThanLockLastDate;
	}

	public void setLessThanLockLastDate(java.util.Date value) {
		this.lessThanLockLastDate = value;
	}

	public java.util.Date getLogoutLastDate() {
		return this.logoutLastDate;
	}

	public void setLogoutLastDate(java.util.Date value) {
		this.logoutLastDate = value;
	}


	public java.util.Date getGreaterAndLogoutLastDate() {
		return this.greaterAndLogoutLastDate;
	}

	public void setGreaterAndLogoutLastDate(java.util.Date value) {
		this.greaterAndLogoutLastDate = value;
	}

	public java.util.Date getGreaterThanLogoutLastDate() {
		return this.greaterThanLogoutLastDate;
	}

	public void setGreaterThanLogoutLastDate(java.util.Date value) {
		this.greaterThanLogoutLastDate = value;
	}

	public java.util.Date getLessAndLogoutLastDate() {
		return this.lessAndLogoutLastDate;
	}

	public void setLessAndLogoutLastDate(java.util.Date value) {
		this.lessAndLogoutLastDate = value;
	}

	public java.util.Date getLessThanLogoutLastDate() {
		return this.lessThanLogoutLastDate;
	}

	public void setLessThanLogoutLastDate(java.util.Date value) {
		this.lessThanLogoutLastDate = value;
	}

}

