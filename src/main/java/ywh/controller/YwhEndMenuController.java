package ywh.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ywh.entity.Ywh_end_menu;
import ywh.service.YwhEndMenuService;

import java.util.List;

@Controller
public class YwhEndMenuController {

    @Autowired
    YwhEndMenuService ywhEndMenuService;

    /*@RequestMapping("/menu")
    @ResponseBody
    public List<Ywh_end_menu> findYwh_end_menu_ById(Integer mid){
       mid = 2;
        return ywhEndMenuService.findYwh_end_menu_ById(mid);

    }*/
    @RequestMapping("/menu")
    public ModelAndView findYwh_end_menu_ById(Integer mid) {
       ModelAndView mv = new ModelAndView();
        mid = 2;
        List<Ywh_end_menu> ywh_end_menus = ywhEndMenuService.findYwh_end_menu_ById(mid);
        mv.addObject("ywh_end_menus",ywh_end_menus);
        mv.setViewName("menu");
        return mv;

    }

}
