
package com.hundsun.ppos;
import com.hundsun.ppos.ds.BasePo;

/**
 * created by codeGenerator
 * 2020-7-13 15:41:55
 * @Version: 1.0
 */
public class AmopSysRolePo extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "AMOP_SYS_ROLE";
	//column alias
	public static final String ALIAS_ROLE_CODE = "角色编码，主键";
	public static final String ALIAS_ROLE_NAME = "角色名称";
	public static final String ALIAS_ROLE_TYPE = "角色类型";
	public static final String ALIAS_PARENT_ID = "角色父节点标识";
	public static final String ALIAS_ROLE_PATH = "角色索引";
	public static final String ALIAS_ROLE_ORDER = "排序";
	public static final String ALIAS_IS_ROLE_ASSIGNABLE = "角色是否可分配";
	public static final String ALIAS_IS_ROLE_DELETE = "角色是否可删除";
	public static final String ALIAS_ROLE_DESCRIBE = "角色描述";
	public static final String ALIAS_ROLE_CLASSIFY = "角色分类";
	public static final String ALIAS_ROLE_CLASSES = "角色类别";
	public static final String ALIAS_GMT_CREATED = "创建时间";
	public static final String ALIAS_GMT_MODIFIED = "修改时间";
	public static final String ALIAS_CREATOR = "创建人";
	public static final String ALIAS_OPERATOR = "修改人";
	public static final String ALIAS_STATUS = "状态（-1删除，0，无效，1有效）";
	public static final String ALIAS_ROLE_STATUS = "用于表示此用户状态取数据字典[sys_biz_user_status] 0-正常 1-注销 2-禁用";
	public static final String ALIAS_CANCEL_DATE = "停用日期";
	public static final String ALIAS_ENABLE_OPERATOR = "启用经办";
	public static final String ALIAS_DISABLE_OPERATOR = "停用经办";
	public static final String ALIAS_ENABLE_LAST_DATE = "最后一次启用时间";
	public static final String ALIAS_DISABLE_LAST_DATE = "最后一次停用时间";

	/**
	 * 角色编码，主键
	 */
	private java.lang.String roleCode;

	/**
	 * 角色名称
	 */
	private java.lang.String roleName;

	/**
	 * 角色类型
	 */
	private java.math.BigDecimal roleType;

	/**
	 * 角色父节点标识
	 */
	private java.lang.String parentId;

	/**
	 * 角色索引
	 */
	private java.lang.String rolePath;

	/**
	 * 排序
	 */
	private java.math.BigDecimal roleOrder;

	/**
	 * 角色是否可分配
	 */
	private java.lang.String isRoleAssignable;

	/**
	 * 角色是否可删除
	 */
	private java.lang.String isRoleDelete;

	/**
	 * 角色描述
	 */
	private java.lang.String roleDescribe;

	/**
	 * 角色分类
	 */
	private java.lang.String roleClassify;

	/**
	 * 角色类别
	 */
	private java.lang.String roleClasses;

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
	 * 用于表示此用户状态取数据字典[sys_biz_user_status] 0-正常 1-注销 2-禁用
	 */
	private java.lang.String roleStatus;

	/**
	 * 停用日期
	 */
	private java.util.Date cancelDate;

	/**
	 * 启用经办
	 */
	private java.lang.String enableOperator;

	/**
	 * 停用经办
	 */
	private java.lang.String disableOperator;

	/**
	 * 最后一次启用时间
	 */
	private java.util.Date enableLastDate;

	/**
	 * 最后一次停用时间
	 */
	private java.util.Date disableLastDate;


	public java.lang.String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(java.lang.String value) {
		this.roleCode = value;
	}

	public java.lang.String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(java.lang.String value) {
		this.roleName = value;
	}

	public java.math.BigDecimal getRoleType() {
		return this.roleType;
	}

	public void setRoleType(java.math.BigDecimal value) {
		this.roleType = value;
	}

	public java.lang.String getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.String value) {
		this.parentId = value;
	}

	public java.lang.String getRolePath() {
		return this.rolePath;
	}

	public void setRolePath(java.lang.String value) {
		this.rolePath = value;
	}

	public java.math.BigDecimal getRoleOrder() {
		return this.roleOrder;
	}

	public void setRoleOrder(java.math.BigDecimal value) {
		this.roleOrder = value;
	}

	public java.lang.String getIsRoleAssignable() {
		return this.isRoleAssignable;
	}

	public void setIsRoleAssignable(java.lang.String value) {
		this.isRoleAssignable = value;
	}

	public java.lang.String getIsRoleDelete() {
		return this.isRoleDelete;
	}

	public void setIsRoleDelete(java.lang.String value) {
		this.isRoleDelete = value;
	}

	public java.lang.String getRoleDescribe() {
		return this.roleDescribe;
	}

	public void setRoleDescribe(java.lang.String value) {
		this.roleDescribe = value;
	}

	public java.lang.String getRoleClassify() {
		return this.roleClassify;
	}

	public void setRoleClassify(java.lang.String value) {
		this.roleClassify = value;
	}

	public java.lang.String getRoleClasses() {
		return this.roleClasses;
	}

	public void setRoleClasses(java.lang.String value) {
		this.roleClasses = value;
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

	public java.lang.String getRoleStatus() {
		return this.roleStatus;
	}

	public void setRoleStatus(java.lang.String value) {
		this.roleStatus = value;
	}

	public java.util.Date getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(java.util.Date value) {
		this.cancelDate = value;
	}

	public java.lang.String getEnableOperator() {
		return this.enableOperator;
	}

	public void setEnableOperator(java.lang.String value) {
		this.enableOperator = value;
	}

	public java.lang.String getDisableOperator() {
		return this.disableOperator;
	}

	public void setDisableOperator(java.lang.String value) {
		this.disableOperator = value;
	}

	public java.util.Date getEnableLastDate() {
		return this.enableLastDate;
	}

	public void setEnableLastDate(java.util.Date value) {
		this.enableLastDate = value;
	}

	public java.util.Date getDisableLastDate() {
		return this.disableLastDate;
	}

	public void setDisableLastDate(java.util.Date value) {
		this.disableLastDate = value;
	}

}

