package com.godoro.pattern2;

public class School {
	
	private int id;
	private String SchlName;
	private double schlNo;
	public School(int id, String schlName, double schlNo) {
		this.id = id;
		SchlName = schlName;
		this.schlNo = schlNo;
	}
	public School() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchlName() {
		return SchlName;
	}
	public void setSchlName(String schlName) {
		SchlName = schlName;
	}
	public double getSchlNo() {
		return schlNo;
	}
	public void setSchlNo(double schlNo) {
		this.schlNo = schlNo;
	}
	
	

	
	
}
