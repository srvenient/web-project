package co.edu.unimonserrate.webproject.books.domain;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Entity
@Table(name = "books")
public final class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @NotNull UUID id;

  @Column(name = "title")
  private String title;
  @Column(name = "author")
  private String author;
  @Column(name = "description")
  private String description;
  @Column(name = "image")
  private String image;

  public Book() {
  }

  public @NotNull UUID id() {
    return this.id;
  }

  public @NotNull String title() {
    return this.title;
  }

  public @NotNull String author() {
    return this.author;
  }

  public @NotNull String description() {
    return this.description;
  }

  public @NotNull String image() {
    return this.image;
  }
}
