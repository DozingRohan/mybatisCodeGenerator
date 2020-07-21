<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage};

import com.hundsun.ppos.ds.api.model.BasePo;

/**
 * created by codeGenerator
 * ${.now}
 * @Version: 1.0
 */
public class ${className}Po extends BasePo{

	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "${table.tableAlias}";
	//column alias
	<#list table.columns as column>
	public static final String ALIAS_${column.constantName} = "${column.columnAlias}";
	</#list>

	<@generateFields/>

	<@generateGetSetProperties/>
}

<#macro generateFields>
<#list table.columns as column>
	/**
	 * ${column.columnAlias}
	 */
	private ${column.javaType} ${column.columnNameLower};
	<#if column.compare>

	/**
	 * ${column.columnName}条件字段 ( >= )
	 */
	private ${column.javaType} ${column.columnGreaterAndName};
	/**
	 * ${column.columnName}条件字段 ( <= )
	 */
	private ${column.javaType} ${column.columnLessAndName};
	/**
	 * ${column.columnName}条件字段 ( > )
	 */
	private ${column.javaType} ${column.columnGreaterThanName};
	/**
	 * ${column.columnName}条件字段 ( < )
	 */
	private ${column.javaType} ${column.columnLessThanName};

	</#if>
</#list>
</#macro>


<#macro generateGetSetProperties>
<#list table.columns as column>
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}

	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}

	<#if column.compare>

	public ${column.javaType} getGreaterAnd${column.columnName}() {
		return this.${column.columnGreaterAndName};
	}

	public void setGreaterAnd${column.columnName}(${column.javaType} value) {
		this.${column.columnGreaterAndName} = value;
	}

	public ${column.javaType} getGreaterThan${column.columnName}() {
		return this.${column.columnGreaterThanName};
	}

	public void setGreaterThan${column.columnName}(${column.javaType} value) {
		this.${column.columnGreaterThanName} = value;
	}

	public ${column.javaType} getLessAnd${column.columnName}() {
		return this.${column.columnLessAndName};
	}

	public void setLessAnd${column.columnName}(${column.javaType} value) {
		this.${column.columnLessAndName} = value;
	}

	public ${column.javaType} getLessThan${column.columnName}() {
		return this.${column.columnLessThanName};
	}

	public void setLessThan${column.columnName}(${column.javaType} value) {
		this.${column.columnLessThanName} = value;
	}

	</#if>
</#list>
</#macro>





