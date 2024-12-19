package homework17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practise2 {
    /**
     * Даны 2 файла - in1.txt и in2.txt в каждом файле по 50 чисел от 1 до 1000. Создайте файл out.txt,
     * который будет содержать все отсортированные числа из файлов in1.txt и in2.txt. Файлы in1.txt и in2.txt
     * можно создать с помощью кода.
     *
     * @param args
     */
    public static void main(String[] args) {
        writeRandomNumbers("resources/in1.txt", 50, 1, 1000);
        writeRandomNumbers("resources/in2.txt", 50, 1, 1000);

        List<Integer> list1 = readfile("resources/in1.txt");
        List<Integer> list2 = readfile("resources/in2.txt");

        System.out.println("\nИсходная последовательность 1: ");
        System.out.println(list1);
        System.out.println("\nИсходная последовательность 1: ");
        System.out.println(list2);

        list1.addAll(list2);

        Collections.sort(list1);

        System.out.println("\nРезультат: ");
        System.out.println(list1);

        writeFile("resources/in-result.txt", list1);
    }

    public static void writeFile(String filePath, List<Integer> list) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (Integer value : list) {
                fileWriter.write(String.valueOf(value));
                fileWriter.append("\n");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void writeRandomNumbers(String filePath, int count, int min, int max) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < count) {
            list.add(generateRandomInt(min, max));
            i++;
        }

        writeFile(filePath, list);
    }


    public static List<Integer> readfile(String filePath) {
        List<Integer> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        return result;
    }

    /**
     * Вернет случайное число от min до max
     *
     * @param max
     * @return
     */
    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
