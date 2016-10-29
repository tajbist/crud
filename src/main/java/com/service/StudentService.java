package com.service;

import com.dao.StudentDao;
import com.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Oops on 7/23/2016.
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student addStudent(String name){
        Student student = new Student(name);

        return   studentDao.add(student);

    }
}
