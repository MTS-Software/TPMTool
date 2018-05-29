package com.maintenance.db.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Station {

	private int id;
	private String name;
	private String equipment;
	private String auftrag;
	private int wartungStueckIntervall ;
	private int wartungDateIntervall ;
	private int lastWartungStueckzahl ;
	private Date lastWartungDate;
	private boolean auswertung;
	private int wartungStueckWarnung ;
	private int wartungStueckFehler ;
	private int wartungDateWarnung ;
	private boolean status;
	private boolean tpm;
	private boolean mailSent;
	private int wartungArt ;
	private int intervallDateUnit ;
	private int warnungDateUnit ;
	private String wartungsplanLink;
	private String user;

	private Date createDate;
	private String timestamp;
	private Timestamp timestampSql;

	private int panelFormatId;
	private PanelFormat panelFormat;

	private int anlageId;
	private Anlage anlage;

	private List<Wartung> wartungList = new ArrayList<Wartung>();

	private List<Anhang> anhangList;
	private boolean anhang;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEquipment() {
		return equipment;
	}
	public String getAuftrag() {
		return auftrag;
	}
	public int getWartungStueckIntervall() {
		return wartungStueckIntervall;
	}
	public int getWartungDateIntervall() {
		return wartungDateIntervall;
	}
	public int getLastWartungStueckzahl() {
		return lastWartungStueckzahl;
	}
	public Date getLastWartungDate() {
		return lastWartungDate;
	}
	public boolean isAuswertung() {
		return auswertung;
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
	public boolean isStatus() {
		return status;
	}
	public boolean isTpm() {
		return tpm;
	}
	public boolean isMailSent() {
		return mailSent;
	}
	public int getWartungArt() {
		return wartungArt;
	}
	public int getIntervallDateUnit() {
		return intervallDateUnit;
	}
	public int getWarnungDateUnit() {
		return warnungDateUnit;
	}
	public String getWartungsplanLink() {
		return wartungsplanLink;
	}
	public String getUser() {
		return user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public String getTimestamp() {
		return timestamp;
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
	public int getAnlageId() {
		return anlageId;
	}
	public Anlage getAnlage() {
		return anlage;
	}
	public List<Wartung> getWartungList() {
		return wartungList;
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
	public void setName(String name) {
		this.name = name;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public void setAuftrag(String auftrag) {
		this.auftrag = auftrag;
	}
	public void setWartungStueckIntervall(int wartungStueckIntervall) {
		this.wartungStueckIntervall = wartungStueckIntervall;
	}
	public void setWartungDateIntervall(int wartungDateIntervall) {
		this.wartungDateIntervall = wartungDateIntervall;
	}
	public void setLastWartungStueckzahl(int lastWartungStueckzahl) {
		this.lastWartungStueckzahl = lastWartungStueckzahl;
	}
	public void setLastWartungDate(Date lastWartungDate) {
		this.lastWartungDate = lastWartungDate;
	}
	public void setAuswertung(boolean auswertung) {
		this.auswertung = auswertung;
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
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setTpm(boolean tpm) {
		this.tpm = tpm;
	}
	public void setMailSent(boolean mailSent) {
		this.mailSent = mailSent;
	}
	public void setWartungArt(int wartungArt) {
		this.wartungArt = wartungArt;
	}
	public void setIntervallDateUnit(int intervallDateUnit) {
		this.intervallDateUnit = intervallDateUnit;
	}
	public void setWarnungDateUnit(int warnungDateUnit) {
		this.warnungDateUnit = warnungDateUnit;
	}
	public void setWartungsplanLink(String wartungsplanLink) {
		this.wartungsplanLink = wartungsplanLink;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
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
	public void setAnlageId(int anlageId) {
		this.anlageId = anlageId;
	}
	public void setAnlage(Anlage anlage) {
		this.anlage = anlage;
	}
	public void setWartungList(List<Wartung> wartungList) {
		this.wartungList = wartungList;
	}
	public void setAnhangList(List<Anhang> anhangList) {
		this.anhangList = anhangList;
	}
	public void setAnhang(boolean anhang) {
		this.anhang = anhang;
	}

	
	
	
}
