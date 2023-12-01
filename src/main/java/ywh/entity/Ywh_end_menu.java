package ywh.entity;

import java.util.List;

public class Ywh_end_menu {
    private  Integer id;
    private  String name;
    private String path;
    private List<Ywh_end_user> Ywh_end_users;
    private List<Ywh_end_role> Ywh_end_roles;

    public List<Ywh_end_role> getYwh_end_roles() {
        return Ywh_end_roles;
    }

    public void setYwh_end_roles(List<Ywh_end_role> ywh_end_roles) {
        Ywh_end_roles = ywh_end_roles;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Ywh_end_user> getYwh_end_users() {
        return Ywh_end_users;
    }

    public void setYwh_end_users(List<Ywh_end_user> ywh_end_users) {
        Ywh_end_users = ywh_end_users;
    }

    @Override
    public String toString() {
        return "Ywh_end_menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", Ywh_end_users=" + Ywh_end_users +
                ", Ywh_end_roles=" + Ywh_end_roles +
                '}';
    }
}
