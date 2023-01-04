package com.EmployeeMangement.Controller;

import com.EmployeeMangement.Model.Student;
import com.EmployeeMangement.Repoitory.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

@Autowired
private StudentRepo repo;

@PostMapping("/student")
public Student addStudent(@RequestBody Student stu)
{
    return  repo.save(stu);
}
@GetMapping("/student")
public List<Student> getAllStudents(){
    return repo.findAll();
}


@GetMapping("/student/{id}")
    public Student getAllStudentById(@PathVariable ("id") int id ){
        return repo.findById(id).get();
    }
}