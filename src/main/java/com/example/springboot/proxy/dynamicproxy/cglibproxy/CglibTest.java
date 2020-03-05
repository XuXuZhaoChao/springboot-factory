package com.example.springboot.proxy.dynamicproxy.cglibproxy;


import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 15:53:00
 */
public class CglibTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.example.springboot.proxy.dynamicproxy.cglibproxy.Zhangsan");
        System.out.println(clazz == Zhangsan.class);

        //利用CGlib代理类可以将内存中的.class文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/xuzhaochao/Books/cglib_proxy_class/");

        //代理类是ZhangSan的子类,proxy是代理对象
        Zhangsan proxy = (Zhangsan) new CglibMeipo().getInstance(Zhangsan.class);
        proxy.findLove();
        proxy.buyInsurance(10000);
    }
}