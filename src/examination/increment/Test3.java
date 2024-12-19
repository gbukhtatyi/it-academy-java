package examination.increment;

public class Test3 {
    static int a, b;

    public static void main(String[] args) {
        if (!(++a == 0 && ++b == 0)) {
            System.out.print("true a+b=");
        } else {
            System.out.print("false a+b=");
        }
        System.out.print(a + b);
    }
}
