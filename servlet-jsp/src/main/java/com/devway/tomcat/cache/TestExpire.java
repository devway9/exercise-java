package com.devway.tomcat.cache;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * TestExpire class *
 *
 * @author devway
 * @date 2017-12-08
 */
public class TestExpire extends BaseServlet {
    private static int i;
    private static long time = System.currentTimeMillis();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        /*resp.setDateHeader("Expires", System.currentTimeMillis() + 50000);
        resp.setHeader("Cache-Control","public");
        resp.setHeader("Pragma","Pragma");*/
        //Last-Modified:页面的最后生成时间
        resp.setDateHeader("Last-Modified",new Date().getTime());
        //Expires:过时期限值
        resp.setDateHeader("Expires", new Date().getTime() + 20000);
        //Cache-Control来控制页面的缓存与否,public:浏览器和缓存服务器都可以缓存页面信息；
        resp.setHeader("Cache-Control", "public");
        //Pragma:设置页面是否缓存，为Pragma则缓存，no-cache则不缓存
        resp.setHeader("Pragma", "Pragma");
        println(String.valueOf(i++));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>service");
        super.service(req, resp);
    }

}
