package co.edu.unimonserrate.webproject.student.application;

import co.edu.unimonserrate.webproject.student.domain.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public final class StudentRestController {

  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("/students")
  public List<Object> getStudents() {
    return List.of();
  }
}
