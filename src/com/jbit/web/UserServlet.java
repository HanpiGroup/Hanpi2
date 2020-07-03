package com.jbit.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jbit.biz.UserBiz;
import com.jbit.biz.impl.UserBizImpl;
import com.jbit.entity.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	
	//登录
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String user_account = request.getParameter("user_account");
		String user_pass = request.getParameter("user_pass");
		
		User user =  new User();
		user.setUser_account(user_account);
		user.setUser_pass(user_pass);
		
		UserBiz userBiz = new UserBizImpl();
		
		User currUser = userBiz.getUser(user);
		HttpSession session = request.getSession();
		
		session.setAttribute("currUser", currUser);
		
		if(currUser!=null) {
			String countString = (String) this.getServletContext().getAttribute("count");
			int count = 1;
			if(countString==null) {
				this.getServletContext().setAttribute("count", count+"");
			}else {
				count = Integer.parseInt(countString);
				count++;
				this.getServletContext().setAttribute("count", count+"");
			}
			if(currUser.getUser_role()==0) {
				//管理员
				response.sendRedirect("index");
				
			}else {
				//普通用户
				response.sendRedirect("userIndex");
			}
		}else {
			//登录失败
			response.sendRedirect("login.jsp");
		}
	}

	//注册
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");

		String user_account = request.getParameter("user_account");
		String user_pass = request.getParameter("user_pass");
		String user_name = request.getParameter("user_name");
		
		User user =  new User();
		user.setUser_account(user_account);
		user.setUser_pass(user_pass);
		user.setUser_name(user_name);
		
		UserBiz userBiz = new UserBizImpl();
		userBiz.addUser(user);
		
		response.sendRedirect("login.jsp");
	}

}
