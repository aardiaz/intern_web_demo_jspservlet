package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	       request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  //get data form login form
		String un = request.getParameter("username");
		String psw = request.getParameter("password");
		
		UserService  service = new UserServiceImpl();
		
		 if(service.userLogin(un, psw)) {
			 
			 request.setAttribute("uname", un);
			 request.getRequestDispatcher("Home.jsp").forward(request, response);
		 }else {
			
			 request.setAttribute("message", "user not found !!");
			 
			 request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
		 }
		
	}

}
