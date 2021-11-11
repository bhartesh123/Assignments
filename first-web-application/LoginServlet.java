import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(urlPatterns = "/login1.do")
public class LoginServlet extends HttpServlet{
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException{
		  String name=request.getParameter("name");
		  System.out.println(name);
		  request.setAttribute("name", name);
		  request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		  
	/*
	 * PrintWriter out=response.getWriter(); out.println("Bhartesh is Good");
	 * out.println("Bhartesh is Good and Titu also");
	 */
	  }


}
