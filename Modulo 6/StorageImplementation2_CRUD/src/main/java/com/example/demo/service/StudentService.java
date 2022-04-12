package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    private final StudentRepository stuRepo;

    public StudentService(StudentRepository stuRepo) {
        this.stuRepo = stuRepo;
    }


    @Override
    public List<Student> getStudents() {
        List<Student> studentList = stuRepo.findAll();
        return studentList;
    }

    @Override
    public void saveStudent(Student stu) {
        stuRepo.save(stu);
    }

    @Override
    public void delectStudent(Long id) {
        stuRepo.deleteById(id);
    }

    @Override
    public Student findStudent(Long id) {
        Student stu = stuRepo.findById(id).orElse(null);
        return stu;
    }
}
