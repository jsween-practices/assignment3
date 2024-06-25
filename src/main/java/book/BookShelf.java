package book;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

  private final List<Book<T>> books = new ArrayList<>();

//  public BookShelf() {
//    //필드 초기화를 진행므로 생략
//  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    books.remove(book);
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    return books.stream().filter(book -> book.getUpperCaseTitle().contains(title.toUpperCase()))
        .toList();
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    return books.stream().filter(book -> book.getUpperCaseAuthor().contains(author.toUpperCase()))
        .toList();
  }
}
