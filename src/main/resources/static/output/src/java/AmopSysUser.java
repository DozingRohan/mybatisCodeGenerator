
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 15:41:55
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
	 * 停用时间
	 */
	private java.util.Date cancelDate;

	/**
	 * 创建时间
	 */
	private java.util.Date gmtCreated;

	/**
	 * 修改时间
	 */
	private java.util.Date gmtModified;

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
	 * 最后一次注销时间
	 */
	private java.util.Date logoutLastDate;


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

	public java.util.Date getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(java.util.Date value) {
		this.cancelDate = value;
	}

	public java.util.Date getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(java.util.Date value) {
		this.gmtCreated = value;
	}

	public java.util.Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(java.util.Date value) {
		this.gmtModified = value;
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

	public java.util.Date getLogoutLastDate() {
		return this.logoutLastDate;
	}

	public void setLogoutLastDate(java.util.Date value) {
		this.logoutLastDate = value;
	}

}

