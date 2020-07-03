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
import com.jbit.entity.User;

@WebServlet("/addMyBook")
public class AddMyBookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		
		BookBiz bookBiz = new BookBizImpl();
		
		User currUser = (User) request.getSession().getAttribute("currUser");
		
		Book book = new Book();
		
		book.setBook_id(book_id);
		book.setUser_id(currUser.getUser_id());
		book.setBook_status(1);
		
		bookBiz.updateBookStatus(book);
		
		bookBiz.addMyBook(book);
		
		response.sendRedirect("userIndex");
	}
}
