
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:31:56
 * @Version: 1.0
 */
public class AmopSysPosUserPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_POS_USER";
	//column alias
	public static final String ALIAS_POSITION_CODE = "岗位代码";
	public static final String ALIAS_USER_CODE = "用户代码";

	/**
	 * 岗位代码
	 */
	private java.lang.String positionCode;
	/**
	 * 用户代码
	 */
	private java.lang.String userCode;

	public java.lang.String getPositionCode() {
		return this.positionCode;
	}

	public void setPositionCode(java.lang.String value) {
		this.positionCode = value;
	}

	public java.lang.String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(java.lang.String value) {
		this.userCode = value;
	}

}

