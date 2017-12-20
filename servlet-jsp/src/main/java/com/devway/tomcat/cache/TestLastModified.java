package com.devway.tomcat.cache;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestLastModified class
 * 使用此方法判断是否从客户端缓存获取页面，仅对Http get方法有效
 *
 * @author devway
 * @date 2017-12-08
 */
public class TestLastModified extends BaseServlet {
    private static int i;
    private static long time = System.currentTimeMillis();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        println(String.valueOf(i++));
    }

    /**
     * 该方法同时会设置Last-Modified的值
     *
     * @param req
     * @return
     */
    @Override
    protected long getLastModified(HttpServletRequest req) {
        return time;
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>service");
        super.service(req, resp);
    }
}
