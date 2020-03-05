package com.example.springboot.loadClass;

import java.io.*;

/**
 * @description 自定义类加载器 继承ClassLoader重写findClass方法
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月29日 17:41:00
 */
public class LoadClassTest extends ClassLoader {

    /**
     * @title 加载文件
     *
     * @param name 文件全路径(包括包名称)
     * @return
     */
    @Override
    public Class<?> findClass(String name){
        try {
            byte[] bytes = this.findClassFile(name);
            return super.defineClass(name,bytes,0,bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @title 生成二进制文件
     *
     * @param name 文件全路径(包括包名称)
     * @return
     */
    private byte[] findClassFile(String name) throws Exception {
        String[] result = name.split("\\.");
        String className = result[result.length - 1];
        File file = new File("/Users/xuzhaochao/Development/" + className + ".class");
        InputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] data = new byte[1024];
        while((len = inputStream.read(data)) != -1){
            byteArrayOutputStream.write(data,0, len);
        }
        byte[] writeData = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        inputStream.close();
        return writeData;
    }

    /**
     * @title 测试方法
     *
     * @param 
     * @return 
     */
    public static void main(String[] args) throws Exception {
        LoadClassTest loadClassTest = new LoadClassTest();
        Class<?> clazz = loadClassTest.findClass("com.example.springboot.pojo.Student");
        Object object = clazz.newInstance();
        System.out.println(object);
    }
}