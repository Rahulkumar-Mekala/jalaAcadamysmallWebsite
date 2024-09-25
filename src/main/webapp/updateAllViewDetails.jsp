
<%@page import="AdminLogin.AdminBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
table, th, td {
	border: 1px solid black;
}
</style>
	<table>
		<tr>
			<th>FIRSTNAME :</th>
			<th>LASTNAME :</th>
			<th>EMAIL :</th>
			<th>MOBILENUMBER :</th>
			<th>DATEOFBIRTH :</th>
			<th>GENDER :</th>
			<th>ADDRESS :</th>
			<th>COUNTRY :</th>
			<th>CITY :</th>
			<th>SKILLS :</th>

		</tr>

		<%AdminBean bean = (AdminBean)session.getAttribute("abean");
ArrayList<AdminBean> arrayList = (ArrayList<AdminBean>)session.getAttribute("alist");
out.println(" Page Belong to Admin "+bean.getFirstname()+"<br>");

if(arrayList.size()==0){
	out.println(" Not Product Avalivable...<br>");
}
else{
	Iterator<AdminBean> iterator= arrayList.iterator();
	while(iterator.hasNext()){
		AdminBean adminBean= (AdminBean)iterator.next();
	
		out.println("<tr>"+"<td>"+adminBean.getFirstname()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getLastname()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getEmail()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getMobilenumber()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getDateofbirth()+"</td>"+"<td>"+adminBean.getGender()+"</td>"+"&nbsp&nbsp"+"<td>"+adminBean.getAddress()+"&nbsp&nbsp"+"<td>"+adminBean.getCountry()+"&nbsp&nbsp"+"<td>"+adminBean.getCity()+"&nbsp&nbsp"+"<td>"+adminBean.getSkills()+
				"</td>"+"<br>&nbsp&nbsp"+"<td>&nbsp&nbsp"+"<a href ='updateedit?Email="+adminBean.getEmail()+"'><button>UpdateEdit</button></a>"+"<br>&nbsp&nbsp"+"<br>"+"<a href = 'UpdateDeletepage?Email="+adminBean.getEmail()+"'><button>UpDateDelete</button></a>&nbsp&nbsp;"+"</td>"+"</tr>");
		
	}
}
%>

	</table>
	<br>
	<a href="AdminLogout" target="black"><button>AdminLogout</button></a>
</body>
</html>