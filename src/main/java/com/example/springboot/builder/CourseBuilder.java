package com.example.springboot.builder;

/**
 * @description 建造者模式:创建和使用分离
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月01日 15:21:00
 */
public class CourseBuilder {

    private Course course;

    public CourseBuilder() {
        course = new Course();
    }

    public CourseBuilder addVideo(String video){
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNotes(String notes){
        course.setNotes(notes);
        return this;
    }

    public CourseBuilder addHomework(String homework){
        course.setHomework(homework);
        return this;
    }

    public Course build(){
        return this.course;
    }

    public static void main(String[] args) {
        //创建对象
        CourseBuilder courseBuilder = new CourseBuilder();
        courseBuilder.addVideo("设计模式")
                .addNotes("课后笔记")
                .addHomework("JSON实现深克隆");
        //使用对象
        System.out.println(courseBuilder.build());
    }
}