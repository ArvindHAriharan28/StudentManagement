package com.chainsys.sms.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.AttendanceDOA;
import com.chainsys.sms.model.Attendance;
import com.chainsys.sms.model.Student_details;

/**
 * Servlet implementation class AttendDetailsServlet
 */
@WebServlet("/AttendDetailsServlet")
public class AttendDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendDetailsServlet() {
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
	//	Attendance attendance = new Attendance();
		
		Student_details details = new Student_details();
		long rollno = Long.parseLong(request.getParameter("rollno"));
		LocalDate curdate=LocalDate.parse(request.getParameter("date"));
		String status = request.getParameter("attendance");
		Attendance attend=new Attendance();
		//Attendance attend1=new Attendance();
details.setRollno(rollno);

		attend.setDetails(details);
		attend.setCurrentDate(curdate);
		attend.setStatus(status);
		
		AttendanceDOA attendDoa=new AttendanceDOA();
		try {
			attendDoa.add(attend);
			RequestDispatcher rd=request.getRequestDispatcher("AttendanceList.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
