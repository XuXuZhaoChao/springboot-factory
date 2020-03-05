package com.example.springboot.enums;

import com.example.springboot.pojo.User;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月27日 11:45:00
 */
public class TestEnums {

    public static void main(String[] args) {

        User user = Elvis.INSTANCE.getUserInstance();

        User user1 = Elvis.INSTANCE.getUserInstance();

        System.out.println(user == user1);
    }

}