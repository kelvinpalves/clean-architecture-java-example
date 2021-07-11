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
public interface StudentPasswordCryptor {
    
    String encrypt(String password);
    
}
