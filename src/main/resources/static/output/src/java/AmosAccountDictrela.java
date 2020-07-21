
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 15:50:07
 * @Version: 1.0
 */
public class AmosAccountDictrelaPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOS_ACCOUNT_DICTRELA";
	//column alias
	public static final String ALIAS_RELA_ID = "RELA_ID";
	public static final String ALIAS_RELA_TYPE = "RELA_TYPE";
	public static final String ALIAS_RELA_VALUE = "RELA_VALUE";
	public static final String ALIAS_ANO_RELA_VALUE = "ANO_RELA_VALUE";
	public static final String ALIAS_CREATE_TIME = "CREATE_TIME";
	public static final String ALIAS_UPDATE_TIME = "UPDATE_TIME";
	public static final String ALIAS_STATUS = "STATUS";

	/**
	 * RELA_ID
	 */
	private java.lang.String relaId;

	/**
	 * RELA_TYPE
	 */
	private java.lang.String relaType;

	/**
	 * RELA_VALUE
	 */
	private java.lang.String relaValue;

	/**
	 * ANO_RELA_VALUE
	 */
	private java.lang.String anoRelaValue;

	/**
	 * CREATE_TIME
	 */
	private java.util.Date createTime;

	/**
	 * UPDATE_TIME
	 */
	private java.util.Date updateTime;

	/**
	 * STATUS
	 */
	private java.lang.String status;


	public java.lang.String getRelaId() {
		return this.relaId;
	}

	public void setRelaId(java.lang.String value) {
		this.relaId = value;
	}

	public java.lang.String getRelaType() {
		return this.relaType;
	}

	public void setRelaType(java.lang.String value) {
		this.relaType = value;
	}

	public java.lang.String getRelaValue() {
		return this.relaValue;
	}

	public void setRelaValue(java.lang.String value) {
		this.relaValue = value;
	}

	public java.lang.String getAnoRelaValue() {
		return this.anoRelaValue;
	}

	public void setAnoRelaValue(java.lang.String value) {
		this.anoRelaValue = value;
	}

	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}

	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String value) {
		this.status = value;
	}

}

