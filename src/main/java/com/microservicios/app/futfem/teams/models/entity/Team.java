package com.microservicios.app.futfem.teams.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String country;
	private String nickname;
	private String urlpic;
	private String urlshirt;
	@Column(name = "established")
	private Date established;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getEstablished() {
		return established;
	}

	public void setEstablished(Date established) {
		this.established = established;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUrlpic() {
		return urlpic;
	}

	public void setUrlpic(String urlpic) {
		this.urlpic = urlpic;
	}

	public String getUrlshirt() {
		return urlshirt;
	}

	public void setUrlshirt(String urlshirt) {
		this.urlshirt = urlshirt;
	}

}
