package eu.udemx.demo.repository;

import eu.udemx.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
}
