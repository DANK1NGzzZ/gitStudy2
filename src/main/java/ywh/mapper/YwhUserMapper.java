package ywh.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ywh.entity.Sys_user;

import java.util.List;
import java.util.Map;
@Repository
public interface YwhUserMapper {
    /**
     * 檢查用戶是否存在
     * @param user_name
     * @return
     */
    public Sys_user queryUserByName(String user_name);

    /**
     * 註冊用戶
     * @param sys_user
     * @return
     */
    public int register(Sys_user sys_user);

    /**
     * 登錄
     * @param
     * @return
     */
   public List<Sys_user> login(@Param("user_name")String user_name,@Param("password")String password);
    // public List<Sys_user> login(Map<String,Object> map);
}