package com.yb.cloud.utils;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author Administrator
 * @descition
 * @date 2022/03/20  18:46
 */
public class JasyptEncryptUtil {
    public static void main(String[] args){
        //PBEWithMD5AndDES
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("yuanban_123@!");

        //加密的key值，用于配置文件jasypt.encryptor.password的值
//        encryptor.setPassword("username");
        //加密
        System.out.println(encryptor.decrypt("TI+RgRCPmGLcgeKYLv5OpOz+wM/OscupekHuShiQ1/io7bsKRxt0fw=="));
    }

    public static String encrptField(String field){
        //PBEWithMD5AndDES
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("yuanban_123@!");

        //加密的key值，用于配置文件jasypt.encryptor.password的值
//        encryptor.setPassword("username");
        return encryptor.encrypt(field);
    }

    public static String decrptField(String enrptField){
        //PBEWithMD5AndDES
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("yuanban_123@!");
        //加密
//        System.out.println(encryptor.decrypt("TI+RgRCPmGLcgeKYLv5OpOz+wM/OscupekHuShiQ1/io7bsKRxt0fw=="));
        return encryptor.decrypt(enrptField);
    }

}