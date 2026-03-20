package repository;

import entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<StudentEntity> studentEntities = new ArrayList<>();

    public List<StudentEntity> getAllStudentEntity() {
        return studentEntities;
    }

    public void saveStudentEntity(StudentEntity student) {
        studentEntities.add(student);
    }
}
