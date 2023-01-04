package com.EX2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formulaire
 */
@WebServlet("/formulaire")
public class formulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public formulaire() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("nom");
		String email = request.getParameter("email");
		String subject = request.getParameter("sujet");
		String msg = request.getParameter("msg");
		out.println("<!DOCTYPE html>\r\n"   //pour afficher les données saisies.
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Resultat</title>\r\n"
				+"<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" />"
				+"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\" crossorigin=\"anonymous\" defer></script>"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+"<div class=\"container my-4\">"
				+"<p>"+"Nom : "+name+"<br></p>"
				+"<p>"+"Email : "+email+ "<br></p>"
				+"<p>"+"Sujet : "+subject+"<br></p>"
				+"<p>"+"Message : "+msg+"<br></p>"
				+"</div>"
				+ "</body>\r\n"
				+ "</html>");
	}
}
