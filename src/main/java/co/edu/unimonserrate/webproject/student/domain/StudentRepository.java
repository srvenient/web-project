package co.edu.unimonserrate.webproject.student.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * This interface represents the repository for the Student entity.
 *
 * @see Student
 * @see JpaRepository
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
}
