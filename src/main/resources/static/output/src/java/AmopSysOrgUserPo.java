
package com.hundsun.ppos.ds.mybatis.po;
import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-14 9:56:15
 * @Version: 1.0
 */
public class AmopSysOrgUserPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_ORG_USER";
	//column alias
	public static final String ALIAS_USER_CODE = "用户代码";
	public static final String ALIAS_ORG_CODE = "组织机构编码";
	public static final String ALIAS_ORG_FLAG = "主从组织标志：0为主组织、1为从组织";

	/**
	 * 用户代码
	 */
	private java.lang.String userCode;
	/**
	 * 组织机构编码
	 */
	private java.lang.String orgCode;
	/**
	 * 主从组织标志：0为主组织、1为从组织
	 */
	private java.lang.String orgFlag;

	public java.lang.String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(java.lang.String value) {
		this.userCode = value;
	}

	public java.lang.String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(java.lang.String value) {
		this.orgCode = value;
	}

	public java.lang.String getOrgFlag() {
		return this.orgFlag;
	}

	public void setOrgFlag(java.lang.String value) {
		this.orgFlag = value;
	}

}

