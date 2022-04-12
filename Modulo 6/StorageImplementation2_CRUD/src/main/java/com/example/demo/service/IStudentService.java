package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface IStudentService{
    public List<Student> getStudents();
    public void saveStudent(Student stu);
    public void delectStudent(Long id);
    public Student findStudent(Long id);
}
