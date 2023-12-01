package ywh;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ywh.config.SpringConfig;
import ywh.entity.Sys_user;
import ywh.service.YwhUserService;

import java.lang.annotation.Annotation;

public class TestSpring {
    @Test
    public void testYwhUService(){
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(SpringConfig.class);
        YwhUserService ywhUserService = ac.getBean(YwhUserService.class);
        Sys_user u1 = ywhUserService.queryUserByName("ywh");
        System.out.println(u1);

        //注册
        Sys_user u = new Sys_user();
        u.setId("11");
        u.setUserName("lcw");
        u.setPassword("123456");
        u.setNickName("yiyiyi");
        int r = ywhUserService.register(u);
        System.out.println((r + "------------------"));
    }



    @Test
    //登入
    public void testYwhUService02(){
        AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(SpringConfig.class);
        YwhUserService ywhUserService = ac.getBean(YwhUserService.class);
        Sys_user u1 = ywhUserService.queryUserByName("ywh");
        System.out.println(u1);

        //注册
        Sys_user u = new Sys_user();
        u.setId("11");
        u.setUserName("lcw");
        u.setPassword("123456");
        u.setNickName("yiyiyi");
        int r = ywhUserService.register(u);
        System.out.println((r + "------------------"));
    }
}
