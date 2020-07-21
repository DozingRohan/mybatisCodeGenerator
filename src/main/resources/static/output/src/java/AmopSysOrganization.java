
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 21:31:56
 * @Version: 1.0
 */
public class AmopSysOrganizationPo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_ORGANIZATION";
	//column alias
	public static final String ALIAS_ORG_ID = "组织机构标识";
	public static final String ALIAS_ORG_NAME = "组织机构名称";
	public static final String ALIAS_ORG_CODE = "组织机构编码";
	public static final String ALIAS_PARENT_ID = "上级组织标识";
	public static final String ALIAS_ADDRESS = "联系地址";
	public static final String ALIAS_GMT_CREATED = "创建时间";
	public static final String ALIAS_GMT_MODIFIED = "修改时间";
	public static final String ALIAS_CREATOR = "创建人";
	public static final String ALIAS_OPERATOR = "修改人";
	public static final String ALIAS_STATUS = "状态（-1删除，0，无效，1有效）";
	public static final String ALIAS_ORG_LEVEL = "组织级别";
	public static final String ALIAS_ORG_ORDER = "组织序号";
	public static final String ALIAS_ORG_TYPE = "组织类型，用于区分机构与分支机构";
	public static final String ALIAS_ORG_PATH = "组织索引";
	public static final String ALIAS_LEAVE_IS = "是否叶子节点,0 叶子节点，1非叶子节点";
	public static final String ALIAS_ORG_CATE = "组织分类(0:机构，1：部门)";
	public static final String ALIAS_DIMENSION = "组织维度（0：行政维度，1：岗位维度）";
	public static final String ALIAS_BELONG_INST = "所属机构";
	public static final String ALIAS_ORG_DESCRIBE = "组织描述";

	/**
	 * 组织机构标识
	 */
	private java.lang.String orgId;
	/**
	 * 组织机构名称
	 */
	private java.lang.String orgName;
	/**
	 * 组织机构编码
	 */
	private java.lang.String orgCode;
	/**
	 * 上级组织标识
	 */
	private java.lang.String parentId;
	/**
	 * 联系地址
	 */
	private java.lang.String address;
	/**
	 * 创建时间
	 */
	private java.util.Date gmtCreated;

	private java.util.Date greaterThangmtCreated;

	private java.util.Date lessThangmtCreated;

	/**
	 * 修改时间
	 */
	private java.util.Date gmtModified;

	private java.util.Date greaterThangmtModified;

	private java.util.Date lessThangmtModified;

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

	private java.math.BigDecimal greaterThanstatus;

	private java.math.BigDecimal lessThanstatus;

	/**
	 * 组织级别
	 */
	private java.lang.String orgLevel;
	/**
	 * 组织序号
	 */
	private java.math.BigDecimal orgOrder;

	private java.math.BigDecimal greaterThanorgOrder;

	private java.math.BigDecimal lessThanorgOrder;

	/**
	 * 组织类型，用于区分机构与分支机构
	 */
	private java.lang.String orgType;
	/**
	 * 组织索引
	 */
	private java.lang.String orgPath;
	/**
	 * 是否叶子节点,0 叶子节点，1非叶子节点
	 */
	private java.math.BigDecimal leaveIs;

	private java.math.BigDecimal greaterThanleaveIs;

	private java.math.BigDecimal lessThanleaveIs;

	/**
	 * 组织分类(0:机构，1：部门)
	 */
	private java.lang.String orgCate;
	/**
	 * 组织维度（0：行政维度，1：岗位维度）
	 */
	private java.lang.String dimension;
	/**
	 * 所属机构
	 */
	private java.lang.String belongInst;
	/**
	 * 组织描述
	 */
	private java.lang.String orgDescribe;

	public java.lang.String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(java.lang.String value) {
		this.orgId = value;
	}

	public java.lang.String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(java.lang.String value) {
		this.orgName = value;
	}

	public java.lang.String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(java.lang.String value) {
		this.orgCode = value;
	}

	public java.lang.String getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.String value) {
		this.parentId = value;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String value) {
		this.address = value;
	}

	public java.util.Date getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(java.util.Date value) {
		this.gmtCreated = value;
	}


	public java.util.Date getGreaterThanGmtCreated() {
		return this.gmtCreated;
	}

	public java.util.Date getLessThanGmtCreated() {
		return this.gmtCreated;
	}

	public void setGreaterThanGmtCreated(java.util.Date value) {
		this.gmtCreated = value;
	}

	public void setLessThanGmtCreated(java.util.Date value) {
		this.gmtCreated = value;
	}

	public java.util.Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(java.util.Date value) {
		this.gmtModified = value;
	}


	public java.util.Date getGreaterThanGmtModified() {
		return this.gmtModified;
	}

	public java.util.Date getLessThanGmtModified() {
		return this.gmtModified;
	}

	public void setGreaterThanGmtModified(java.util.Date value) {
		this.gmtModified = value;
	}

	public void setLessThanGmtModified(java.util.Date value) {
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


	public java.math.BigDecimal getGreaterThanStatus() {
		return this.status;
	}

	public java.math.BigDecimal getLessThanStatus() {
		return this.status;
	}

	public void setGreaterThanStatus(java.math.BigDecimal value) {
		this.status = value;
	}

	public void setLessThanStatus(java.math.BigDecimal value) {
		this.status = value;
	}

	public java.lang.String getOrgLevel() {
		return this.orgLevel;
	}

	public void setOrgLevel(java.lang.String value) {
		this.orgLevel = value;
	}

	public java.math.BigDecimal getOrgOrder() {
		return this.orgOrder;
	}

	public void setOrgOrder(java.math.BigDecimal value) {
		this.orgOrder = value;
	}


	public java.math.BigDecimal getGreaterThanOrgOrder() {
		return this.orgOrder;
	}

	public java.math.BigDecimal getLessThanOrgOrder() {
		return this.orgOrder;
	}

	public void setGreaterThanOrgOrder(java.math.BigDecimal value) {
		this.orgOrder = value;
	}

	public void setLessThanOrgOrder(java.math.BigDecimal value) {
		this.orgOrder = value;
	}

	public java.lang.String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(java.lang.String value) {
		this.orgType = value;
	}

	public java.lang.String getOrgPath() {
		return this.orgPath;
	}

	public void setOrgPath(java.lang.String value) {
		this.orgPath = value;
	}

	public java.math.BigDecimal getLeaveIs() {
		return this.leaveIs;
	}

	public void setLeaveIs(java.math.BigDecimal value) {
		this.leaveIs = value;
	}


	public java.math.BigDecimal getGreaterThanLeaveIs() {
		return this.leaveIs;
	}

	public java.math.BigDecimal getLessThanLeaveIs() {
		return this.leaveIs;
	}

	public void setGreaterThanLeaveIs(java.math.BigDecimal value) {
		this.leaveIs = value;
	}

	public void setLessThanLeaveIs(java.math.BigDecimal value) {
		this.leaveIs = value;
	}

	public java.lang.String getOrgCate() {
		return this.orgCate;
	}

	public void setOrgCate(java.lang.String value) {
		this.orgCate = value;
	}

	public java.lang.String getDimension() {
		return this.dimension;
	}

	public void setDimension(java.lang.String value) {
		this.dimension = value;
	}

	public java.lang.String getBelongInst() {
		return this.belongInst;
	}

	public void setBelongInst(java.lang.String value) {
		this.belongInst = value;
	}

	public java.lang.String getOrgDescribe() {
		return this.orgDescribe;
	}

	public void setOrgDescribe(java.lang.String value) {
		this.orgDescribe = value;
	}

}

