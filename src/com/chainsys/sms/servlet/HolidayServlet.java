package com.chainsys.sms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.sms.doa.HolidayDOA;
import com.chainsys.sms.model.Holiday;

/**
 * Servlet implementation class HolidayServlet
 */
@WebServlet("/HolidayServlet")
public class HolidayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HolidayServlet() {
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
		// TODO Auto-generated method stub
		
		LocalDate fromDate=LocalDate.parse(request.getParameter("from"));
		LocalDate toDate=LocalDate.parse(request.getParameter("to"));
		Holiday holiday=new Holiday();
		holiday.setFromdate(fromDate);
		holiday.setTodate(toDate);
		HolidayDOA holidayDOA=new HolidayDOA();
		try {
			ArrayList<Holiday> holi =holidayDOA.holidays(holiday);
			request.setAttribute("HOLIDAY", holi);
			RequestDispatcher rd=request.getRequestDispatcher("viewHoliday.jsp");
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
