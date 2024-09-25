function generateOTP() {

	var otp = Math.floor(100000 + Math.random() * 900000);
	alert("Your OTP is: " + otp);


	localStorage.setItem("generatedOTP", otp);
	const email = document.getElementById('email').value;
	if (email) {
		alert(`OTP sent to ${email}`);
		window.location.href = 'otp.html';
	} else {
		alert("Please enter a valid email.");
	}
}