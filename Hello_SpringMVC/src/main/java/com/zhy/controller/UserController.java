package com.zhy.controller;

import com.zhy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: UserController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/9 15:59
 * @Version: 1.0
 **/

@Controller
public class UserController {


    Object o1 = null;
    Object o2 = null;
    Object o3 = null;

    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/api")
    public String api(HttpSession session, HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("requestParam","request");
        session.setAttribute("sessionParam","session");
        return "success";
    }


    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user, Model model){
        System.out.println(user);
        o2 = model;
        //可以看到所有的model都是同一个对象
        System.out.println(o1==o2);
        //可以看到存储的user对象也是同一个
        System.out.println(user == o3);
        return "success";
    }

    @ModelAttribute
    public void MyModelAttribute(Model model){
        o1 = model;
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(12);
        user.setPassword("123");
        model.addAttribute("user",user);
        System.out.println("modelAttribute:"+user);
        o3 = user;
    }
}
