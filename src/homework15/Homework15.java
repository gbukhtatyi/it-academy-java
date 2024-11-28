package homework15;


import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Convert HashMap<Integer, String> -> HashMap<String, Integer>");
        exercise1();

        System.out.println("\nЗадание 2. Полидром");
        exercise2();
    }

    /**
     * Реализуйте метод, который поменяет ключи и значения в HashMap местами.
     * На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.
     */
    public static void exercise1() {
        HashMap<Integer, String> input = new HashMap<Integer, String>();

        input.put(1, "First");
        input.put(2, "Second");
        input.put(3, "Third");

        System.out.println("\nИсходные данные: ");
        printKeyValueLine(input);

        HashMap<String, Integer> result = convertMap(input);

        System.out.println("\nРезультат: ");
        printKeyValueLine(result);
    }

    protected static void printKeyValueLine(HashMap lines ){
        lines.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

    protected static HashMap<String, Integer> convertMap(HashMap<Integer, String> input) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        input.forEach((key, value) -> {
            result.put(value, key);
        });

        return result;
    }

    /**
     * Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать,
     * что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо
     * считать, как одного человека с разными телефонами.
     */
    public static void exercise2() {
        HashMap<String,String> input = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();

        input.put("123456", "Andrey");
        input.put("678901", "Andrey");
        input.put("845678", "Max");

        System.out.println("\nИсхожные справочник:");
        input.forEach((phone, name) -> {
            System.out.println(name + ": " + phone);
            phoneBook.addContact(name, phone);
        });

        System.out.println("\nСправочник после обработки:");
        phoneBook.printAllContacts();
    }
}
