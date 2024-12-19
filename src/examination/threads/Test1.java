package examination.threads;

public class Test1 extends Thread {
    public void go() {
        System.out.println("Go!");
    }

    public void run() {
        System.out.println("Run!");
    }

    public void begin() {
        System.out.println("Begin!");
    }

    public void execute() {
        System.out.println("Execute!");
    }

    public static void main(String[] args) {
        Test1 thread = new Test1();
        thread.start();
    }
}
