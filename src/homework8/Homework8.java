package homework8;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("Man info");
        System.out.println("==================");
        Man man = new Man("Ivan", 30, Man.GENDER_MAN, 85.5f);
        man.printInfo();

        System.out.println("\nStudent info");
        System.out.println("==================");
        Student student = new Student("Ivan", 21, Man.GENDER_MAN, 75.5f, 3);
        student.printInfo();

        System.out.println("\nIncresed studying year");
        System.out.println("==================");
        student.increaseStudyingYear();
        student.printInfo();
    }
}
