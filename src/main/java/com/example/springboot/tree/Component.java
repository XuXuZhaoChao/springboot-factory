package com.example.springboot.tree;

/**
 * @description 组合模式
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 15:21:00
 */
public class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * @title 增加成员
     *
     * @param component
     * @return
     */
    public void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    /**
     * @title 删除成员
     *
     * @param component
     * @return
     */
    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    /**
     * @title 获取成员
     *
     * @param index
     * @return
     */
    public Component getChild(int index) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    /**
     * @title 业务方法
     *
     * @param
     * @return
     */
    public void show() {
        throw new UnsupportedOperationException("不支持删除操作");
    }
}