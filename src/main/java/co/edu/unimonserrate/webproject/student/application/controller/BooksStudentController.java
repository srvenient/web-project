package co.edu.unimonserrate.webproject.student.application.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/books")
public final class BooksStudentController {
  @RequestMapping
  public @NotNull String show() {
    return "books";
  }
}
