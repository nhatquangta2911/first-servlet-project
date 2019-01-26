package com.msita.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {

    // private de ko tao instance dc
    private CookieUtils() {
    }

    static void addCookie(HttpServletResponse response, String name, String value, int age) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(age);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    static void removeCookie(HttpServletRequest request ,HttpServletResponse response, String name) {
        Cookie cookie = getCookie(request, name);
        if (cookie == null) {
            return;
        }
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    static Cookie getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies =  request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(name)) {
                return cookie;
            }
        }
        return null;
    }
}
