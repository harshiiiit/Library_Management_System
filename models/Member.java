package models;

import java.util.ArrayList;
import java.util.List;

public class Member {

  private String name;
  private String memberId;
  private List<BorrowedRecord> borrowedBooks;

  public Member(String name, String memberId) {
    this.name = name;
    this.memberId = memberId;
    this.borrowedBooks = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public String getMemberId() {
    return this.memberId;
  }

  public List<BorrowedRecord> getBorrowedBooks() {
    return this.borrowedBooks;
  }
}
