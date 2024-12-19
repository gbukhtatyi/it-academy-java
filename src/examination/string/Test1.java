package examination.string;

public class Test1 {
    public static void main(String[] args) {
        Integer i = new Integer("10");

        System.out.println(i.toString());
        System.out.println(i.toString());
        System.out.println(i.toString() == i.toString());
        System.out.println(i.toString().equals(i.toString()));

        if (i.toString() == i.toString()){
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
    }
}
