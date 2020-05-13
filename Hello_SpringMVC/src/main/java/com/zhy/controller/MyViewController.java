package com.zhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: MyViewController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/13 22:05
 * @Version: 1.0
 **/
@Controller
public class MyViewController {
    @RequestMapping("/myview")
    public String myView(Model model){
        model.addAttribute("msb","马士兵");
        return "msb:/index";
    }
}
