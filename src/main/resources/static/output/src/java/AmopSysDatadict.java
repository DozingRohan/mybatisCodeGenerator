
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:31:56
 * @Version: 1.0
 */
public class AmopSysDatadictPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_DATADICT";
	//column alias
	public static final String ALIAS_L_DICT_ID = "字典类别编号";
	public static final String ALIAS_VC_DICT_NAME = "字典类别名称";
	public static final String ALIAS_L_ITEM_ID = "条目序号";
	public static final String ALIAS_VC_ITEM_NAME = "条目名称";
	public static final String ALIAS_VC_ITEM_NO = "条目编码";
	public static final String ALIAS_C_LVL = " y:有权限 n：没有权限 ";
	public static final String ALIAS_L_ORDER = "L_ORDER";

	/**
	 * 字典类别编号
	 */
	private java.math.BigDecimal lDictId;

	private java.math.BigDecimal greaterThanlDictId;

	private java.math.BigDecimal lessThanlDictId;

	/**
	 * 字典类别名称
	 */
	private java.lang.String vcDictName;
	/**
	 * 条目序号
	 */
	private java.math.BigDecimal lItemId;

	private java.math.BigDecimal greaterThanlItemId;

	private java.math.BigDecimal lessThanlItemId;

	/**
	 * 条目名称
	 */
	private java.lang.String vcItemName;
	/**
	 * 条目编码
	 */
	private java.lang.String vcItemNo;
	/**
	 *  y:有权限 n：没有权限 
	 */
	private java.lang.String cLvl;
	/**
	 * L_ORDER
	 */
	private java.math.BigDecimal lOrder;

	private java.math.BigDecimal greaterThanlOrder;

	private java.math.BigDecimal lessThanlOrder;


	public java.math.BigDecimal getLDictId() {
		return this.lDictId;
	}

	public void setLDictId(java.math.BigDecimal value) {
		this.lDictId = value;
	}


	public java.math.BigDecimal getGreaterThanLDictId() {
		return this.lDictId;
	}

	public java.math.BigDecimal getLessThanLDictId() {
		return this.lDictId;
	}

	public void setGreaterThanLDictId(java.math.BigDecimal value) {
		this.lDictId = value;
	}

	public void setLessThanLDictId(java.math.BigDecimal value) {
		this.lDictId = value;
	}

	public java.lang.String getVcDictName() {
		return this.vcDictName;
	}

	public void setVcDictName(java.lang.String value) {
		this.vcDictName = value;
	}

	public java.math.BigDecimal getLItemId() {
		return this.lItemId;
	}

	public void setLItemId(java.math.BigDecimal value) {
		this.lItemId = value;
	}


	public java.math.BigDecimal getGreaterThanLItemId() {
		return this.lItemId;
	}

	public java.math.BigDecimal getLessThanLItemId() {
		return this.lItemId;
	}

	public void setGreaterThanLItemId(java.math.BigDecimal value) {
		this.lItemId = value;
	}

	public void setLessThanLItemId(java.math.BigDecimal value) {
		this.lItemId = value;
	}

	public java.lang.String getVcItemName() {
		return this.vcItemName;
	}

	public void setVcItemName(java.lang.String value) {
		this.vcItemName = value;
	}

	public java.lang.String getVcItemNo() {
		return this.vcItemNo;
	}

	public void setVcItemNo(java.lang.String value) {
		this.vcItemNo = value;
	}

	public java.lang.String getCLvl() {
		return this.cLvl;
	}

	public void setCLvl(java.lang.String value) {
		this.cLvl = value;
	}

	public java.math.BigDecimal getLOrder() {
		return this.lOrder;
	}

	public void setLOrder(java.math.BigDecimal value) {
		this.lOrder = value;
	}


	public java.math.BigDecimal getGreaterThanLOrder() {
		return this.lOrder;
	}

	public java.math.BigDecimal getLessThanLOrder() {
		return this.lOrder;
	}

	public void setGreaterThanLOrder(java.math.BigDecimal value) {
		this.lOrder = value;
	}

	public void setLessThanLOrder(java.math.BigDecimal value) {
		this.lOrder = value;
	}

}

