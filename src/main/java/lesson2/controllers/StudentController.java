package lesson2.controllers;

import lesson2.entities.Student;
import lesson2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/showStudent")
    public String hello(Model uiModel, @ModelAttribute("student") Student student) {
        student = studentService.getStudentById(10);
        uiModel.addAttribute("student", student);
        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "students";
    }
//    @RequestMapping(path = "/showStudentById", method = RequestMethod.GET)
//    @ResponseBody
//    public Student showStudentById(Model uiModel, @RequestParam int id) {
//        Student student = studentService.getStudentById(id);
//        return student;
//    }

    @RequestMapping(path = "/showStudentById/{sid}", method = RequestMethod.GET)
    @ResponseBody
    public Student showStudentById(@PathVariable("sid") int id) {
        Student student = studentService.getStudentById(id);
        return student;
    }

    @RequestMapping(path = "/setStudentById", method = RequestMethod.POST)
    public void setStudent(@RequestBody Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
    }

    @RequestMapping("/showForm")
    public String showForm(Model uiModel) {
        Student student = new Student();
        uiModel.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-form-result";
    }
}
