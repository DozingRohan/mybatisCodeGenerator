package com.dozingrohan.service;

import com.alibaba.fastjson.JSON;
import com.dozingrohan.dto.Column;
import com.dozingrohan.dto.GenParam;
import com.dozingrohan.dto.Table;
import com.dozingrohan.support.EnvironmentSupport;
import com.dozingrohan.util.FreemarkerUtil;
import com.dozingrohan.util.ZipUtil;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleDriver;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
@Component
public class GeneratorService implements EnvironmentAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorService.class);

    /**
     * 根据配置文件中的数据源信息，schema信息，查询所有的表名称。考虑做成多个数据源选择，后觉得没必要用处不大
     * @return
     */
    public List<String> getAllTableName(){
        Connection conn = null;
        ResultSet tables = null;
        try {
            List<String> tableNameList = new ArrayList<>();
            conn = this.getConnection();
            DatabaseMetaData metaData = conn.getMetaData();
            tables = metaData.getTables(null, schema, "%", type);
            while (tables.next()){
                tableNameList.add(tables.getString("TABLE_NAME"));
            }
            return tableNameList;
        }catch (Exception e){
            LOGGER.error("",e);
            throw new RuntimeException("获取表信息失败");
        }finally {
            try {
                if(null != conn){
                    conn.close();
                }
                if(null != tables){
                    tables.close();
                }
            } catch (SQLException e) {
                LOGGER.error("",e);
                //ignore
            }
        }
    }

    /**
     * 解析表的详细信息，并生成zip文件字节数组
     * @param input
     * @return
     */
    public File generatorFileContent(GenParam input) {
        List<Table> tableDTOS = this.getTableDetailInfoList(input);
        List<File> files = FreemarkerUtil.fillTablesIn(tableDTOS);
        return ZipUtil.getZipBytes(files);
    }

    /**
     * 根据选择OK的表名称列表，从数据库中取得这些表结构的详细信息，并构造TableList的java对象
     * @param input
     * @return
     */
    private List<Table> getTableDetailInfoList(GenParam input){
        Connection conn = null;
        ResultSet rsTable = null;
        ResultSet rsPrimaryKey = null;
        try {
            List<Table> tableList = new ArrayList<>();
            Set<String> pkSet = null;
            conn = this.getConnection();
            DatabaseMetaData metaData = conn.getMetaData();
            for(String tableName : input.getTableNames()){
                Table table = new Table();
                pkSet = new HashSet<>();
                rsTable = metaData.getColumns(null, schema, tableName, null);
                rsPrimaryKey = metaData.getPrimaryKeys(null, schema, tableName);
                while(rsPrimaryKey.next()){
                    pkSet.add(rsPrimaryKey.getString(4).toUpperCase());
                }
                table.setTableAlias(tableName);
                table.setClassName(getClassNameFromTableName(tableName,true));
                table.setBasepackage(input.getBasepackage());
                table.setSqlName(tableName);
                while (rsTable.next()){
                    Column cdto = new Column();
                    cdto.setColumnName(getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),true));
                    cdto.setColumnNameLower(getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),false));
                    cdto.setSqlName(rsTable.getString("COLUMN_NAME"));
                    cdto.setSqlType(rsTable.getString("TYPE_NAME"));
                    cdto.setJavaType(EnvironmentSupport.getJavaMappingType(rsTable.getString("TYPE_NAME").toUpperCase()));
                    LOGGER.info("=====[{}]",rsTable.getString("TYPE_NAME").toUpperCase());
                    LOGGER.info("=====[{}]",EnvironmentSupport.getJavaMappingType(rsTable.getString("TYPE_NAME").toUpperCase()));
                    if(EnvironmentSupport.isSupportedComparableType(Class.forName(EnvironmentSupport.getJavaMappingType(rsTable.getString("TYPE_NAME").toUpperCase())))){
                        cdto.setCompare(true);
                        cdto.setColumnGreaterAndName("greaterAnd" + getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),true));
                        cdto.setColumnLessAndName("lessAnd" + getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),true));

                        cdto.setColumnGreaterThanName("greaterThan" + getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),true));
                        cdto.setColumnLessThanName("lessThan" + getClassNameFromTableName(rsTable.getString("COLUMN_NAME"),true));
                    }
                    if(pkSet.contains(rsTable.getString("COLUMN_NAME"))){
                        table.getPrimaryColumns().add(cdto);
                        cdto.setPk(true);
                    }
                    cdto.setConstantName(rsTable.getString("COLUMN_NAME"));
                    if(StringUtils.isNotBlank(rsTable.getString("REMARKS"))){
                        cdto.setColumnAlias(rsTable.getString("REMARKS").toLowerCase());
                    }else{
                        cdto.setColumnAlias(rsTable.getString("COLUMN_NAME"));
                    }
                    table.getColumns().add(cdto);
                }
                tableList.add(table);
            }
            return tableList;
        }catch (Exception e){
            LOGGER.error("",e);
            throw new RuntimeException("小老弟，出错啦");
        }finally {
            try {
                if (null != conn) {
                    conn.close();
                }
                if (null != rsTable) {
                    rsTable.close();
                }
                if (null != rsPrimaryKey){
                    rsPrimaryKey.close();
                }
            }catch (Exception e){
                LOGGER.error("",e);
                //ignore
            }
        }
    }


    private Connection getConnection() {
        try {
            DriverManager.registerDriver(this.getDriver());
            Connection conn = DriverManager.getConnection(dbUrl,dbUser,dbUserpass);
            if(dbType.contains(ORACLE_DRIVER)){
                OracleConnection oracleConnection = ((OracleConnection)conn);
                oracleConnection.setRemarksReporting(true);
                return oracleConnection;
            }
            return conn;
        }catch (SQLException e){
            LOGGER.error("",e);
            throw new RuntimeException(e.getMessage());
        }
    }

    private Driver getDriver() throws SQLException {
        if(dbType.contains(MYSQL_DRIVER)){
            return new com.mysql.cj.jdbc.Driver();
        }else if(dbType.contains(ORACLE_DRIVER)){
            return new OracleDriver();
        }else{
            throw new IllegalArgumentException("数据源类型错误");
        }
    }



    @Override
    public void setEnvironment(Environment environment) {
        this.dbType = environment.getProperty("app.db.driverClassName");
        this.dbUrl = environment.getProperty("app.db.url");
        this.dbUser = environment.getProperty("app.db.username");
        this.dbUserpass = environment.getProperty("app.db.password");
        this.schema = environment.getProperty("app.db.schema");
        if(StringUtils.isBlank(dbType) ||
                StringUtils.isBlank(dbUrl) ||
                StringUtils.isBlank(dbUser) ||
                StringUtils.isBlank(dbUserpass) ||
                StringUtils.isBlank(schema)){
            LOGGER.error("启动参数加载错误： \n dbType---[{}]\n dbUrl---[{}]\n dbUser---[{}]\n dbUserpass---[{}]\n dbSchema[{}]",dbType,dbUrl,dbUser,dbUserpass,schema);
            throw new IllegalArgumentException("参数错误，启动失败");
        }
    }


    public static String getClassNameFromTableName(String underline,boolean flag) {
        if(StringUtils.isBlank(underline)){
            throw new RuntimeException("小老弟，类名不可以是空的");
        }
        Pattern pattern = Pattern.compile("[_]\\w");
        String camel = underline.trim().toLowerCase();

        Matcher matcher = pattern.matcher(camel);
        while(matcher.find()){
            String w = matcher.group().trim();
            camel = camel.replace(w,w.toUpperCase().replace("_", ""));
        }
        if(flag){
            camel = new StringBuilder(camel.substring(0,1).toUpperCase()).append(camel.substring(1)).toString();
        }
        return camel;
    }


    private static final String ORACLE_DRIVER = "oracle";

    private static final String MYSQL_DRIVER = "mysql";

    private static final String[] type =  new String[]{"TABLE"};

    private String dbType;

    private String dbUrl;

    private String dbUser;

    private String dbUserpass;

    private String schema;


}
