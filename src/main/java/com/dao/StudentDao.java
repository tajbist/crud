package com.dao;

import com.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Oops on 7/23/2016.
 */
@Repository
public class StudentDao implements IStudent {
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public Student add(Student s) {
         /// TODO: 7/23/2016  call hibernate or jpa to save to database 
        return  s; 

    }

    @Override
    public Student get(int id) {
        return null;
    }

    @Override
    public void update(int id, Student s) {

    }

    @Override
    public void delete(int id) {

    }
}
