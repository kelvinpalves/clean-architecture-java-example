/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school.application.student.register;

import com.kelvin.school.domain.student.Email;
import com.kelvin.school.domain.student.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelvin
 */
public class RegisterStudentDto {
    
    private String nameStudent;
    private String codeStudent;
    private String emailStudent;
    private final List<RegisterStudentPhoneDto> phonesStudent = new ArrayList<>();
    
    public RegisterStudentDto addPhone(String code, String number) {
        this.phonesStudent.add(new RegisterStudentPhoneDto()
                .code(code)
                .number(number));
        
        return this;
    }
    
    public RegisterStudentDto name(String name) {
        this.nameStudent = name;
        return this;
    }
    
    public RegisterStudentDto code(String code) {
        this.codeStudent = code;
        return this;
    }
    
    public RegisterStudentDto email(String email) {
        this.emailStudent = email;
        return this;
    }
    
    public Student build() {
        Student student = new Student(codeStudent, nameStudent, new Email(emailStudent));
        this.phonesStudent.forEach(phone -> student.addPhone(phone.getCode(), phone.getNumber()));
        return student;
    }
    
}
