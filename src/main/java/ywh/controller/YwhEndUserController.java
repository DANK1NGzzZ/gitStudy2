package ywh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ywh.bean.ResponseMsg;
import ywh.entity.Ywh_end_user;
import ywh.service.YwhEndUserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller//
public class YwhEndUserController {

    @Autowired
    YwhEndUserService ywhEndUserService;

    @RequestMapping("/")
    public String index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return "login";
    }
    @RequestMapping("/re")
    public String index02() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return "register";
    }
/**
 @ResponseBody
 public  int register(Sys_user sys_user){
 Sys_user u = new Sys_user();
 u.setId("14");
 u.setUserName("yangwenhao");
 u.setPassword("123456");
 u.setNickName("yyyyyyy");
 return ywhUserService.register(u);

 }*/
    /**@RequestMapping("/login")
    public List<Sys_user> login( String user_name, String password){
    user_name = "ywh";
    password = "123456";
    return ywhUserService.login(user_name,password);

    }
     * @return**/

    @RequestMapping( "/register")
    public String register(String name,String password) {
        int isSuccess = ywhEndUserService.register(name,password);

        if (isSuccess == 0) {
            return "login";
        } else {
            return "register";
        }
    }
    @RequestMapping( "/login")
    public String login(String name,String password) {

        List<Ywh_end_user> sys_user = ywhEndUserService.login(name, password);

        if (sys_user.size() != 0) {

            return "redirect:/menu";
        } else {
            return "login";
        }

    }
}
/**@RestController
 @RequestMapping("/auth")
 public class LoginController {

 // ... 其他方法

 @RequestMapping(value = "/login", method = RequestMethod.OPTIONS)
 public ResponseEntity<?> handleOptionsRequest() {
 return ResponseEntity.ok()
 .header("Access-Control-Allow-Origin", "http://localhost:8080")
 .header("Access-Control-Allow-Methods", "POST")
 .header("Access-Control-Allow-Headers", "Content-Type")
 .build();
 }
 }**/
/**@PostMapping("/auth/login")
public ResponseMsg<Map> login(@RequestBody  Sys_user sys_user){
ResponseMsg<Map> res = new ResponseMsg<Map>();
Map<String,Object> map = new HashMap<String, Object>();
map.put("user_name",sys_user.getUserName());
map.put("password",sys_user.getPassword());
try{
List<Sys_user> users = ywhUserService.login(map);
if(users.size()!=0){
res.success("登录成功");
map.put("user",users.get(0));
map.put("state","200");
res.setData(map);
}else {
map.put("state","200");
res.fail("登录失败");
res.setData(map);
}
}catch (Exception e){
res.fail("登录失败");

}
return res;
// return  userService.login(map);
}*/
