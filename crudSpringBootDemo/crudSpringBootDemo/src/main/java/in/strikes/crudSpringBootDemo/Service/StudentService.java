package in.strikes.crudSpringBootDemo.Service;

import in.strikes.crudSpringBootDemo.Entity.Student;
import in.strikes.crudSpringBootDemo.Repository.StudentRespository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
    public class StudentService
    {
        public StudentRespository studentRespository;
        public  StudentService(StudentRespository s){

             studentRespository=s;
        }

        public Student createStudentService(Student studentReq){
            System.out.println("Inside StudentService");
            studentRespository.save(studentReq);
            return studentReq;
        }

        public Student getStudentService(Long id){
             Optional<Student> s=studentRespository.findById(id);
             if(s.isPresent()){
                 return s.get();
             }
             return null;
        }

        public List<Student> getAllStudentService(){
            return studentRespository.findAll();
        }

        public Student updateStudentService(Long id, Student studentUpdateReqBody){
            Optional<Student> existingStudent=studentRespository.findById(id);
            if(existingStudent.isEmpty()){
                return null;
            }
            Student studentToSave=existingStudent.get();
            studentToSave.setName(studentUpdateReqBody.getName());
            studentToSave.setAge(studentUpdateReqBody.getAge());
            studentToSave.setEmail(studentUpdateReqBody.getEmail());
            studentToSave.setSubject(studentUpdateReqBody.getSubject());
            studentToSave.setId(studentUpdateReqBody.getId());
            studentToSave.setRollNo(studentUpdateReqBody.getRollNo());
            return studentRespository.save(studentToSave);

        }

        public boolean deleteStudentService(Long id){
            Optional<Student> existingStudent=studentRespository.findById(id);
            if(existingStudent.isEmpty()){
                return false;
            }
            studentRespository.deleteById(id);
            return true;
        }

    }

