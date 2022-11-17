package com.example.animals.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.animals.entities.Animal;
import com.example.animals.entities.Race;

@Service
public interface AnimalService {
	Animal saveAnimal(Animal a);
	Animal updateAnimal(Animal a);
	void deleteAnimal(Animal a);
	 void deleteAnimalById(Long id);
	 Animal getAnimal(Long id);
	List<Animal> getAllAnimals();
	List<Animal> findByNomAnimal(String nom);
	List<Animal> findByNomAnimalContains(String nom);
	List<Animal> findByNomGenre (String nom, String genre);
	List<Animal> findByRace (Race race);
	List<Animal> findByRaceIdAnim(Long id);
	List<Animal> findByOrderByNomAnimalAsc();
	List<Animal> trierAnimalsNomsGenre();

}
