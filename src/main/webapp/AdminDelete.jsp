
<%@page import="AdminLogin.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%AdminBean adminBean = (AdminBean) session.getAttribute("abean");
out.println(" This Page Be long to "+adminBean.getFirstname()+"<br>");
String msg= (String)request.getAttribute("msg");
out.println(msg);
%>
	<a href="AllViewDetails">AllViewDetails :</a>
	<a href="userbeanlogin.html">AdminLogout</a>

</body>
</html>