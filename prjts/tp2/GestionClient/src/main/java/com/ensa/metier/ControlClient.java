package com.ensa.metier;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControlClient")
public class ControlClient extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			//we recupe the informations of the form
		
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String tele = request.getParameter("tele");
			String adress = request.getParameter("adress");
			String pay = request.getParameter("pay");
			String ville = request.getParameter("ville");
			String etre = request.getParameter("etre");
			String fct = request.getParameter("fct");
			String email = request.getParameter("email");
			String age = request.getParameter("age");
			String fb = request.getParameter("fb");
	
			response.setContentType("text/html");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnn;
			try {
				cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/base_clients", "root", "");
				java.sql.Statement stmt = cnn.createStatement();

				String sql = "insert into table_client VALUES('" + nom + "','" + prenom + "','" + tele + "','" + adress
						+ "','" + pay + "','" + ville + "','" + etre + "','" + fct + "','" + email + "','" + age + "','"
						+ fb + "')";

				stmt.executeUpdate(sql);
				cnn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
