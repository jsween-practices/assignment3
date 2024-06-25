package book;

import java.util.List;

public interface BookManager<T> {
  void addBook(Book<T> book);
  void removeBook(Book<T> book);

  /***
   * - 도서 제목으로 검색하는 메소드입니다.
   * - 검색 결과가 없으면 빈 리스트를 반환합니다.
   * @param title 검색할 도서 제목
   * @return 검색 결과 Book<T> 객체들의 리스트
   */
  List<Book<T>> searchByTitle(String title);

  /***
   * - 도서 저자로 검색하는 메소드입니다.
   *     - 검색 결과가 없으면 빈 리스트를 반환합니다.
   * @param author 도서 저자
   * @return 검색 결과 Book<T> 객체들의 리스트
   */
  List<Book<T>> searchByAuthor(String author);

}
