package ywh.entity;

import java.util.List;

public class Ywh_end_role {
    private  Integer id;
    private  String name;
    private List<Ywh_end_user> Ywh_end_users;

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

    public List<Ywh_end_user> getYwh_end_users() {
        return Ywh_end_users;
    }

    public void setYwh_end_users(List<Ywh_end_user> ywh_end_users) {
        Ywh_end_users = ywh_end_users;
    }

    @Override
    public String toString() {
        return "Ywh_end_role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Ywh_end_users=" + Ywh_end_users +
                '}';
    }
}
