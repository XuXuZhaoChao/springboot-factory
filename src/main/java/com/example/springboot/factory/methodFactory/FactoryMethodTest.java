package com.example.springboot.factory.methodFactory;

/**
 * @description 工厂的工厂
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:36:00
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonFactory();
        ICourse iCourse = courseFactory.create();
        iCourse.record();
    }
}