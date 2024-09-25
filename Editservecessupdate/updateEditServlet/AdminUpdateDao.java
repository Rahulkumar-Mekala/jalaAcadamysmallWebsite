package updateEditServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import DataBase.DBconnection;



public class AdminUpdateDao {
	 public int k=0;
	 public int update(AdminBean adminBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("UPDATE jalaRegisteruserBean SET FIRSTNAME = ?, LASTNAME = ?, EMAIL = ?, MOBILENUMBER = ?, DATEOFBIRTH = ?, GENDER = ?,ADDRESS= ?, COUNTRY=?,CITY=?,SKILLS= ? WHERE MOBILENUMBER = ? and EMAIL= ?");
			 preparedStatement.setString(1, adminBean.getFirstname());
			 preparedStatement.setString(2, adminBean.getLastname());
			 preparedStatement.setString(3, adminBean.getEmail());
			 preparedStatement.setLong(4, adminBean.getMobilenumber());
			 preparedStatement.setDate(5, adminBean.getDateofbirth());
			 preparedStatement.setString(6, adminBean.getGender());
			 preparedStatement.setString(7, adminBean.getAddress());
			 preparedStatement.setString(8, adminBean.getCountry());
			 preparedStatement.setString(9, adminBean.getCity());
			 preparedStatement.setString(10, adminBean.getSkills());
			 preparedStatement.setLong(11, adminBean.getMobilenumber());
			 preparedStatement.setString(12, adminBean.getEmail());
				  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
