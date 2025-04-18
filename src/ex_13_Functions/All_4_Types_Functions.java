package ex_13_Functions;

public class All_4_Types_Functions {
    public static void main(String[] args) {
        //Type 1 Calling -Without parameter and without return type
        Call_type1();

        //Type 2 Calling -Without parameter and with return type
        String msg = Call_type2();
        System.out.println(msg);

        //Type 3 calling - With parameter and without return type (90%)
        Call_type3("Hello", 123, 45);

        //Type 4 calling - With parameter and with return type String
        String msg_type4 = Call_type4_string("Ashish", 31);
        System.out.println(msg_type4);

        //Type 4 calling - With parameter and with return type Integer
        int sum_type4 = Call_type4_integer(12, 31);
        System.out.println(sum_type4);

    }




    //Type 1 Method declaration- Without parameter and without return type
    static void Call_type1()
    {
        System.out.println("--------");
        System.out.println("Method is type 1");
    }

    //Type 2 Method declaration- Without parameter and with return type
    static String Call_type2()
    {
        System.out.println("--------");
        System.out.println("Method is type 2");
        return "Returning string from type 2";
    }

    static void Call_type3(String name, int age, int salary)
    {
        System.out.println("--------");
        System.out.println("Method is Type 3");
        System.out.println("Your name is "+name+ "\n" + "Your age is " +age+ "\n" + "Your salary is "  +salary );
    }

    static String Call_type4_string(String name, int age)
    {
        System.out.println("--------");
        System.out.println("Method is Type 4 : Return type is String");
        System.out.println("Your name is "+name+ "\n" + "Your age is " +age);
        return "Returning string from type 4";
    }

    static int Call_type4_integer (int a, int b)
    {
        System.out.println("--------");
        System.out.println("Method is Type 4 : Return type is integer");
        return a+b;
    }

}
