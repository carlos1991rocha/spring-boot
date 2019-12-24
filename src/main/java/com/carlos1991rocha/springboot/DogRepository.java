package com.carlos1991rocha.springboot;

import org.springframework.data.repository.CrudRepository;

/**
 * DogDao
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {


}