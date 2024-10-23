package edu.icet.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.StudentEntity;
import edu.icet.crm.model.Student;
import edu.icet.crm.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ObjectMapper mapper;
    @Override

    public Student presist(Student student) {
        StudentEntity save = studentRepository.save(mapper.convertValue(student, StudentEntity.class));
        return mapper.convertValue(save, Student.class);
    }

    @Override
    public List<Student> retrive() {
        Iterable<StudentEntity> all = studentRepository.findAll();
        List<Student> studentModels = new ArrayList<>();
        all.forEach(studentEntity -> studentModels.add(mapper.convertValue(studentEntity, Student.class)));
        return studentModels;
    }
}
