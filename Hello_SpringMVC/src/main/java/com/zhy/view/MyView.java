package com.zhy.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ClassName: MyView
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/13 22:08
 * @Version: 1.0
 **/
public class MyView implements View {

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("保存的对象是："+model);
        response.setContentType("text/html");
        response.getWriter().write("欢迎加入马士兵教育");
    }

    /**
     * 返回数据内容的类型
     * @return
     */
    @Override
    public String getContentType() {
        return "text/html";
    }
}
