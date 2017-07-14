package com.on.dao.run;

import org.springframework.stereotype.Repository;
import com.on.domain.StyleGoal;

@Repository
public interface StyleGoalDao {
	//插入跑步目标
	public boolean insertStyleGaol(StyleGoal goal);
}
