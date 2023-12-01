package ywh;

import ywh.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Test;


public class TestMybatis {
    @Test
    //查询
    public  void test01() throws IOException {
// 加载 JDBC 配置文件,从类路径中加载 jdbc.properties 文件并创建输入流。
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

        }
    }
    //插入
    @Test
    public  void test02() throws IOException {
        //模拟user对象
        UserInfo userinfo = new UserInfo();
        userinfo.setUaccount(202000027);
        userinfo.setUname("re");
        userinfo.setUpwd("66666");
        userinfo.setUsex("eee");
// 加载 JDBC 配置文件,从类路径中加载 jdbc.properties 文件并创建输入流。
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
           sqlSession.insert("UserInfoMapper.save",userinfo);
            //mybatis更新需要提交事务
        sqlSession.commit();
            sqlSession.close();

    }
    //更新
    @Test
    public  void test03() throws IOException {
        //模拟user对象
        UserInfo userinfo = new UserInfo();
        userinfo.setUaccount(202000026);
        userinfo.setUname("yang");
        userinfo.setUpwd("6556");
        userinfo.setUsex("man");
// 加载 JDBC 配置文件,从类路径中加载 jdbc.properties 文件并创建输入流。
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
      SqlSession sqlSession = sqlSessionFactory.openSession();
      sqlSession.update("UserInfoMapper.update",userinfo);
        //mybatis更新需要提交事务
        sqlSession.commit();
        sqlSession.close();



    }
    //删除
    @Test
    public  void test04() throws IOException {
// 加载 JDBC 配置文件,从类路径中加载 jdbc.properties 文件并创建输入流。
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("UserInfoMapper.delete",202000026);

        //mybatis更新需要提交事务
        sqlSession.commit();
        sqlSession.close();

    }
}
