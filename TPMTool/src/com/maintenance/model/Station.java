package com.maintenance.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station {

	private int id;
	private String name;
	private String equipment;
	private String auftragNr;

	private int wartungStueckIntervall;
	private int wartungDateIntervall;
	private int lastWartungStueck;

	private Date lastWartungDate;

	private int wartungStueckWarnung;
	private int wartungStueckFehler;
	private int wartungDateWarnung;

	private boolean auswertung;
	private boolean status;
	private boolean tpm;

	private int wartungArt;
	private String wartungsPlanLink;
	private int intervallDateUnit;
	private int warnungDateUnit;

	private boolean mailSent;

	private Date createDate;
	private Date timestamp;
	private String user;

	private Anlage anlage;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEquipment() {
		return equipment;
	}

	public String getAuftragNr() {
		return auftragNr;
	}

	public int getWartungStueckIntervall() {
		return wartungStueckIntervall;
	}

	public int getWartungDateIntervall() {
		return wartungDateIntervall;
	}

	public int getLastWartungStueck() {
		return lastWartungStueck;
	}

	public Date getLastWartungDate() {
		return lastWartungDate;
	}

	public int getWartungStueckWarnung() {
		return wartungStueckWarnung;
	}

	public int getWartungStueckFehler() {
		return wartungStueckFehler;
	}

	public int getWartungDateWarnung() {
		return wartungDateWarnung;
	}

	public boolean isAuswertung() {
		return auswertung;
	}

	public boolean isStatus() {
		return status;
	}

	public boolean isTpm() {
		return tpm;
	}

	public int getWartungArt() {
		return wartungArt;
	}

	public String getWartungsPlanLink() {
		return wartungsPlanLink;
	}

	public int getIntervallDateUnit() {
		return intervallDateUnit;
	}

	public int getWarnungDateUnit() {
		return warnungDateUnit;
	}

	public boolean isMailSent() {
		return mailSent;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getUser() {
		return user;
	}

	public Anlage getAnlage() {
		return anlage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public void setAuftragNr(String auftragNr) {
		this.auftragNr = auftragNr;
	}

	public void setWartungStueckIntervall(int wartungStueckIntervall) {
		this.wartungStueckIntervall = wartungStueckIntervall;
	}

	public void setWartungDateIntervall(int wartungDateIntervall) {
		this.wartungDateIntervall = wartungDateIntervall;
	}

	public void setLastWartungStueck(int lastWartungStueck) {
		this.lastWartungStueck = lastWartungStueck;
	}

	public void setLastWartungDate(Date lastWartungDate) {
		this.lastWartungDate = lastWartungDate;
	}

	public void setWartungStueckWarnung(int wartungStueckWarnung) {
		this.wartungStueckWarnung = wartungStueckWarnung;
	}

	public void setWartungStueckFehler(int wartungStueckFehler) {
		this.wartungStueckFehler = wartungStueckFehler;
	}

	public void setWartungDateWarnung(int wartungDateWarnung) {
		this.wartungDateWarnung = wartungDateWarnung;
	}

	public void setAuswertung(boolean auswertung) {
		this.auswertung = auswertung;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setTpm(boolean tpm) {
		this.tpm = tpm;
	}

	public void setWartungArt(int wartungArt) {
		this.wartungArt = wartungArt;
	}

	public void setWartungsPlanLink(String wartungsPlanLink) {
		this.wartungsPlanLink = wartungsPlanLink;
	}

	public void setIntervallDateUnit(int intervallDateUnit) {
		this.intervallDateUnit = intervallDateUnit;
	}

	public void setWarnungDateUnit(int warnungDateUnit) {
		this.warnungDateUnit = warnungDateUnit;
	}

	public void setMailSent(boolean mailSent) {
		this.mailSent = mailSent;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setAnlage(Anlage anlage) {
		this.anlage = anlage;
	}

}
