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
			<li class="active"><a href="#">Profile</a></li>
			<li><a href="View.jsp">Marks</a></li>
			<li><a href="studentAttendance.jsp">Attendance</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Special Events<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#href">Fees Balance</a></li>
					<li><a href="holidays.jsp">Holidays</a></li>
				</ul></li>
			<li class="nav-item"><a class="nav-link" href="Index.html"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>
	</div>
	</nav>

<form method="post" action="ViewProfileServlet" id="vacancybtn">
<button type="submit" name="Vacancy" value="Vacancy"
class="btn btn-success waves-effect btn-sm">
<i class="fa fa-th-list" aria-hidden="true"></i>&nbsp;&nbsp;view profile
</button>
</form>
	<main class="pt-5 mx-lg-5"> <!--Grid row--> 
	<c:forEach var="view" items="${VIEW}">
		<div class="row wow fadeIn" id="Vacancy">
			<!--Grid column-->
			<div class="col-md-7 mb-4">
				<!--Card-->
				<div class="card">
					<!--Card content-->
					<div class="card-body">
							<table>
								<h3>Profile</h3>
								<tbody>
									<tr>
										<th>RollNO</th>
										<td>${view.rollno}</td>
									</tr>
									<tr>
										<th>Name</th>
										<td>${view.studentName}</td>
									<tr>
										<th>Address</th>
										<td>${view.address}</td>
									<tr>
										<th>Phone No</th>
										<td>${view.phone_number}</td>
								</tbody>
							</table>
						
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
	</main> 
</body>
</html>