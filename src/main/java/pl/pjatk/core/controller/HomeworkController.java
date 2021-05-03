package pl.pjatk.core.controller;


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
    @PutMapping("/Student/{id}")
    public ResponseEntity<Student> studentToUpdate(@PathVariable Long id,@RequestBody Student student){
        return ResponseEntity.ok(studentService.studentUpdate(id,student));
    }

    @PutMapping("/Student/{id}")
    public ResponseEntity<Student> checkStudentRate(@PathVariable Long id){
        return ResponseEntity.ok(studentService.checkStudentRate(id));
    }


    /*@PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }*/


    /*Stwórz dodatkowo logikę dla pozostałych metod PUT / POST / DELTE. Dla metody PUT skorzystaj z PathVariable oraz RequestBody.
    Dla metody POST skorzystaj z RequestBody. Dla metody DELETE skorzystaj z PathVariable.
    Niech metody PUT oraz POST zwrócą dostarczone dane,
    natomiast metoda DELETE niech zwraca jedynie HTTP status 200 bez żadnego body.
*/











}

