package updateEditServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import AdminLogin.AdminBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/updateedit")
public class updateEditservelet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		 if (httpSession ==null) {
			 request.setAttribute("msg", "Session Expired..<br>");
			 request.getRequestDispatcher("msg.jsp").forward(request, response);
			
		} else {
			String email = request.getParameter("Email");
		ArrayList<AdminBean> arrayList = (ArrayList<AdminBean>)httpSession.getAttribute("alist");
		   Iterator<AdminBean>it= arrayList.iterator();
		   while (it.hasNext()) {
			   AdminBean bean = (AdminBean)it.next();
			   if (email.equals(bean.getEmail())) {
				   request.setAttribute("ubean", bean);
				   request.getRequestDispatcher("updateEditDetails.jsp").forward(request, response);
				break;
			}
				
			}
			
		}
			
		}
	}
	


