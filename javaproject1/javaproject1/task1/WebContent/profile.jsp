<%@page import="userbean.userbean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>profile</title>
</head>
<body>
<h1>profile</h1>
<%userbean user=(userbean)session.getAttribute("session"); %>
<h2><%=user.getUsername() %></h2>
<h2><%=user.getPassword() %></h2>
<h2><%=user.getEmailid() %></h2>

<a href="logout.jsp">logout</a>
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("session")==null)
      response.sendRedirect("login.jsp");

  %> 
</body>
</html>