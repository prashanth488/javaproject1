<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.invalidate(); %>
<% HttpSession session1=request.getSession(false);
if(session1!=null){
	String str=(String)session.getAttribute("deactivate");
	out.println(str);
}else{
	response.sendRedirect("homepage.jsp");
}


%>
</body>
</html>