package book;

import java.util.Stack;
import java.util.stream.Stream;

public class BookStack<T> extends Stack<Book<T>>{

  private final Stack<Book<T>> books = new Stack<>();

  //  public BookStack() {
//    //필드 초기화 방식으로 생략
//  }


  @Override
  public Book<T> push(Book<T> item) {
    return books.push(item);
  }

  @Override
  public Book<T> pop() {
    return books.pop();
  }

  @Override
  public Book<T> peek() {
    return books.peek();
  }

  @Override
  public boolean isEmpty() {
    return books.empty();
  }

  @Override
  public Stream<Book<T>> stream() {
    return books.stream();
  }
}
