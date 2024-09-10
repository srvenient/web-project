package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.student.application.StudentService;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/register")
public final class RegisterStudentController {

  private final StudentService studentService;

  public RegisterStudentController(final @NotNull StudentService studentService) {
    this.studentService = studentService;
  }

  @ModelAttribute
  private StudentDTO student() {
    return new StudentDTO();
  }

  @GetMapping
  public @NotNull String show() {
    return "register";
  }

  @PostMapping
  public @NotNull String registerStudent(@ModelAttribute("student") final @NotNull StudentDTO student) {
    if (this.studentService.createStudent(student)) {
      return "redirect:/api/v1/register?success";
    }
    return "redirect:/api/v1/register?error";
  }
}
