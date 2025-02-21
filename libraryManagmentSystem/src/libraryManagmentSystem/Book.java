package libraryManagmentSystem;

public class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "\n Book ID: " + bookId + ",\n Title: " + title + ",\n Author: " + author + ",\n Issued: " + (isIssued ? "Yes" : "No");
    }
}
