package com.chainsys.sms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.AttendanceDOA;
import com.chainsys.sms.model.Attendance;

/**
 * Servlet implementation class StudentAttendServlet
 */
@WebServlet("/StudentAttendServlet")
public class StudentAttendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAttendServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalDate fromDate=LocalDate.parse(request.getParameter("from"));
		LocalDate toDate=LocalDate.parse(request.getParameter("to"));
		Attendance attend=new Attendance();
		attend.setFrom(fromDate);
		attend.setTo(toDate);
		AttendanceDOA attendDOA= new AttendanceDOA();
		try {
			List<Attendance> attendlist=attendDOA.studentAttend(attend);
			request.setAttribute("ATTENDANCE", attendlist);
			RequestDispatcher rd=request.getRequestDispatcher("studentAttendance.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
