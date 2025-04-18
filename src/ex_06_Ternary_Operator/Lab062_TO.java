package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        // ? :
        int age = 10;
        String canIVote = 10 >= 18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote);


        int age2 = 19;
        String canIVote2 = age2 >= 18 ? "Yes you can vote" : "No, you can't vote";
        System.out.println(canIVote2);

    }
}
