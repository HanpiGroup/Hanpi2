package com.jbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbit.entity.Book;
import com.jbit.entity.User;

public class BookDao extends BaseDao {

	public List<Book> getBooks(){
		List<Book>books = new ArrayList<Book>();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("select * from book");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				int book_id = resultSet.getInt(1);
				String book_name = resultSet.getString(2);
				double book_price = resultSet.getDouble(3);
				String book_detail = resultSet.getString(4);
				String book_public = resultSet.getString(5);
				int book_status = resultSet.getInt(6);
				Book book = new Book(book_id, book_name, book_price, book_detail, book_public, book_status);
				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
		return books;
	}

	public void addBook(Book book) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("insert book values(0,'"+book.getBook_name()+"',"+book.getBook_price()+",'"+book.getBook_detail()+"','"+book.getBook_public()+"',"+book.getBook_status()+")");
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}

	public Book getBookById(int book_id) {
		Book book = new Book();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("select * from book where book_id = "+book_id);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				String book_name = resultSet.getString(2);
				double book_price = resultSet.getDouble(3);
				String book_detail = resultSet.getString(4);
				String book_public = resultSet.getString(5);
				int book_status = resultSet.getInt(6);
				book = new Book(book_id, book_name, book_price, book_detail, book_public, book_status);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
		return book;
	}

	public void deleteBook(int book_id) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("delete from book where book_id = "+book_id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}

	public void updateBook(Book book) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("update book set book_name = '"+book.getBook_name()+"',book_price="+book.getBook_price()+",book_detail='"+book.getBook_detail()+"',book_public='"+book.getBook_public()+"' where book_id="+book.getBook_id());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}

	public void updateBookStatus(Book book) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("update book set book_status = "+book.getBook_status()+" where book_id = "+book.getBook_id());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}

	public void addMyBook(Book book) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("insert user_book values("+book.getUser_id()+","+book.getBook_id()+")");
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}

	public List<Book> getMyBooks(User currUser) {
		List<Book>books = new ArrayList<Book>();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("select a.* from book a,user_book b where a.book_id = b.book_id and b.user_id = "+currUser.getUser_id());
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				int book_id = resultSet.getInt(1);
				String book_name = resultSet.getString(2);
				double book_price = resultSet.getDouble(3);
				String book_detail = resultSet.getString(4);
				String book_public = resultSet.getString(5);
				int book_status = resultSet.getInt(6);
				Book book = new Book(book_id, book_name, book_price, book_detail, book_public, book_status);
				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
		return books;
	}

	public void deleteMyBook(int book_id) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("delete from user_book where book_id = "+ book_id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}
	
	
}
