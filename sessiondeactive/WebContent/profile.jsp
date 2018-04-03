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
<% userbean user=(userbean)session.getAttribute("deactivate"); %>
<h1>welcome: <%=user.getUsername() %></h1>
<h1>username: <%=user.getUsername() %></h1>
<h1>password: <%=user.getPassword() %></h1>
<h1>email: <%=user.getEmail() %></h1>

<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader("Expires", 0);
if(session.getAttribute("deactivate")==null)
	response.sendRedirect("homepage.jsp");
%>


<a href="logout.jsp">logout</a>
</body>
</html>