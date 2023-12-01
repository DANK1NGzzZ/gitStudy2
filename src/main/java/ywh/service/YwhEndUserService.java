package ywh.service;

import org.apache.ibatis.annotations.Param;
import ywh.entity.Ywh_end_user;

import java.util.List;

public interface YwhEndUserService {
    public Ywh_end_user queryUserByName(String u);
    public  int register(String name, String password);
    public List<Ywh_end_user> login(String name, String password);
}
