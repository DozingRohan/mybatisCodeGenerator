
package com.hundsun.ppos.ds.mybatis.po;
import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * 2020-7-14 9:56:15
 * @Version: 1.0
 */
public class AmopSysPositionPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_POSITION";
	//column alias
	public static final String ALIAS_POSITION_CODE = "岗位代码";
	public static final String ALIAS_POSITION_SHORT_NAME = "岗位简称";
	public static final String ALIAS_POSITION_NAME = "岗位名称";
	public static final String ALIAS_PARENT_CODE = "上级岗位编号";
	public static final String ALIAS_POSITION_PATH = "岗位内码";
	public static final String ALIAS_ORG_ID = "所属组织";
	public static final String ALIAS_DEPT_ID = "所属部门";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_EXT_FIELD_ONE = "拓展字段1";
	public static final String ALIAS_EXT_FIELD_TWO = "拓展字段2";
	public static final String ALIAS_EXT_FIELD_THREE = "拓展字段3";
	public static final String ALIAS_GMT_CREATED = "创建日期";
	public static final String ALIAS_GMT_MODIFIED = "修改日期";
	public static final String ALIAS_CREATOR = "创建人";
	public static final String ALIAS_OPERATOR = "修改人";
	public static final String ALIAS_STATUS = "状态";

	/**
	 * 岗位代码
	 */
	private java.lang.String positionCode;
	/**
	 * 岗位简称
	 */
	private java.lang.String positionShortName;
	/**
	 * 岗位名称
	 */
	private java.lang.String positionName;
	/**
	 * 上级岗位编号
	 */
	private java.lang.String parentCode;
	/**
	 * 岗位内码
	 */
	private java.lang.String positionPath;
	/**
	 * 所属组织
	 */
	private java.lang.String orgId;
	/**
	 * 所属部门
	 */
	private java.lang.String deptId;
	/**
	 * 备注
	 */
	private java.lang.String remark;
	/**
	 * 拓展字段1
	 */
	private java.lang.String extFieldOne;
	/**
	 * 拓展字段2
	 */
	private java.lang.String extFieldTwo;
	/**
	 * 拓展字段3
	 */
	private java.lang.String extFieldThree;
	/**
	 * 创建日期
	 */
	private java.util.Date gmtCreated;

	private java.util.Date greaterAndGmtCreated;

	private java.util.Date lessAndGmtCreated;

	private java.util.Date greaterThanGmtCreated;

	private java.util.Date lessThanGmtCreated;

	/**
	 * 修改日期
	 */
	private java.util.Date gmtModified;

	private java.util.Date greaterAndGmtModified;

	private java.util.Date lessAndGmtModified;

	private java.util.Date greaterThanGmtModified;

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
	 * 状态
	 */
	private java.math.BigDecimal status;

	private java.math.BigDecimal greaterAndStatus;

	private java.math.BigDecimal lessAndStatus;

	private java.math.BigDecimal greaterThanStatus;

	private java.math.BigDecimal lessThanStatus;


	public java.lang.String getPositionCode() {
		return this.positionCode;
	}

	public void setPositionCode(java.lang.String value) {
		this.positionCode = value;
	}

	public java.lang.String getPositionShortName() {
		return this.positionShortName;
	}

	public void setPositionShortName(java.lang.String value) {
		this.positionShortName = value;
	}

	public java.lang.String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(java.lang.String value) {
		this.positionName = value;
	}

	public java.lang.String getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(java.lang.String value) {
		this.parentCode = value;
	}

	public java.lang.String getPositionPath() {
		return this.positionPath;
	}

	public void setPositionPath(java.lang.String value) {
		this.positionPath = value;
	}

	public java.lang.String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(java.lang.String value) {
		this.orgId = value;
	}

	public java.lang.String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(java.lang.String value) {
		this.deptId = value;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}

	public java.lang.String getExtFieldOne() {
		return this.extFieldOne;
	}

	public void setExtFieldOne(java.lang.String value) {
		this.extFieldOne = value;
	}

	public java.lang.String getExtFieldTwo() {
		return this.extFieldTwo;
	}

	public void setExtFieldTwo(java.lang.String value) {
		this.extFieldTwo = value;
	}

	public java.lang.String getExtFieldThree() {
		return this.extFieldThree;
	}

	public void setExtFieldThree(java.lang.String value) {
		this.extFieldThree = value;
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

}

