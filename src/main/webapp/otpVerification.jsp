<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2>Verify OTP</h2>
		<form action="verifyOtp" method="post">
			<input type="text" name="otp" placeholder="Enter the OTP" required><br>
			<br> <input id="button" type="submit" value="Verify OTP">
		</form>
	</div>
</body>
</html>