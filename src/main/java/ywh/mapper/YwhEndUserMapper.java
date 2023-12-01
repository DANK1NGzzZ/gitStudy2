package ywh.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ywh.entity.Ywh_end_user;

import java.util.List;
import java.util.Map;
@Repository
public interface YwhEndUserMapper {
    /**
     * 檢查用戶是否存在
     *
     * @param name
     * @return
     */
    public Ywh_end_user queryUserByName(String name);

    /**
     * 註冊用戶
     *
     * @param
     * @return
     */
    public int register(@Param("name") String name, @Param("password") String password);

    /**
     * 登錄
     *
     * @param
     * @return
     */
    public List<Ywh_end_user> login(@Param("name") String name, @Param("password") String password);
}
// public List<Sys_user> login(Map<String,Object> map);
