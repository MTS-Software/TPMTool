package com.maintenance.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "anlage")
public class Anlage {

	private int id;
	private String name;

	private String equipment;
	private String auftragNr;

	private int jahresStueck;
	private int aktuelleStueck;
	private int wartungStueckIntervall;
	private int wartungDateIntervall;
	private int lastWartungStueck;

	private Date lastWartungDate;

	private int wartungStueckWarnung;
	private int wartungStueckFehler;
	private int wartungDateWarnung;

	private boolean auswertung;
	private boolean status;
	private boolean subMenu;

	private int wartungArt;
	private String wartungsPlanLink;
	private String produkte;

	private int intervallDateUnit;
	private int warnungDateUnit;
	private int wartungUeberfaellig;

	private boolean mailSent;

	private Date createDate;
	private Date timestamp;
	private String user;

	private List<Station> stationen;
	private List<User> users;

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

	public boolean isSubMenu() {
		return subMenu;
	}

	public int getWartungArt() {
		return wartungArt;
	}

	public String getWartungsPlanLink() {
		return wartungsPlanLink;
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

	public List<Station> getStationen() {
		return stationen;
	}

	public List<User> getUsers() {
		return users;
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

	public void setSubMenu(boolean subMenu) {
		this.subMenu = subMenu;
	}

	public void setWartungArt(int wartungArt) {
		this.wartungArt = wartungArt;
	}

	public void setWartungsPlanLink(String wartungsPlanLink) {
		this.wartungsPlanLink = wartungsPlanLink;
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

	public void setStationen(List<Station> stationen) {
		this.stationen = stationen;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
