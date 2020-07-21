package com.dozingrohan.support;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
@Component
public class EnvironmentSupport implements InitializingBean , EnvironmentAware{

    private static final Map<String,String> typeMap = new HashMap<>();

    private String dbTypeMappingfile;

    private static final Set<Class> DATABASE_SUPPORTED_TYPES;

    static{
        DATABASE_SUPPORTED_TYPES = new HashSet<>();
        DATABASE_SUPPORTED_TYPES.add(java.math.BigDecimal.class);
        DATABASE_SUPPORTED_TYPES.add(java.util.Date.class);
        DATABASE_SUPPORTED_TYPES.add(java.lang.Integer.class);
        DATABASE_SUPPORTED_TYPES.add(java.lang.Long.class);
        DATABASE_SUPPORTED_TYPES.add(java.lang.Float.class);
        DATABASE_SUPPORTED_TYPES.add(java.lang.Double.class);
    }

    public static boolean isSupportedComparableType(Class<?> clazz){
        return DATABASE_SUPPORTED_TYPES.contains(clazz);
    }

    public static String getJavaMappingType(String key){
        if(key.contains("(")){
            key = key.substring(0,key.indexOf("("));
        }
        return typeMap.get(key);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        InputStream in = EnvironmentSupport.class.getResourceAsStream("/"+dbTypeMappingfile);
        Properties prop = new Properties();
        try {
            prop.load(in);
            Set<String> set = prop.stringPropertyNames();
            for(String key : set){
                typeMap.put(key.toUpperCase(),prop.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("应用启动失败，配置文件缺失");
        }
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.dbTypeMappingfile = environment.getProperty("dbtypemapping");
    }
}
