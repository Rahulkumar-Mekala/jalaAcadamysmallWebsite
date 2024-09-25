package AdminLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DataBase.DBconnection;

public class AdminLoginDAO {
	public AdminBean adminBean = null;
	public AdminBean Login(String email,Long number) {
		try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from  jalaRegisteruserBean where EMAIL=? and mobilenumber = ?");
			
			preparedStatement.setString(1, email);
			preparedStatement.setLong(2, number);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				adminBean = new AdminBean();
				adminBean.setFirstname(resultSet.getString(1));
				adminBean.setLastname(resultSet.getString(2));
				adminBean.setEmail(resultSet.getNString(3));
				adminBean.setMobilenumber(resultSet.getLong(4));
				adminBean.setDateofbirth(resultSet.getDate(5));
				adminBean.setGender(resultSet.getString(6));
				adminBean.setAddress(resultSet.getString(7));
				adminBean.setCountry(resultSet.getString(8));
				adminBean.setCity(resultSet.getString(9));
				adminBean.setSkills(resultSet.getNString(10));
							}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return adminBean;
	}

}
