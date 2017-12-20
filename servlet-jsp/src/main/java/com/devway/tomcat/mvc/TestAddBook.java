package com.devway.tomcat.mvc;

import com.devway.tomcat.bean.Book;
import com.devway.tomcat.common.BaseServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestAddBook class
 *
 * @author devway
 * @date 2017-12-08
 */
public class TestAddBook extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        Book book = new Book();
        book.setBookName(req.getParameter("bookName"));
        book.setPageNo(Integer.parseInt(req.getParameter("pageNo")));
        book.setDesc(req.getParameter("bookName")+":"+req.getParameter("desc"));
        req.setAttribute("name","bookName");
        req.setAttribute("book",book);
        req.setAttribute("scope","request");
        req.getSession().setAttribute("scope","session");
        req.getServletContext().setAttribute("scope","context");
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/mvc/addBookResult.jsp");
        dispatcher.forward(req,resp);

    }
}
