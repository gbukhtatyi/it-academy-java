package examination;

public class Test {
    static {
        System.out.println("Шаг 1");
    }

    public Test() {
        System.out.println("Шаг 4");
    }

    static {
        System.out.println("Шаг 2");
    }

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println("Шаг 5");
    }

    static {
        System.out.println("Шаг 3");
    }
}