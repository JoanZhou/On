package com.on.controller.user;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.on.domain.UserActiveInfoVO;
import com.on.service.user.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "MyGoals",method = RequestMethod.GET)
	public void getActivityStatus(@RequestParam("openID") String openID, 
			HttpServletRequest request, HttpServletResponse response) {
		
		List<UserActiveInfoVO> list = userService.getUserActiveInfoDao(openID);
		JSONArray jsa = new JSONArray();
		JSONObject jso;
		
		for (int  i = 0; i < list.size(); i++) {
			UserActiveInfoVO uai = list.get(i);
			jso = new JSONObject();
			jso.accumulate("activityID", uai.getTargetId());
			jso.accumulate("status", uai.getStatus());
			jsa.put(jso);
		}
		
		try {
			ServletOutputStream sos = response.getOutputStream();
			sos.print(jsa.toString());
			sos.flush();
			sos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
