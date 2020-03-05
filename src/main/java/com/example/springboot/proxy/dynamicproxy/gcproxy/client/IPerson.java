package com.example.springboot.proxy.dynamicproxy.gcproxy.client;

/**
 * @description jdk动态代理
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:49:00
 */
public interface IPerson {

    void findLove();

    void buyInsurance(int money);

    void merry(int money,String address,String name);
}