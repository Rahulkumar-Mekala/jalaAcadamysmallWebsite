package jalatechnologies;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Userbean implements Serializable {
	private String Username;
	private String password;
	private String Email;
	private Long Phone;
	
	public Userbean() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhone() {
		return Phone;
	}

	public void setPhone(Long phone) {
		Phone = phone;
	}
	

}
