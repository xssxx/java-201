package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.models.Book;
import ku.cs.models.BookList;
import ku.cs.services.FXRouter;
import ku.cs.services.HardcodeDatasource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class BookController {
    @FXML private Label titleLabel;
    @FXML private Label authorLabel;
    @FXML private Label yearLabel;
    @FXML private Label statusLabel;
    @FXML private ImageView cover;
    @FXML private ListView<String> myListView;

    private BookList books;
    private Book selectedBook;

    @FXML
    public void initialize() {
        HardcodeDatasource datasource = new HardcodeDatasource();
        books = datasource.ReadData();

        showList(books);

        myListView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue == null) {
                selectedBook = null;
            } else {
                selectedBook = books.findByTitle(newValue);
                showBook(selectedBook);
            }
        });

        // Default book image
        Image defaultImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/assets/default.jpg")));
        cover.setImage(defaultImage);
    }

    private void showList(BookList books) {
        myListView.getItems().clear();
        myListView.getItems().addAll(books.getBookTitles());
    }

    private void showBook(Book book) {
        titleLabel.setText(book.getTitle());
        authorLabel.setText(book.getAuthor());
        yearLabel.setText(String.format("%d", book.getYear()));
        statusLabel.setText(book.getStatusText());

        Image image = loadBookImage(book);
        cover.setImage(image);
    }

    private Image loadBookImage(Book book) {
        String imagePath = String.format("/assets/%s.jpg", book.getTitle());
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
    }

    private ArrayList<Book> getBorrowedBooks() {
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books.getBooks()) {
            if (!book.isAvailable()) {
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }

    @FXML
    private void onBorrowButton() {
        if (selectedBook != null && selectedBook.isAvailable()) {
            selectedBook.borrowBook();
            showBook(selectedBook);
        }
    }

    @FXML
    private void onReturnButton() {
        if (selectedBook != null && !selectedBook.isAvailable()) {
            selectedBook.returnBook();
            showBook(selectedBook);
        }
    }

    @FXML
    private void onButtonClick() throws IOException {
        FXRouter.goTo("hello");
    }

    @FXML
    private void onHistoryButton() throws IOException {
        ArrayList<Book> borrowedBooks = getBorrowedBooks();
        FXRouter.goTo("history", borrowedBooks);
    }
}
