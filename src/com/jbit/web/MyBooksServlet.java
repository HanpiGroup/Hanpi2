package com.jbit.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jbit.biz.BookBiz;
import com.jbit.biz.impl.BookBizImpl;
import com.jbit.entity.Book;
import com.jbit.entity.User;

@WebServlet("/myBooks")
public class MyBooksServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		BookBiz bookBiz = new BookBizImpl();
		HttpSession session = request.getSession();
		
		User currUser = (User) session.getAttribute("currUser");
		
		List<Book>books = bookBiz.getMyBooks(currUser);
		
		session.setAttribute("books", books);
		
		response.sendRedirect("myBooks.jsp");
	}
}
