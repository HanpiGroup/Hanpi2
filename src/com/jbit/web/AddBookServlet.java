package com.jbit.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jbit.biz.BookBiz;
import com.jbit.biz.impl.BookBizImpl;
import com.jbit.entity.Book;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String book_name = request.getParameter("book_name");
		double book_price = Double.parseDouble(request.getParameter("book_price"));
		String book_detail = request.getParameter("book_detail");
		String book_public = request.getParameter("book_public");
		
		Book book = new Book(0, book_name, book_price, book_detail, book_public, 0);
		
		BookBiz bookBiz = new BookBizImpl();
		bookBiz.addBook(book);
		
		response.sendRedirect("index");
	}

}
