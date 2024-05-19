package eu.udemx.demo.repository;

import eu.udemx.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long>{
}
