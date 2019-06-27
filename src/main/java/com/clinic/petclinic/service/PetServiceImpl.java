package com.clinic.petclinic.service;

import com.clinic.petclinic.domain.Pet;
import com.clinic.petclinic.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Iterable<Pet> findAllPet() {
        return petRepository.findAll();
    }

}
