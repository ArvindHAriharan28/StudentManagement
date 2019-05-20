package com.chainsys.sms.doa;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chainsys.sms.model.Attendance;
import com.chainsys.sms.model.Fees;
import com.chainsys.sms.util.ConnectionUtil;

public class AttendanceDOA {

	public void add(Attendance attendance) throws Exception{
		try {
			
			java.sql.Connection connection = ConnectionUtil.getConnection();
			String sql="insert into trn_attendence values(attendance_id_seq.NEXTVAL,?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setLong(1,attendance.getDetails().getRollno());
			preparedStatement.setDate(2, Date.valueOf(attendance.getCurrentDate()));
			preparedStatement.setString(3, attendance.getStatus());
			LocalDate cur=LocalDate.now();
			preparedStatement.setDate(4, Date.valueOf(cur));
			//int rows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		throw new Exception("unable to insert");
		}
	}
	public  ArrayList<Attendance> studentAttend(Attendance attendance)
			throws ClassNotFoundException, SQLException  {
		ArrayList<Attendance> list = new ArrayList<>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql="select * from trn_attendence where cur_date between ? and ? and REGISTER_ID=76543";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setDate(1,Date.valueOf(attendance.getFrom())); 
		preparedStatement.setDate(2,Date.valueOf(attendance.getTo()));
		ResultSet resultset = preparedStatement.executeQuery();
		//list.detailslist=null;
		while (resultset.next()) {
			Attendance attend = new Attendance();

			attend.setCurrentDate(resultset.getDate("cur_date").toLocalDate());
			attend.setStatus(resultset.getString("status"));
			list.add(attend);
		}
		return list;
	}
	public void addFees(Fees fees) throws Exception{
		try {
			
			java.sql.Connection connection = ConnectionUtil.getConnection();
			String sql="insert into fees values(fees_id_seq.NEXTVAL,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setLong(1,fees.getDetails().getRollno());
			preparedStatement.setLong(2, fees.getFees());
			LocalDate cur=LocalDate.now();
			preparedStatement.setDate(3, Date.valueOf(cur));
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		throw new Exception("unable to insert");
		}
	}
	}
