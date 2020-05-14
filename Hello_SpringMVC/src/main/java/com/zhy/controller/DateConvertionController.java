package com.zhy.controller;

import com.zhy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: DateConvertionController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/14 11:00
 * @Version: 1.0
 **/
@Controller
public class DateConvertionController {

    @RequestMapping("dateConvertion")
    public String dateConvertion(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
