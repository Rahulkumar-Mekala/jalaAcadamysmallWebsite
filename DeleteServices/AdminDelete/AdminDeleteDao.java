package AdminDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import DataBase.DBconnection;


public class AdminDeleteDao {
	 public int k=0;
	 public int Delete(AdminBean adminBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("delete from jalaRegisteruserBean  where EMAIL= ? and MOBILENUMBER=?");
			 preparedStatement.setString(1, adminBean.getEmail());
			 preparedStatement.setLong(2, adminBean.getMobilenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}
	  
		// TODO Auto-generated method stub
		
}
