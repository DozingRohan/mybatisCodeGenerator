package com.dozingrohan.dto;

import java.io.Serializable;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
public class Column implements Serializable,Comparable<Column> {

    private static final long serialVersionUID = -5471119210283793674L;

    private String constantName;

    private String columnAlias;

    private Boolean pk = false;

    private Boolean compare = false;

    private String javaType;

    private String columnName;

    private String columnNameLower;

    private String sqlName;

    private String sqlType;

    private String columnGreaterAndName;

    private String columnLessAndName;

    private String columnGreaterThanName;

    private String columnLessThanName;

    public String getColumnGreaterAndName() {
        return columnGreaterAndName;
    }

    public void setColumnGreaterAndName(String columnGreaterAndName) {
        this.columnGreaterAndName = columnGreaterAndName;
    }

    public String getColumnLessAndName() {
        return columnLessAndName;
    }

    public void setColumnLessAndName(String columnLessAndName) {
        this.columnLessAndName = columnLessAndName;
    }

    public String getColumnGreaterThanName() {
        return columnGreaterThanName;
    }

    public void setColumnGreaterThanName(String columnGreaterThanName) {
        this.columnGreaterThanName = columnGreaterThanName;
    }

    public String getColumnLessThanName() {
        return columnLessThanName;
    }

    public void setColumnLessThanName(String columnLessThanName) {
        this.columnLessThanName = columnLessThanName;
    }

    public Boolean isCompare() {
        return compare;
    }

    public void setCompare(Boolean compare) {
        this.compare = compare;
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
    }

    public String getColumnAlias() {
        return columnAlias;
    }

    public void setColumnAlias(String columnAlias) {
        this.columnAlias = columnAlias;
    }

    public boolean isPk() {
        return pk;
    }

    public void setPk(boolean pk) {
        this.pk = pk;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnNameLower() {
        return columnNameLower;
    }

    public void setColumnNameLower(String columnNameLower) {
        this.columnNameLower = columnNameLower;
    }

    @Override
    public int compareTo(Column o) {
        return - this.pk.compareTo(o.pk);
    }
}
