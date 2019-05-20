<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
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

.required {
	color: red;
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


	<div
		style="padding-left: 650px; font-family: Times New Roman; font-size: 24px;">Student
		Details</div>
	<div class="container">
		<table class="table table-striped">
			<tbody>
				<tr>
					<td colspan="1">
						<form class="well form-horizontal" action="StudentDetailsServlet"
							method="post">
							<fieldset>
								<div class="form-group">
									<label class="col-md-4 control-label">Roll Number<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-registration-mark"></i></span><input
												id="addressLine1" name="rollNumber"
												placeholder="Register Number" class="form-control"
												required="true" value="" type="number">
										</div>
									</div>
									
									
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Full Name<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-user"></i></span><input id="fullName"
												name="fullName" placeholder="Full Name" class="form-control"
												required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Email<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-envelope"></i></span><input id="email"
												name="email" placeholder="Email" class="form-control"
												required="true" value="" type="email">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Phone Number<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-earphone"></i></span><input
												id="phoneNumber" name="phoneNumber"
												placeholder="Phone Number" class="form-control"
												required="true" value="" type="number">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Department<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
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
								<div class="form-group">
									<label class="col-md-4 control-label">Year<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon" style="max-width: 100%;"><i
												class="glyphicon glyphicon-list"></i></span> <select
												class="selectpicker form-control" name="year">
												<option>1</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
											</select>
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label">Address<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-home"></i></span><input
												id="addressLine1" name="address"
												placeholder="Permanent Address" class="form-control"
												required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">SSLC<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-book"></i></span><input id="city"
												name="sslc" placeholder="SSLC" class="form-control"
												required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Mark in SSLC<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-book"></i></span><input id="state"
												name="markSslc" placeholder="Mark in SSLC"
												class="form-control" required="true" value="" type="number">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">HSC<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-book"></i></span><input id="postcode"
												name="hsc" placeholder="HSC" class="form-control"
												required="true" value="" type="text">
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label">Mark in HSC<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-book"></i></span><input id="phoneNumber"
												name="markHsc" placeholder="Mark in HSC"
												class="form-control" required="true" value="" type="number">
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label">Father Name<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-user"></i></span><input id="fullName"
												name="fatherName" placeholder="Father Name"
												class="form-control" required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Father Occupation</label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-briefcase"></i></span><input
												id="fullName" name="fatherOccupation"
												placeholder="Father Occupation" class="form-control"
												value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Mother Name<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-user"></i></span><input id="fullName"
												name="matherName" placeholder="Mather Name"
												class="form-control" required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Mother Occupation</label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-briefcase"></i></span><input
												id="fullName" name="matherOccupation"
												placeholder="Mather Occupation" class="form-control"
												value="" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Aadhar</label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-credit-card"></i></span><input
												id="addressLine1" name="aadhar" placeholder="Aadhar Number"
												class="form-control" value="" type="number">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Annual Income<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-usd"></i></span><input id="addressLine2"
												name="annual" placeholder="INR" class="form-control"
												required="true" value="" type="number">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Password<span
										class="required"> *</span></label>
									<div class="col-md-5 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"><i
												class="glyphicon glyphicon-user"></i></span><input id="password"
												name="password" placeholder="password" class="form-control"
												required="true" value="" type="text">
										</div>
									</div>
								</div>
								<div style="padding-left: 550px;" class="well well-md text-center">
									<button   data-toggle="modal" data-target="#myModal">Submit</button>
								</div>
							</fieldset>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="modal fade success-popup" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog modal-sm" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title" id="myModalLabel">Thank You !</h4>
      </div>
      <div class="modal-body text-center">
         <img src="http://osmhotels.com//assets/check-true.jpg">
          <p class="lead">Student form successfully submitted.</p>
          
      </div>
      
    </div>
  </div>
</div>

</body>
</html>