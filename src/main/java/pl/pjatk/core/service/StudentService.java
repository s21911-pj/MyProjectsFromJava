package pl.pjatk.core.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.pjatk.core.Student;

import pl.pjatk.core.exception.NoNameException;
import pl.pjatk.core.exception.StudentException;
import pl.pjatk.core.repository.StudentRepository;

import java.util.List;


@Component
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    public Student findById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new StudentException(id));
    }


    public Student studentUpdate(Long id, Student studentToUpdate) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentException(id));


        if (studentToUpdate.getName() != null) {
            student.setName(studentToUpdate.getName());
        }
        if (studentToUpdate.getForname() != null) {
            student.setForname(studentToUpdate.getForname());

        }
        if (studentToUpdate.getSubjectOfStudy() != null){
            student.setSubjectOfStudy(studentToUpdate.getSubjectOfStudy());
        }
        if (studentToUpdate.getRate() < 0){
            student.setRate(studentToUpdate.getRate());
        }
        return studentRepository.save(student);
    }

    public Student checkStudentRate(Long id) {

        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentException(id));
        if (student.getRate() > 3) {
            student.setRate(5);
        }else {
            student.setRate(2);
        }

        return studentRepository.save(student);
    }

    public Student checkName(Student student){
        if(student.getName()==null){
            throw new NoNameException("no way u are hidding something? ");
        }
        if (student.getForname()==null){
            throw new NoNameException("Give ur id now!!");
        }
        return studentRepository.save(student);
    }
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

}
