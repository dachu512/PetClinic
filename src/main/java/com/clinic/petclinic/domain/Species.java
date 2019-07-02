package com.clinic.petclinic.domain;

import javax.persistence.*;

@Entity
@Table(name="Species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String species;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
