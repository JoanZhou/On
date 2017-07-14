package com.on.controller.run;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.on.domain.StyleGoal;
import com.on.service.run.RunService;

@Controller
public class RunController {
	
	@Autowired
	RunService runService;

	@RequestMapping(value = "SetRunningGoal", method = RequestMethod.GET)
	public void SetRunningGoal(@RequestParam("activityID")int activityID, @RequestParam("type")int type,@RequestParam("goalDays")int goalDays,
			@RequestParam("goalDistance")int goalDistance, @RequestParam("bail")int bail, @RequestParam("deposit")int deposit,
			@RequestParam("pcoeffient")float pcoeffient, HttpServletRequest request, HttpServletResponse response) {
		
		StyleGoal gaol = new StyleGoal(activityID, type, goalDays, goalDistance, pcoeffient, deposit, bail, 0, 0, new Date(), 0);
		boolean isSucces = runService.insertStyleGaol(gaol);
		JSONObject jso = new JSONObject();
		
		if (isSucces) jso.accumulate("status", "success");
		else jso.accumulate("status", "failed");
		
		try {
			ServletOutputStream sos = response.getOutputStream();
			sos.print(jso.toString());
			sos.flush();
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
