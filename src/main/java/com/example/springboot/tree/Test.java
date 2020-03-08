package com.example.springboot.tree;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 15:28:00
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("============透明组合模式===========");
        Composite root = new Composite("root",1);

        root.add(new Leaf("叶子1"));
        Composite composite = new Composite("叶子2",2);
        Leaf leaf1 = new Leaf("叶子2-1");
        Leaf leaf2 = new Leaf("叶子2-2");
        composite.add(leaf1);
        composite.add(leaf2);
        root.add(composite);

        Composite composite1 = new Composite("叶子3",2);
        Leaf leaf3 = new Leaf("叶子3-1");
        Leaf leaf4 = new Leaf("叶子3-2");
        composite1.add(leaf3);
        composite1.add(leaf4);
        root.add(composite1);

        root.show();
    }
}