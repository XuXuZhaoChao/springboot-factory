package com.example.springboot.singleton;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description 容器式单例
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月27日 13:46:00
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> ioc = new HashMap<>();

    /**
    * 参考双重检查锁的单例模式--容器式单例(线程安全)
    */
    public static Object getInstance(String className) {
        synchronized (ioc){
            if (!ioc.containsKey(className)) {
                Object instance = null;
                try {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            } else {
                return ioc.get(className);
            }
        }
    }
}