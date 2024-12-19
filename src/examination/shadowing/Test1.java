package examination.shadowing;

public class Test1 {
    private int anInt = 4;

    public Test1() {
        anInt = 5;
    }

    public void print(int anInt) {
        System.out.println(anInt);
    }

    public static void main(String[] args) {
        Test1 main = new Test1();
        int anInt = 6;
        main.print(anInt);
    }
}
