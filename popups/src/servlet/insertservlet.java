package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.insertdao;
import userbean.userbean;

public class insertservlet extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	userbean user=new userbean();
	user.setFirstname(request.getParameter("firstname"));
	user.setLastname(request.getParameter("lastname"));
	user.setEmailid(request.getParameter("emailid"));
	insertdao.insert(user);
	PrintWriter out=response.getWriter();
	boolean  status=user.isValid();
	if(status) {
		out.println("<h1>values are inserted successfully</h1>");
		response.sendRedirect("homepage.jsp");
	}else {
		out.println("<h1>values are not inserted</h1>");
	}
}
}
