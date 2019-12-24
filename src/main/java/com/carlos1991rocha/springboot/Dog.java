package com.carlos1991rocha.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Dog
 */
@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String raca;

    public Integer getId() {
        return id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}