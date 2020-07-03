package com.jbit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jbit.biz.BookBiz;
import com.jbit.biz.impl.BookBizImpl;
import com.jbit.entity.Book;

@WebServlet("/toUpdateBook")
public class ToUpdateBookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int book_id = Integer.parseInt(request.getParameter("book_id"));
		
		BookBiz bookBiz = new BookBizImpl();
		
		Book currBook = bookBiz.getBookById(book_id);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("currBook", currBook);
		
		response.sendRedirect("updateBook.jsp");
	}
}
