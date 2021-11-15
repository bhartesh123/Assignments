import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	private LoginService loginservice=new LoginService();
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException{
	
	

		 request.getRequestDispatcher("/bhartesh.com/view/login.jsp").forward(request,
				  response);
	 
	//  PrintWriter out=response.getWriter(); out.println("Bhartesh is Good");
	
	 
	  }
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	  ServletException, IOException{
	  	
		  String name=request.getParameter("name"); System.out.println(name);
		  //request.setAttribute("name", request.getParameter("name"));
		  //request.setAttribute("password", request.getParameter("password"));
		  //System.out.println(name);
		  String password=request.getParameter("password");
		  System.out.println(password);
		 boolean isValid= loginservice.validate(name,password);
		 if(isValid) {
			 request.setAttribute("name", request.getParameter("name"));
		  	  request.getRequestDispatcher("/bhartesh.com/view/helloworld.jsp").forward(request,
		  	  response);
		
		  
		 }
		 else {
			 request.setAttribute("Error", "Invalid Credentials..!");
			 request.getRequestDispatcher("/bhartesh.com/view/login.jsp").forward(request,
					  response);
		 }
			/*
			 * PrintWriter out=response.getWriter(); out.println("Bhartesh is Good");
			 * 
			 */
	  	 
	  	  }

}
