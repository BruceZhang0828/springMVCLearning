package com.zhy.controller;

import com.zhy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ConvertUserController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/14 10:50
 * @Version: 1.0
 **/
@Controller
public class ConvertUserController {

    /**
     * @Description 转化数据
     * @Date 10:49 2020/5/14
     * @Param [user, model]
     * @return java.lang.String
     **/
    @RequestMapping("/convertUser")
    public String add(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
