package homework3;

import java.util.Scanner;

public class Homework3 {
    protected static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Задание 1. Вывод числа в полном виде");
        exercise1();

        System.out.println("Задание 2. Степень четности");
        exercise2();

        System.out.println("Задание 3. Симметричные числа");
        exercise3();

        System.out.println("Задание 4. Треугольник");
        exercise4();

        System.out.println("Задание 5. Время года");
        exercise5();
    }

    /**
     * Напишите класс, который принимает с клавиатуры целое положительное трехзначное число и выводит его на экран в
     * «полном виде»: например, для числа 364 это будет выглядеть как 300+60+4.
     */
    private static void exercise1() {
        int number = getNumber();

        if (validateNumber(number)) {
            return;
        }

        int units = getUnits(number);
        int tens = getTens(number);
        int hundreds = getHundreds(number);

        System.out.println("Ответ: " + hundreds + " + " + tens + " + " + units);
    }

    /**
     * Назовем «степенью четности» числа количество четных цифр в нем. Например, для числа 4612 степень четности
     * равна 3 (в его составе три четных цифры - 4, 6 и 2). Напишите класс, который принимает с клавиатуры
     * положительное трехзначное число, а затем вычисляет и выводит на экран его «степень четности».
     */
    private static void exercise2() {
        int number = getNumber();

        if (validateNumber(number)) {
            return;
        }

        int units = getUnits(number);
        int tens = getTens(number);
        int hundreds = getHundreds(number);

        int result = 0;
        result += isEvenNumber(units);
        result += isEvenNumber(tens);
        result += isEvenNumber(hundreds);

        System.out.println("Ответ: " + result);
    }

    /**
     * Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы. Напишите класс,
     * который принимает с клавиатуры трехзначное положительное число и проверяет, является ли оно «симметричным».
     * В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
     */
    private static void exercise3() {
        int number = getNumber();

        if (validateNumber(number)) {
            return;
        }

        int units = getUnits(number);
        int hundreds = getHundreds(number);

        String result;
        if (units == hundreds) {
            result = "число является симметричным";
        } else {
            result = "число не является симметричным";
        }

        System.out.println("Ответ: " + result);
    }

    /**
     * Напишите класс, который принимает с клавиатуры три положительных числа и проверяет, могут ли они являться
     * длинами сторон треугольника. По результатам проверки следует вывести на экран соответствующее текстовое сообщение.
     */
    private static void exercise4() {
        int numberA = getNumber("Введите первое число: ");
        int numberB = getNumber("Введите второе число: ");
        int numberC = getNumber("Введите третье число: ");

        String result = "треугольник построить можно";
        if ((numberA >= numberB + numberC)
                || (numberB >= numberA + numberC)
                || (numberC >= numberA + numberB)) {
            result = "треугольник построить нельзя";
        }

        System.out.println("Ответ: " + result);
    }

    /**
     * Напишите класс, который принимает с клавиатуры целое число, которое должно означать порядковый номер месяца.
     * В случае если полученное значение действительно соответствует порядковому номеру одного из месяцев,
     * следует вывести сезон (лето, осень, зима, весна), к которому относится месяц. В случае если введенное значение
     * не является порядковым номером месяца, следует вывести на экран соответствующее текстовое сообщение.
     */
    private static void exercise5() {
        int number = getNumber("Введите порядковый номер месяца: ");

        String result = switch (number) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Введенное число не является порядковым номером месяца.";
        };

        System.out.println("Ответ: " + result);
    }

    private static int getNumber() {
        System.out.print("Введите целое положительное трехзначное число: ");
        return sc.nextInt();
    }

    private static int getNumber(String text) {
        System.out.print(text);
        return sc.nextInt();
    }

    private static boolean validateNumber(int number) {
        boolean result = isInvalidNUmber(number);
        
        if (result) {
            System.out.println("Ошибка! Введенное число не является целым положительным трехзначным числом.");
        }

        return result;
    }

    private static boolean isInvalidNUmber(int number) {
        return number < 100 || number > 999;
    }

    private static int getUnits(int number) {
        return number % 10;
    }

    private static int getTens(int number) {
        return number % 100 / 10;
    }

    private static int getHundreds(int number) {
        return number / 100;
    }

    private static int isEvenNumber(int number) {
        return number % 2 == 0 ? 1 : 0;
    }
}
