package co.edu.unimonserrate.webproject.books.application;

import co.edu.unimonserrate.webproject.books.domain.Book;
import co.edu.unimonserrate.webproject.student.domain.Student;
import co.edu.unimonserrate.webproject.student.domain.dto.StudentDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public interface BookService {
  @NotNull Collection<Book> getAllBooks();
}
