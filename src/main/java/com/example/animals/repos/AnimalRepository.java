package com.example.animals.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.animals.entities.Animal;
import com.example.animals.entities.Race;

@RepositoryRestResource(path = "rest")


public interface AnimalRepository extends JpaRepository<Animal, Long> {
	
	List<Animal> findByNomAnimal(String nom);
	 List<Animal> findByNomAnimalContains(String nom);
	 
	 
	 @Query
	 ("select a from Animal a where a.nomAnimal like %?1 and a.genre > ?2")
	 List<Animal> findByNomGenre (String nom, String genre);
	 
	 @Query
	 ("select a from Animal a where a.race = ?1")
	 List<Animal> findByRace (Race race);
	 
	 @Query("select a from Animal a order by a.nomAnimal ASC, a.genre DESC")
		List<Animal> trierAnimalsNomsGenre ();
	List<Animal> findByOrderByNomAnimalAsc();
	List<Animal> findByRaceIdAnim(Long l);
	
	 
	 

}
