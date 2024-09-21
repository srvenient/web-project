package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.books.application.BookService;
import co.edu.unimonserrate.webproject.books.domain.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/books")
public final class BooksStudentController {

  private final BookService bookService;

  public BooksStudentController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public @NotNull String show() {
    return "books";
  }

  @GetMapping("/all")
  public @NotNull List<Book> getAll() {
    return new ArrayList<>(this.bookService.getAllBooks());
  }

}
