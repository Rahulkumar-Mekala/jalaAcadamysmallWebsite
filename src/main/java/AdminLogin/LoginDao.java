package AdminLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DataBase.DBconnection;

public class LoginDao {
	 public Userbean registerpage= null;
	 public Userbean Login(String email,String password) {
		 try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from javaadmin where emailAddress=? and password=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			ResultSet executeQuery = preparedStatement.executeQuery();
			if (executeQuery.next()) {
				this.registerpage = new Userbean();
				this.registerpage.setUsername(executeQuery.getString(1));
				this.registerpage.setPassword(executeQuery.getString(2));
				this.registerpage.setEmail(executeQuery.getString(3));	
				this.registerpage.setPhone(executeQuery.getLong(4));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerpage;
		 
	 }

}
