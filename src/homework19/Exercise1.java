package homework19;

import homework19.library.Book;
import homework19.library.BookManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Управление списком книг.
 * Файл books.txt содержит список книг в бинарном формате. Необходимо прочитать этот список книг из файла в классе BookManager и добавить в этот класс следующие методы:
 * - фильтрация книг по определенным критериям (по автору, по количеству страниц)
 * - сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
 * - создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц больше определенного значения)
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "resources/books.txt";

        List<Book> books = new ArrayList<>();

        books.add(new Book("Оруэлл", "1984", 2021, 100));
        books.add(new Book("Караткевич", "Дзiкае паляванне караля Стаха", 2020, 500));
        books.add(new Book("Толкиен", "Хоббит", 2024, 300));

        BookManager.writeBooksToFile(filePath, books);

        List<Book> booksFromFile = BookManager.readBooksFromFile(filePath);

        System.out.println("Исходный список:");
        System.out.println(booksFromFile);

        // Фильтрация

        System.out.println("Фильтрация по автору:");
        System.out.println(BookManager.filterByAuthor(booksFromFile, "Толкиен"));

        System.out.println("Фильтрация количеству страниц: >= 150");
        System.out.println(BookManager.filterByAmountPages(booksFromFile, 150));

        // Сортировка

        System.out.println("Сортировка по названию:");
        System.out.println(BookManager.sortedByTitle(booksFromFile));

        System.out.println("Сортировка по автору:");
        System.out.println(BookManager.sortedByAuthor(booksFromFile));

        System.out.println("Сортировка по количеству страниц:");
        System.out.println(BookManager.sortedByAmountPages(booksFromFile));
    }
}
