package homework19;

import java.util.Arrays;
import java.util.List;

/**
 * Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
 * Используя stream и lambda выполнить следующие действия:
 * Удалить все содержащие “3”
 * Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
 *  Отбросить первый и последний элемент
 *  Привести в uppercase
 *  Выдать на печать результат
 * Напечатать количество оставшихся элементов
 */
public class Exercise2 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        System.out.println("Исходный список:");
        System.out.println(myList);

        System.out.println("Удалить все содержащие “3”: ");
        myList = myList.stream().filter((word) -> word.indexOf("3") == -1).toList();
        System.out.println(myList);

        System.out.println("Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)");
        myList = myList.stream().sorted(
                (String word1, String word2) -> {
                    int result = String.valueOf(word1.charAt(1)).compareTo(String.valueOf(word2.charAt(1)));
                    if (result == 0){
                        result = -1 * String.valueOf(word1.charAt(0)).compareTo(String.valueOf(word2.charAt(0)));
                    }
                    return result;
                }
        ).toList();
        System.out.println(myList);

        System.out.println("Отбросить первый и последний элемент");
        myList = myList.stream().skip(1).limit(myList.size()-2).toList();
        System.out.println(myList);

        System.out.println("Привести в uppercase");
        myList = myList.stream().map(String::toUpperCase).toList();
        System.out.println(myList);

        System.out.println("количество оставшихся элементов: " + myList.size());
    }
}
