package ywh.service;

import ywh.entity.Sys_user;

import java.util.List;
import java.util.Map;

public interface YwhUserService {
    public Sys_user queryUserByName(String u);
    public  int register(Sys_user sys_user);
   public List<Sys_user> login(String user_name, String password);
 // public   List<Sys_user> login(Map<String,Object> map);
}
