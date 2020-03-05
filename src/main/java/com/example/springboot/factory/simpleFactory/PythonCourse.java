package com.example.springboot.factory.simpleFactory;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月26日 18:16:00
 */
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("python 录制课程");
    }
}