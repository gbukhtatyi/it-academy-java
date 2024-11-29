package util;

import java.util.Scanner;

public class Input {
    protected static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }

    /**
     * Запросит число c сообщением text
     *
     * @param text
     * @return
     */
    public static int getNumber(String text) {
        System.out.print(text);

        return getScanner().nextInt();
    }

    /**
     * Запросит строку c сообщением text
     *
     * @param text
     * @return
     */
    public static String getText(String text) {
        System.out.print(text);

        return getScanner().next();
    }

    /**
     * Запросит число c сообщением text которое должно быть больше или равно min
     *
     * @param text
     * @param min
     * @return
     */
    public static int getNumberGreater(String text, int min) {
        int n;

        do {
            n = Input.getNumber(text);
            if (n < min) {
                System.out.println("Ошибка. Число должно быть больше или равно " + min + "!");
            }
        } while (n < min);

        return n;
    }
}
