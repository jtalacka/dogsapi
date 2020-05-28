package com.tieto.dogsapi.Controller;

import com.tieto.dogsapi.Service.AnimalDAO;
import com.tieto.dogsapi.model.Animal;
import com.tieto.dogsapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogsController {
    @Autowired
    AnimalDAO animalDAO;

    @GetMapping("/getAll")
    public List<Animal> animal(){

        List<Animal> animals=animalDAO.findAll();

        return animals;
    }
    @CrossOrigin
    @GetMapping("/get")
    public Animal getOne(){

        Animal animal=animalDAO.findRandom();

        return animal;
    }

}
