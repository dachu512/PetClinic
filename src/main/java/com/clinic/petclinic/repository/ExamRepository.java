package com.clinic.petclinic.repository;

import com.clinic.petclinic.domain.Exam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Long> {

}
