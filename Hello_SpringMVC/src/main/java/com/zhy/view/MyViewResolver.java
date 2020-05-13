package com.zhy.view;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @ClassName: MyViewResolver
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/13 22:06
 * @Version: 1.0
 **/
public class MyViewResolver implements ViewResolver, Ordered {

    private int order = 0;

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        //如果前缀是msb:开头的就进行解析
        if (viewName.startsWith("msb:")){
            System.out.println("msb:");
            return new MyView();
        }else{
            //如果不是，则直接返回null
            return null;
        }
    }


    @Override
    public int getOrder() {
        return this.order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
