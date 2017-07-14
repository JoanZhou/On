package com.on.controller.active;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.on.domain.ActivityRecord;
import com.on.service.active.ActivityService;

@Controller
public class ActivityController {
	
	@Autowired
	ActivityService activityService;

	@RequestMapping(value = "GetActivity", method = RequestMethod.GET)
	public void getAllActivity(HttpServletRequest request, HttpServletResponse response) {
		
		List<ActivityRecord> list = activityService.getAllActivityRecord();
		JSONArray jsa = new JSONArray();
		JSONObject jso;
		
		for (int i = 0; i < list.size(); i++) {
			ActivityRecord ar = list.get(i);
			jso = new JSONObject();
			jso.accumulate("activityID", ar.getActivityID());
			jso.accumulate("activityLevel", ar.getActivityLevel());
			jso.accumulate("attendPeople", ar.getAttendPeople());
			jso.accumulate("totalBonus", ar.getTotalBonus());
			
			jsa.put(jso);
		}
		
		JSONObject res = new JSONObject();
		res.accumulate("activity", jsa);
		
		try {
			ServletOutputStream sos = response.getOutputStream();
			sos.print(res.toString());
			sos.flush();
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
