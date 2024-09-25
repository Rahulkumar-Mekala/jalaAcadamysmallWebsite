package forgotpassword;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;



import org.apache.catalina.Session;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import oracle.jdbc.driver.Message;


@SuppressWarnings("serial")
@WebServlet("/forgot")
public class loginservelts  extends HttpServlet{
	@Override
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		String email = request.getParameter("email");
		int otpvalue=0;
		HttpSession httpSession = request.getSession();
	
		
		Userbean userbean = new LoginDao().Login(email);
		  if (userbean==null) {
			  request.setAttribute("msg", "Invalidate Password");
			  request.getRequestDispatcher("forgotmsg.jsp").forward(request, response);;
			
		} else {
			ServletContext servletContext = request.getServletContext();
			servletContext.setAttribute("forubean", userbean);
			Cookie cookie = new Cookie("name",userbean.getUsername());
	response.addCookie(cookie);
	request.getRequestDispatcher("forgotlogin.jsp").forward(request, response);

		}
          		}
	

	}
