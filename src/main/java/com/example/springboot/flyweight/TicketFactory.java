package com.example.springboot.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description 享元工厂
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 13:43:00
 */
public class TicketFactory {

    private static Map<String,ITicket> map = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from,String to){
        String key = from + "->" + to;
        if(map.containsKey(key)){
            System.out.println("使用缓存:" + key);
            return map.get(key);
        }
        System.out.println("首次查询,创建对象: " + key);
        ITicket ticket = new TrainTicket(from, to);
        map.put(key,ticket);
        return ticket;
    }

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京","长春");
        ticket.showInfo("硬卧");

        ITicket ticket1 = TicketFactory.queryTicket("北京","长春");
        ticket1.showInfo("软卧");
    }
}