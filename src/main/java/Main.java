import book.BookShelf;
import book.BookStack;
import book.IntegerBookController;
import book.StringBookController;
import java.util.Scanner;
import support.InputManager;
import support.OutputManager;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    InputManager inputManager = new InputManager(scanner);
    OutputManager outputManager = new OutputManager();
    BookShelf<String> stringBookShelf = new BookShelf<>();
    BookStack<Integer> integerBookStack = new BookStack<>();
    StringBookController stringBookController = new StringBookController(inputManager,
        outputManager, stringBookShelf);
    IntegerBookController integerBookController = new IntegerBookController(inputManager,
        outputManager, integerBookStack);

    System.out.println("BookShelf<String> 테스트");
    stringBookController.addStringBook();
    stringBookController.addStringBook();
    stringBookController.addStringBook();
    stringBookController.searchByTitle();
    stringBookController.searchByAuthor();

    System.out.println();
    System.out.println();

    System.out.println("BookStack<Integer> 테스트");
    integerBookController.push();
    integerBookController.push();
    integerBookController.push();
    integerBookController.printAll();
    integerBookController.pop();
    integerBookController.peek();
    integerBookController.printIsEmpty();
    integerBookController.pop();
    integerBookController.pop();
    integerBookController.printIsEmpty();

    scanner.close();
  }


}
