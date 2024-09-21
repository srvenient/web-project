package co.edu.unimonserrate.webproject.books.domain.dto;

public final class BookDTO {
  private String title;
  private String author;
  private String description;
  private String image;

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
