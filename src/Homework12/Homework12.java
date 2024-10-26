package Homework12;

import util.Input;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Последовательности");
        exercise1();

        System.out.println("\nЗадание 2. Полидром");
        exercise2();

        System.out.println("\nЗадание 3. Слово test");
        exercise3("Sample text with test rewqewtest testqwe test, test!");

        System.out.println("\nЗадание 4. 19xx");
        exercise4("1975 1976 1977 1978 1979 1980 1981 1982 1983 1984");

        System.out.println("\nЗадание 5. Нечетный индекс");
        exercise5();
    }

    /**
     * Введите строку (текст). Показать номера символов, совпадающих с последним символом строки.
     */
    public static void exercise1() {
        String text = "Пример строки для поиска совпадений последний символ: р";
        System.out.println("Исходный текст: \n" + text);

        char lastChar = text.charAt(text.length() - 1);

        Pattern pattern = Pattern.compile(lastChar + "");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Индекс символа: " + matcher.start());
        }
    }

    /**
     * Напишите класс, который принимает с клавиатуры строковое значение и определяет, является
     * ли оно палиндромом (симметричным).
     */
    public static void exercise2() {
        String text = Input.getText("Введите слово для проверки: \n");

        if (isPalindrome(text)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }

    protected static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    /**
     * Найдите количество вхождения слова 'test' в строке.
     */
    public static void exercise3(String text) {
        System.out.println("Исходный текст: \n" + text);

        Pattern pattern = Pattern.compile("\\btest\\b");
        Matcher matcher = pattern.matcher(text);

        int result = 0;
        while (matcher.find()) {
            result++;
        }

        System.out.println("Кол-во слова test: " + result);
    }

    /**
     * Напишите регулярное выражение чтобы найти все годы между 1977 и 1982
     * 1975 1976 1977 1978 1979 1980 1981 1982 1983 1984
     */
    public static void exercise4(String text) {
        System.out.println("Исходный текст: \n" + text);

        Pattern pattern = Pattern.compile("\\b(197[7-9]|198[0-2])\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Совпадение: " + matcher.group());
        }
    }

    /**
     * Напишите регулярное выражение для IP адреса.
     * 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками.
     * Группа содержит число в диапазоне от 1 до 255
     * Пример: 127.0.0.1  255.255.255.253   100.99.44.2
     */
    public static void exercise5() {
        String text = Input.getText("Введите адрес для проверки: \n");

        Pattern pattern = Pattern.compile(
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"
        );

        if (pattern.matcher(text).matches()) {
            System.out.println("Данная строка является IP адресом");
        } else {
            System.out.println("Данная строка не является IP адресом");
        }
    }
}
