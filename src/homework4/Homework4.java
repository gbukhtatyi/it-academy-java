package homework4;

import java.util.Scanner;

public class Homework4 {
    protected static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println("Задание 1. Вывод таблицы умножения");
        exercise1();

        System.out.println("Задание 2. Умножения");
        exercise2();

        System.out.println("Задание 3. Последовательность Фибоначчи");
        exercise3();

        System.out.println("Задание 4. Число положительное или отрицательное");
        exercise4();

        System.out.println("Задание 5. Счастливые билеты");
        exercise5();
    }

    /**
     * Напишите программу, которая выводит на консоль таблицу умножения
     */
    public static void exercise1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                printEquation(j, i);
            }
            System.out.println();
        }
        System.out.println();
    }

    protected static void printEquation(int x, int y) {
        System.out.printf("%-15s", (x + " * " + y + " = " + (x * y)));
    }

    /**
     * В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
     * После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
     * И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
     * то программа продолжает спрашивать у пользователя два числа и умножать их.
     */
    public static void exercise2() {
        int number_1, number_2, needExit;
        do {
            System.out.print("Введите ваше первое число: ");
            number_1 = sc.nextInt();
            System.out.print("Введите ваше второе число: ");
            number_2 = sc.nextInt();

            System.out.println("Результат их умножения: " + number_1 * number_2);

            System.out.print("Введите 1 для завершения работы, или любое другое число для продолжения: ");
            needExit = sc.nextInt();
        }
        while (needExit != 1);

        System.out.println();
    }

    /**
     * Последовательность Фибоначчи - последовательность целых чисел, построенная по следующему правилу:
     * каждый член последовательности, начиная с 3-го, равен сумме двух предыдущих. Напишите класс,
     * который получает с клавиатуры два первых члена последовательности и целое положительное число N.
     * Класс подсчитает и выведет на экран сумму первых N членов последовательности Фибоначчи
     */
    public static void exercise3() {
        int number_1, number_2, N, currentNumber, sum;

        System.out.print("Введите ваше первое число: ");
        number_1 = sc.nextInt();
        System.out.print("Введите ваше второе число: ");
        number_2 = sc.nextInt();
        System.out.print("Введите N число: ");
        N = sc.nextInt();

        System.out.println("Последовательность Фибоначчи: ");
        System.out.print(number_1 + " ");
        System.out.print(number_2 + " ");

        sum = number_1 + number_2;
        for (int i = 1; i <= N - 2; i++) {
            currentNumber = number_1 + number_2;
            System.out.print(currentNumber + " ");

            sum += currentNumber;

            number_1 = number_2;
            number_2 = currentNumber;
        }
        System.out.println("\nСумма чисел равна: " + sum);

        System.out.println();
    }

    /**
     * Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 0.
     * Для каждого введенного с клавиатуры положительного числа класс должен выводить на экран текст “Плюс”,
     * для каждого отрицательного - “Минус”.
     */
    public static void exercise4() {
        int answer;
        System.out.println("Введите 0 для завершения работы или любое другое число для проверки.");
        do {
            System.out.print("Введите ваше число: ");
            answer = sc.nextInt();
            if (answer > 0) {
                System.out.println("Плюс");
            } else if (answer < 0) {
                System.out.println("Минус");
            } else {
                System.out.println("Завершение работы.");
            }
        }
        while (answer != 0);

        System.out.println();
    }

    /**
     * В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо
     * заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик
     * у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами
     * 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь
     * раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном
     * рулоне?
     */
    public static void exercise5() {
        int total = 0;
        for (int i = 1; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10;
            int number4 = (i / 100) % 10;
            int number5 = (i / 10) % 10;
            int number6 = i % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                total++;
            }
        }
        System.out.println("Колличество счастливых билетов: " + total);

        System.out.println();
    }
}
