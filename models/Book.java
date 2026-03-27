package models;

import enums.BookAvailability;

public class Book {

private String title;
  private String author;
  private String isbn;
  private BookAvailability availability;

  public Book(String title, String author, String isbn, BookAvailability availability) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.availability = availability;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public BookAvailability getAvailability() {
    return this.availability;
  }

  public void setAvailability(BookAvailability availability) {
    this.availability = availability;
  }
}
