package ywh.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;
import ywh.intercept.ProjectInterceptor;

import java.nio.charset.Charset;
import java.util.List;

public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //配置多拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/", "/*");


    }

    /**
     * /**
     * * 消息内容转换配置
     *
     * @param converters
     */
@Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //配置String类型消息转换器
        StringHttpMessageConverter converter = new StringHttpMessageConverter();
        //converter.setSupportedMediaTypes(List.of(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        converter.setDefaultCharset(Charset.defaultCharset());
        converters.add(converter);
        MappingJackson2HttpMessageConverter converter2 = new MappingJackson2HttpMessageConverter();
        converters.add(converter2);

    }

    /**
     * 解决跨域问题
     **/
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("POST", "GET")
                .allowedOrigins("*");
    }

    /**
     * 配置静态访问资源
     *
     * @Override
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        HttpHeaders headers =new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:8080");
        registry.addViewController("/toLogin").setViewName("login");
    }

}
