package tojoniaina.hei.td3.service;

import tojoniaina.hei.td3.entity.StudentEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private final List<StudentEntity> student = new ArrayList<>();

    public List<String> addStudent(List<StudentEntity> students) {
        student.addAll(students);
        return students.stream()
                .map(StudentEntity::getFirstname)
                .toList();
    }

    public List<String> listStudentName() {
        return student.stream()
                .map(StudentEntity::getFirstname)
                .toList();
    }

    public String getStudentNameAsText() {
        return student.stream()
                .map(StudentEntity::getFirstname)
                .collect(Collectors.joining(", "));
    }
}
