package com.maintenance.db.dto;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.maintenance.model.User;

@Entity
@Table(name = "anlage")
public class Anlage {

	private int id;
	private String name;
	private String equipment;
	private String auftrag;
	private int jahresStueck;
	private int aktuelleStueck;
	private int wartungStueckIntervall;
	private int wartungDateIntervall;
	private int lastWartungStueckzahl;
	private Date lastWartungDate;
	private boolean auswertung;
	private int wartungStueckWarnung;
	private int wartungStueckFehler;
	private int wartungDateWarnung;
	private boolean status;
	private boolean subMenu;
	private int wartungArt;
	private String produkte;
	private int intervallDateUnit;
	private int warnungDateUnit;
	private int wartungUeberfaellig;
	private String wartungsplanLink;

	private Date createDate;
	private String user;
	private String timestamp;

	private double intervall;

	private int panelFormatId;
	private PanelFormat panelFormat;

	private int abteilungId;
	private Abteilung abteilung;

	private List<MESAnlage> mesAnlagen;

	private List<User> users;

	private Timestamp timestampSql;

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

	public int getJahresStueck() {
		return jahresStueck;
	}

	public int getAktuelleStueck() {
		return aktuelleStueck;
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

	public boolean isSubMenu() {
		return subMenu;
	}

	public int getWartungArt() {
		return wartungArt;
	}

	public String getProdukte() {
		return produkte;
	}

	public int getIntervallDateUnit() {
		return intervallDateUnit;
	}

	public int getWarnungDateUnit() {
		return warnungDateUnit;
	}

	public int getWartungUeberfaellig() {
		return wartungUeberfaellig;
	}

	public String getWartungsplanLink() {
		return wartungsplanLink;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getUser() {
		return user;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public double getIntervall() {
		return intervall;
	}

	public int getPanelFormatId() {
		return panelFormatId;
	}

	public PanelFormat getPanelFormat() {
		return panelFormat;
	}

	public int getAbteilungId() {
		return abteilungId;
	}

	public Abteilung getAbteilung() {
		return abteilung;
	}

	public List<MESAnlage> getMesAnlagen() {
		return mesAnlagen;
	}

	public List<User> getUsers() {
		return users;
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

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public void setAuftrag(String auftrag) {
		this.auftrag = auftrag;
	}

	public void setJahresStueck(int jahresStueck) {
		this.jahresStueck = jahresStueck;
	}

	public void setAktuelleStueck(int aktuelleStueck) {
		this.aktuelleStueck = aktuelleStueck;
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

	public void setSubMenu(boolean subMenu) {
		this.subMenu = subMenu;
	}

	public void setWartungArt(int wartungArt) {
		this.wartungArt = wartungArt;
	}

	public void setProdukte(String produkte) {
		this.produkte = produkte;
	}

	public void setIntervallDateUnit(int intervallDateUnit) {
		this.intervallDateUnit = intervallDateUnit;
	}

	public void setWarnungDateUnit(int warnungDateUnit) {
		this.warnungDateUnit = warnungDateUnit;
	}

	public void setWartungUeberfaellig(int wartungUeberfaellig) {
		this.wartungUeberfaellig = wartungUeberfaellig;
	}

	public void setWartungsplanLink(String wartungsplanLink) {
		this.wartungsplanLink = wartungsplanLink;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setIntervall(double intervall) {
		this.intervall = intervall;
	}

	public void setPanelFormatId(int panelFormatId) {
		this.panelFormatId = panelFormatId;
	}

	public void setPanelFormat(PanelFormat panelFormat) {
		this.panelFormat = panelFormat;
	}

	public void setAbteilungId(int abteilungId) {
		this.abteilungId = abteilungId;
	}

	public void setAbteilung(Abteilung abteilung) {
		this.abteilung = abteilung;
	}

	public void setMesAnlagen(List<MESAnlage> mesAnlagen) {
		this.mesAnlagen = mesAnlagen;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void setTimestampSql(Timestamp timestampSql) {
		this.timestampSql = timestampSql;
	}

}
