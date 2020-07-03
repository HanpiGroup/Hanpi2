package com.jbit.biz.impl;

import com.jbit.biz.UserBiz;
import com.jbit.dao.UserDao;
import com.jbit.entity.User;

public class UserBizImpl implements UserBiz {
	
	UserDao userDao = new UserDao();

	@Override
	public User getUser(User user) {
		
		return userDao.getUser(user);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

}
