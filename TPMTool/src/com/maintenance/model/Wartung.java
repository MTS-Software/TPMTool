package com.maintenance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wartung")
public class Wartung {

	private int id;
	private String auftragNr;
	private Date faellig;
	private int prozent;
	private String mitarbeiter;
	private String info;
	private boolean wartungNichtMoeglich;
	private int status;
	private boolean tpm;
	private Date timestamp;
	private String user;

	public int getId() {
		return id;
	}

	public String getAuftragNr() {
		return auftragNr;
	}

	public Date getFaellig() {
		return faellig;
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

	public boolean isWartungNichtMoeglich() {
		return wartungNichtMoeglich;
	}

	public int getStatus() {
		return status;
	}

	public boolean isTpm() {
		return tpm;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getUser() {
		return user;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAuftragNr(String auftragNr) {
		this.auftragNr = auftragNr;
	}

	public void setFaellig(Date faellig) {
		this.faellig = faellig;
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

	public void setWartungNichtMoeglich(boolean wartungNichtMoeglich) {
		this.wartungNichtMoeglich = wartungNichtMoeglich;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setTpm(boolean tpm) {
		this.tpm = tpm;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
