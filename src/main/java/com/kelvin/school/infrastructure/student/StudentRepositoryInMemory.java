/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.infrastructure.student;

import com.kelvin.school.domain.student.StudentNotFound;
import com.kelvin.school.domain.student.Student;
import com.kelvin.school.domain.student.StudentRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelvin
 */
public class StudentRepositoryInMemory implements StudentRepository {
    
    private final List<Student> registered = new ArrayList<>();

    @Override
    public void register(Student student) {
        this.registered.add(student);
    }

    @Override
    public Student findByCode(String code) {
        return this.registered.stream()
                .filter(student -> student.getCode().equals(code))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(code));
    }

    @Override
    public List<Student> findAllStudentsRegistered() {
        return this.registered;
    }

    @Override
    public void update(String code, Student student) {
        int index = getIndexByCode(code);
        this.registered.set(index, student);
    }
    
    private int getIndexByCode(String code) {
        for (int i = 0; i < this.registered.size(); i++) {
            Student student = registered.get(i);
            
            if (student.getCode().equals(code)) {
                return i;
            }
        }
        
        return -1;
    }
    
}
