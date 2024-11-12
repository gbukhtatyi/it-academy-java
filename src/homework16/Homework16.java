package homework16;

import java.util.*;
import java.util.stream.Collectors;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Последовательности");
        exercise1();

        System.out.println("\nЗадание 2. Стэк");
        exercise2();

        System.out.println("\nЗадание 3. Количество вхождений в массив");
        exercise3();
    }

    /**
     * Реализуйте функцию для подсчета количества вхождений каждого элемента в список и возврата списка
     * элементов, которые встречаются более одного раза. Для этого используйте метод Collections.frequency
     * Сигнатура функции public List<T> findDuplicates(List<T> list)
     * Пример:
     * учитывая список [1,2,3,1,4,5,2] функция должна вернуть [1,2]
     */
    public static void exercise1() {
        Integer[] values = {1, 2, 3, 1, 4, 5, 2};

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(values));

        System.out.println("\nИсходная последовательность:");
        System.out.println(list);

        System.out.println("\nРезультат:");
        System.out.println(findDuplicates(list));
    }

    public static <T> List<T> findDuplicates(List<T> list) {
        Map<T, Integer> amounts = new HashMap<>();

        for (T value : list) {
            int amount = (amounts.get(value) == null) ? 0 : amounts.get(value);
            amount++;
            amounts.put(value, amount);
        }

        return amounts.entrySet()
                .stream()
                .filter(
                        a -> a.getValue() > 1
                ).map(
                        e -> e.getKey()
                ).toList();
    }

    /**
     * Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop().
     */
    public static void exercise2() {
        Stack<Integer> stackInteger = new Stack<>();

        System.out.println("\nСтэк числовой:");
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);

        System.out.println(stackInteger.pop());
        System.out.println(stackInteger.pop());
        System.out.println(stackInteger.pop());

        System.out.println("\nСтэк строковый:");
        Stack<String> stackString = new Stack<>();
        stackString.push("First");
        stackString.push("Second");
        stackString.push("Third");

        System.out.println(stackString.pop());
        System.out.println(stackString.pop());
        System.out.println(stackString.pop());
    }

    /**
     * Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
     * где K — значение из массива, а Integer — количество вхождений в массив.
     * Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)
     */
    public static void exercise3() {
        Integer[] values = {1, 2, 3, 1, 4, 5, 2};

        System.out.println("\nИсходная последовательность:");
        System.out.println(Arrays.asList(values));

        System.out.println("\nРезультат:");
        System.out.println(arrayToMap(values));
    }

    public static <T> Map<T, Integer> arrayToMap(T[] ks) {
        Map<T, Integer> result = new HashMap<>();

        for (T value : ks) {
            int amount = (result.get(value) == null) ? 0 : result.get(value);
            amount++;
            result.put(value, amount);
        }

        return result;
    }

}
