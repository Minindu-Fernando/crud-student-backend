package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/student")
    Student persist(@RequestBody Student student){
        return studentService.presist(student);
    }
}
