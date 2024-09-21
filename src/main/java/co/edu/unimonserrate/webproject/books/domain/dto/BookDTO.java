package co.edu.unimonserrate.webproject.books.domain.dto;

import co.edu.unimonserrate.webproject.books.domain.Book;

/**
 * This class represents the Data Transfer Object (DTO)
 * for the Book entity.
 *
 * @see Book

 */
public final class BookDTO {
  private String title;
  private String author;
  private String description;
  private String image;

  /**
   * This constructor initializes the BookDTO object.
   */
  public BookDTO() {
  }

  public String title() {
    return this.title;
  }

  public String author() {
    return this.author;
  }

  public String description() {
    return this.description;
  }

  public String image() {
    return this.image;
  }
}
