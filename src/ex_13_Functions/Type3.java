package ex_13_Functions;

public class Type3 {

    public static void main(String[] args) {
        //  3. With Parameters and Without Return Type ( 90%)
       Call_Type3("Ashish", 31, 100);
       Call_Type3_Diff("Meru",25);
    }

    private static void Call_Type3_Diff(String name, int age) {
        System.out.println("Your name is "+name+ "\n"+"Your age is " +age );
    }

    private static void Call_Type3(String name, int age, int salary) {
        System.out.println("Your name is " +name+ "\n" + "Your age is " +age+ "\n" + "Your salary is " +salary);
    }

}
