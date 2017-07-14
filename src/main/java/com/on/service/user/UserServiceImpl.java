package com.on.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.dao.user.UserActiveInfoDao;
import com.on.domain.UserActiveInfo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserActiveInfoDao dao;
	
	
	@Override
	public List<UserActiveInfo> getUserActiveInfoDao(String openId) {
		// TODO Auto-generated method stub
		int userId = dao.getUserId(openId);
		return dao.getUserActiveInfoDao(userId);
	}

}
