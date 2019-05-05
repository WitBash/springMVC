package lesson2.service;

import lesson2.entities.Student;
import lesson2.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student getStudentById(int id){
        Student student = studentRepository.findOneById(id);
        return student;

    }
    public StudentService(){

    }
}
