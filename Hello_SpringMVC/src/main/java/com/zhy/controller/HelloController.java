package com.zhy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: HelloController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/8 15:01
 * @Version: 1.0
 **/
@Controller
public class HelloController {

    /*@Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv  = new ModelAndView();
        //将需要的值传递到model中
        mv.addObject("msg","helloSpringMVC");
        //设置要跳转的视图，
        mv.setViewName("hello");
        return mv;
    }*/


    /*
     * @RequestMapping就是用来标识此方法用来处理什么请求，其中的/可以取消
     * 取消后默认也是从当前项目的根目录开始查找，一般在编写的时候看个人习惯
     * 同时，@RequestMapping也可以用来加在类上，
     * */
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";
    }
}
