package com.on.service.active;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.dao.active.ActivityRecordDao;
import com.on.domain.ActivityRecord;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	ActivityRecordDao dao;
	
	@Override
	public List<ActivityRecord> getAllActivityRecord() {
		// TODO Auto-generated method stub
		return dao.getAllActivityRecord();
	}

}
