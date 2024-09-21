package co.edu.unimonserrate.webproject.books.domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
  @Nullable Book findByTitle(final @NotNull String title);

  @Nullable Book findByAuthor(final @NotNull String author);
}
