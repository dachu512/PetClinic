package com.clinic.petclinic.service;

import com.clinic.petclinic.domain.Exam;

public interface ExamService {

    Exam saveExam(Exam exam);

    Iterable<Exam> findAllExam();
}


