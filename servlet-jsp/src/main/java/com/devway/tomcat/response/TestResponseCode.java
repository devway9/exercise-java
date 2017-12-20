package com.devway.tomcat.response;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestResponseCode class
 *
 * @author devway
 * @date 2017-12-06
 */
public class TestResponseCode extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        //resp.setStatus(204);

        //resp.setStatus(307);
       // resp.setHeader("Location","http://www.baidu.com");

        //505
        //System.out.println(autowiring/0);

        out.println("测试setStatus："+resp.getStatus());

        //重定向
        //resp.sendRedirect("http://www.baidu.com");

       //resp.sendError(405,"页面错误");

    }
}
