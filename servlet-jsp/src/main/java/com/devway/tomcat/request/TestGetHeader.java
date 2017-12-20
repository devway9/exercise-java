package com.devway.tomcat.request;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * TestGetHeader class
 * Http报文头测试
 *
 * @author devway
 * @date 2017-12-06
 */
public class TestGetHeader extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        testPath(req, resp);
        testHeaderMethod(req, resp);
    }

    /**
     * 获取url相关方法
     *
     * @param req
     * @param resp
     */
    private void testPath(HttpServletRequest req, HttpServletResponse resp) {
        // 访问地址为http://localhost/tomcat/testHeader?name=Jack&age=20&sex=M

        //http://localhost/servlet/testHeader
        StringBuffer url = req.getRequestURL();
        println("完整的URL地址为：" + url);

        // /tomcat/testHeader
        String uri = req.getRequestURI();
        println("URI地址（返回主机和端口后，请求参数前的部分）：" + uri);

        // /tomcat
        String contextPath = req.getContextPath();
        println("项目的根路径contextPath：" + contextPath);

        // /testHeader
        String servletPath = req.getServletPath();
        println("不包含项目名的地址servletPath：" + servletPath);

        String queryString = req.getQueryString();
        println("请求参数（仅支持GET方法）：" + queryString);
    }

    /**
     * 获取方法测试
     *
     * @param req
     * @param resp
     */
    private void testHeaderMethod(HttpServletRequest req, HttpServletResponse resp) {
        String authType = req.getAuthType();
        println("认证类型：" + authType);

        String remoteUser = req.getRemoteUser();
        println("登陆用户名：" + remoteUser);

        int contentLength = req.getContentLength();
        println("请求消息正文的长度：" + contentLength);

        String contentType = req.getContentType();
        println("正文的MIME类型：" + contentType);

        String method = req.getMethod();
        println("请求方法（GET、POST等）：" + method);

        String protocol = req.getProtocol();
        println("协议：" + protocol);

        //获取单个报文头的多个值
        Enumeration<String> headers = req.getHeaders("accept-language");
        while (headers.hasMoreElements()) {
            println("accept-language：" + headers.nextElement());
        }

        //获取所有报文头名称
        Enumeration<String> enums = req.getHeaderNames();
        println("所有HTTP头部信息：");
        while (enums.hasMoreElements()) {
            String element = enums.nextElement();
            println(">>>" + element + "=" + req.getHeader(element));
        }

        //获取Cookie
        Cookie[] cookies = req.getCookies();
        println("cookie的信息：");
        for (Cookie cookie : cookies) {
            println(">>>注释：" + cookie.getComment());
            println(">>>域名：" + cookie.getDomain());
            println(">>>名字：" + cookie.getName());
            println(">>>适用的路径：" + cookie.getPath());
            println(">>>值：" + cookie.getValue());
            println(">>>存活的时间：" + cookie.getMaxAge());
            println(">>>遵从的是否是安全协议：:" + cookie.getSecure());
            println(">>>遵从的协议版本：" + cookie.getVersion());
        }
    }
}
