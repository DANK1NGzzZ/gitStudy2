package ywh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywh.entity.Sys_user;
import ywh.mapper.YwhUserMapper;

import java.util.List;
import java.util.Map;

@Service
public class YwhUserServicelmpl implements  YwhUserService {
    @Autowired
    YwhUserMapper ywhUserMapper;

    public Sys_user queryUserByName(String sys_user_name) {
        Sys_user sys_user = ywhUserMapper.queryUserByName(sys_user_name);
        return sys_user;
    }

    @Override
    public int register(Sys_user sys_user) {
        Sys_user rSys_user = ywhUserMapper.queryUserByName(sys_user.getUserName());
        if (rSys_user != null && rSys_user.getUserName().equals(sys_user.getUserName())) {
            return 1;
        }
        int r = ywhUserMapper.register(sys_user);
        System.out.println(r + "插入数据");
        if (r == 1) {
            return 0;
        } else {
            return 2;
        }
    }
    @Override
    public List<Sys_user> login(String user_name, String password) {

        List<Sys_user> sys_user = ywhUserMapper.login(user_name, password);

        return  sys_user;
    }

/**@Override
   public List<Sys_user> login(Map<String,Object> map) {
       return ywhUserMapper.login(map);
   }*/
}


