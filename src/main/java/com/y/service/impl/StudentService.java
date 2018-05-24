package com.y.service.impl;

import com.y.dao.IStudentDao;
import com.y.model.Student;
import com.y.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao dao;
    @Override
    public int add(Student student) {
        return dao.add(student);
    }

    @Override
    public List<Student> selectStudent() {
        return dao.selectStudent();
    }

    @Override
    public int deleteStudent(int id) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }

    @Override
    public Student selectById(int id) {
        return null;
    }
}
