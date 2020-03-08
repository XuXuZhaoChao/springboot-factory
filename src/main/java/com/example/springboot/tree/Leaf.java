package com.example.springboot.tree;

/**
 * @description 叶子节点
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 15:23:00
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show() {

        System.out.println(this.name);
    }
}