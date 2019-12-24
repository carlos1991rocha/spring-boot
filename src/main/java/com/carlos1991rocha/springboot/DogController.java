package com.carlos1991rocha.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * DogController
 */
@RestController
@RequestMapping({"/dog"})
public class DogController {

    @Autowired
    private DogRepository dogRepository;

    @PostMapping
    public @ResponseBody Dog create(@RequestBody Dog dog) {
        return dogRepository.save(dog);

    }

    @GetMapping
    public @ResponseBody Iterable<Dog> getAll() {
        return dogRepository.findAll();

    }

    @GetMapping({"/{id}"})
    public @ResponseBody Optional<Dog> getById(@PathVariable Integer id) {
        return dogRepository.findById(id);

    }

    @DeleteMapping({"/{id}"})
    public @ResponseBody Optional<Dog> deleteById(@PathVariable Integer id) {
        Optional<Dog> dog = dogRepository.findById(id);

        dogRepository.deleteById(id);

        return dog;

    }
}