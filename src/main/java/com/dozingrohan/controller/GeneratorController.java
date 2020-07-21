package com.hundsun.dozingrohan.controller;

import com.alibaba.fastjson.JSON;
import com.hundsun.dozingrohan.dto.GenParam;
import com.hundsun.dozingrohan.service.GeneratorService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
@Controller
public class GeneratorController {

    final static Logger LOGGER = LoggerFactory.getLogger(GeneratorController.class);

    @Resource
    private GeneratorService generatorService;

    public static final String FILE_NAME = "mybatisGen.zip";

    @RequestMapping("/getAllTable")
    public String getAllTable(Model model){
        List<String> list = generatorService.getAllTableName();
        model.addAttribute("tableList",list);
        return "index";
    }

    @RequestMapping("/generate")
    public void generatorMybatisZip(HttpServletRequest request, HttpServletResponse response) {
        String packageName = request.getParameter("packageName");
        String tables = request.getParameter("tables");
        if(StringUtils.isBlank(packageName) || StringUtils.isBlank(tables)){
            throw new RuntimeException("包名和表名是必要的参数");
        }
        GenParam input = new GenParam();
        input.setTableNames(tables.split(","));
        input.setBasepackage(packageName);
        File ff = generatorService.generatorFileContent(input);
        FileInputStream fileIn = null;
        ServletOutputStream out = null;
        try {
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(FILE_NAME, "UTF-8"));
            fileIn = new FileInputStream(ff);
            out = response.getOutputStream();
            byte[] outputByte = new byte[1024];
            int readTmp = 0;
            while ((readTmp = fileIn.read(outputByte)) != -1) {
                out.write(outputByte, 0, readTmp); //并不是每次都能读到1024个字节，所有用readTmp作为每次读取数据的长度，否则会出现文件损坏的错误
            }
        }catch (IOException e){
            LOGGER.error("",e);
            throw new RuntimeException("出错啦，小老弟");
        }finally {
            try {
                if (null != fileIn){
                    fileIn.close();
                }
                if(null != out){
                    out.close();
                }
            }catch (IOException e){
                LOGGER.error("",e);
                //ingnore
            }
        }
    }
}
