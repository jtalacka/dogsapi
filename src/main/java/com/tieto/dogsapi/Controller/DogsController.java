package com.tieto.dogsapi.Controller;

import com.tieto.dogsapi.Model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogsController {

    @GetMapping("/get")
    public Animal animal(@RequestParam(value="name",defaultValue = "World")String name){
        Animal animal1=new Animal(1,"Some fact","dog");
        return animal1;
    }

}
