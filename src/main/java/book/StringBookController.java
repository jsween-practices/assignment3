package book;

import java.util.List;
import support.InputManager;
import support.OutputManager;

public class StringBookController {
  private final InputManager inputManager;
  private final OutputManager outputManager;
  private final BookShelf<String> stringBookShelf;


  public StringBookController(InputManager inputManager, OutputManager outputManager,
      BookShelf<String> stringBookShelf) {
    this.inputManager = inputManager;
    this.outputManager = outputManager;
    this.stringBookShelf = stringBookShelf;
  }

  public void addStringBook() {
    outputManager.printInputBookInfoMessage();
    Book<String> stringBook = inputManager.inputStringBook();
    stringBookShelf.addBook(stringBook);
  }

  public void removeBook(Book<String> book) {
    stringBookShelf.removeBook(book);
  }

  public void searchByTitle() {
    outputManager.printInputTitleForSearch();
    String title = inputManager.inputString();
    outputManager.printBooks(stringBookShelf.searchByTitle(title));
  }

  public void searchByAuthor() {
    outputManager.printInputAuthorForSearch();
    String author = inputManager.inputString();
    outputManager.printBooks(stringBookShelf.searchByAuthor(author));
  }
}
