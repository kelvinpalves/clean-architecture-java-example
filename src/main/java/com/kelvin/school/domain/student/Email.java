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
public class Email {
    private String address;
    
    public Email(String address) {
        if (address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid e-mail.");
        }
        this.address = address;
    }
    
    public String getAdress() {
        return address;
    }

    @Override
    public String toString() {
        return "Email{" + "address=" + address + '}';
    }
    
}
