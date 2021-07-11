/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.application.student.get;

import com.kelvin.school.domain.student.Student;
import com.kelvin.school.domain.student.StudentRepository;

/**
 *
 * @author kelvin
 */
public class GetStudent {
    
    private final StudentRepository repository;

    public GetStudent(StudentRepository repository) {
        this.repository = repository;
    }
    
    public Student execute(String code) {
        return repository.findByCode(code);
    }

}
