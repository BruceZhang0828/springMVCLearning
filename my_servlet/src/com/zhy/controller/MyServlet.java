package com.zhy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: MyServlet
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/8 10:03
 * @Version: 1.0
 **/
public class MyServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method.equals("add")){
            req.getSession().setAttribute("msg","add");
        }else if(method.equals("sub")){
            req.getSession().setAttribute("msg","sub");
        }
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }


}
