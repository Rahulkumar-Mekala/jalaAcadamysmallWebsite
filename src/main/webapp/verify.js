function verifyOTP() {
	// Get the OTP entered by the user
	var enteredOTP = document.getElementById('otpInput').value;

	// Get the generated OTP from localStorage
	var generatedOTP = localStorage.getItem("generatedOTP");

	// Check if the entered OTP matches the generated OTP
	if (enteredOTP == generatedOTP) {
		alert("OTP Verified! Access granted.");
		// Redirect or show next content here
	} else {
		alert("Invalid OTP. Please try again.");
	}

}