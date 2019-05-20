package com.chainsys.sms.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.StudentDetailsDOA;
import com.chainsys.sms.model.Student_details;

/**
 * Servlet implementation class StudentDetailsServlet
 */
@WebServlet("/StudentDetailsServlet")
public class StudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentDetailsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long rollno = Long.parseLong(request.getParameter("rollNumber"));
		System.out.println(rollno);
		String student_name = request.getParameter("fullName");
		String email = request.getParameter("email");
		long phoneno = Long.parseLong(request.getParameter("phoneNumber"));		
		int departmentno = 0;
		String department = (request.getParameter("department"));
		
		if(department.equals("CSE")) {
			departmentno=1;
		}
		if(department.equals("ECE")) {
			departmentno=2;
		}
		if(department.equals("EEE")) {
			departmentno=3;
		}
		int year = Integer.parseInt(request.getParameter("year"));
		String address = request.getParameter("address");
		String sslc_school = request.getParameter("sslc");
		int sslc_mark = Integer.parseInt(request.getParameter("markSslc"));
		String hsc_school = request.getParameter("hsc");
		int hsc_mark = Integer.parseInt(request.getParameter("markHsc"));
		long aadhar = Long.parseLong(request.getParameter("aadhar"));
		String father_name = request.getParameter("fatherName");
		String mother_name = request.getParameter("matherName");
		String father_occup = request.getParameter("fatherOccupation");
		String mother_occup = request.getParameter("matherOccupation");
		long annual_income = Long.parseLong(request.getParameter("annual"));
		String password = request.getParameter("password");

		Student_details student_details = new Student_details();

		student_details.setRollno(rollno);
		student_details.setStudentName(student_name);
		student_details.setEmail(email);
		student_details.setPhone_number(phoneno);
		student_details.setDepartment(departmentno);
		student_details.setYear(year);
		student_details.setAddress(address);
		student_details.setSslc_school(sslc_school);
		student_details.setSslc_mark(sslc_mark);
		student_details.setHsc_school(hsc_school);
		student_details.setHsc_mark(hsc_mark);
		student_details.setAaadhar(aadhar);
		student_details.setCreatedDate(LocalDate.now());
		student_details.setFather_name(father_name);
		student_details.setFather_occupation(father_occup);
		student_details.setMother_name(mother_name);
		student_details.setMother_occupation(mother_occup);
		student_details.setAnnual_income(annual_income);
		student_details.setPassword(password);
		
		

	StudentDetailsDOA detailsDOA =new StudentDetailsDOA();
		try {
			detailsDOA.add(student_details);
			RequestDispatcher rd = request.getRequestDispatcher("adminhome.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
