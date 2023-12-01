package ywh.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywh.entity.Ywh_end_user;
import ywh.mapper.YwhEndUserMapper;

import java.util.List;

@Service
public class YwhEndUserServiceImpl  implements  YwhEndUserService{
    @Autowired
    YwhEndUserMapper ywhEndUserMapper;

    public Ywh_end_user queryUserByName(String ywh_end_user_name) {
        Ywh_end_user wyh_end_user = ywhEndUserMapper.queryUserByName(ywh_end_user_name);
        return wyh_end_user;
    }

    @Override
    public int register(String name, String password) {
        Ywh_end_user rSys_user = ywhEndUserMapper.queryUserByName(name);
        if (rSys_user != null && rSys_user.getName().equals(name)) {
            return 1;
        }
        int r = ywhEndUserMapper.register(name, password);
        System.out.println(r + "插入数据");
        if (r == 1) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public List<Ywh_end_user> login(String name, String password) {

        List<Ywh_end_user> ywh_end_user = ywhEndUserMapper.login(name, password);

        return  ywh_end_user;
    }

}
