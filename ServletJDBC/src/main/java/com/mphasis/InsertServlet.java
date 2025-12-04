package com.mphasis;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter printWriter = response.getWriter();
		ServletContext context = request.getServletContext();
		String insertQurey = "insert into stu value(?,?,?,?)";
		
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("user");
		String pwd = context.getInitParameter("pwd");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String Sid = request.getParameter("id");
		String Smarks= request.getParameter("mark");
		
		int id = Integer.parseInt(Sid);
		int marks = Integer.parseInt(Smarks);
		
		
			try {
				Class.forName(driver);
				Connection connection = DriverManager.getConnection(url,user,pwd);
				//printWriter.println("connected");
				PreparedStatement preparedStatement = connection.prepareStatement(insertQurey);
				
				preparedStatement.setString(1, fname);
				preparedStatement.setString(2, lname);
				preparedStatement.setInt(3, id);
				preparedStatement.setInt(4, marks);
				preparedStatement.executeUpdate();
				printWriter.println("Value Inserted");
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
