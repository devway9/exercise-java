package com.devway.tomcat.session;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TestSession class
 *
 * @author devway
 * @date 2017-12-07
 */
public class TestSession extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        HttpSession session = req.getSession(true);
        System.out.println(session.getClass());
        println("sessionId=" + session.getId() + ":count=" + session.getAttribute("count"));

        int count = 0;
        if (session.getAttribute("count") == null) {
            count = 1;
        } else {
            count = Integer.parseInt((String) session.getAttribute("count")) + 1;
        }
        session.setAttribute("count", String.valueOf(count));
    }
}
