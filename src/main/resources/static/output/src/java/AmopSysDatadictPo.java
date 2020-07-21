
package com.hundsun.ppos.ds.mybatis.po;
import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-14 9:56:15
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

	private java.math.BigDecimal greaterAndLDictId;

	private java.math.BigDecimal lessAndLDictId;

	private java.math.BigDecimal greaterThanLDictId;

	private java.math.BigDecimal lessThanLDictId;

	/**
	 * 字典类别名称
	 */
	private java.lang.String vcDictName;
	/**
	 * 条目序号
	 */
	private java.math.BigDecimal lItemId;

	private java.math.BigDecimal greaterAndLItemId;

	private java.math.BigDecimal lessAndLItemId;

	private java.math.BigDecimal greaterThanLItemId;

	private java.math.BigDecimal lessThanLItemId;

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

	private java.math.BigDecimal greaterAndLOrder;

	private java.math.BigDecimal lessAndLOrder;

	private java.math.BigDecimal greaterThanLOrder;

	private java.math.BigDecimal lessThanLOrder;


	public java.math.BigDecimal getLDictId() {
		return this.lDictId;
	}

	public void setLDictId(java.math.BigDecimal value) {
		this.lDictId = value;
	}


	public java.math.BigDecimal getGreaterAndLDictId() {
		return this.greaterAndLDictId;
	}

	public void setGreaterAndLDictId(java.math.BigDecimal value) {
		this.greaterAndLDictId = value;
	}

	public java.math.BigDecimal getGreaterThanLDictId() {
		return this.greaterThanLDictId;
	}

	public void setGreaterThanLDictId(java.math.BigDecimal value) {
		this.greaterThanLDictId = value;
	}

	public java.math.BigDecimal getLessAndLDictId() {
		return this.lessAndLDictId;
	}

	public void setLessAndLDictId(java.math.BigDecimal value) {
		this.lessAndLDictId = value;
	}

	public java.math.BigDecimal getLessThanLDictId() {
		return this.lessThanLDictId;
	}

	public void setLessThanLDictId(java.math.BigDecimal value) {
		this.lessThanLDictId = value;
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


	public java.math.BigDecimal getGreaterAndLItemId() {
		return this.greaterAndLItemId;
	}

	public void setGreaterAndLItemId(java.math.BigDecimal value) {
		this.greaterAndLItemId = value;
	}

	public java.math.BigDecimal getGreaterThanLItemId() {
		return this.greaterThanLItemId;
	}

	public void setGreaterThanLItemId(java.math.BigDecimal value) {
		this.greaterThanLItemId = value;
	}

	public java.math.BigDecimal getLessAndLItemId() {
		return this.lessAndLItemId;
	}

	public void setLessAndLItemId(java.math.BigDecimal value) {
		this.lessAndLItemId = value;
	}

	public java.math.BigDecimal getLessThanLItemId() {
		return this.lessThanLItemId;
	}

	public void setLessThanLItemId(java.math.BigDecimal value) {
		this.lessThanLItemId = value;
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


	public java.math.BigDecimal getGreaterAndLOrder() {
		return this.greaterAndLOrder;
	}

	public void setGreaterAndLOrder(java.math.BigDecimal value) {
		this.greaterAndLOrder = value;
	}

	public java.math.BigDecimal getGreaterThanLOrder() {
		return this.greaterThanLOrder;
	}

	public void setGreaterThanLOrder(java.math.BigDecimal value) {
		this.greaterThanLOrder = value;
	}

	public java.math.BigDecimal getLessAndLOrder() {
		return this.lessAndLOrder;
	}

	public void setLessAndLOrder(java.math.BigDecimal value) {
		this.lessAndLOrder = value;
	}

	public java.math.BigDecimal getLessThanLOrder() {
		return this.lessThanLOrder;
	}

	public void setLessThanLOrder(java.math.BigDecimal value) {
		this.lessThanLOrder = value;
	}

}

