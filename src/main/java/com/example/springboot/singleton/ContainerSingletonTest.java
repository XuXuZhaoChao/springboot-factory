package com.example.springboot.singleton;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月27日 13:51:00
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {


        /*Object object = ContainerSingleton.getInstance("com.example.springboot.pojo.User");
        Object object1 = ContainerSingleton.getInstance("com.example.springboot.pojo.User");
        System.out.println(object == object1);*/

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
    }
}