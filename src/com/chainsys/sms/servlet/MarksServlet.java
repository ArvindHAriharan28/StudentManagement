package com.chainsys.sms.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.StudentDetailsDOA;
import com.chainsys.sms.model.Student_details;

/**
 * Servlet implementation class MarksServlet
 */
@WebServlet("/MarksServlet")
public class MarksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String department = request.getParameter("department");
		int rollno = Integer.parseInt(request.getParameter("roll"));
		StudentDetailsDOA nameListDAO = new StudentDetailsDOA();
		try {
		/*	ArrayList<Object> nameList = nameListDAO.List(department,semester);*/
			Map<String,String> nameList = nameListDAO.List(department,rollno);
			request.setAttribute("NAMELIST", nameList);
			System.out.println(nameList.size());
			RequestDispatcher rd = request.getRequestDispatcher("marks.jsp");
			rd.forward(request, response);
			} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
