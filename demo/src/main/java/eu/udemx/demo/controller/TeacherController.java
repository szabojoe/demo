package eu.udemx.demo.controller;

import eu.udemx.demo.model.Teacher;
import eu.udemx.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;
    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }
    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
        return teacher;
    }
}
