package com.on.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.dao.user.UserActiveInfoDao;
import com.on.domain.UserActiveInfoVO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserActiveInfoDao dao;
	
	@Override
	public List<UserActiveInfoVO> getUserActiveInfoDao(String openID) {
		// TODO Auto-generated method stub
		return dao.getUserActiveInfoDao(openID);
	}

}
