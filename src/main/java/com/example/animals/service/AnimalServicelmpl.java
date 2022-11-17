package com.example.animals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.animals.entities.Animal;
import com.example.animals.entities.Race;
import com.example.animals.repos.AnimalRepository;



@Service
public class AnimalServicelmpl implements AnimalService {
	@Autowired
	AnimalRepository animalRepository;
	

	@Override
	public Animal saveAnimal(Animal a) {
		return animalRepository.save(a);
	
	}

	@Override
	public Animal updateAnimal(Animal a) {
		return animalRepository.save(a);
	}

	@Override
	public void deleteAnimal(Animal a) {
		 animalRepository.delete(a);
		
	}

	@Override
	public void deleteAnimalById(Long id) {
		animalRepository.deleteById(id);
	}

	@Override
	public Animal getAnimal(Long id) {
		
		return animalRepository.findById(id).get();

	}

	@Override
	public List<Animal> getAllAnimals() {
		
		return animalRepository.findAll();
	}
	@Override
	public List<Animal> findByNomAnimal(String nom) {
		return animalRepository.findByNomAnimal(nom);
	
	}

	@Override
	public List<Animal> findByNomAnimalContains(String nom) {
		return animalRepository.findByNomAnimalContains(nom);
	}

	@Override
	public List<Animal> findByNomGenre(String nom, String genre) {
		return animalRepository.findByNomGenre(nom, genre);
	}

	@Override
	public List<Animal> findByRace(Race race) {
		return animalRepository.findByRace(race);
	}

	@Override
	public List<Animal> findByRaceIdAnim(Long id) {
		return animalRepository.findByRaceIdAnim(id);
	}

	@Override
	public List<Animal> findByOrderByNomAnimalAsc() {
	
		return animalRepository.findByOrderByNomAnimalAsc();
	}

	@Override
	public List<Animal> trierAnimalsNomsGenre() {
		
		return animalRepository.trierAnimalsNomsGenre();
	}

	

}
