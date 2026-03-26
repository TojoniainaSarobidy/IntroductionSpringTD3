package tojoniaina.hei.td3.validator;

import tojoniaina.hei.td3.entity.StudentEntity;
import tojoniaina.hei.td3.exception.BadRequestException;

import java.util.List;

public class StudentValidator {
    public void validate(List<StudentEntity> students) {
        if (students == null) {
            throw new BadRequestException("Students list cannot be null");
        }
        for (StudentEntity student : students) {
            if (student.getReference() == null || student.getReference().isBlank()) {
                throw new BadRequestException("Student reference is required");
            }
            if (student.getFirstname() == null || student.getFirstname().isBlank()) {
                throw new BadRequestException("Student firstname is required");
            }
            if (student.getLastname() == null || student.getLastname().isBlank()) {
                throw new BadRequestException("Student lastname is required");
            }
            if (student.getAge() == null) {
                throw new BadRequestException("Student age is required");
            }
        }
    }
}
