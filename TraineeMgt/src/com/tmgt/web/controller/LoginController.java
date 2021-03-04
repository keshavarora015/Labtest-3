package com.tmgt.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tmgt.exception.UserNotFoundException;
import com.tmgt.model.service.UserService;
import com.tmgt.model.service.UserServiceImpl;
import com.tmgt.userdao.User;



@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			User user = userService.getUser(username, password);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("TranieeController.do");
		}catch(UserNotFoundException e) {
			response.sendRedirect("login.jsp?error=login failed!");
		}
	}

}
