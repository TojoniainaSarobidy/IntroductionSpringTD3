package controller;

import entity.StudentEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(@RequestParam(value = "name", required = false) String name) {
        if (name == null || name.isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body("Le paramètre 'name' est requis");
        }
        return ResponseEntity
                .ok("Welcome " + name);
    }

    @PostMapping("/students")
    public ResponseEntity<?> students(@RequestBody List<StudentEntity> students) {
        try {
            List<String> result = studentService.createStudents(students);
            return ResponseEntity
                    .status(201)
                    .body(result);
        } catch (Exception e) {
            return ResponseEntity
                    .status(500)
                    .body("Erreur serveur");
        }
    }

    @GetMapping("/students")
    public ResponseEntity<?> getStudents(
            @RequestHeader(value = "Accept", required = false) String accept) {
        try {
            if (accept == null) {
                return ResponseEntity
                        .badRequest()
                        .body("Header 'Accept' manquant");
            }
            if ("text/plain".equals(accept)) {
                String result = String.join(", ", studentService.getAllStudentNames());
                return ResponseEntity
                        .ok()
                        .header("Content-Type", "text/plain")
                        .body(result);
            }
            if ("application/json".equals(accept)) {
                return ResponseEntity
                        .ok()
                        .body(studentService.getAllStudentNames());
            }
            return ResponseEntity
                    .status(501)
                    .body("Format non supporté");
        } catch (Exception e) {
            return ResponseEntity
                    .status(500)
                    .body("Erreur serveur");
        }
    }
}
