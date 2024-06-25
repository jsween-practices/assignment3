package book;

import java.util.Collection;
import support.InputManager;
import support.OutputManager;

public class IntegerBookController {
  private final InputManager inputManager;
  private final OutputManager outputManager;
  private final BookStack<Integer> integerBookStack;

  public IntegerBookController(InputManager inputManager, OutputManager outputManager,
      BookStack<Integer> integerBookStack) {
    this.inputManager = inputManager;
    this.outputManager = outputManager;
    this.integerBookStack = integerBookStack;
  }

  public void push() {
    outputManager.printInputBookInfoMessage();
    Book<Integer> integerBook = inputManager.inputIntegerBook();
    integerBookStack.push(integerBook);
  }

  public void peek() {
    outputManager.setOutputStackPeek(integerBookStack.peek());
  }
  public void pop() {
    outputManager.printOutputStackPop(integerBookStack.pop());
  }

  public void printAll() {
    outputManager.printBooks(integerBookStack);
  }

  public boolean printIsEmpty() {
    return integerBookStack.isEmpty();
  }
}
