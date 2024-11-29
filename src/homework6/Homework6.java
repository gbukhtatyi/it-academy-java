package homework6;

import util.Input;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Последовательности");
        exercise1();

        System.out.println("Задание 2. Нечетный индекс");
        exercise2();

        System.out.println("Задание 3. Возрастающая последовательность");
        exercise3();

        System.out.println("Задание 4. Четные и нечетные элементы");
        exercise4();

        System.out.println("Задание 5. Число X");
        exercise5();

        System.out.println("Задание 6. Четные элементы");
        exercise6();

        System.out.println("Задание 7. Положительные двузначные числа");
        exercise7();
    }

    /**
     * Продолжи последовательность:
     * 1. Определить закономерность, согласно которой формируется та или иная числовая последовательность.
     * 2. Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного
     * массива и выводит элементы массива на экран:
     * 1, -2,  3,  -4,   5,  -6…
     * 1,  0,  2,   0,   3,   0,  4....
     */
    public static void exercise1() {
        int n = Input.getNumberGreater("Введите ваше число N: ", 1);

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = (i + 1) * (i % 2 > 0 ? -1 : 1);
        }
        printArray("Первая последовательность:", arr1);

        int currentNumber = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr2[i] = currentNumber;
                currentNumber++;
            } else {
                arr2[i] = 0;
            }
        }
        printArray("Вторая последовательность:", arr2);
    }

    /**
     * Заменить каждый элемент массива с нечетным индексом на ноль
     */
    public static void exercise2() {
        int n = Input.getNumberGreater("Введите ваше число N: ", 1);

        int[] arr = generateArray(n, 1, 10);
        for (int i = 0; i < n; i++) {
            if (i % 2 > 0) {
                arr[i] = 0;
            }
        }

        printArray("Ответ:", arr);
    }

    /**
     * Является ли массив возрастающей последовательностью: создайте массив из 4 случайных целых чисел из
     * отрезка [10;99], выведите его на экран в строку. Далее определите и выведите на экран сообщение о том,
     * является ли массив строго возрастающей последовательностью.
     */
    public static void exercise3() {
        int[] arr = generateArray(4, 10, 99);
        printArray("Исходная последовательность:", arr);

        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i);
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Ответ: последовательность является строго возрастающей");
        } else {
            System.out.println("Ответ: последовательность не является строго возрастающей");
        }
    }

    /**
     * Напишите класс, который заполняет случайными двузначными числами массив, размер которого при инициализации
     * вводится с клавиатуры. После заполнения класс должен вывести на экран значения массива следующим образом:
     * в первой строке - значения из четных ячеек массива;
     * во второй строке - значения из нечетных ячеек массива.
     */
    public static void exercise4() {
        int n = Input.getNumberGreater("Введите ваше число N: ", 1);

        int[] arr = generateArray(n, 10, 99);
        printArray("Исходная последовательность:", arr);

        String evenNumbers = "";
        String oddNumbers = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers += arr[i] + " ";
            } else {
                oddNumbers += arr[i] + " ";
            }
        }

        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);
    }

    /**
     * Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
     * Метод проверяет, находится ли число Х в массиве
     */
    public static void exercise5() {
        int x = generateRandomInt(10, 99);
        System.out.println("X:" + x);

        int[] arr = generateArray(10, 10, 99);
        printArray("Исходная последовательность:", arr);

        if (indexOf(arr, x)) {
            System.out.println("Число X находится в массиве");
        } else {
            System.out.println("Число X не находится в массиве");
        }
    }

    /**
     * Поиск числа x в массиве arr
     *
     * @param arr
     * @param x
     * @return
     */
    public static boolean indexOf(int[] arr, int x) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     * Создать второй массив из четных элементов первого массива.
     * Условие задачи:
     * 1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
     * 2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
     * 3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
     * 4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
     */
    public static void exercise6() {
        int n = Input.getNumberGreater("Введите ваше число N: ", 4);

        int[] arr = generateArray(n, 1, 99);
        printArray("Исходная последовательность:", arr);

        int evenAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenAmount++;
            }
        }

        if (evenAmount == 0) {
            System.out.println("Данный масив не содержит Четные числа");
            return;
        }

        int currentIndex = 0;
        int[] evenNumbers = new int[evenAmount];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        printArray("Четные числа последовательность:", evenNumbers);
    }

    /**
     * Напишите метод, который получает в качестве параметра массив и заполняет его положительными случайными
     * двузначными числами так, чтобы первая и вторая половины массива были идентичными.
     */
    public static void exercise7() {
        int n = Input.getNumberGreater("Введите ваше число N: ", 1);

        int[] arr = fillMirrorArray(new int[n]);
        printArray("Ответ :", arr);
    }

    /**
     * Заполнит массив положительными случайными двузначными числами так,
     * чтобы первая и вторая половины массива были идентичными
     *
     * @param arr
     * @return
     */
    public static int[] fillMirrorArray(int[] arr) {
        int amountSteps = arr.length / 2;
        boolean isEven = arr.length % 2 == 0;

        int randomInt;
        for (int i = 0; i < amountSteps; i++) {
            randomInt = generateRandomInt(10, 99);
            arr[i] = randomInt;
            if (isEven) {
                arr[amountSteps + i] = randomInt;
            } else {
                arr[amountSteps + i + 1] = randomInt;
            }
        }

        if (arr.length % 2 > 0) {
            arr[amountSteps] = generateRandomInt(10, 99);
        }

        return arr;
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

    /**
     * @param n int
     * @return Массив длиной n со случайными числами от 0 до 100
     */
    public static int[] generateArray(int n, int min, int max) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = generateRandomInt(min, max);
        }
        return result;
    }

    /**
     * Ввыод одномерного массива
     *
     * @param message
     * @param arr
     */
    public static void printArray(String message, int[] arr) {
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
