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

@WebServlet("/index")
public class BooksServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		BookBiz bookBiz = new BookBizImpl();
		
		List<Book>books = bookBiz.getBooks();
		HttpSession session = request.getSession();
		
		session.setAttribute("books", books);
		
		response.sendRedirect("index.jsp");
		
	}
}
