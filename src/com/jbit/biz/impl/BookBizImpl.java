package com.jbit.biz.impl;

import java.util.List;

import com.jbit.biz.BookBiz;
import com.jbit.dao.BookDao;
import com.jbit.entity.Book;
import com.jbit.entity.User;

public class BookBizImpl implements BookBiz {
	
	BookDao bookDao = new BookDao();

	@Override
	public List<Book> getBooks() {
		
		return bookDao.getBooks();
	}

	@Override
	public void addBook(Book book) {
		
		bookDao.addBook(book);
	}

	@Override
	public Book getBookById(int book_id) {
		
		return bookDao.getBookById(book_id);
	}

	@Override
	public void deleteBook(int book_id) {
		bookDao.deleteBook(book_id);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	@Override
	public void updateBookStatus(Book book) {
		bookDao.updateBookStatus(book);
	}

	@Override
	public void addMyBook(Book book) {
		bookDao.addMyBook(book);
	}

	@Override
	public List<Book> getMyBooks(User currUser) {
		
		return bookDao.getMyBooks(currUser);
	}

	@Override
	public void deleteMyBook(int book_id) {
		bookDao.deleteMyBook(book_id);
	}

}
