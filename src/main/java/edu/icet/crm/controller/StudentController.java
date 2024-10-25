package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/student")
    Student persist(@RequestBody Student student){
        return studentService.presist(student);
    }

    @GetMapping("/student")
    List<Student> retrive(){
        return studentService.retrive();
    }

    @DeleteMapping("/student")
    void remove(@RequestParam(name = "id") Integer studentId){
        studentService.removeStudent(studentId);
    }

    @PutMapping("/student")
    Student update(@RequestParam(name = "id") Integer studentId, @RequestBody Student student){
        return studentService.updateStudent(studentId,student);
    }

    @GetMapping("/students")
    Student getStudent(@RequestParam(name = "id") Integer studentId){
        return studentService.searchStudent(studentId);
    }
}
