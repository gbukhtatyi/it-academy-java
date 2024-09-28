package Util;

import java.util.Scanner;

public class Input {

    /**
     * Запросит число c сообщением text
     *
     * @param text
     * @return
     */
    public static int getNumber(String text) {
        System.out.print(text);
        return new Scanner(System.in)
                .nextInt();
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
