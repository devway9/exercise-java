package com.devway.tomcat.request;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;


/**
 * TestGzip class
 *
 * @author devway
 * @date 2017-12-06
 */
public class TestGzip extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        if (isSupportGzip(req)) {
            out = new PrintWriter(new GZIPOutputStream(resp.getOutputStream()));
            resp.setHeader("Content-Encoding", "gzip");
        } else {
            out = resp.getWriter();
        }

        for (int i = 0; i < 100000; i++) {
            println(i + ":This is a test for gzip.");
        }

    }


    //判断浏览器是否支持gzip压缩
    private boolean isSupportGzip(HttpServletRequest req) {
        String acceptEncoding = req.getHeader("Accept-Encoding");
        if (acceptEncoding != null && acceptEncoding.contains("gzip")) {
            return true;
        }
        return false;
    }

}
