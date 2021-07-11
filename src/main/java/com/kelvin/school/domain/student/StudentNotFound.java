/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.domain.student;

/**
 *
 * @author kelvin
 */
public class StudentNotFound extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public StudentNotFound(String code) {
        super("Student not found with code: !" + code);
    }
    
}
