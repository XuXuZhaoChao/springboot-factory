package com.example.springboot.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description jdk动态代理测试方法
 *
 * 动态代理是在运行期利用JVM的反射机制生成代理类,这里是直接生成类的字节码,然后通过类加载器载入JAVA虚拟机执行
 *
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 13:50:00
 */
public class JdkProxyTest {

    public static void main(String[] args) throws IOException {
        JdkMeipo jdkMeipo = new JdkMeipo();
        //生成new Zhangsan()的代理对象【proxy名字为$Proxy0】
        IPerson proxy = jdkMeipo.getInstance(new Zhangsan());
        //proxy代理对象需要写到文件中反编译,$Proxy0.class,每次执行都会调用invoke方法
        proxy.findLove();
        proxy.buyInsurance(10000);
        proxy.merry(50000,"吉林","xu");

        //生成代理类的字节码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IPerson.class});
        FileOutputStream os = new FileOutputStream("/Users/xuzhaochao/Books/$Proxy0.class");
        os.write(bytes);
        os.flush();
        os.close();
    }
}