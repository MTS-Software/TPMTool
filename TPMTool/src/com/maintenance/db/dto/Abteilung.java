package com.maintenance.db.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class Abteilung implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String timestampString;
	private String user;

	private Timestamp timestampSql;

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

}
