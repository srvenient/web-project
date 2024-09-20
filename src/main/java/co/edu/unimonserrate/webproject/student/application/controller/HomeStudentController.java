package co.edu.unimonserrate.webproject.student.application.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class represents the controller for the home of the student.
 */
@Controller
@RequestMapping("/api/v1/home")
public final class HomeStudentController {
  /**
   * This method shows the home page.
   *
   * @return the home page
   */
  @GetMapping
  public @NotNull String show() {
    return "home";
  }
}
