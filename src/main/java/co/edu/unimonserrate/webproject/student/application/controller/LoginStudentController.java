package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.student.application.StudentService;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginStudentController {
  private final StudentService studentService;

  public LoginStudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @ModelAttribute
  private StudentDTO student() {
    return new StudentDTO();
  }

  @GetMapping("/")
  public String show() {
    return "index";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute("student") final @NotNull StudentDTO student) {
    if (this.studentService.getStudent(student) != null) {
      return "redirect:/home";
    }
    return "redirect:/?error";
  }
}
