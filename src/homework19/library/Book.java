package homework19.library;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String title;
    private int yearWrite;
    private int amountPages;


    public Book(String author, String title, int yearWrite, int amountPages) {
        this.author = author;
        this.title = title;
        this.yearWrite = yearWrite;
        this.amountPages = amountPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearWrite() {
        return yearWrite;
    }

    public void setYearWrite(int yearWrite) {
        this.yearWrite = yearWrite;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearWrite=" + yearWrite +
                ", amountPages=" + amountPages +
                '}';
    }
}