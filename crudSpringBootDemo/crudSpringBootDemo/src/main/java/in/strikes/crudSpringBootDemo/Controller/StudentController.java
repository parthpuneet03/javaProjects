package in.strikes.crudSpringBootDemo.Controller;

import in.strikes.crudSpringBootDemo.Entity.Student;
import in.strikes.crudSpringBootDemo.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService s){
        this.studentService=s;
    }

    @PostMapping("/create")
    public ResponseEntity createStudent(@RequestBody Student student){
        Student s1=studentService.createStudentService(student);

        return ResponseEntity.
                status(HttpStatus.CREATED).
                body(s1);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getStudent(@PathVariable Long id){
        Student studentResponse1=studentService.getStudentService(id);
        if(studentResponse1== null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResponse1);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList=studentService.getAllStudentService();
        if(studentList== null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(studentList);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateStudent(@PathVariable Long id, @RequestBody Student studentUpdateReqBody){
        Student studentResponse1=studentService.updateStudentService(id,studentUpdateReqBody);
        if(studentResponse1== null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResponse1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id){
        boolean isDeleted = studentService.deleteStudentService(id);
        if(!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Record deleted");
    }

}
