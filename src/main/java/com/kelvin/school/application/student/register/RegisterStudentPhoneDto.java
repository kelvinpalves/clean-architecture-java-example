/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.application.student.register;

/**
 *
 * @author kelvin
 */
public class RegisterStudentPhoneDto {
    
    private String code;
    private String number;
    
    public RegisterStudentPhoneDto code(String code) {
        this.code = code;
        return this;
    }
    
    public RegisterStudentPhoneDto number(String number) {
        this.number = number;
        return this;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }
    
}
