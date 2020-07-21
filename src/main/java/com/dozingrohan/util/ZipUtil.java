package com.hundsun.dozingrohan.util;

import com.hundsun.dozingrohan.controller.GeneratorController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * DozingRohan
 * 2020/7/7
 * @Version: 1.0
 */
public class ZipUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZipUtil.class);

    public static File getZipBytes(List<File> files){
        if(null == files || files.isEmpty()){
            LOGGER.warn("文件内容为空");
            return null;
        }
        FileChannel fChannel = null;
        ZipOutputStream zipOut = null;
        File zipFile = null;
        try {
            zipFile = new File(GeneratorController.FILE_NAME);
            zipFile.createNewFile();
            zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            ByteBuffer buffer = null;
            for(File file : files){
                fChannel = new FileInputStream(file).getChannel();
                buffer = ByteBuffer.wrap(new byte[new Long(file.length()).intValue()]);
                fChannel.read(buffer);
                zipOut.putNextEntry(new ZipEntry(file.getAbsolutePath().substring(file.getAbsolutePath().indexOf("output"))));
                buffer.flip();
                buffer.clear();
                zipOut.write(buffer.array());
                zipOut.flush();
            }
            return zipFile;
        }catch (IOException e){
            LOGGER.error("文件压缩失败",e);
            throw new RuntimeException("文件压缩失败:" + e.getClass().getName());
        }finally {
            try {
                if(null != fChannel){
                    fChannel.close();
                }
                if(null != zipOut){
                    zipOut.close();
                }
                if(null != files && !files.isEmpty()){
                    for(File ff : files){
                        ff.delete();
                    }
                }
            }catch (IOException e){
                LOGGER.error("",e);
                //ignore
            }
        }
    }

}
