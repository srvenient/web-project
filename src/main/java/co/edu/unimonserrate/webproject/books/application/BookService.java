package co.edu.unimonserrate.webproject.books.application;

import co.edu.unimonserrate.webproject.books.domain.Book;
import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * This interface represents the service for the Book entity.
 *
 * @see Book
 */
public interface BookService {
  /**
   * This method retrieves all existing
   * books in the database.
   *
   * @return all existing books in the database
   */
  @NotNull Collection<@NotNull Book> getAllBooks();
}
