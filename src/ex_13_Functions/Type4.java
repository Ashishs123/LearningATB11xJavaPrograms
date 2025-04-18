package ex_13_Functions;

public class Type4 {

    public static void main(String[] args) {
        //with parameter and with return type

        String msg =method4("Ashish", 100);
        System.out.println(msg);




    }

    private static String method4(String name, int salary) {
        System.out.println("Your name is " +name+ "\n" + "Your salary is " +salary );
        return "Hello";
    }
}
