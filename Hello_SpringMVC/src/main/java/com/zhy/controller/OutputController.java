package com.zhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @ClassName: OutputController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/9 23:12
 * @Version: 1.0
 **/
@Controller
/**
 * @SessionAttribute：此注解可以表示，当向request作用域设置数据的时候同时也要向session中保存一份,
 * 此注解有两个参数，一个value（表示将哪些值设置到session中），
 * 另外一个type（表示按照类型来设置数据，一般不用，因为有可能会将很多数据都设置到session中，导致session异常）。
**/
@SessionAttributes(value = "msg")
public class OutputController {

    @RequestMapping("output1")
    public String output(Model model){
        model.addAttribute("msg","hello,Springmvc");
        System.out.println(model.getClass());
        return "success";
    }

    @RequestMapping("output2")
    public String output2(ModelMap model){
        model.addAttribute("msg","hello,Springmvc");
        return "success";
    }


    @RequestMapping("output3")
    public String output1(Map map){
        map.put("msg","hello,Springmvc");
        return "success";
    }

    /**
     * @Description 使用modelandview
     * @Date 16:47 2020/5/13
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
    **/
    @RequestMapping("mv")
    public ModelAndView mv(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg","hello.modelAndView");
        return mv;
    }

}
