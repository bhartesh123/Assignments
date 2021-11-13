package com.in28minutes.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
				request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String amount = request.getParameter("amount");
		String time = request.getParameter("time");
		String rate= request.getParameter("rate");
		Integer n1=Integer.parseInt(amount);
		Integer n2=Integer.parseInt(time);
		Integer n3=Integer.parseInt(rate);
		double x;
		x=(n1*n2*n3)/100;
		System.out.println(x);
		request.setAttribute("amount", n1);
		request.setAttribute("time", n2);
		request.setAttribute("rate", n3);
		request.setAttribute("x", x);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward( request,response);
		System.out.println("Amount = "+n1);
		System.out.println("Time= "+n2);
		System.out.println("rate=" +n3);
		
		
		//boolean isValidUser = service.validateUser(name, password);
		/*
		 * if (isValidUser) { request.setAttribute("name", name);
		 * request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward( request,
		 * response); } else { request.setAttribute("errorMessage",
		 * "Invalid Credentials!!");
		 * request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,
		 * response); }
		 */
		
	}

}