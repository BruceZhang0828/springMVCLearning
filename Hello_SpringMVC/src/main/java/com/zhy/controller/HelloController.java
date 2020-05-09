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


    /**
     * Request的其他属性值
     *  value:要匹配的请求
     *  method:限制发送请求的方式： POST GET
     *  params:表示请求要接受的参数,如果定义了这个属性，那么发送的时候必须要添加参数
     *         params有几种匹配规则
     *          1、直接写参数的名称，param1,param2
     *              params = {"username"}
     *          2、表示请求不能包含的参数，！param1
     *              params = {"!username"}
     *          3、表示请求中需要要包含的参数但是可以限制值 param1=values  param1!=value
     *              params = {"username=123","age"}
     *              params = {"username!=123","age"}
     *  headers:填写请求头信息
     *          chrome：User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.79 Safari/537.36
     *          firefox:User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0
     *
     *  consumers:只接受内容类型是哪种的请求，相当于指定Content-Type
     *  produces:返回的内容类型 Content-Type：text/html;charset=utf-8
     *
     * @return
     */

    /**
     * @Request包含三种模糊匹配的方式，分别是：
     *  ？：能替代任意一个字符
     *  *: 能替代任意多个字符和一层路径
     *  **：能代替多层路径
     * @return
     */


    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";
    }
}
