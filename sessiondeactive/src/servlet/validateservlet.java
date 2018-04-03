package servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.validatedao;
import userbean.userbean;
@WebServlet("/validateservlet")
public class validateservlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	userbean user=new userbean();
	user.setUsername(request.getParameter("username"));
	user.setPassword(request.getParameter("password"));
	validatedao vd=new validatedao();
	vd.validate(user);
	HttpSession session=request.getSession(true);
	boolean status=user.isValid();
	if(status) {
		session.setAttribute("deactivate", user);
		response.sendRedirect("profile.jsp");
	}else {
		response.sendRedirect("error.jsp");
	}
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader("Expires", 0);
	if(session.getAttribute("deactivate")==null)
		response.sendRedirect("homepage.jsp");
}
}
