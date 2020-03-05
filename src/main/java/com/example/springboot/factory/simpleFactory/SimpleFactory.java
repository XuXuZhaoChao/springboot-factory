package com.example.springboot.factory.simpleFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:17:00
 */
public class SimpleFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            //反射 生成对象实例
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}