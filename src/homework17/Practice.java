package homework17;

import java.io.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("resources/prac.txt")) {
            int i = 0;
            while (i < 30) {
                fileWriter.write(String.valueOf(generateRandomInt(0, 100)));
                fileWriter.append("\n");
                i++;
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        int avg = 0;
        float count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/prac.txt"));) {
            String line;
            while ((line = reader.readLine()) != null) {
                avg += Integer.valueOf(line);
                count++;
                System.out.println("Число: " + line);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.printf("Резальтат %.2f", (avg / count));

//        try (FileReader fileReader = new FileReader("resources/practise.txt")) {
//            int charCode;
//            while ((charCode = fileReader.read()) != -1) {
//                System.out.print((char) charCode);
//            }
//        } catch (IOException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader("resources/practise.txt"));) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//
//        try (Scanner scanner = new Scanner(new File("resources/practise.txt"))) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
//
//        try (FileWriter fileWriter = new FileWriter("resources/practise-w.txt")){
//            fileWriter.write("Test");
//            fileWriter.append("\n");
//            fileWriter.append("\n");
//        } catch (IOException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
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
