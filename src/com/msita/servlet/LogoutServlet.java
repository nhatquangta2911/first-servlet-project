package com.msita.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "logout-servlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        HttpSession session =  req.getSession();
//        session.setAttribute("username", null);
//        session.invalidate();
//        out.print("You have successfully logged out! ");
        CookieUtils.removeCookie(req, resp, "username");
        resp.sendRedirect("/login");
    }
}
