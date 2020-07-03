package com.jbit.biz;

import java.util.List;

import com.jbit.entity.Book;
import com.jbit.entity.User;

public interface BookBiz {

	List<Book> getBooks();

	void addBook(Book book);

	Book getBookById(int book_id);

	void deleteBook(int book_id);

	void updateBook(Book book);

	void updateBookStatus(Book book);

	void addMyBook(Book book);

	List<Book> getMyBooks(User currUser);

	void deleteMyBook(int book_id);

}
