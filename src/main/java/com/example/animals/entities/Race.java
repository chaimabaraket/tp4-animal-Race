package com.example.animals.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Race {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnim;
	private String nomAnim;
	private String descriptionAnim;
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<Animal> animals;

	
	public Race() {
		super();
	
	}
	public Long getIdAnim() {
		return idAnim;
	}
	public void setIdAnim(Long idAnim) {
		this.idAnim = idAnim;
	}
	public String getNomAnim() {
		return nomAnim;
	}
	public void setNomAnim(String nomAnim) {
		this.nomAnim = nomAnim;
	}
	public String getDescriptionAnim() {
		return descriptionAnim;
	}
	public void setDescriptionAnim(String descriptionAnim) {
		this.descriptionAnim = descriptionAnim;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}


}
