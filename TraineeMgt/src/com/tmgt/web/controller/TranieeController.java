package com.tmgt.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tmgt.model.dao.Traniee;
import com.tmgt.model.service.TranieeService;
import com.tmgt.model.service.TranieeServiceImpl;

@WebServlet("/TranieeController.do")
public class TranieeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TranieeService traineeService = new TranieeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action==null) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/home.jsp");
			rd.forward(request, response);
		}

		else if (action.equalsIgnoreCase("show")) {
			List<Traniee> trainees = traineeService.getAllTraniee();
			request.setAttribute("trainees", trainees);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/show.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String branch = request.getParameter("branch");
		
		Double percentage = Double.parseDouble(request.getParameter("percentage"));
		
		Traniee newTrainee = new Traniee(name, branch, percentage);
		traineeService.addTraniee(newTrainee);
		
		List<Traniee> trainees = traineeService.getAllTraniee();
		
		request.setAttribute("trainees", trainees);
		response.sendRedirect("TraineeManagement.do?action=show");
	}

}
