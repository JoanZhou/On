package com.on.domain;

import java.util.Date;

public class StyleGoal {

	private int styleId;
	private int type;
	private int goalDays;
	private int goalDistance;
	private int kilosDay;
	private double mul;
	private int deposit;
	private int bail;
	private double kilos;
	private double finAll;
	private Date date;
	private double bonusAll;
	
	public StyleGoal(int styleId, int type, int goalDays, int goalDistance, int kilosDay, 
			double mul, int deposit, int bail, double kilos, double finAll, Date date, double bonusAll) {
		this.styleId = styleId;
		this.type = type;
		this.goalDays = goalDays;
		this.goalDistance = goalDistance;
		this.kilosDay = kilosDay;
		this.mul = mul;
		this.deposit = deposit;
		this.bail = bail;
		this.kilos = kilos;
		this.finAll = finAll;
		this.date = date;
		this.bonusAll = bonusAll;
	}
	
	public StyleGoal(int styleId, int type, int goalDays, int goalDistance, 
			double mul, int deposit, int bail, double kilos, double finAll, Date date, double bonusAll) {
		this.styleId = styleId;
		this.type = type;
		this.goalDays = goalDays;
		this.goalDistance = goalDistance;
		this.mul = mul;
		this.deposit = deposit;
		this.bail = bail;
		this.kilos = kilos;
		this.finAll = finAll;
		this.date = date;
		this.bonusAll = bonusAll;
	}
	
	public int getStyleId() {
		return styleId;
	}
	public int getType() {
		return type;
	}
	public int getGoalDays() {
		return goalDays;
	}
	public int getGoalDistance() {
		return goalDistance;
	}
	public int getKilosDay() {
		return kilosDay;
	}
	public double getMul() {
		return mul;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getBail() {
		return bail;
	}
	public double getKilos() {
		return kilos;
	}
	public double getFinAll() {
		return finAll;
	}
	public Date getDate() {
		return date;
	}
	public double getBonusAll() {
		return bonusAll;
	}
	public void setStyleId(int styleId) {
		this.styleId = styleId;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setGoalDays(int goalDays) {
		this.goalDays = goalDays;
	}
	public void setGoalDistance(int goalDistance) {
		this.goalDistance = goalDistance;
	}
	public void setKilosDay(int kilosDay) {
		this.kilosDay = kilosDay;
	}
	public void setMul(double mul) {
		this.mul = mul;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setBail(int bail) {
		this.bail = bail;
	}
	public void setKilos(double kilos) {
		this.kilos = kilos;
	}
	public void setFinAll(double finAll) {
		this.finAll = finAll;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setBonusAll(double bonusAll) {
		this.bonusAll = bonusAll;
	}
	
}
