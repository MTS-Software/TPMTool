package com.maintenance.db.dto;

import java.sql.Timestamp;

public class Leerflaeche {

	private int id;
	private String name;
	private String timestampString;
	private String user;

	private Timestamp timestampSql;

	private int panelFormatId;
	private PanelFormat panelFormat;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTimestampString() {
		return timestampString;
	}
	public String getUser() {
		return user;
	}
	public Timestamp getTimestampSql() {
		return timestampSql;
	}
	public int getPanelFormatId() {
		return panelFormatId;
	}
	public PanelFormat getPanelFormat() {
		return panelFormat;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTimestampString(String timestampString) {
		this.timestampString = timestampString;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setTimestampSql(Timestamp timestampSql) {
		this.timestampSql = timestampSql;
	}
	public void setPanelFormatId(int panelFormatId) {
		this.panelFormatId = panelFormatId;
	}
	public void setPanelFormat(PanelFormat panelFormat) {
		this.panelFormat = panelFormat;
	}

	

}
