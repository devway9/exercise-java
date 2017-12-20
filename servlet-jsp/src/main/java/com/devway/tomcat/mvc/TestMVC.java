package com.devway.tomcat.mvc;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestMVC class
 *
 * @author devway
 * @date 2017-12-08
 */
public class TestMVC extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String address = "/WEB-INF/test.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(address);
        System.out.println(req.getClass());
        System.out.println(dispatcher.getClass());
        dispatcher.forward(req, resp);
    }

}
