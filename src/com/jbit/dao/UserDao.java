package com.jbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbit.entity.Goods;
import com.jbit.entity.User;

public class UserDao extends BaseDao {

	public User getUser(User user) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("select * from user where user_account = '"+user.getUser_account()+"' and user_pass = '"+user.getUser_pass()+"'");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				user.setUser_id(resultSet.getInt(1));
				user.setUser_account(resultSet.getString(2));
				user.setUser_pass(resultSet.getString(3));
				user.setUser_name(resultSet.getString(4));
				user.setUser_role(resultSet.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
		return user;
	}
	
	public void addUser(User user) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement("insert user values(0,'"+user.getUser_account()+"','"+user.getUser_pass()+"','"+user.getUser_name()+"',1)");
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeResource(connection, statement, resultSet);
		}
	}
}
