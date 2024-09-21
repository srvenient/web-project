package co.edu.unimonserrate.webproject.books.application;

import co.edu.unimonserrate.webproject.books.domain.Book;
import co.edu.unimonserrate.webproject.books.domain.BookRepository;
import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.StudentRepository;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * This class represents the service for the Student entity.
 *
 * @see StudentRepository
 */
@Service
public class BookServiceImpl implements BookService {
  private final BookRepository bookRepository;

  public BookServiceImpl(final @NotNull BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public @NotNull Collection<Book> getAllBooks() {
    return this.bookRepository.findAll();
  }
}
