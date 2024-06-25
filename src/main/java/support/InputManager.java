package support;

import book.Book;
import java.util.Scanner;

public class InputManager {

  private final Scanner scanner;


  public InputManager(Scanner scanner) {
    this.scanner = scanner;
  }

  public Book<String> inputStringBook() {
    String[] inputs = inputWithSplit();
    assert inputs.length == 3;
    return new Book<>(inputs[0], inputs[1], inputs[2]);
  }

  public Book<Integer> inputIntegerBook() {
    String[] inputs = inputWithSplit();
    return new Book<>(inputs[0], inputs[1], Integer.valueOf(inputs[2]));
  }


  private String[] inputWithSplit() {
    String s = scanner.nextLine();
    return s.split(OutputManager.DELIMETER);
  }

  public String inputString() {
    return scanner.nextLine();
  }
}
