package ywh.entity;

import java.util.List;

public class Ywh_end_user {
    private  Integer id;
    private  String name;
    private String password;
    private  String sex;
    private String phonenumber;
    private String email;
    private List<Ywh_end_menu> Ywh_end_menus;
    private List<Ywh_end_role> Ywh_end_roles;

    public List<Ywh_end_menu> getYwh_end_menus() {
        return Ywh_end_menus;
    }

    public void setYwh_end_menus(List<Ywh_end_menu> ywh_end_menus) {
        Ywh_end_menus = ywh_end_menus;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ywh_end_user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", Ywh_end_menus=" + Ywh_end_menus +
                ", Ywh_end_roles=" + Ywh_end_roles +
                '}';
    }
}
