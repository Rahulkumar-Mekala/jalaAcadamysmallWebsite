<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String  fname =(String)request.getAttribute("name");
String msg=(String) request.getAttribute("msg");
out.println("  this page belong to "+fname);
out.println(msg);%>
	<a href="Jala Academy.html"> Home Page</a>
</body>
</html>