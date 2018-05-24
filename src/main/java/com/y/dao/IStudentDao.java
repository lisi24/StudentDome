package com.y.dao;

import org.apache.ibatis.annotations.Mapper;

import com.y.model.Student;

import java.util.List;

@Mapper
public interface IStudentDao {

    int add(Student student);

    List<Student> selectStudent();

    int deleteStudent(int id);

    int updateStudent(Student student);

    Student selectById(int id);
}
