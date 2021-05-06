package pl.pjatk.core.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.core.Student;
import pl.pjatk.core.service.StudentService;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    private final StudentService studentService;


    public HomeworkController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/add1/{first}")
    public ResponseEntity<String> getFirstChallenge(@PathVariable String first){
        return ResponseEntity.ok("FirstChallenge " + first);
    }
    @GetMapping( "/getSecondChallenge")
    public ResponseEntity<String> getSecondChallenge(@RequestParam ("second") String second){
        return  ResponseEntity.ok ("SecondChallenge " + second);
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<Student> studentToUpdate(@PathVariable Long id,@RequestBody Student student){
        return ResponseEntity.ok(studentService.studentUpdate(id,student));
    }

    @PutMapping("/studentRate/{id}")
    public ResponseEntity<Student> checkStudentRate(@PathVariable Long id){
        return ResponseEntity.ok(studentService.checkStudentRate(id));
    }
    @PostMapping("/check")
    public ResponseEntity<Student> checkName(@RequestBody Student student){
        return ResponseEntity.ok(studentService.checkName(student));
    }
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




    /*Stwórz dodatkowo logikę dla pozostałych metod PUT / POST / DELTE. Dla metody PUT skorzystaj z PathVariable oraz RequestBody.
    Dla metody POST skorzystaj z RequestBody. Dla metody DELETE skorzystaj z PathVariable.
    Niech metody PUT oraz POST zwrócą dostarczone dane,
    natomiast metoda DELETE niech zwraca jedynie HTTP status 200 bez żadnego body.
*/











}

