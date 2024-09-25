 package EditUpdateProfile;

import java.io.IOException;

import forgotpassword.Userbean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/update")
public class updateProfileservelts extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 Cookie cookies[] = request.getCookies();
		 if (cookies==null) {
			 request.setAttribute("msg", "seasion Expried..");
			 request.getRequestDispatcher("msg.jsp").forward(request, response);
			
		} else {
			String value = cookies[0].getValue();
		request.setAttribute("name", value);
		ServletContext servletContext = request.getServletContext();
		 Userbean bean=(Userbean) servletContext.getAttribute("forubean");
		bean.setPassword(request.getParameter("pass"));
		  int k = new  UpdateProfileDAO().Update(bean);
	    if(k>0) {
	    	  request.setAttribute("msg"," profile Update Sucessfully completed..");
	    	  request.getRequestDispatcher("UpdateProfile.jsp").forward(request, response);
			
		}

		}
	 }

}
