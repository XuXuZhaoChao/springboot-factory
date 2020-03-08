package com.example.springboot.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 树枝节点
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月08日 15:24:00
 */
public class Composite extends Component {

    private Integer level;

    private List<Component> components;

    public Composite(String name, Integer level) {
        super(name);
        this.level = level;
        this.components = new ArrayList<Component>();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Component component : components) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (int i = 0; i < this.level; i++) {
                    //每一行开始打印一个+号
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            component.show();
        }
    }
}