package homework22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practise {

    /**
     * Напишите программу, которая асинхронно генерирует N случайных чисел и выводит их на экран.
     *
     * @param args
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 100000;

        List<CompletableFuture<Integer>> numbersFutures = new ArrayList<>(n);

        long time1 = System.currentTimeMillis();
        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < n; i++) {
                executor.execute(() -> System.out.println(
                        generateRandomInt(0, 100))
                );
            }
        }

        time1 = System.currentTimeMillis() - time1;
        long time2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> generateRandomInt(0, 100));

            numbersFutures.add(integerCompletableFuture);
        }

        for (int i = 0; i < n; i++) {
            CompletableFuture<Integer> integerCompletableFuture = numbersFutures.get(i);
            System.out.println(
                    i + ": " + integerCompletableFuture.get()
            );
        }
        time2 = System.currentTimeMillis() - time2;

        System.out.println("Time: " + time1);
        System.out.println("Time: " + time2);
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
