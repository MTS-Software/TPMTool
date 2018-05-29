package com.maintenance.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	private int id;
	private String name;
	private String mail;

	private List<Anlage> anlagen;

	private boolean active;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public List<Anlage> getAnlagen() {
		return anlagen;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setAnlagen(List<Anlage> anlagen) {
		this.anlagen = anlagen;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
