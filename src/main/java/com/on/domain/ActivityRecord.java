package com.on.domain;

public class ActivityRecord {
	private int activityID;
	private int activityType;
	private int activityLevel;
	private int attendPeople;
	private float acoefficient;
	private int totalBonus;
	
	public ActivityRecord(int activityID, int activityType, int activityLevel, int attendPeople, float acoefficient, int totalBonus){
		this.activityID = activityID;
		this.activityType = activityType;
		this.activityLevel = activityLevel;
		this.attendPeople = attendPeople;
		this.acoefficient = acoefficient;
		this.totalBonus = totalBonus;
	}
	
	public ActivityRecord(int activityID, int activityType, int activityLevel, int attendPeople, int totalBonus){
		this.activityID = activityID;
		this.activityType = activityType;
		this.activityLevel = activityLevel;
		this.attendPeople = attendPeople;
		this.totalBonus = totalBonus;
	}

	public int getActivityID() {
		return activityID;
	}

	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	public int getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(int activityLevel) {
		this.activityLevel = activityLevel;
	}

	public int getAttendPeople() {
		return attendPeople;
	}

	public void setAttendPeople(int attendPeople) {
		this.attendPeople = attendPeople;
	}

	public float getAcoefficient() {
		return acoefficient;
	}

	public void setAcoefficient(float acoefficient) {
		this.acoefficient = acoefficient;
	}

	public int getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(int totalBonus) {
		this.totalBonus = totalBonus;
	}

}
