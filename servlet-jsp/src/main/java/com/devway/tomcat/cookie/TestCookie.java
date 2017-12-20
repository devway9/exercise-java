package com.devway.tomcat.cookie;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestCookie class
 *
 * @author devway
 * @date 2017-12-07
 */
public class TestCookie extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        boolean isNew = true;
        int num = 1;
        String uid = req.getParameter("uid");

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (uid != null & uid.equals(cookie.getName())) {
                    isNew = false;
                    num = Integer.parseInt(cookie.getValue()) + 1;
                }
            }
        }

        Cookie c = new Cookie(uid, String.valueOf(num));
        c.setComment(uid + "Comment");
        c.setMaxAge(60);
        resp.addCookie(c);
        println("欢迎" + c.getName() + "第" + c.getValue() + "次访问。");
    }
}
