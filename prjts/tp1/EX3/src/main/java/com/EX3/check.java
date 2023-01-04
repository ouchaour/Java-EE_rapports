package com.EX3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class check
 */
@WebServlet("/check")
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public check() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("pass");
		
		if(id.equals("Youssef") && password.equals("abcd123")) {
			
		out.print("<h2>"+"Welcome "+ id 
				+" You are connected successfully"
				+"</h2>"+"<br>"
				+"ID = "+id
				+"<br>"
				+"Password = "+password);
		}else {
			this.getServletContext().getRequestDispatcher("/login.html").forward(request, response);
		}
		
	}
}
