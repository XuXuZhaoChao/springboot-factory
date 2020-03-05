package com.example.springboot.singleton;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月27日 13:55:00
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        Object object = ContainerSingleton.getInstance("com.example.springboot.pojo.User");
        System.out.println(Thread.currentThread().getName() + ":" + object);
    }
}