package com.on.service.user;

import java.util.List;

import com.on.domain.UserActiveInfo;
public interface UserService {

	public List<UserActiveInfo> getUserActiveInfoDao(String openId);
}
