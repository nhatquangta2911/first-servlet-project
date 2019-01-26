package com.msita.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

@WebServlet(name = "welcome-servlet", urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
//        PrintWriter out = resp.getWriter();
//        HttpSession session = req.getSession();
//        if (session.getAttribute("username") != null) {
//            req.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(req, resp);
//        } else {
//            out.print("Please Login first!");
//            resp.sendRedirect("/login");
//        }

        if(CookieUtils.getCookie(req, "username") != null) {
            req.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }
}
