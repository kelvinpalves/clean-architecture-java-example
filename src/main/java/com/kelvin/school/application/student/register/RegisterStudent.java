/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.application.student.register;

import com.kelvin.school.domain.student.StudentRepository;

/**
 *
 * @author kelvin
 */
public class RegisterStudent {
    
    private final StudentRepository repository;
    
    public RegisterStudent(StudentRepository repository) {
        this.repository = repository;
    }
    
    public void execute(RegisterStudentDto dto) {
        repository.register(dto.build());
    }
    
}
