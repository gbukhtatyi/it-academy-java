package homework22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practise2 {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(10)){
            executor.execute(() -> System.out.println("1"));
            executor.execute(() -> System.out.println("3"));
        }
        finally {
            System.out.println("Done");
        }
    }
}
