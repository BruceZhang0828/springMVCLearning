package com.zhy.controller;

import com.zhy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: DataValidateController
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/14 15:29
 * @Version: 1.0
 **/
@Controller
public class DataValidateController {

    @RequestMapping("/dataValidate")
    public String validate(@Valid User user, BindingResult bindingResult, Model model) {
        System.out.println(user);
        Map<String,Object> errorsMap = new HashMap<String, Object>();
        if (bindingResult.hasErrors()) {
            System.out.println("验证失败");
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());
                System.out.println(fieldError.getField());
                errorsMap.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            model.addAttribute("errorInfo",errorsMap);
            return "add";
        } else {
            System.out.println("验证成功");
            return "success";
        }
    }



    @RequestMapping("add")
    public String add(Model model){
        model.addAttribute("user",new User(1,"zhangsan",12,"女",null,"1234@qq.com"));
        return "add";
    }
}
