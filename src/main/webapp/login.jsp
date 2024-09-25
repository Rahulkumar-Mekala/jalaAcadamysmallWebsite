<%@page import="jalatechnologies.Userbean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<title>Side Navigation Bar Example</title>
<link rel="stylesheet" href="background.css">
</head>
<body>
	<%
Userbean ub = (Userbean)application.getAttribute("ubean");
out.println("Welcome User :"+ub.getUsername());
%>
	<nav>
		<ul class="navbar">
			<li><a href="Jala Academy.html">Layout</a></li>

		</ul>
	</nav>
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
					<li><a href="userbeanlogin.html">Search</a></li>

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
	<br>
	<br>
	<br>
	<div class="content">
		<h1>Welcome to Jala Academy</h1>
		<br>
		<br>
		<p>The World's best up-skilling academy.</p>
	</div>
	<br>
	<br>
	<br>
	<h3>Do you want to learn Selenium/cucumber Automation completely
		with Practical Scenarios in 7 Days? Use this website to find all the
		scenarios at one place.</h3>
	<br>
	<h3>To understand or test RESTful APIs, use the JALA Academy FREE
		live APIs. Seach on Google with the keyword "JALA Academy Postman
		APIs"</h3>
	<br>
	<br>

	<div class="demo1">
		<p>
			You learn Everything by doing projects if you are very serious to gat
			a software job in 90 days <a href="https://jalaacademy.com/">http://jalatechnologies.com</a>
		</p>
		<br>
		<p>Don't forget to read our website JALA Academy completley to
			know more opportunities</p>
	</div>
	<br>
	<br>
	<br>
	<div class="demo2">

		<h3 id="paragraph">
			If you are a working professional, Up-skill with JALA Academy Job
			Guarantee Programs to keep your Job secure for 10 Years
			</p>
	</div>

</body>
</html>