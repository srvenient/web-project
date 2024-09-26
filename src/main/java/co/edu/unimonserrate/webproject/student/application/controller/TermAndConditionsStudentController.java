package co.edu.unimonserrate.webproject.student.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class represents the controller for
 * the term and conditions of the student.
 */
@Controller
@RequestMapping("/api/v1/term-and-conditions")
public final class TermAndConditionsStudentController {
  /**
   * This method shows the term and conditions page.
   *
   * @return the term and conditions page
   */
  @RequestMapping
  public String show() {
    return "term-and-conditions";
  }
}
