package jdbc.entity;

public class JdbcBook {
    private String bookId;
    private String bookName;
    private String status;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JdbcBook(String bookId, String bookName, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.status = status;
    }
}
