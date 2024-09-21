package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.books.application.BookService;
import co.edu.unimonserrate.webproject.books.domain.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the controller for the Book entity.
 *
 * @see Book
 * @see BookService
 */
@Controller
@RequestMapping("/api/v1/books")
public final class BooksStudentController {

  private final BookService bookService;

  public BooksStudentController(final @NotNull BookService bookService) {
    this.bookService = bookService;
  }

  /**
   * This method shows the books page.
   *
   * @return the books page
   */
  @GetMapping
  public @NotNull String show() {
    return "books";
  }

  /**
   * This method retrieves all existing books in the database.
   *
   * @return all existing books in the database
   */
  @GetMapping("/all")
  public @NotNull List<@NotNull Book> getAll() {
    return new ArrayList<>(this.bookService.getAllBooks());
  }
}
