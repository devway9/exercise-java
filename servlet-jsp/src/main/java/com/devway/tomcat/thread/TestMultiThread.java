package com.devway.tomcat.thread;

import com.devway.tomcat.common.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestMultiThread class
 *
 * @author devway
 * @date 2017-12-08
 */
public class TestMultiThread extends BaseServlet {
    private static int num = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        try {
            for (int i = 0; i < 30; i++) {
                num = num + 1;
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getId()+":"+String.valueOf(i)+","+String.valueOf(num));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
