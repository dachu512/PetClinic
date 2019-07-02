package com.clinic.petclinic.repository;

import com.clinic.petclinic.domain.Species;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Long> {
}
