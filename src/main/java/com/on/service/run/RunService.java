package com.on.service.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.on.dao.run.StyleGoalDao;
import com.on.domain.StyleGoal;


public interface RunService {
	//插入跑步目标
	public boolean insertStyleGaol(StyleGoal goal);
}
