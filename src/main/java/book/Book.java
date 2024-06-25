package book;

public class Book<T> {

  private final String title;
  private final String author;
  private final T identifier;

  public Book(String title, String author, T identifier) {
    this.title = title;
    this.author = author;
    this.identifier = identifier;
  }

  String getUpperCaseTitle() {
    return title.toUpperCase();
  }

  String getUpperCaseAuthor() {
    return author.toUpperCase();
  }

  @Override
  public String toString() {
    return "제목='" + title + '\'' + ", 작가='" + author + '\'' + ", 식별자=" + identifier;
  }
}
