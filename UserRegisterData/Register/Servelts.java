package Register;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/register")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
		  UserBean bean = new UserBean();
		 bean.setFirstname(request.getParameter("firstname"));
		 bean.setLastname(request.getParameter("lastname"));
		 bean.setEmail(request.getParameter("email"));
		 bean.setMobilenumber(Long.parseLong(request.getParameter("mobile")));
		 bean.setDateofbirth(java.sql.Date.valueOf(request.getParameter("dateofbirth")));

		 bean.setGender(request.getParameter("gender"));
		 bean.setAddress(request.getParameter("address"));
		 bean.setCountry(request.getParameter("country"));
		 bean.setCity(request.getParameter("city"));
		 bean.setSkills(request.getParameter("skills"));
		   int k = new UserBeanDAO().register(bean);
		   if (k>0) {
			   request.setAttribute("msg", " Register is Sucessfully completed...");
			   request.getRequestDispatcher("Register.jsp").forward(request, response);
			
		}
		   
		 
	 }

}
