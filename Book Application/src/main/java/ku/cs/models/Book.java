package ku.cs.models;

import java.util.ArrayList;

public class Book {
    // fields
    private final String id;
    private final String title;
    private final String author;
    private final int year;
    private boolean available;
    private String statusText;
    private final ArrayList<Book> borrowedHistory;

    // constructor
    public Book(String id, String title, String author, int year) {
        if (id == null || id.isEmpty() || title == null || title.isEmpty() || author == null || author.isEmpty() || year == 0) {
            throw new IllegalArgumentException("Invalid book data");
        }
        borrowedHistory = new ArrayList<>();
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        available = true;
        statusText = "Available";
    }

    // Borrow the book
    public void borrowBook() {
        if (available) {
            available = false;
            statusText = "Borrowed";
            addToHistory();
        }
    }

    // Return the book
    public void returnBook() {
        if (!available) {
            available = true;
            statusText = "Available";
        }
    }

    private void addToHistory() {
        borrowedHistory.add(this);
    }

    public ArrayList<Book> getBorrowedHistory() {
        return borrowedHistory;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getStatusText() {
        return statusText;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isTitle(String title) {
        return this.title.equals(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public boolean isId(String id) {
        return this.id.equals(id);
    }
}
