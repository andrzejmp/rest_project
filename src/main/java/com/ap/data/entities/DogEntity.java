package com.ap.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DogEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String name;
String bread;

    public DogEntity(){

    }

    public DogEntity(String name, String bread) {

        this.name = name;
        this.bread = bread;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
