/**package ywh.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ywh.entity.Sys_user;
import ywh.service.YwhUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HelloController {

 @Autowired
    YwhUserService ywhUserService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "哈喽";//是返回aaaa当页面还是文本输出
    }

    //@ResponseBody
   @RequestMapping("/")
    public String index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return "login";
    }

    
}
*/