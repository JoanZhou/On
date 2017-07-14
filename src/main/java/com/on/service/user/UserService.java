package com.on.service.user;

import java.util.List;

import com.on.domain.UserActiveInfoVO;

public interface UserService {

	public List<UserActiveInfoVO> getUserActiveInfoDao(String openID);
}
