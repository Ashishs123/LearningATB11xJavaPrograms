package ex_13_Functions;

public class Test {

    public static void main(String[] args) {
        int n= return_integer();
        System.out.println(n);

        boolean result = return_boolean_test ();
        System.out.println(result);


    }

    private static boolean return_boolean_test() {
        return(true);
    }

    static int return_integer() {
        return 10;
    }
}
