package Register;

import java.io.Serializable;
import java.sql.Date;


public class UserBean implements Serializable {
	private String firstname;
	private String lastname;
	private String email;
	private Long mobilenumber;
	private Date Dateofbirth;
	private String Gender;
	private String Address;
	private String country;
	private String city;
	private String skills;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Date getDateofbirth() {
		return  Dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	

}
