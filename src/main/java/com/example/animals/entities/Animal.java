package com.example.animals.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;
	private String nomAnimal;
	private String genre;
	private Date dateNaiss;
	
	@ManyToOne
	private Race race;

	public Animal() {
		super();
		
	}
	
	
	public Animal(String nomAnimal, String genre, Date dateNaiss) {
		super();
		this.nomAnimal = nomAnimal;
		this.genre = genre;
		this.dateNaiss = dateNaiss;
	}


	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}


	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nomAnimal=" + nomAnimal + ", genre=" + genre + ", dateNaiss="
				+ dateNaiss + "]";
	}


	public Race getRace() {
		return race;
	}


	public void setRace(Race race) {
		this.race = race;
	}
	
	

}
