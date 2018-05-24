package com.y.service;

import com.y.model.Student;

import java.util.List;

public interface IStudentService {

    int add(Student student);

    List<Student> selectStudent();

    int deleteStudent(int id);

    int updateStudent(Student student);

    Student selectById(int id);
}
