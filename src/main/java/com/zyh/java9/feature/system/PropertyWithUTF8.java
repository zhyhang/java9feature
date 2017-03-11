package com.zyh.java9.feature.system;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * properties file read default using utf-8 decoding.
 * Created by zhyhang on 2017/3/11.
 */
public class PropertyWithUTF8 {
    public static void main(String... args) throws Exception {
        Properties pps = new Properties();
//        pps.load(PropertyWithUTF8.class.getResourceAsStream("/utf8data.properties"));
        pps.load(Files.newBufferedReader(Paths.get(PropertyWithUTF8.class.getResource("/utf8data.properties").toURI())));
        System.out.format("UTF8的资源文件，country=%s,usa=%s,en=%s\n", pps.get("country"), pps.get("usa"), pps.get("en"));
    }
}
