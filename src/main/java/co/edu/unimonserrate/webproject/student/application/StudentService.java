package co.edu.unimonserrate.webproject.student.application;

import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface StudentService {
  boolean createStudent(final @NotNull StudentDTO studentDTO);

  @Nullable Student getStudent(final @NotNull StudentDTO studentDTO);
}
