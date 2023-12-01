package ywh.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ywh.entity.Ywh_end_courseinfo;
import ywh.entity.Ywh_end_menu;
import ywh.service.YwhEndCourseinfoService;


import java.util.List;

@Controller
public class YwhEndCourseinfoController {

    @Autowired
    YwhEndCourseinfoService ywhEndCourseinfoService;

    @RequestMapping("/courseinfo")
    public ModelAndView findYwh_end_courseinfoById(Integer cid){
        cid = 2;
        ModelAndView mv = new ModelAndView();
        List<Ywh_end_courseinfo> ywh_end_courses = ywhEndCourseinfoService.findYwh_end_courseinfoById(cid);
        mv.addObject("ywh_end_courses",ywh_end_courses);
        mv.setViewName("courseinfo");
        return mv;

    }
}
