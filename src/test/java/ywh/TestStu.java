package ywh;
import org.junit.Before;
import ywh.entity.Classes;
import ywh.entity.Course;
import ywh.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import ywh.mapper.YwhClassesMapper;
import ywh.mapper.YwhCourseMapper;
import ywh.mapper.YwhStudentMapper;

public class TestStu {

    @Test
    public void testYwh01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhStudentMapper ywhStudentMapper = sqlSession.getMapper(YwhStudentMapper.class);
        System.out.println(ywhStudentMapper.findStudentById(2));

        sqlSession.close();

    }

    @Test
    public void testYwh02() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhClassesMapper ywhStudentMapper = sqlSession.getMapper(YwhClassesMapper.class);
        List<Classes> infoSearch01 = ywhStudentMapper.findClassesById(2);
        int i ;
        for(Classes classes: infoSearch01){
            for(i = 0 ; i<classes.getStudents().size();i++)
            {
                System.out.print("cid: " + classes.getId() + " ");
                System.out.print("cname: " + classes.getName()+ " ");
                System.out.print("sid: " + classes.getStudents().get(i).getId()+ " ");
                System.out.print("sname: " + classes.getStudents().get(i).getName()+ " ");
                System.out.println("sage: " + classes.getStudents().get(i).getAge()+ " ");
            }

        }
        sqlSession.close();

    }


    @Test
    public void testYwh03() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

// 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2,properties);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        YwhCourseMapper ywhCourseMapper = sqlSession.getMapper(YwhCourseMapper.class);
        List<Course> infoSearch02 = ywhCourseMapper.findCourseAll();
        int i ;
        for(Course cours: infoSearch02){
            for(i = 0 ; i<cours.getStudents().size();i++) {
                System.out.print("cid: " + cours.getId() + " ");
                System.out.print("cname: " + cours.getName() + " ");
                System.out.print("sid: " + cours.getStudents().get(i).getId() + " ");
                System.out.print("sname: " + cours.getStudents().get(i).getName() + " ");
                System.out.println("sage: " + cours.getStudents().get(i).getAge() + " ");
            }
        }
        sqlSession.close();

    }



}
