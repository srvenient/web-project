package co.edu.unimonserrate.webproject.student.application;

import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.StudentRepository;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public boolean createStudent(final @NotNull StudentDTO studentDTO) {
    for (final Student student : this.studentRepository.findAll()) {
      if (student.email().equals(studentDTO.getEmail())) {
        return false;
      }
    }
    this.studentRepository.save(new Student(
      studentDTO.getFullName(),
      studentDTO.getEmail(),
      studentDTO.getPhone(),
      studentDTO.getPassword(),
      studentDTO.isTermsAndConditions()
    ));
    return true;
  }

  @Override
  public @Nullable Student getStudent(final @NotNull StudentDTO studentDTO) {
    for (final Student student : this.studentRepository.findAll()) {
      if (student.email().equals(studentDTO.getEmail()) && student.password().equals(studentDTO.getPassword())) {
        return student;
      }
    }

    return null;
  }
}
