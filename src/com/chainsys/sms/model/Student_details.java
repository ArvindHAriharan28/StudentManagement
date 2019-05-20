package com.chainsys.sms.model;

import java.time.LocalDate;

public class Student_details {
	
	private long rollno;
	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	private String email;
	private long phone_number;
	private int department;
	private int year;
	private String address;
	private String sslc_school;
	private int sslc_mark;
	private String hsc_school;
	private int hsc_mark;
	private long aaadhar;
	private String father_name;
	private String mother_name;
	private String father_occupation;
	private String mother_occupation;
	private long annual_income;
	private LocalDate createdDate;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public long getRollno() {
		return rollno;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSslc_school() {
		return sslc_school;
	}
	public void setSslc_school(String sslc_school) {
		this.sslc_school = sslc_school;
	}
	public int getSslc_mark() {
		return sslc_mark;
	}
	public void setSslc_mark(int sslc_mark) {
		this.sslc_mark = sslc_mark;
	}
	public String getHsc_school() {
		return hsc_school;
	}
	public void setHsc_school(String hsc_school) {
		this.hsc_school = hsc_school;
	}
	public int getHsc_mark() {
		return hsc_mark;
	}
	public void setHsc_mark(int hsc_mark) {
		this.hsc_mark = hsc_mark;
	}
	public long getAaadhar() {
		return aaadhar;
	}
	public void setAaadhar(long aaadhar) {
		this.aaadhar = aaadhar;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getFather_occupation() {
		return father_occupation;
	}
	public void setFather_occupation(String father_occupation) {
		this.father_occupation = father_occupation;
	}
	public String getMother_occupation() {
		return mother_occupation;
	}
	public void setMother_occupation(String mother_occupation) {
		this.mother_occupation = mother_occupation;
	}
	public long getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(long annual_income) {
		this.annual_income = annual_income;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student_details [rollno=" + rollno + ", studentName=" + studentName + ", email=" + email
				+ ", phone_number=" + phone_number + ", department=" + department + ", year=" + year + ", address="
				+ address + ", sslc_school=" + sslc_school + ", sslc_mark=" + sslc_mark + ", hsc_school=" + hsc_school
				+ ", hsc_mark=" + hsc_mark + ", aaadhar=" + aaadhar + ", father_name=" + father_name + ", mother_name="
				+ mother_name + ", father_occupation=" + father_occupation + ", mother_occupation=" + mother_occupation
				+ ", annual_income=" + annual_income + ", createdDate=" + createdDate + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aaadhar ^ (aaadhar >>> 32));
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (annual_income ^ (annual_income >>> 32));
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + department;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((father_name == null) ? 0 : father_name.hashCode());
		result = prime * result + ((father_occupation == null) ? 0 : father_occupation.hashCode());
		result = prime * result + hsc_mark;
		result = prime * result + ((hsc_school == null) ? 0 : hsc_school.hashCode());
		result = prime * result + ((mother_name == null) ? 0 : mother_name.hashCode());
		result = prime * result + ((mother_occupation == null) ? 0 : mother_occupation.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (phone_number ^ (phone_number >>> 32));
		result = prime * result + (int) (rollno ^ (rollno >>> 32));
		result = prime * result + sslc_mark;
		result = prime * result + ((sslc_school == null) ? 0 : sslc_school.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_details other = (Student_details) obj;
		if (aaadhar != other.aaadhar)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (annual_income != other.annual_income)
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (department != other.department)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (father_name == null) {
			if (other.father_name != null)
				return false;
		} else if (!father_name.equals(other.father_name))
			return false;
		if (father_occupation == null) {
			if (other.father_occupation != null)
				return false;
		} else if (!father_occupation.equals(other.father_occupation))
			return false;
		if (hsc_mark != other.hsc_mark)
			return false;
		if (hsc_school == null) {
			if (other.hsc_school != null)
				return false;
		} else if (!hsc_school.equals(other.hsc_school))
			return false;
		if (mother_name == null) {
			if (other.mother_name != null)
				return false;
		} else if (!mother_name.equals(other.mother_name))
			return false;
		if (mother_occupation == null) {
			if (other.mother_occupation != null)
				return false;
		} else if (!mother_occupation.equals(other.mother_occupation))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone_number != other.phone_number)
			return false;
		if (rollno != other.rollno)
			return false;
		if (sslc_mark != other.sslc_mark)
			return false;
		if (sslc_school == null) {
			if (other.sslc_school != null)
				return false;
		} else if (!sslc_school.equals(other.sslc_school))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	}