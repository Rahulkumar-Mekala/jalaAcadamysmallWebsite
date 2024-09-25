package Register;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DataBase.DBconnection;

public class UserBeanDAO {
	public  int k=0;
	 public int register(UserBean userBean) {
		 try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into jalaRegisteruserBean values(?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, userBean.getFirstname());
			preparedStatement.setString(2, userBean.getLastname());
			preparedStatement.setString(3, userBean.getEmail());
			preparedStatement.setLong(4, userBean.getMobilenumber());
			preparedStatement.setDate(5, userBean.getDateofbirth());
			preparedStatement.setString(6, userBean.getGender());
			preparedStatement.setString( 7,userBean.getAddress());
			preparedStatement.setString( 8,userBean.getCountry());
			preparedStatement.setString( 9,userBean.getCity());
			preparedStatement.setString( 10,userBean.getSkills());
			
			k = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}

}
