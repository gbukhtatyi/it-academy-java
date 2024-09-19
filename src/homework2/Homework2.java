package homework2;

public class Homework2 {
    public static void main(String[] args) {
        Homework2.exercise1(3, 5);
        Homework2.divider();

        Homework2.exercise2();
        Homework2.divider();

        Homework2.exercise3(123);
        Homework2.divider();

        Homework2.exercise4(12345);
        Homework2.divider();

        Homework2.exercise5(1234);
        Homework2.divider();

        Homework2.exercise6(7.5);
        Homework2.divider();

        Homework2.exercise7(1, 2, 3, 4, 7);
        Homework2.divider();
    }

    /**
     * Вывод разделителя между задачами
     */
    protected static void divider() {
        System.out.println("=========================");
    }

    /**
     * Найти сумму и произведения двух чисел
     */
    protected static void exercise1(int a, int b) {
        System.out.println("Задание 1");
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);

        System.out.println("Сумма " + (a + b));
        System.out.println("Произведение " + (a * b));
    }

    /**
     * Вычислить 20 + -3 * 5 / 8
     */
    protected static void exercise2() {
        System.out.println("Задание 2");

        double result;
        result = 20 + (-3 * 5 / 8.0);

        System.out.println("Результат: " + result);
    }

    /**
     * Вывести последнию цифру числа
     */
    protected static void exercise3(int n) {
        System.out.println("Задание 3");
        System.out.println("Число: " + n);

        System.out.println("Результат: " + (n % 10));
    }

    /**
     * Вывести 3юю цифру 5 значного числа
     */
    protected static void exercise4(int n) {
        System.out.println("Задание 4");
        System.out.println("Число: " + n);

        String s = String.valueOf(n);

        System.out.println("Результат: " + s.charAt(2));
    }

    /**
     * Найти сумму цифр ab + cd числа abcd
     */
    protected static void exercise5(int n) {
        System.out.println("Задание 5");
        System.out.println("Число: " + n);

        String s = String.valueOf(n);

        int ab, cd;
        ab = Integer.valueOf(Character.toString(s.charAt(0)) + Character.toString(s.charAt(1)));
        cd = Integer.valueOf(Character.toString(s.charAt(2)) + Character.toString(s.charAt(3)));

        System.out.println("Результат: " + (ab + cd));
    }

    /**
     * Найти площадь и переммитр круга r = 7.5
     */
    protected static void exercise6(double r) {
        System.out.println("Задание 6");
        System.out.println("Радиус: " + r);

        System.out.println("Площадь: " + (Math.PI * r * r));
        System.out.println("Периметр: " + (2 * Math.PI * r));
    }

    /**
     * Найти средние арифмитеческое пяти чисел
     */
    protected static void exercise7(int a, int b, int c, int d, int e) {
        System.out.println("Задание 7");

        double result = (double) (a + b + c + d + e) / 5;

        System.out.println("Результат: " + result);
    }
}
