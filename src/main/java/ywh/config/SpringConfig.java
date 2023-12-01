package ywh.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ywh.mapper.YwhEndRoleMapper;

import java.io.InputStream;
import java.util.Properties;

@Configuration
@MapperScan("ywh.mapper")
@ComponentScan("ywh.service")
public class SpringConfig {
    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();//创建 Properties 对象，用于存储加载的配置属性。
        properties.load(inputStream);

        // 创建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream2 = Resources.getResourceAsStream(resource);
        //通过配置文件和属性创建 SqlSessionFactory 实例。
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream2, properties);
        return sqlSessionFactory;

    }
}
