package Metier;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entities.Etudiant;



@WebServlet("/SaveEtudiant")
public class SaveEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveEtudiant() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Etudiant> listEtd = new ArrayList<Etudiant>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnn;
            try {
            	cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiants", "root", "");
    			
    			PreparedStatement ps = (PreparedStatement) cnn.prepareStatement("select * from tetudiant");
    			ResultSet rs = ps.executeQuery();
    			while (rs.next()) {
    				Etudiant e = new Etudiant();
    				e.setCode(rs.getString(1));
    				e.setNom(rs.getString(2));
    				e.setPrenom(rs.getString(3));
    				e.setAge(rs.getInt(4));
    				e.setVille(rs.getString(5));
    				listEtd.add(e);
    			}
    			rs.close();
    	         
    			cnn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		request.setAttribute("lst", listEtd);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age = Integer.parseInt(request.getParameter("age"));
		String ville = request.getParameter("ville");

		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection cnn;
			 try {
				 cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbetudiants", "root", "");
			 	java.sql.Statement stmt = cnn.createStatement();
			 	String sql = "insert into tetudiant VALUES('" + code + "','" + nom + "','" + prenom + "','" + age
					 + "','" + ville + "')";
			 	stmt.executeUpdate(sql);
			 	cnn.close();
			 } catch (SQLException e) {
				 e.printStackTrace();
			 	}
			 } catch (ClassNotFoundException e) {
				 e.printStackTrace();
			 	}
		 doGet(request, response);
	}
}
