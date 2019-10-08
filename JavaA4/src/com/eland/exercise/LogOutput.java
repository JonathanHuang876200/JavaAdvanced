package com.eland.exercise;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class LogOutput {

    public static Logger logger = Logger.getLogger(LogOutput.class);

    public static void main(String[] args) throws IOException {
        String inputFileName = "C:\\\\Users\\iminghuang\\IdeaProjects\\NewProjectA4\\" + args[0] + ".properties";
        String outputFileName = args[1] + ".txt";
        Properties props = new Properties();
        /*A4*/
//        InputStream is = null;
        FileOutputStream oFile = null;
        InputStream is = new BufferedInputStream(new FileInputStream(inputFileName));
        props.load(new InputStreamReader(is, "utf-8"));
//        HashMap<String, String> config = new HashMap<>();
        for (String key : props.stringPropertyNames()) {        /*stringPropertyNames()得到集合的字串*/
            logger.info("[" + key + "," + props.getProperty(key) + "]");  /*將key放入getProperty會回傳value*/
//            config.put(key, props.getProperty(key));
        }
//        props.setProperty(config.get("enterWord"), "新增資料");
//        props.setProperty("LatestData", "新增資料");
        oFile = new FileOutputStream(outputFileName, false);    /*true會接續寫，false會清空再寫入*/
        props.store(new OutputStreamWriter(oFile, "utf-8"), "NewFileIsCreated");
        for (String key : props.stringPropertyNames()) {
            System.out.println("[" + key + "," + props.getProperty(key) + "]");
        }


    }
}
