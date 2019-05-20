package com.chainsys.sms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.StudentDetailsDOA;
import com.chainsys.sms.model.Student_details;

/**
 * Servlet implementation class FeesServlet
 */
@WebServlet("/FeesServlet")
public class FeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int year = Integer.parseInt(request.getParameter("year"));
		StudentDetailsDOA detailsDOA =new StudentDetailsDOA();
		try {
			List<Student_details> detailslist=detailsDOA.fees(year);
			request.setAttribute("DETAILSLIST", detailslist);
			RequestDispatcher rd=request.getRequestDispatcher("fees.jsp");
			rd.forward(request, response);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}

}
