package com.example.springboot.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description cglib动态代理【继承被代理类,重写所有方法】
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 13:50:00
 */
public class CglibMeipo implements MethodInterceptor {

    /**
     * @title
     *
     * @param  clazz 被代理类
     * @return
     */
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把clazz设置为即将生成新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //调用父类的方法
        return methodProxy.invokeSuper(o,objects);
    }
}