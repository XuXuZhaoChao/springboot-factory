package com.example.springboot.prototype;

import com.google.gson.Gson;

/**
 * @description 原型模式:(1)浅克隆;(2)深克隆
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月01日 13:28:00
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("smith", new Address("北京", "中国"));

        //浅克隆
        User shallowCloneUser = user.clone();
        user.getAddress().setCity("深圳");

        System.out.println("原始对象 :" + user);
        System.out.println("浅克隆对象 : " + shallowCloneUser);
        System.out.println(user.getAddress() == shallowCloneUser.getAddress());

        System.out.println("**************************************************");

        //深克隆 Gson可以将对象序列化成JSON,也可以将JSON反序列化成对象
        Gson gson = new Gson();
        User deepCloneUser = gson.fromJson(gson.toJson(user), User.class);
        user.getAddress().setCity("上海");

        System.out.println("原始对象 :" + user);
        System.out.println("深克隆对象 : " + deepCloneUser);
        System.out.println(user.getAddress() == deepCloneUser.getAddress());
    }
}