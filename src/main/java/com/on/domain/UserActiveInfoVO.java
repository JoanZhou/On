package com.on.domain;

public class UserActiveInfoVO {

	private int targetId;
	private int status;
	
	public UserActiveInfoVO(int targetId, int status) {
		this.targetId = targetId;
		this.status = status;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
