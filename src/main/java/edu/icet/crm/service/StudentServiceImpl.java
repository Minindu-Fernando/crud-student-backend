package edu.icet.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.StudentEntity;
import edu.icet.crm.model.Student;
import edu.icet.crm.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public void removeStudent(Integer studentId) {
        Optional<StudentEntity> byId = studentRepository.findById(studentId);
        StudentEntity studentEntity = mapper.convertValue(byId, StudentEntity.class);
        studentRepository.delete(studentEntity);
    }
}
