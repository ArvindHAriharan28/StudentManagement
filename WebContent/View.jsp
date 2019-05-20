<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<li class="active"><a href="home.jsp">Profile</a></li>
			<!-- <li class="active" class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Department <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="departcse.jsp">CSE</a></li>
					<li><a href="departEce.jsp">ECE</a></li>
					<li><a href="departEee.jsp">EEE</a></li>
				</ul></li>
 -->
			<li><a href="marks.jsp">Marks</a></li>
			<li><a href="studentAttendance.jsp">Attendance</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Special Events<span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#href">Fees Balance</a></li>
					<li><a href="holidays.jsp">Holidays</a></li>
				</ul></li>
			<li class="nav-item"><a class="nav-link" href="Index.html"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>
	</div>
	</nav>
	<form action="" method="post">
		<div style="padding-top: 20px;">
			<label style="font-size: 20px;" class="col-md-1 control-label">Semester<span
				class="required">*</span></label>
			<div class="col-md-1 inputGroupContainer">
				<select class="selectpicker form-control" name="semester">
					<option>01</option>
					<option>02</option>
					<option>03</option>
					<option>04</option>
				</select>
			</div>
			<label style="padding-left: 60px; font-size: 20px;"
				class="col-md-1 control-label">Year<span class="required">*</span></label>
			<div class="col-md-1 inputGroupContainer">
				<select class="selectpicker form-control">
					<option>1</option>
					<option>2</option>
					<option>3</option>
				</select>
			</div>
		<!-- 	<label style="padding-left: 60px; font-size: 20px;"
				class="col-md-1 control-label">Dept<span class="required">*</span></label>
			<div class="col-md-1 inputGroupContainer">
				<select class="selectpicker form-control" name="department">
					<option>CSE</option>
					<option>ECE</option>
					<option>EEE</option>
				</select>
			</div> -->
			<!-- <label style="font-size:20px;padding-left:60px">Department : </label> -->

			<button type="submit" class="btn btn-primary">Search</button>
		</div>
	</form>
	<%-- <div>
	 <c:forEach var="nList" items="${NAMELIST}">
		<table class="table">

			<thead>
				<tr>
					<th scope="col">Name</th>
					 <th scope="col"><c:out value="${nList.studentName}"></c:out></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row"><c:out value="${nList.subName}"></c:out></th>
					<td><input type="text" value="mark"></td>
				</tr>
			</tbody>

		</table>
	</c:forEach> 
</div> --%>
</body>
</html>