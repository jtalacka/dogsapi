package com.tieto.dogsapi.Service;

import com.tieto.dogsapi.model.Animal;
import com.tieto.dogsapi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AnimalDAO implements IAnimalDAO {

    @Autowired
    private AnimalRepository repository;

    @Override
    public List<Animal> findAll() {
        List<Animal> animals = (List<Animal>) repository.findAll();

        return animals;
    }
    public Animal findRandom()
    {
        List<Animal> animals=findAll();
        Random rand = new Random();
        int random = rand.nextInt(animals.size());

        return animals.get(random);

    }
}
