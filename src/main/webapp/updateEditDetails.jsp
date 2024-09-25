

<%@page import="AdminLogin.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="background2.css">
<script type="text/javascript">
   const cityOptions = {
		    india: ["Delhi", "Mumbai", "Bengaluru", "Chennai", "Kolkata", "Hyderabad"],
		    usa: ["New York", "Los Angeles", "Chicago"],
		    canada: ["Toronto", "Vancouver", "Montreal"],
		    uk: ["London", "Manchester", "Birmingham"]
		};

		function updateCities() {
		    const countrySelect = document.getElementById("country");
		    const citySelect = document.getElementById("city");
		    const selectedCountry = countrySelect.value;

		    // Clear existing options
		    citySelect.innerHTML = '<option value="">Select a city</option>';
		    citySelect.disabled = !selectedCountry;

		    if (selectedCountry) {
		        cityOptions[selectedCountry].forEach(city => {
		            const option = document.createElement("option");
		            option.value = city.toLowerCase();
		            option.textContent = city;
		            citySelect.appendChild(option);
		        });
		    }
		}



   </script>
</head>
<body>

	<div class="edit">


		<%AdminBean adminBean = (AdminBean)session.getAttribute("abean");
out.println(" This Page To Admin : "+adminBean.getFirstname()+"<br>");
AdminBean bean = (AdminBean)request.getAttribute("ubean");
%>

		<nav>
			<ul class="navbar">
				<li><a href="Jala Academy.html">Layout</a></li>

			</ul>

		</nav>
		<br>
		<br>


		<div class="sidebar">
			<h2>Magnus</h2>
			<h2>
				Guest User <br>User
			</h2>
			<ul>

				<li><a href="login.jsp">Home</a></li>
				<li class="dropdown"><a href="#services" class="dropdown-btn">Employee</a>
					<ul class="dropdown-content">
						<li><a href="Create.html">Create</a></li>
						<li><a href="#app-development">Search</a></li>

					</ul></li>
				<li class="dropdown"><a href="#services" class="dropdown-btn">More</a>
					<ul class="dropdown-content">
						<li><a href="#web-development">Multiple Table</a></li>
						<li><a href="#app-development">Menu</a></li>
						<li><a href="#app-development">Auto complete</a></li>
						<li><a href="#app-development">Collapsible Content</a></li>
						<li><a href="#app-development">Images</a></li>
						<li><a href="#app-development">Slider</a></li>
						<li><a href="#app-development">Tooltips</a></li>
						<li><a href="#app-development">Popups</a></li>
						<li><a href="#app-development">Links</a></li>
						<li><a href="#app-development">CSS Properties</a></li>
						<li><a href="#app-development">IFrames</a></li>

					</ul>
				<li class="dropdown"><a href="#services" class="dropdown-btn">Settings</a>
					<ul class="dropdown-content">


					</ul></li>
			</ul>
		</div>
		<div align="center">
			<label id="Employee">Employee</label> <label id="create">Create</label>
			<div id="pages">
				<a class="link" href="Jala Academy.html">Home &nbsp &nbsp &nbsp
					></a> <a class="link" href="login.jsp">Employee &nbsp &nbsp &nbsp ></a>
				<a class="link" href="Create.html">Create &nbsp &nbsp &nbsp ></a>

			</div>
			<br>
			<br>
			<div class="form-container">

				<br>
				<br>
				<h1>Update The Details:</h1>
				<form action="adminupdateprofile" method="post">
					<div class="form-group">
						<label for="firstName">First Name:</label> <input type="text"
							id="firstName" placeholder="Enter your first name"
							name="firstname" value=<%bean.getFirstname(); %> required>
					</div>

					<div class="form-group">
						<label for="lastName">Last Name:</label> <input type="text"
							id="lastName" placeholder="Enter your last name" name="lastname"
							value=<%bean.getLastname(); %> required>
					</div>

					<div class="form-group">
						<label for="email">Email:</label> <input type="email" id="email"
							placeholder="Enter your email" name="email"
							value=<%bean.getEmail(); %>> required>
					</div>

					<div class="form-group">
						<label for="mobile">Mobile Number:</label> <input type="tel"
							id="mobile" placeholder="Enter your mobile number" name="mobile"
							value=<%bean.getMobilenumber(); %> required>
					</div>

					<div class="form-group">
						<label for="dob">Date of Birth:</label> <input type="date"
							id="dob" name="dateofbirth" value=<%bean.getGender(); %> required>
					</div>

					<div class="form-group gender-group">
						<label>Gender:</label>
						<div>
							<input type="radio" id="male" name="gender" value="male"
								<%bean.getGender(); %> required> <label for="male">Male</label>
							<input type="radio" id="female" name="gender" value="female"
								required> <label for="female">Female</label>
						</div>
					</div>

					<div class="form-group">
						<label for="address">Address:</label>
						<textarea id="address" placeholder="Enter your address"
							name="address" value=<%bean.getAddress(); %> required></textarea>
					</div>

					<div class="form-group">
						<label for="country">Select Country:</label> <select id="country"
							onchange="updateCities()" name="country" required>
							<option value="">Select a country</option>
							<option value="india" <%bean.getCountry(); %>>India</option>
							<option value="usa" <%bean.getCountry(); %>>United
								States</option>
							<option value="canada" <%bean.getCountry(); %>>Canada</option>
							<option value="uk" <%bean.getCountry(); %>>United
								Kingdom</option>
						</select>
					</div>

					<div class="form-group">
						<label for="city">Select City:</label> <select id="city"
							name="city" disabled required>
							<option value="" <%bean.getCity() ;%>>Select a city</option>
						</select>
					</div>

					<div class="form-group skills-group">
						<label>Skills:</label>
						<div>
							<input type="checkbox" id="aws" name="skills" value="AWS"
								<%bean.getSkills(); %>> <label for="aws">AWS</label><br>
							<br> <input type="checkbox" id="devOps" name="skills"
								value="Dev Ops" <%bean.getSkills(); %>> <label
								for="devOps">Dev Ops</label><br> <input type="checkbox"
								id="fullStack" name="skills" value="Full Stack Developer"
								<%bean.getSkills(); %>> <label for="fullStack">Full
								Stack Developer</label><br> <input type="checkbox" id="middleware"
								name="skills" value="Middleware" <%bean.getSkills(); %>>
							<label for="middleware">Middleware</label><br> <input
								type="checkbox" id="qa" name="skills" value="QA Automation"
								<%bean.getSkills(); %>> <label for="qa">QA
								Automation</label><br> <input type="checkbox" id="webServices"
								name="skills" value="Web Services" <%bean.getSkills(); %>>
							<label for="webServices">Web Services</label>
						</div>
					</div>

					<button type="submit">Submit</button>
					<br>
					<br>

				</form>
			</div>
			<button type="submit">
				<a href="">Submit
			</button>
		</div>
</body>
</html>


</body>
</html>