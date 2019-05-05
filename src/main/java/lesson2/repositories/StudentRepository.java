package lesson2.repositories;

import lesson2.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student findOneById(int id){
        Student student = new Student();
        student.setFirstName("Ivan"+ id);
        student.setLastName("Ivanov" + id);
        return student;
    }
}
