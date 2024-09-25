package updateViewAllDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import AdminLogin.AdminBean;
import DataBase.DBconnection;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;


public class updateviewAllDetails {
 public ArrayList<AdminBean>adminBeans = new ArrayList<AdminBean>();
  public ArrayList<AdminBean>retrieve(){
	  
	  try {
		  Connection connection = DBconnection.getcon();
		  PreparedStatement preparedStatement = connection.prepareStatement("select * from jalaRegisteruserBean");
		  ResultSet resultSet = preparedStatement.executeQuery();
		   while (resultSet.next()) {
			   AdminBean bean = new AdminBean();
				 bean.setFirstname(resultSet.getString(1));
			 bean.setLastname(resultSet.getString(2));
			 bean.setEmail(resultSet.getString(3));
			 bean.setMobilenumber(resultSet.getLong(4));
			 bean.setDateofbirth(resultSet.getDate(5));
			 bean.setGender(resultSet.getString(6));
			 bean.setAddress(resultSet.getString(7));
			 bean.setCountry(resultSet.getString(8));
			 bean.setCity(resultSet.getString(9));
			 bean.setSkills(resultSet.getString(10));
			  adminBeans.add(bean);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return adminBeans;
  }
}
