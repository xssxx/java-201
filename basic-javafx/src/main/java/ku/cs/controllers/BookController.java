package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Book;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class BookController {
    @FXML Label titleLabel;
    @FXML Label authorLabel;
    @FXML Label yearLabel;
    @FXML Label statusLabel;

    private Book book;

    @FXML
    public void initialize() {
        book = new Book("Barbie", "Noah Baumbach", 1959);
        showBook(book);
    }

    private void showBook(Book book) {
        titleLabel.setText(book.getTitle());
        authorLabel.setText(book.getAuthor());
        yearLabel.setText(String.format("%d", book.getYear()));
        statusLabel.setText(book.getStatusText());
    }

    @FXML
    private void onButtonClick() throws IOException {
        FXRouter.goTo("hello");
    }

    @FXML
    private void onBorrowButton() {
        book.borrowBook();
        statusLabel.setText(book.getStatusText());
    }

    @FXML
    private void onReturnButton() {
        book.returnBook();
        statusLabel.setText(book.getStatusText());
    }
}