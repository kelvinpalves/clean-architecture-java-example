/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelvin.school;

import com.kelvin.school.application.student.get.GetStudent;
import com.kelvin.school.application.student.password.CreatePassword;
import com.kelvin.school.application.student.register.RegisterStudent;
import com.kelvin.school.application.student.register.RegisterStudentDto;
import com.kelvin.school.domain.student.Student;
import com.kelvin.school.domain.student.StudentPasswordCryptor;
import com.kelvin.school.domain.student.StudentRepository;
import com.kelvin.school.infrastructure.student.StudentPasswordMD5Cryptor;
import com.kelvin.school.infrastructure.student.StudentRepositoryInMemory;

/**
 *
 * @author kelvin
 */
public class RegisterStudentByCommandLine {
    public static void main (String [] args) {
        
        StudentRepository repository = new StudentRepositoryInMemory();
        RegisterStudent registerStudent = new RegisterStudent(repository);
        
        String code = "123456789";
        
        registerStudent.execute(new RegisterStudentDto()
                .code(code)
                .name("Kelvin Pereira Alves")
                .email("kelvinpalves@gmail.com")
                .addPhone("51", "998619645")
                .addPhone("51", "998619647"));
        
        GetStudent getStudent = new GetStudent(repository);
        
        Student registered = getStudent.execute(code);
        
        System.out.println(registered);
        
        StudentPasswordCryptor cryptor = new StudentPasswordMD5Cryptor();
        
        CreatePassword createPassword = new CreatePassword(repository, cryptor);
        createPassword.execute(code, "1234");
        
        Student studentWithPassword = getStudent.execute(code);
        
        System.out.println(studentWithPassword);
       
        
        
    }
}
