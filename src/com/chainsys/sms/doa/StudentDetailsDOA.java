package com.chainsys.sms.doa;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.chainsys.sms.model.Student_details;
import com.chainsys.sms.util.ConnectionUtil;

public class StudentDetailsDOA {
	public void add(Student_details student_details) throws Exception {
		try {
	java.sql.Connection connection = ConnectionUtil.getConnection();
	String sql = "insert into trn_student_details(student_id,rollno,student_name,email,phoneno,department,year,address,sslc_school,"
			+ "sslc_mark,hsc_school,hscc_mark,aadhar,father_name,mother_name,father_occupation,mother_occupation,annual_income,create_date,password) values"
			+ "(student_id_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement preparedStatement = connection
	.prepareStatement(sql);
	preparedStatement.setLong(1, student_details.getRollno());
	preparedStatement.setString(2, student_details.getStudentName());
	preparedStatement.setString(3, student_details.getEmail());
	preparedStatement.setLong(4, student_details.getPhone_number());
	preparedStatement.setInt(5, student_details.getDepartment());
	preparedStatement.setInt(6, student_details.getYear());
	preparedStatement.setString(7, student_details.getAddress());
	preparedStatement.setString(8, student_details.getSslc_school());
	preparedStatement.setInt(9, student_details.getSslc_mark());
	preparedStatement.setString(10, student_details.getHsc_school());
	preparedStatement.setInt(11, student_details.getHsc_mark());
	preparedStatement.setLong(12, student_details.getAaadhar());
	preparedStatement.setString(13, student_details.getFather_name());
	preparedStatement.setString(14, student_details.getMother_name());
	preparedStatement.setString(15, student_details.getFather_occupation());
	preparedStatement.setString(16, student_details.getMother_occupation());
	preparedStatement.setLong(17, student_details.getAnnual_income());
	preparedStatement.setDate(18, Date.valueOf(student_details.getCreatedDate()));
	preparedStatement.setString(19, student_details.getPassword());

	@SuppressWarnings("unused")
	int rows = preparedStatement.executeUpdate();
	} catch (SQLException e) {
	e.printStackTrace();
	throw new Exception("unable to insert");
	}
	}
	

	public Map<String,String> List(String department, int rollno) throws SQLException, ClassNotFoundException {
		//ArrayList<Object> nameList = new ArrayList<>();
		Map<String,String> map=new HashMap<String,String>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql = "select s.student_name as sname,e.sub_name as ename from trn_student_details\r\n" + 
				"s inner join department d \r\n" + 
				"on s.department = d.dept_id\r\n" + 
				" join semester c on s.department=c.sem_id\r\n" + 
				"inner join subject e on c.sem_id= e.department\r\n" + 
				"where  rollno=? and name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, rollno); 
		preparedStatement.setString(2, department);
		ResultSet resultset = preparedStatement.executeQuery();
		
		while (resultset.next()) {
		/*	Student_details names = new Student_details();
			Subject sub_name = new Subject();
			names.setStudentName(resultset.getString("sname"));
			sub_name.setSubName(resultset.getString("ename"));
			nameList.add(names);
			nameList.add(sub_name);*/
			map.put(resultset.getString("ename"), resultset.getString("sname"));
		}
		return map;
	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static ArrayList<Student_details> detailsDAO() throws ClassNotFoundException, SQLException {
		
		ArrayList<Student_details> list = new ArrayList<>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql = "select rollno,student_name,address,phoneno from trn_student_details where student_name='Arvind'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultset = preparedStatement.executeQuery();
		while (resultset.next()) {
			Student_details student_details = new Student_details();
			student_details.setRollno(resultset.getInt("rollno"));
			student_details.setStudentName(resultset.getString("student_name"));
			student_details.setAddress(resultset.getString("address"));
			student_details.setPhone_number(resultset.getLong("phoneno"));
			list.add(student_details);
		}
		return list;
	}
	
	public ArrayList<Student_details> detailsDOA(int year,int departmentno) throws ClassNotFoundException, SQLException{
		ArrayList<Student_details> list = new ArrayList<>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql ="select rollno from  trn_student_details where year=? and department=?";
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, year);
		preparedStatement.setInt(2, departmentno);
		ResultSet resultset = preparedStatement.executeQuery();
		while (resultset.next()) {
			Student_details student_details = new Student_details();
			student_details.setRollno(resultset.getInt("rollno"));
			list.add(student_details);
		}
		return list;
	}
	public ArrayList<Student_details> fees(int year) throws ClassNotFoundException, SQLException{
		ArrayList<Student_details> list = new ArrayList<>();
		java.sql.Connection connection = ConnectionUtil.getConnection();
		String sql ="select rollno from  trn_student_details where year=? ";
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, year);
		ResultSet resultset = preparedStatement.executeQuery();
		while (resultset.next()) {
			Student_details student_details = new Student_details();
			student_details.setRollno(resultset.getInt("rollno"));
			list.add(student_details);
		}
		return list;
	}
	
}
