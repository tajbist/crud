package com.dao;

import com.domain.Student;

import java.util.List;

/**
 * Created by Oops on 7/23/2016.
 */
public interface IStudent {
public abstract List<Student> getAll();
    public abstract Student add(Student s);
    public abstract Student get(int id);
    public abstract void update(int id,Student s);
    public abstract void delete(int id);
}
