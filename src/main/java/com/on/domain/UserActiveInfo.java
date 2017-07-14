package com.on.domain;

import java.util.Date;

public class UserActiveInfo {

	private int id;
	private int userId;
	private int targetId;
	private int status;
	private Date createTime;
	private int finishDay;
	private String comment;
	
	public UserActiveInfo(int id, int userId, int targetId, int status, Date createTime, int finishDay, String comment) {
		this.id = id;
		this.userId = userId;
		this.targetId = targetId;
		this.status = status;
		this.createTime = createTime;
		this.finishDay = finishDay;
		this.comment = comment;
	}
	
	public UserActiveInfo(int id, int userId, int targetId, int status, Date createTime) {
		this.id = id;
		this.userId = userId;
		this.targetId = targetId;
		this.status = status;
		this.createTime = createTime;
	}
	
	public UserActiveInfo() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public int getTargetId() {
		return targetId;
	}
	public int getStatus() {
		return status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public int getFinishDay() {
		return finishDay;
	}
	public String getComment() {
		return comment;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setFinishDay(int finishDay) {
		this.finishDay = finishDay;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
