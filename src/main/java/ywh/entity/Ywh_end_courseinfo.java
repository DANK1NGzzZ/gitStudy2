package ywh.entity;

import java.util.List;

public class Ywh_end_courseinfo {
    private  Integer id;
    private  String name;
    private String info;
    private  String teacher_name;
    private List<Ywh_end_course> Ywh_end_courses;

    public List<Ywh_end_course> getYwh_end_courses() {
        return Ywh_end_courses;
    }

    public void setYwh_end_courses(List<Ywh_end_course> ywh_end_courses) {
        Ywh_end_courses = ywh_end_courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    @Override
    public String toString() {
        return "Ywh_end_courseinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", Ywh_end_courses=" + Ywh_end_courses +
                '}';
    }
}
