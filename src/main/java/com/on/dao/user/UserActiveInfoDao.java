package com.on.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.on.domain.UserActiveInfoVO;

@Repository
public interface UserActiveInfoDao {

	//从用户，查出用户有那些活动，每个活动下有一个目标，查到目标状态
	public List<UserActiveInfoVO> getUserActiveInfoDao(String openID);
}
