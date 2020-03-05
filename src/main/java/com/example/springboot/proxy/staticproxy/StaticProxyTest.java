package com.example.springboot.proxy.staticproxy;

/**
 * @description 静态代理(硬编码)
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月02日 11:56:00
 */
public class StaticProxyTest {

    public static void main(String[] args) {

        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new ZhangSan());
        //调用父亲的findLove方法,由父亲代替张三完成findLove方法调用,父亲在此基础上加了些方法要求。
        zhangLaoSan.findLove();
        zhangLaoSan.buyInsurance(3000);
    }
}