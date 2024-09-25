package updateEditServlet;

import java.io.IOException;
import java.sql.Date;
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
@WebServlet("/adminupdateprofile")
public class UpdateAdminServelt  extends HttpServlet{
	@Override
public  void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg", "Session Expired  <br>");
			request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			
		} else {
			 ArrayList<AdminBean> arrayList= (ArrayList<AdminBean>)httpSession.getAttribute("alist");
			 String firstname = request.getParameter("firstname");
			 String lastname = request.getParameter("lastname");
			 String Email = request.getParameter("email");
			 Long mobilenumber = Long.parseLong(request.getParameter("mobile"));
		 Date Dataofbirth = Date.valueOf(request.getParameter("dateofbirth"));
			 String Gender = request.getParameter("gender");
			 String Address = request.getParameter("address");
			String Country = request.getParameter("country");
			  String city =request.getParameter("city");
			  String Skills= request.getParameter("skills");
			 Iterator<AdminBean> iterator = arrayList.iterator();
			 while (iterator.hasNext()) {
				 AdminBean adminBean = iterator.next();
				 if (Email.equals(adminBean.getEmail())) {
					adminBean.setFirstname(firstname);
					adminBean.setLastname(lastname);
					adminBean.setEmail(Email);
					adminBean.setMobilenumber(mobilenumber);
					adminBean.setDateofbirth(Dataofbirth);
					adminBean.setGender(Gender);
					adminBean.setAddress(Address);
					adminBean.setCountry(Country);
					adminBean.setCity(city);
					adminBean.setSkills(Skills);
					
					 int k = new AdminUpdateDao().update(adminBean);
					 if (k>0) {
						 request.setAttribute("msg", "Update Scessfully completed..<br>");
						
						 request.getRequestDispatcher("AdminUpdate.jsp").forward(request, response);
					}
					break;
				}
				
			}

		}
	
 }
}
