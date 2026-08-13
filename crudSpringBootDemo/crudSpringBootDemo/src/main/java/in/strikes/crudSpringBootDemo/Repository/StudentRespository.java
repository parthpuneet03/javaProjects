package in.strikes.crudSpringBootDemo.Repository;

import in.strikes.crudSpringBootDemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface StudentRespository extends JpaRepository<Student,Long> {

}
