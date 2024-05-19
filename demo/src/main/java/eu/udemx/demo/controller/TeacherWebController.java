package eu.udemx.demo.controller;

import eu.udemx.demo.model.Teacher;
import eu.udemx.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeacherWebController {

    @Autowired
    TeacherRepository teacherRepository;


    @GetMapping("/teachers")
    public String listTeachers(Model model){
        List<Teacher> teachers = teacherRepository.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers";
    }
}
