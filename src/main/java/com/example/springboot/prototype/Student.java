package com.example.springboot.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description 原型模式
 *                      浅克隆(引用类型的数据只复制了引用的地址,在新的对象中修改引用类型的数据会影响原对象中的引用)
 *                      深克隆(新对象和原对象是两个完全独立的对象;1.序列化和反序列化 2.json方式)
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年02月29日 22:07:00
 */
public class Student implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private List<String> info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info=" + info +
                '}';
    }

    /**
     * @title 浅克隆
     *
     * @param
     * @return
     */
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    /**
     * @title 深克隆
     *
     * @param
     * @return
     */
    public Student deepClone() throws IOException, ClassNotFoundException {
        //序列化 -写到流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //反序列化 -生成新对象
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
        Student student = (Student) objectInputStream.readObject();
        return student;

    }

    public static void main(String args[]) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student student = new Student("小明", 11);
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        student.setInfo(list);
        /*Student clone = student.clone();
        list.add("abc");
        list.add("efg");
        clone.setInfo(list);
        list.clear();*/
        Student deepClone = student.deepClone();
        List<String> lists = new ArrayList<>();
        lists.add("xxx");
        lists.add("yyy");
        deepClone.setInfo(lists);
        System.out.println("原始对象 : " + student);
        //System.out.println("浅克隆对象" + clone);
        System.out.println("深克隆对象" + deepClone);
        System.out.println(student.getInfo() == deepClone.getInfo());
    }

}