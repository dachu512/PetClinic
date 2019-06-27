package com.clinic.petclinic.service;

import com.clinic.petclinic.domain.Pet;

public interface PetService {

    Pet savePet(Pet pet);

    Iterable<Pet> findAllPet();
}
