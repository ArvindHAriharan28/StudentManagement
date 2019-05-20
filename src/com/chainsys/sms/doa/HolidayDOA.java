package com.chainsys.sms.doa;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.sms.model.Holiday;
import com.chainsys.sms.util.ConnectionUtil;

public class HolidayDOA {
	
	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static ArrayList<Holiday> holidays(Holiday holiday) throws ClassNotFoundException, SQLException {
		ArrayList<Holiday> list = new ArrayList<>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql = "select * from holiday where date_of_holiday between ? and ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setDate(1,Date.valueOf(holiday.getFromdate())); 
		preparedStatement.setDate(2,Date.valueOf(holiday.getTodate()));
		ResultSet resultset = preparedStatement.executeQuery();
		//list.detailslist=null;
		while (resultset.next()) {
			Holiday holiday1 = new Holiday();
			holiday1.setLeaveDate(resultset.getDate("date_of_holiday").toLocalDate());
			holiday1.setReason(resultset.getString("reason_for_leave"));
			list.add(holiday1);
		}
		return list;
	}

}
