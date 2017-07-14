package com.on.dao.active;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.on.domain.ActivityRecord;

@Repository
public interface ActivityRecordDao {
	//获取所有活动记录
	public List<ActivityRecord> getAllActivityRecord();
}
