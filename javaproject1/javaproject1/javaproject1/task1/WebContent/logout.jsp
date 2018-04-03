
<%@page import="userbean.userbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%session.invalidate();%>
<% HttpSession session1=request.getSession(false);
if(session1!=null){
String s=(String)session.getAttribute("session");
out.println(s);
}else{
RequestDispatcher rd=request.getRequestDispatcher("loginpage.jsp");
rd.forward(request,response);

}

%>
<h1>you are sucessfully logged out</h1>

</body>
</html>