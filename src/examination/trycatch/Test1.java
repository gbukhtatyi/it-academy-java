package examination.trycatch;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try catch");
        } catch (Exception e){

        // } catch (IOException e){ // This is error

        }

        try {
            System.out.println("Inside try catch");
        }
        // System.out.println("This is error");
        catch (Exception e){
        }


//        try {
//            System.out.println("Inside try catch");
//        }
//        catch (IOException e){ // This is error
//
//        }

        try {
            System.out.println("Inside try catch");
        }
        catch (Exception e){ // This is error

        }

    }
}
