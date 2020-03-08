package com.example.springboot.flyweight;

import java.util.Random;

/**
 * @description 具体享元角色
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 13:39:00
 */
public class TrainTicket implements ITicket {

    private String from;

    private String to;

    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println("出发地->" + this.from + ",目的地->" + this.to+ ",票价:" + this.price + "元,席位:" + bunk);
    }
}