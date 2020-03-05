package com.example.springboot.proxy.staticproxy;

/**
 * @description 真实需求方角色
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:50:00
 */
public class ZhaoLiu implements IPerson {

    @Override
    public void findLove() {
        System.out.println("赵六要求:有车有房有钱");
    }

    @Override
    public void buyInsurance(int money) {
        System.out.println("赵六购买保险" + money + "元");
    }
}