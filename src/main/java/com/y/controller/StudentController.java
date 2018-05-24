package com.y.controller;

import com.y.model.Student;
import com.y.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping(value = "/index")
    public ModelAndView lookStudent(ModelAndView mov){
        List<Student> list = studentService.selectStudent();
        mov.addObject("list",list);
        mov.setViewName("index");
        return mov;
    }

    @GetMapping(value = "/bb")
    public ModelAndView addStudent(ModelAndView mov,Student student){
        studentService.add(student);
        mov.setViewName("add");
        return mov;
    }

    @RequestMapping(value = "/add")
    public ModelAndView toAddPaper(ModelAndView mov){
        mov.setViewName("add");
        return mov;
    }
}
