package com.devway.tomcat.response;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * TestSetHeader class
 *
 * @author devway
 * @date 2017-12-07
 */
public class TestSetHeader extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);

        //set***方法，如果有同名的报文头则替换，而add***方法，则即使报文头已存在，也添加一个同名的新的报文头
        resp.setHeader("headerName ","headerValue");
        resp.setDateHeader("headerDate",System.currentTimeMillis());
        resp.setIntHeader("headerInt",1001);

        resp.addHeader("headerName","headerValue1");
        resp.addDateHeader("headerDate",System.currentTimeMillis()+1000000);
        resp.addIntHeader("headerInt",1002);

        resp.setContentType("text/html;charset=\"utf-8\"");
        //resp.setContentLength(200);

        resp.addCookie(new Cookie("c","c1"));

        //指定服务器支持的请求方法（GET、POST等），405响应需要用到这个报文头
        resp.setHeader("allow","GET");

        //告诉客户端，什么环境可以安全的缓存文档
        //resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Cache-Control","public");

        //resp.setContentType("application/vnd.ms-excel;charset=utf-8");
        //resp.setHeader("Content-Disposition","attachment;filename=autowiring.xls");

        //设置内容的过期时间
        resp.setDateHeader("Expires",10*1000);
        println("test");

        //resp.setHeader("Refresh","2");
        //resp.setHeader("refresh","3;URL=\"http://www.baidu.com\"");
        //resp.setIntHeader("Refresh",2);

    }
}
