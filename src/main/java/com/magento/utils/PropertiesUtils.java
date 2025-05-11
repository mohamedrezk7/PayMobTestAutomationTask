package com.magento.utils;

import java.io.File;
import java.io.FilterInputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.logging.ErrorManager;

public class PropertiesUtils {
    private PropertiesUtils(){
        super();
    }
    public final static String PROPERTIES_FILE_PATH = "src/main/resources/";
//    public static Properties loadProperties(){
//
//        try {
//            Properties properties = new Properties();
//            Collection<File> PropertiesFileList;
//            PropertiesFileList = FileUtils.listFiles(new File(PROPERTIES_FILE_PATH), new String[]{"properties"}, true);
////            PropertiesFileList.forEach(PropertyFile -> {
//                try {
////                    properties.load(new FilterInputStream(PropertyFile));
//                } catch (Exception e) {
//                    ErrorManager LogsUtil;
////                    LogsUtil.error(ioe.getMessage());
//                };
////            });
////        }catch(Exception e){}
////        return null;
////    }

}