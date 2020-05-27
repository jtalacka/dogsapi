package com.tieto.dogsapi.Service;

import com.tieto.dogsapi.model.Animal;

import java.util.List;

public interface IAnimalDAO {

    List<Animal> findAll();
    public Animal findRandom();
}
