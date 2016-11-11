package com.example.servlet;

import com.example.service.HelloService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by G on 2016/10/11.
 */
public class HelloServlet extends HttpServlet {

    private HelloService helloService = new HelloService();

    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @java.lang.Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hello = helloService.hello();
        PrintWriter pw = resp.getWriter();
        pw.print(hello);
        pw.flush();
        pw.close();
    }
}
