package examination.staticexp;

import examination.Test;

public class Test1 {
    static {
        System.out.println("Шаг 1");
    }

    public Test1() {
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
