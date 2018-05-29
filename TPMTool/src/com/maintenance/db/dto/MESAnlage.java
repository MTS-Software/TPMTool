package com.maintenance.db.dto;

import java.sql.Timestamp;

public class MESAnlage {

	private int id;
	private String name;
	private int prodStueck;
	private String timestamp;

	private Timestamp timestampSql;

	private int anlageId;
	private Anlage anlage;

	private int anlage2Id;
	private Anlage anlage2;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getProdStueck() {
		return prodStueck;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public Timestamp getTimestampSql() {
		return timestampSql;
	}
	public int getAnlageId() {
		return anlageId;
	}
	public Anlage getAnlage() {
		return anlage;
	}
	public int getAnlage2Id() {
		return anlage2Id;
	}
	public Anlage getAnlage2() {
		return anlage2;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProdStueck(int prodStueck) {
		this.prodStueck = prodStueck;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setTimestampSql(Timestamp timestampSql) {
		this.timestampSql = timestampSql;
	}
	public void setAnlageId(int anlageId) {
		this.anlageId = anlageId;
	}
	public void setAnlage(Anlage anlage) {
		this.anlage = anlage;
	}
	public void setAnlage2Id(int anlage2Id) {
		this.anlage2Id = anlage2Id;
	}
	public void setAnlage2(Anlage anlage2) {
		this.anlage2 = anlage2;
	}

	

}
