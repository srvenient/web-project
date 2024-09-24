package co.edu.unimonserrate.webproject.student.application.controller;

import co.edu.unimonserrate.webproject.books.application.BookService;
import co.edu.unimonserrate.webproject.books.domain.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
  public @NotNull String show(final @NotNull Model model) {
    model.addAttribute("books", this.bookService.getAllBooks());
    return "books";
  }
}
