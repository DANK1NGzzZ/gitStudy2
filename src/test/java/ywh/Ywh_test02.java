package ywh;
import org.junit.Before;
import ywh.entity.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import ywh.mapper.*;

public class Ywh_test02 {

    @Test
    public void test01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhEndRoleMapper ywhEndRoleMapper = sqlSession.getMapper(YwhEndRoleMapper.class);
        List<Ywh_end_role> infoSearch01 = ywhEndRoleMapper.findYwh_end_role_ById(2);
        System.out.println(infoSearch01);
        int i ;
        for(Ywh_end_role ywh_end_role: infoSearch01){
            for(i = 0 ; i<ywh_end_role.getYwh_end_users().size();i++)
            {
                System.out.print("rid: " + ywh_end_role.getId() + " ");
                System.out.print("rname: " + ywh_end_role.getName()+ " ");
                System.out.print("uid: " + ywh_end_role.getYwh_end_users().get(i).getId()+ " ");
                System.out.print("uname: " + ywh_end_role.getYwh_end_users().get(i).getName()+ " ");
                System.out.println("usex: " + ywh_end_role.getYwh_end_users().get(i).getSex()+ " ");
            }

        }
        sqlSession.close();

    }

    @Test
    public void test02() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhEndMenuMapper ywhEndMenuMapper = sqlSession.getMapper(YwhEndMenuMapper.class);
        List<Ywh_end_menu> infoSearch02 = ywhEndMenuMapper.findYwh_end_menu_ById(2);
        System.out.println(infoSearch02);
        int i ;
        for(Ywh_end_menu ywh_end_menu: infoSearch02){
            for(i = 0 ; i<ywh_end_menu.getYwh_end_roles().size();i++)
            {
                System.out.print("mid: " + ywh_end_menu.getId() + " ");
                System.out.print("mname: " + ywh_end_menu.getName()+ " ");
                System.out.print("mpath: " + ywh_end_menu.getPath()+ " ");
                System.out.print("rid: " + ywh_end_menu.getYwh_end_roles().get(i).getId()+ " ");
                System.out.println("rname: " + ywh_end_menu.getYwh_end_roles().get(i).getName()+ " ");

            }

        }
        sqlSession.close();

    }


 /*    @Test
    public void test03() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhEndUserMapper  ywhEndUserMapper= sqlSession.getMapper(YwhEndUserMapper.class);
        List<Ywh_end_user> infoSearch02 = ywhEndUserMapper.findYwh_end_user_ById(5);
        System.out.println(infoSearch02);
        int i ;
        for(Ywh_end_user ywh_end_user: infoSearch02){
            for(i = 0 ; i<ywh_end_user.getYwh_end_menus().size();i++) {
                System.out.print("用户id: " + ywh_end_user.getId() + " ");
                System.out.print("用户名称: " + ywh_end_user.getName() + " ");
                System.out.print("用户性别: " + ywh_end_user.getSex()+ " ");
                System.out.print("用户角色: " + ywh_end_user.getYwh_end_roles().get(i).getName() + " ");
                System.out.print("权限: " + ywh_end_user.getYwh_end_menus().get(i).getName() + " ");
                System.out.println("权限路径: " + ywh_end_user.getYwh_end_menus().get(i).getPath() + " ");
            }
        }
        sqlSession.close();

    }
*/
    @Test
    public void test04() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhEndCourseinfoMapper  ywhEndCourseinfoMapper= sqlSession.getMapper(YwhEndCourseinfoMapper.class);
        List<Ywh_end_courseinfo> infoSearch02 = ywhEndCourseinfoMapper.findYwh_end_courseinfoById(5);
        System.out.println(infoSearch02);
        sqlSession.close();

    }



}
