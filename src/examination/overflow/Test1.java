package examination.overflow;

public class Test1 {
    public static void main(String[] args) {
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMaxValue);
        System.out.println(++intMaxValue);

        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println(byteMaxValue);
        System.out.println(++byteMaxValue);
    }
}
