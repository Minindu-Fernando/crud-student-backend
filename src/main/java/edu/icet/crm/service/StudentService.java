package edu.icet.crm.service;

import edu.icet.crm.model.Student;

import java.util.List;

public interface StudentService {
    Student presist(Student student);

    List<Student> retrive();

    void removeStudent(Integer studentId);

    Student updateStudent(Integer studentId, Student student);

    Student searchStudent(Integer studentId);
}
