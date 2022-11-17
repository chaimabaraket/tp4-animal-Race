package com.example.animals.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.animals.entities.Animal;
import com.example.animals.service.AnimalService;



@RestController
@RequestMapping("/api")
@CrossOrigin

public class AnimalRESTController {

	@Autowired
	AnimalService animalService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Animal> getAllAnimals() {
	return animalService.getAllAnimals();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Animal getAnimalById(@PathVariable("id") Long id) {
	return animalService.getAnimal(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Animal createAnimal(@RequestBody Animal animal) {
	return animalService.saveAnimal(animal);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Animal updateProduit(@RequestBody Animal animal) {
	return animalService.updateAnimal(animal);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAnimal(@PathVariable("id") Long id)
	{
		animalService.deleteAnimalById(id);
	}
	
	@RequestMapping(value="/prodscat/{idAnim}",method = RequestMethod.GET)
	public List<Animal> getAnimalsByAnimId(@PathVariable("idAnim") Long idAnim) {
	return animalService.findByRaceIdAnim(idAnim);
	}

}
