package com.example.springboot.proxy.dynamicproxy.gcproxy.client;

import com.example.springboot.proxy.dynamicproxy.gcproxy.proxy.GCClassLoader;
import com.example.springboot.proxy.dynamicproxy.gcproxy.proxy.GCInvocationHandler;
import com.example.springboot.proxy.dynamicproxy.gcproxy.proxy.GCProxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description jdk动态代理【被代理的类必须实现接口,生成代理类需要接口】
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 13:50:00
 */
public class GCMeipo implements GCInvocationHandler {

    /**
     * 代理类是IPerson子类
     */
    private IPerson target;

    /**
     * @title 生成代理对象
     *
     * @param target = zhangsan 被代理对象
     * @return
     */
    public IPerson getInstance(IPerson target) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        /**
         * @title 使用Proxy提供的方法创建一个动态代理类实例
         *
         * @param ClassLoader loader 类加载器,用于加载这个代理类
         * @param Class<?>[] interfaces 面存放的是待实现的接口信息
         * @param InvocationHandler h InvocationHandler实例(实现接口)
         * @return
         */
        this.target = target;
        Class<?> clazz = target.getClass();
        //[h = GCMeipo] 创建动态代理对象[newProxyInstance]
        return (IPerson) GCProxy.newProxyInstance(new GCClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * @title 代理类最终逻辑invoke方法,通过阅读源码发现每次都会调用invoke方法
     *
     * @param proxy 动态代理类实例
     * @param method 表示调用的方法
     * @param args 表示调用方法的参数
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法名称 ：" + method + ",参数列表 ：" + args);
        before();
        Object object =  method.invoke(this.target, args);
        after();
        return object;
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }
}