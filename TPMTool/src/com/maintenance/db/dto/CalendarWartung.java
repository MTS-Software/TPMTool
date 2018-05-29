package com.maintenance.db.dto;

import java.util.Date;

public class CalendarWartung {

	private int id;
	private Date date;
	private String remark ;

	private Anlage anlage;

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getRemark() {
		return remark;
	}

	public Anlage getAnlage() {
		return anlage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setAnlage(Anlage anlage) {
		this.anlage = anlage;
	}

	
}
