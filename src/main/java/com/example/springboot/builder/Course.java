package com.example.springboot.builder;

/**
 * @description
 * @version 1.0.0
 * @author xuzhaochao
 * @date 2020年03月01日 15:21:00
 */
public class Course {

    private String video;

    private String notes;

    private String homework;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Course{" +
                "video='" + video + '\'' +
                ", notes='" + notes + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}