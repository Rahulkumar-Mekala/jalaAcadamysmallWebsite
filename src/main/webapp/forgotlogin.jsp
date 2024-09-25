<%@page import="forgotpassword.Userbean"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
Userbean ub = (Userbean)application.getAttribute("forubean");
out.println("Welcome User :"+ub.getUsername());
%>;
	<a href="edit">Changepassword</a>
</body>
</html>