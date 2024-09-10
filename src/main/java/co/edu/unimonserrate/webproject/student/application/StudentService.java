package co.edu.unimonserrate.webproject.student.application;

import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface StudentService {
  /**
   * This method creates a new student. If the student already exists,
   * it returns false.
   *
   * @param studentDTO the student to create
   * @return {@code true} if the student was created, {@code false} otherwise
   */
  boolean createStudent(final @NotNull StudentDTO studentDTO);

  /**
   * This method retrieves a student by its email. If the student does not exist,
   *
   * @param studentDTO the student to retrieve
   * @return the student if it exists, {@code null} otherwise
   */
  @Nullable Student getStudent(final @NotNull StudentDTO studentDTO);
}
