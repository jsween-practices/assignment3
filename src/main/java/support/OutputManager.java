package support;

import book.Book;
import java.util.Collection;
import java.util.stream.Collectors;

public class OutputManager {

  public static final String DELIMETER = ", ";
  private static final String INPUT_BOOK_INFO_MESSAGE =
      "책 정보를 " + DELIMETER + "를 구분자로 입력해주세요. [제목, 저자, 식별자] 순으로 입력해 주시면 됩니다.";
  private static final String INPUT_AUTHOR_FOR_SEARCH = "검색에 사용할 저자 이름을 입력해주세요";
  private static final String INPUT_TITLE_FOR_SEARCH = "검색에 사용할 제목 이름을 입력해주세요";
  private static final String OUTPUT_STACK_POP = "popBook() = ";
  private static final String OUTPUT_STACK_PEEK = "peekBook() = ";
  private static final String OUTPUT_STACK_IS_EMPTY = "isEmpty() = ";
  private static final String LINE = "\n==================\n";

  public void printInputBookInfoMessage() {
    System.out.println(INPUT_BOOK_INFO_MESSAGE);
  }

  public void printInputAuthorForSearch() {
    System.out.println(INPUT_AUTHOR_FOR_SEARCH);
  }

  public void printInputTitleForSearch() {
    System.out.println(INPUT_TITLE_FOR_SEARCH);
  }

  public void printOutputStackPop(Book<Integer> integerBook) {
    System.out.println(OUTPUT_STACK_POP+integerBook);
  }

  public void setOutputStackPeek(Book<Integer> integerBook) {
    System.out.println(OUTPUT_STACK_PEEK+integerBook);
  }

  public void printOutputStackIsEmpty(boolean isEmpty) {
    System.out.println(OUTPUT_STACK_IS_EMPTY);
  }

  public <T> void printBooks(Collection<Book<T>> books) {
    String output = books.stream().map(Book::toString)
        .collect(Collectors.joining(LINE, LINE, LINE ));
    System.out.println(output+"\n\n\n\n");
  }
}
