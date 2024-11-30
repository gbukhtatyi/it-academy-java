package homework19.library;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class BookManager {
    public static void writeBooksToFile(String filePath, List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }

    public static List<Book> readBooksFromFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        return (List<Book>) objectInputStream.readObject();
    }

    /**
     * Фильтрация книг по определенным критериям ( по автору )
     */
    public static List<Book> filterByAuthor(List<Book> books, String author) {
        return books.stream().filter(
                book -> book.getAuthor().equals(author)
        ).toList();
    }

    /**
     * Фильтрация книг по определенным критериям ( по количеству страниц )
     */
    public static List<Book> filterByAmountPages(List<Book> books, int minAmountPages) {
        return books.stream().filter(
                book -> book.getAmountPages() >= minAmountPages
        ).toList();
    }

    /**
     * Сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
     */
    public static List<Book> sortedByTitle(List<Book> books) {
        return books.stream().sorted(
                Comparator.comparing(Book::getTitle)
        ).toList();
    }

    /**
     * Сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
     */
    public static List<Book> sortedByAuthor(List<Book> books) {
        return books.stream().sorted(
                Comparator.comparing(Book::getAuthor)
        ).toList();
    }

    /**
     * Сортировка книг по различным параметрам (по количеству страниц)
     */
    public static List<Book> sortedByAmountPages(List<Book> books) {
        return books.stream().sorted(
                Comparator.comparingInt(Book::getAmountPages)
        ).toList();
    }
}
