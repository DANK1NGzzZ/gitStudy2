package ywh.entity;

import java.util.List;

public class Ywh_end_course {
    private  Integer id;
    private  String name;
    private List<Ywh_end_courseinfo> Ywh_end_courseinfos;

    public List<Ywh_end_courseinfo> getYwh_end_courseinfos() {
        return Ywh_end_courseinfos;
    }

    public void setYwh_end_courseinfos(List<Ywh_end_courseinfo> ywh_end_courseinfos) {
        Ywh_end_courseinfos = ywh_end_courseinfos;
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

    @Override
    public String toString() {
        return "Ywh_end_course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Ywh_end_courseinfos=" + Ywh_end_courseinfos +
                '}';
    }
}
