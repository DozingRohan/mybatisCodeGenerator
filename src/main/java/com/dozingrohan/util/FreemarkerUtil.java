package com.dozingrohan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dozingrohan.dto.Table;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/**
 * DozingRohan
 * 2020/7/8
 * @Version: 1.0
 */
@Component
public class FreemarkerUtil implements EnvironmentAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(FreemarkerUtil.class);

    private static final String XML_TEMPLATE = new StringBuilder(FreemarkerUtil.class.getResource("/").getPath()).append("/generatorTemplates/${className}.xml").toString();

    private static final String JAVA_TEMPLATE = new StringBuilder(FreemarkerUtil.class.getResource("/").getPath()).append("/generatorTemplates/${className}Po.java").toString();

    private static String XML_TDIR;

    private static String JAVA_TDIR;


    private static final File xmlFile = new File(XML_TEMPLATE);

    private static final File javaFile = new File(JAVA_TEMPLATE);

    public static List<File> fillTablesIn(List<Table> tables){
        try {
            String xmlContent = getFileContent(xmlFile);
            String javaContent = getFileContent(javaFile);
            List<File> files = new ArrayList<>();
            for(Table table : tables){
                String javaStr = getBuiltContentFromObj(table,javaContent);
                String xmlStr = getBuiltContentFromObj(table,xmlContent);
                files.add(createFile(javaStr,JAVA_TDIR + File.separator + table.getClassName(),"Po.java"));
                files.add(createFile(xmlStr,XML_TDIR + File.separator + table.getClassName(),".xml"));
            }
            return files;
        }catch (Exception e){
            LOGGER.error("小老弟，填充freemarker模板出错啦",e);
            throw new RuntimeException("小老弟，填充freemarker模板出错啦");
        }
    }

    private static File createFile(String content,String fileName,String type){
        FileChannel outPutChannel = null;
        FileOutputStream outputStream = null;
        try {
            String filePath = fileName + type;
            File targetFile = new File(filePath);
            LOGGER.info("准备创建文件，文件路径===>[{}]",filePath);
            targetFile.createNewFile();
            outputStream = new FileOutputStream(targetFile);
            outPutChannel = outputStream.getChannel();
            ByteBuffer contentBuffer = ByteBuffer.wrap(content.getBytes());
            outPutChannel.write(contentBuffer);
            contentBuffer.flip();
            contentBuffer.clear();
            return targetFile;
        } catch (IOException e) {
            LOGGER.error("",e);
            throw new RuntimeException("小老弟出错啦");
        }finally {
            try {
                if(null != outPutChannel){
                    outPutChannel.close();
                }
                if(null != outputStream){
                    outputStream.close();
                }
            } catch (IOException e) {
                LOGGER.error("",e);
                //ignore
            }
        }
    }

    private static String getBuiltContentFromObj(Table table,String temp) throws IOException, TemplateException {
        Template template = new Template(UUID.randomUUID().toString(), new StringReader(temp),
                new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS));
        JSONObject jobjOne = new JSONObject();
        JSONObject tableJson = new JSONObject();
        Collections.sort(table.getColumns());
        JSONArray  columnsJson = JSON.parseArray(JSON.toJSONString(table.getColumns().toArray()));
        JSONArray  columnsJsonPk = JSON.parseArray(JSON.toJSONString(table.getPrimaryColumns().toArray()));
        tableJson.put("sqlName",table.getSqlName());
        tableJson.put("className",table.getClassName());
        tableJson.put("tableAlias",table.getTableAlias());
        tableJson.put("columns",columnsJson);
        tableJson.put("columnspk",columnsJsonPk);
        tableJson.put("searchColumns",columnsJson);
        jobjOne.put("table",tableJson);
        jobjOne.put("basepackage",table.getBasepackage());
        LOGGER.info(jobjOne.toJSONString());
        StringWriter writer = new StringWriter();
        template.process(jobjOne, writer);
        return writer.toString();
    }

    private static String getFileContent(final File file){
        try(FileInputStream inputStream = new FileInputStream(file);
                FileChannel xchannel = inputStream.getChannel()) {
            ByteBuffer xbyteBuffer = ByteBuffer.wrap(new byte[new Long(file.length()).intValue()]);
            xchannel.read(xbyteBuffer);
            xbyteBuffer.flip();
            return new String(xbyteBuffer.array(), StandardCharsets.UTF_8);
        }catch (Exception e){
            LOGGER.error("",e);
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public void setEnvironment(Environment environment) {
        XML_TDIR = environment.getProperty("mapperfiledir");
        JAVA_TDIR = environment.getProperty("javafiledir");
        LOGGER.info("xmlpath ---> [{}]",XML_TDIR);
        LOGGER.info("javapath ---> [{}]",JAVA_TDIR);
        File xmlDir = new File(XML_TDIR);
        File javaDir = new File(JAVA_TDIR);
        if(!xmlDir.exists()){
            xmlDir.mkdir();
        }
        if(!javaDir.exists()){
            javaDir.mkdir();
        }
    }
}
