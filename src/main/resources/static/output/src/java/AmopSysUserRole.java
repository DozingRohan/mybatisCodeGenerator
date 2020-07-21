
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 15:50:07
 * @Version: 1.0
 */
public class AmopSysUserRolePo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_USER_ROLE";
	//column alias
	public static final String ALIAS_ROLE_CODE = "角色编号";
	public static final String ALIAS_USER_CODE = "用户代码";
	public static final String ALIAS_RIGHT_FLAG = "0-操作角色
1-授权角色
";

	/**
	 * 角色编号
	 */
	private java.lang.String roleCode;

	/**
	 * 用户代码
	 */
	private java.lang.String userCode;

	/**
	 * 0-操作角色
1-授权角色

	 */
	private java.lang.String rightFlag;


	public java.lang.String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(java.lang.String value) {
		this.roleCode = value;
	}

	public java.lang.String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(java.lang.String value) {
		this.userCode = value;
	}

	public java.lang.String getRightFlag() {
		return this.rightFlag;
	}

	public void setRightFlag(java.lang.String value) {
		this.rightFlag = value;
	}

}

