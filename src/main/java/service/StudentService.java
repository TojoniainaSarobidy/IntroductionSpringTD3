package service;

import entity.StudentEntity;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<String> createStudents(List<StudentEntity> students) {
        for (StudentEntity se : students) {
            studentRepository.saveStudentEntity(se);
        }
        List<StudentEntity> Students = studentRepository.getAllStudentEntity();
        List<String> listName = new ArrayList<>();
        for (StudentEntity se : Students) {
            listName.add(se.getFirstname());
        }
        return listName;
    }

    public List<String> getAllStudentNames() {
        List<StudentEntity> students = studentRepository.getAllStudentEntity();
        List<String> names = new ArrayList<>();
        for (StudentEntity s : students) {
            names.add(s.getFirstname());
        }
        return names;
    }
}
