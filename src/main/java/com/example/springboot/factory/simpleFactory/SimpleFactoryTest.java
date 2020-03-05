package com.example.springboot.factory.simpleFactory;

/**
 * @description 产品工厂
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:18:00
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICourse iCourse = simpleFactory.create(PythonCourse.class);
        iCourse.record();
    }
}