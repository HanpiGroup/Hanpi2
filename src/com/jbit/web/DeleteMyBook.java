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

@WebServlet("/deleteMyBook")
public class DeleteMyBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		
		BookBiz bookBiz = new BookBizImpl();
		
		Book book = new Book();
		book.setBook_status(0);
		book.setBook_id(book_id);
		
		bookBiz.updateBookStatus(book);
		bookBiz.deleteMyBook(book_id);
		
		response.sendRedirect("myBooks");
	}
}
