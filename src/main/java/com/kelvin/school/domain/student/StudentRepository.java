/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.domain.student;

import java.util.List;

/**
 *
 * @author kelvin
 */
public interface StudentRepository {
    
    void register(Student student);
    
    void update(String code, Student student);
    
    Student findByCode(String code);
    
    List<Student> findAllStudentsRegistered();
    
}
