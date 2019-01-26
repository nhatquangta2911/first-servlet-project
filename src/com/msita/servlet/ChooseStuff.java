package com.msita.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "choose-stuff-servlet", urlPatterns = "/choose-stuff")
public class ChooseStuff extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/choose-stuff.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product = req.getParameter("choose-product");
        String result = "Your product is " + product;
        req.setAttribute("result", result);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/choose-stuff.jsp");
        requestDispatcher.forward(req, resp);
    }
}
