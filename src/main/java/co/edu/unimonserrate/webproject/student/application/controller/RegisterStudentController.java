package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.student.application.StudentService;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * This class represents the controller for the registration of the student.
 *
 * @see StudentService
 * @see StudentDTO
 */
@Controller
@RequestMapping("/api/v1/register")
public final class RegisterStudentController {

  private final StudentService studentService;

  public RegisterStudentController(final @NotNull StudentService studentService) {
    this.studentService = studentService;
  }

  /**
   * This method creates a new student.
   *
   * @return a new student
   */
  @ModelAttribute
  private StudentDTO student() {
    return new StudentDTO();
  }

  /**
   * This method shows the registration page.
   *
   * @return the registration page
   */
  @GetMapping
  public @NotNull String show() {
    return "register";
  }

  /**
   * This method registers a student.
   *
   * @param student the student to register
   * @return the success page if the student was registered, the error page otherwise
   */
  @PostMapping
  public @NotNull String registerStudent(@ModelAttribute("student") final @NotNull StudentDTO student) {
    if (this.studentService.createStudent(student)) {
      return "redirect:/api/v1/register?success";
    }
    return "redirect:/api/v1/register?error";
  }
}
