package com.example.animals;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.animals.entities.Animal;
import com.example.animals.entities.Race;
import com.example.animals.repos.AnimalRepository;
import com.example.animals.service.AnimalService;

@SpringBootTest(classes = AnimalService.class)

class AnimalApplicationTests {

	@Autowired
	private AnimalRepository animalRepository;

	@Test
	public void testCreateAnimal() {
		Animal prod = new Animal("mailou", "female", new Date());
		animalRepository.save(prod);
	}

	@Test
	public void testFindAnimal() {
		Animal a = animalRepository.findById(4L).get();
		System.out.println(a);
	}

	@Test
	public void testUpdateAnimal() {
		Animal a = animalRepository.findById(1L).get();
		a.setNomAnimal("bibi");
		animalRepository.save(a);
	}

	@Test
	public void testDeleteAnimal() {
		animalRepository.deleteById(2L);
		;
	}

	@Test
	public void testListerTousAnimal() {
		List<Animal> anim = animalRepository.findAll();
		for (Animal a : anim) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomAnimal() {
		List<Animal> anim = animalRepository.findByNomAnimal("bichou");
		for (Animal a : anim) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByNomAnimalContains() {
		List<Animal> anim = animalRepository.findByNomAnimalContains("m");
		for (Animal a : anim) {
			System.out.println(a);
		}
	}

	@Test
	public void testfindByNomGenre() {
		List<Animal> anim = animalRepository.findByNomGenre("bichou", "male");
		for (Animal a : anim) {
			System.out.println(a);
		}
	}

	@Test
	public void testfindByRace() {
		Race cat = new Race();
		cat.setIdAnim(2L);
		List<Animal> anim = animalRepository.findByRace(cat);
		for (Animal a : anim) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindByRaceIdAnim() {
		List<Animal> prods = animalRepository.findByRaceIdAnim(1L);
		for (Animal p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void TestFindByOrderByNomAnimalAsc() {
		List<Animal> prods = animalRepository.findByOrderByNomAnimalAsc();
		for (Animal p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testTrierAnimalsNomsGenre() {
		List<Animal> prods = animalRepository.trierAnimalsNomsGenre();
		for (Animal p : prods) {
			System.out.println(p);
		}
	}
}
