package examination.staticexp;

public class Test2 {
    {
        System.out.print("1 ");
    }

    Test2() {
        System.out.print("2 ");
    }

    public static void main(String[] args) {
        System.out.print("3 ");
        examination.staticexp.Test2 example = new examination.staticexp.Test2();
        System.out.print("4 ");
    }

    static {
        System.out.print("5 ");
    }
}
