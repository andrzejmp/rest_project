package com.ap.controllers;

import com.ap.DogRepository;
import com.ap.data.Dog;
import com.ap.data.entities.DogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping(("/dogs"))
public class DogController {

    @Autowired
    private DogRepository dogRepository;

@GetMapping
    public List<Dog> getAll(){
    System.out.println("get");
    return dogRepository.findAll()
           .stream()
           .map(item -> new Dog(item.getName(),new Date(), item.getBread()))
           .collect(toList());
}

@PostMapping
    public void postDog(@RequestBody Dog dog){
    System.out.println("post");
    dogRepository.save(new DogEntity(dog.getName(),dog.getBread()));

    System.out.println(dog.getName());
}
}
