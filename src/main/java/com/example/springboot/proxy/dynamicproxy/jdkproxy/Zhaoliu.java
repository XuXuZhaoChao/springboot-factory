package com.example.springboot.proxy.dynamicproxy.jdkproxy;


/**
 * @description 真实需求方角色
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:50:00
 */
public class Zhaoliu implements IPerson {

    @Override
    public void findLove() {
        System.out.println("赵六要求:有车有房有钱");
    }

    @Override
    public void buyInsurance(int money) {
        System.out.println("赵六购买保险:" + money + "元");
    }

    @Override
    public void merry(int money, String address, String name) {
        System.out.println("彩礼" + money + "家庭地址" + address + "姓名" + name);
    }
}