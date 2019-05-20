<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
.navbar {
	margin-top: 5rem;
	margin-left: 2rem;
}

.required {
	color: red;
}

.heading {
	padding-left: 10rem;
	font-family: 'Kaushan Script', cursive;
}

li {
	padding-left: 10rem;
	font-size: 1.3em;
}
</style>
</head>
<body>

	<div class="heading">
		<h1>Arvind college of engineering</h1>
	</div>
	<nav class="navbar navbar-default" id="navbar">
	<div class="container-fluid">

		<ul class="nav navbar-nav">
			<li class="active"><a href="adminhome.jsp">Student Details</a></li>
			<!-- <li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Department <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="departcse.jsp">CSE</a></li>
					<li><a href="departEce.jsp">ECE</a></li>
					<li><a href="departEee.jsp">EEE</a></li>
				</ul></li> -->
			<li><a href="marks.jsp">Marks</a></li>
			<li><a href="Attendance.jsp">Attendance</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Special Events<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="fees.jsp">Fees Balance</a></li>
					<li><a href="#href">Holidays</a></li>
				</ul></li>
			<li class="nav-item"><a class="nav-link" href="Index.html"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>
	</div>
	</nav>
	<form action="AttendanceServlet" method="post">
		<label style="padding-left: 45px; font-size: 20px;"
			class="col-md-1 control-label">Year<span class="required">*</span></label>
		<div class="col-md-1 inputGroupContainer">
			<select class="selectpicker form-control" name="year">
				<option>1</option>
				<option>2</option>
				<option>3</option>
			</select>
		</div>
		<div class="form-group">
			<label style="padding-left: 210px; font-size: 20px;"
				class="col-md-3 control-label">Department<span
				class="required">*</span></label>
			<div class="col-md-2 inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon" style="max-width: 100%;"><i
						class="glyphicon glyphicon-list"></i></span> <select
						class="selectpicker form-control" name="department">
						<option>CSE</option>
						<option>ECE</option>
						<option>EEE</option>
					</select>
				</div>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Search</button>

	</form>

	<form action="AttendDetailsServlet" method="post">
		<div style="padding-top: 50px">
			<label style="font-size: 20px;" class="col-md-1 control-label">Roll
				no<span class="required">*</span>
			</label>
			<div class="col-md-1 inputGroupContainer">
				<select class="selectpicker form-control" name="rollno">
					<c:forEach var="detailsList" items="${DETAILSLIST }">
						<option value="${detailsList.rollno }">${detailsList.rollno }</option>
					</c:forEach>
				</select>
			</div>
		</div>

		<div class="form-group">
			<label style="font-size: 20px; padding-left: 50px;"
				class="col-md-1 control-label"> Date<span class="required">*</span>
			</label>
			<div class="col-md-1 inputGroupContainer">
				<div class="input-group">
					<span class="input-group-addon"><i
						class="glyphicon glyphicon-briefcase"></i></span><input id="fullName"
						name="date" class="form-control" value="" type="date">
				</div>
			</div>
		</div>
		<div style="padding-top: 50px; font-size: 20px; padding-left: 10px">
			<label>Attendance<span class="required">*</span>
			</label><br> <input type="radio" name="attendance" value="p">present<br>
			<input type="radio" name="attendance" value="a"> absent<br>

			<div style="padding-top: 10px;">
				<button type="submit" class="btn btn-primary" value="Submit">Submit</button>
			</div>
		</div>

	</form>


</body>
</html>