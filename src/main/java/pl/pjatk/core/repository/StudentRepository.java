package pl.pjatk.core.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pl.pjatk.core.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
