package com.on.service.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.dao.run.StyleGoalDao;
import com.on.domain.StyleGoal;

@Service
public class RunServiceImpl implements RunService{

	@Autowired
	StyleGoalDao dao;
	
	@Override
	public boolean insertStyleGaol(StyleGoal goal) {
		// TODO Auto-generated method stub
		return dao.insertStyleGaol(goal);
	}

}
