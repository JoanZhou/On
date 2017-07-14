package com.on.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.on.domain.UserActiveInfo;

@Repository
public interface UserActiveInfoDao {
	
	//根据openID获取userID
	public int getUserId(String openId);
	//从用户，查出用户有那些活动，每个活动下有一个目标，查到目标状态
	public List<UserActiveInfo> getUserActiveInfoDao(int userId);
}
