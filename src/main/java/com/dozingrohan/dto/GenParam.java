package com.hundsun.dozingrohan.dto;

import java.io.Serializable;

/**
 * DozingRohan
 * 2020/7/8
 * @Version: 1.0
 */
public class GenParam implements Serializable {

    private static final long serialVersionUID = 6959526255921127060L;

    private String basepackage;

    private String[] tableNames;

    public String getBasepackage() {
        return basepackage;
    }

    public void setBasepackage(String basepackage) {
        this.basepackage = basepackage;
    }

    public String[] getTableNames() {
        return tableNames;
    }

    public void setTableNames(String[] tableNames) {
        this.tableNames = tableNames;
    }
}
