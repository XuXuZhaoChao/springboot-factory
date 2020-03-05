package com.example.springboot.proxy.staticproxy;

/**
 * @description 真实需求方角色
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:50:00
 */
public class ZhangSan implements IPerson {

    @Override
    public void findLove() {
        System.out.println("张三要求:肤白貌美大长腿");
    }

    @Override
    public void buyInsurance(int money) {
        System.out.println("张三购买保险" + money + "元");
    }
}