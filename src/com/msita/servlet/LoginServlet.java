package com.msita.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "login-servlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    // 1 Renew Request
    // 2
    // 3 Browser doesn't know (forward)

    // 1. Session la 1 phien lam viec giua 1 browser va 1 server (Sau khi bat tay 3 buoc, trong mo hinh OSI
    //    defaut trong tomcat: gia tri session chi 30p => nhung van co the set Timeout cho no
    // 2. Cookie la 1 text file browser luu trong local => van luu khi tat trinh duyet
    //  Trong response tra ve cho browser => luu vao local
    //  Sau nay khi gui request, gui kem cookie (chua trong header) => server doc header ...
    //  TUY VAO MUC DICH SU DUNG .Neu muon luu thong tin chi co gia tri trong 1 phien lam biec => session

    CookieUtils cookieUtils = new CookieUtils();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if (userName.equals("user01") && password.equals("123456")) {
//            HttpSession session = req.getSession();
//            session.setAttribute("username", userName);

            cookieUtils.addCookie(resp, "username", "userName", 60*60);
            resp.sendRedirect("/welcome");
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/jsp/login.jsp");
            String error = "USERNAME OR PASSWORD IS MIGHT NOT CORRECT !!!";
            req.setAttribute("errorMessage", error);
            requestDispatcher.forward(req, resp);
        }
    }
}
