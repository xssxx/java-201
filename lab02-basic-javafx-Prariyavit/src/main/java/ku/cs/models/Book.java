package ku.cs.models;

public class Book {
    // fields
    private String title;
    private String author;
    private int year;
    private boolean available;
    private String statusText;


    // constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        available = true;
        statusText = "ยืมได้";
    }

    // ยืมหนังสือ 
    public void borrowBook() {
        if (available) {
            available = false;
            statusText = "ยืมไปแล้ว";
        }
    }

    // คืนหนังสือ
    public void returnBook() {
        if (!available) {
            available = true;
            statusText = "ยืมได้";
        }
    }

    // Getter
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

    // setter

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}


