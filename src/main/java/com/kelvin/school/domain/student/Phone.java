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
public class Phone {

    private String code;
    private String number;

    public Phone(String code, String number) {
        if (code == null || number == null) {
            throw new IllegalArgumentException("Code and number are required!");
        }

        if (!code.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid code!");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Invalid number!");
        }
        
        this.code = code;
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" + "code=" + code + ", number=" + number + '}';
    }
    
    

    
}
