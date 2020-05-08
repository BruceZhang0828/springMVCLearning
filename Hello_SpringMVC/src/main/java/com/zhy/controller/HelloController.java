package com.zhy.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: HelloController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/8 15:01
 * @Version: 1.0
 **/
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv  = new ModelAndView();
        //将需要的值传递到model中
        mv.addObject("msg","helloSpringMVC");
        //设置要跳转的视图，
        mv.setViewName("hello");
        return mv;
    }
}
