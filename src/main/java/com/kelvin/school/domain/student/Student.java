/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.domain.student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelvin
 */
public class Student {
    
    private final String code;
    private final String name;
    private final Email email;
    private final List<Phone> phones = new ArrayList<>();
    private String password;

    public Student(String code, String name, Email email) {
        this.code = code;
        this.name = name;
        this.email = email;
    }
    
    public void addPhone(String code, String number) {
        this.phones.add(new Phone(code, number));
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public Email getEmail() {
        return email;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", email=" + email + ", phones=" + phones + ", password=" + password + '}';
    }
    
}
