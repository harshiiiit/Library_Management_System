package models;

import java.time.LocalDateTime;

public class BorrowedRecord {

  private Book book;
  private Member member;
  private LocalDateTime borrowDate;
  private LocalDateTime dueDate;
  private boolean isReturned;

  public BorrowedRecord(Book book, Member member) {
    this.book = book;
    this.member = member;
    this.borrowDate = LocalDateTime.now();
    this.dueDate = this.borrowDate.plusDays(14);
  }

  public Book getBook() {
    return this.book;
  }

  public Member getMember() {
    return this.member;
  }

  public LocalDateTime getBorrowDate() {
    return this.borrowDate;
  }

  public LocalDateTime getDueDate() {
    return this.dueDate;
  }

  public boolean isReturned() {
    return this.isReturned;
  }

  public void setIsReturned(boolean isReturned) {
    this.isReturned = isReturned;
  }

  public void setBorrowDate(LocalDateTime borrowDate) {
    this.borrowDate = borrowDate;
  }
}
