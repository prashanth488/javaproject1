package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.logindao;
import userbean.userbean;

public class loginservlet extends HttpServlet {
public void doPost(HttpServletRequest request,  HttpServletResponse response) throws IOException {
	userbean user=new userbean();
	user.setUsername(request.getParameter("username"));
	user.setPassword(request.getParameter("password"));
	user.setEmailid(request.getParameter("Emailid"));
	logindao.insert(user);
	PrintWriter out=response.getWriter();
	boolean b=user.isValid();
	HttpSession session=request.getSession(true);
	if(b) {
		
		session.setAttribute("session", user);
		response.sendRedirect("profile.jsp");
				
	}
	else {
		response.sendRedirect("loginpage.jsp");
		
	}
	
	  response.setHeader("Cache-Control","no-cache");
	  response.setHeader("Cache-Control","no-store");
	  response.setHeader("Pragma","no-cache");
	  response.setDateHeader ("Expires", 0);
	  if(session.getAttribute("session")==null)
	      response.sendRedirect("login.jsp");

	   
	
}
}
