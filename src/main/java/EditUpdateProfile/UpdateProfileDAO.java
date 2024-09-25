package EditUpdateProfile;


import java.sql.Connection;
import java.sql.PreparedStatement;

import DataBase.DBconnection;
import forgotpassword.Userbean;

public class UpdateProfileDAO {
	 public int k=0;
	 public int Update(Userbean bean) {
		 try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("update javaadmin set password= ? where EMAILADDRESS=?");
			preparedStatement.setString(1, bean.getPassword());
			preparedStatement.setString(2, bean.getEmail());
			 k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}
	 
	 

}
