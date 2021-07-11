/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.application.student.password;

import com.kelvin.school.domain.student.Student;
import com.kelvin.school.domain.student.StudentPasswordCryptor;
import com.kelvin.school.domain.student.StudentRepository;

/**
 *
 * @author kelvin
 */
public class CreatePassword {
    
    private final StudentRepository repository;
    private final StudentPasswordCryptor cryptor;

    public CreatePassword(StudentRepository repository, StudentPasswordCryptor cryptor) {
        this.repository = repository;
        this.cryptor = cryptor;
    }

    public void execute(String code, String password) {
        Student student = repository.findByCode(code);
        student.setPassword(cryptor.encrypt(password));
        repository.update(code, student);
    }
}
