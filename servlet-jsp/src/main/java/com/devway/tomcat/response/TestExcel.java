package com.devway.tomcat.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TestExcel class
 *
 * @author devway
 * @date 2017-12-07
 */
public class TestExcel extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/vnd.ms-excel");
        PrintWriter out = resp.getWriter();
        out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
        out.println("Apples\tautowiring\t2\t3\t4\t=SUM(B2:E2)");
        out.println("Oranges\t2\t2\t3\t4\t=SUM(B3:E4)");
    }

}
