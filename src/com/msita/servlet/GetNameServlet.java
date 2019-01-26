package com.msita.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "get-name-servlet", urlPatterns = "/get-name")
public class GetNameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/get-name.jsp");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        if (session.getAttribute("username") != null) {
            req.getRequestDispatcher("/WEB-INF/jsp/get-name.jsp").forward(req, resp);
        } else {
            out.print("Please Login first!");
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String output = "Welcome to our fantastic world, " + name + " !";
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/get-name.jsp");
        req.setAttribute("output", output);
        requestDispatcher.forward(req, resp);
    }
}
