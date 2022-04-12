package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService stuService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student, HttpServletRequest http){
        stuService.saveStudent(student);
        return ResponseEntity.created(URI.create(http.getRequestURI())).body("O aluno foi adicionado com sucesso");
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudent(){
    List<Student> studentList = stuService.getStudents();
    return ResponseEntity.ok(studentList);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editStudent(@PathVariable Long id,
                                              @RequestBody String name,
                                              @RequestBody String lastname,
                                              HttpServletRequest http){
        Student stu = stuService.findStudent(id);
        stu.setName(name);
        stu.setLastname(lastname);
        stuService.saveStudent(stu);
        return ResponseEntity.created(URI.create(http.getRequestURI())).body("O aluno foi adicionado com sucesso");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        stuService.delectStudent(id);
        return ResponseEntity.ok().body("O aluno foi excluido com sucesso");
    }
}
