<%@page import="javax.swing.JDialog"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertservlet" method="post">
firstname:<br>
<input type="text" name="firstname"><br>
lastname:<br>
<input type="text" name="lastname"><br>
emailid:<br>
<input type="text" name="emailid"><br><br>
<!-- <input type="submit" value="register"> -->
<button onclick="myFunction()">insert</button>
<script>
function myFunction(){
	alert("inserted successfully")


<%-- <%

	public void  myFunction(){
		
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    int response1=JOptionPane.showConfirmDialog(null,"Do you want to contionue","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	    if(response1==JOptionPane.NO_OPTION){
	    	System.out.println("no button clicked");
	    }else if(response1==JOptionPane.YES_OPTION){
	    	System.out.println("yes button clicked");
	    }else if(response1==JOptionPane.CLOSED_OPTION){
	    	System.out.println("close button clicked");
	    }  
	



%> --%>

</
</form>


</body>
</html>