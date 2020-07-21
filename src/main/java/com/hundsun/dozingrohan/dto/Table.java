package com.hundsun.dozingrohan.dto;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
public class Table implements Serializable {

    private static final long serialVersionUID = 6880482510341513058L;

    private String basepackage;

    private String sqlName;

    private String className;

    private String tableAlias;

    private String compositeId;

    private List<Column> columns;

    private List<Column> primaryColumns;

    private String javaStr;

    private String xmlStr;


    public String getJavaStr() {
        return javaStr;
    }

    public void setJavaStr(String javaStr) {
        this.javaStr = javaStr;
    }

    public String getXmlStr() {
        return xmlStr;
    }

    public void setXmlStr(String xmlStr) {
        this.xmlStr = xmlStr;
    }

    public Table(){
        columns = new ArrayList<>();
        primaryColumns = new ArrayList<>();
    }

    public List<Column> getPrimaryColumns() {
        return primaryColumns;
    }

    public void setPrimaryColumns(List<Column> primaryColumns) {
        this.primaryColumns = primaryColumns;
    }

    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getBasepackage() {
        return basepackage;
    }

    public void setBasepackage(String basepackage) {
        this.basepackage = basepackage;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public String getCompositeId() {
        return compositeId;
    }

    public void setCompositeId(String compositeId) {
        this.compositeId = compositeId;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
