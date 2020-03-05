package com.example.springboot.proxy.dynamicproxy.gcproxy.proxy;

import java.lang.reflect.Method;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月03日 12:32:00
 */
public interface GCInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}