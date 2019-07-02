package com.clinic.petclinic.repository;

import com.clinic.petclinic.domain.Perm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermRepository extends CrudRepository<Perm, Long> {
}
