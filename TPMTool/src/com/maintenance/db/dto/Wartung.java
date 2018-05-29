package com.maintenance.db.dto;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Wartung {

	private int id;
	private String auftrag;
	private Date date;
	private int prozent;
	private String mitarbeiter;
	private String info;
	private int status;
	private boolean tpm;

	private String timestamp;

	private Timestamp timestampSql;

	private int anlageId;
	private Anlage anlage;

	private Station station;
	private int stationId;

	private List<Anhang> anhangList;
	private boolean anhang;

	public int getId() {
		return id;
	}

	public String getAuftrag() {
		return auftrag;
	}

	public Date getDate() {
		return date;
	}

	public int getProzent() {
		return prozent;
	}

	public String getMitarbeiter() {
		return mitarbeiter;
	}

	public String getInfo() {
		return info;
	}

	public int getStatus() {
		return status;
	}

	public boolean isTpm() {
		return tpm;
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

	public Station getStation() {
		return station;
	}

	public int getStationId() {
		return stationId;
	}

	public List<Anhang> getAnhangList() {
		return anhangList;
	}

	public boolean isAnhang() {
		return anhang;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuftrag(String auftrag) {
		this.auftrag = auftrag;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setProzent(int prozent) {
		this.prozent = prozent;
	}

	public void setMitarbeiter(String mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setTpm(boolean tpm) {
		this.tpm = tpm;
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

	public void setStation(Station station) {
		this.station = station;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public void setAnhangList(List<Anhang> anhangList) {
		this.anhangList = anhangList;
	}

	public void setAnhang(boolean anhang) {
		this.anhang = anhang;
	}
	

	public enum EWartungArt {

		STUECKZAHL("Stückzahl"), TIME_INTERVALL("Zeitintervall");

		private String label;

		EWartungArt(String label) {
			this.label = label;

		}

		@Override
		public String toString() {
			return label;
		}

	}

}
