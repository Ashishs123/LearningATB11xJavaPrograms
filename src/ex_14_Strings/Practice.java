package ex_14_Strings;


public class Practice {

    public static void main(String[] args) {

//        String s1="Meena";
//        String s2 = "Meena";
//        System.out.println(s1==s2);
//
//        String s3= new String ("Meena");
//        String s4= new String("Meena");
//
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));
//        System.out.println(s3==s1);
//        System.out.println(s1.equals(s2));

        String s1= "Ashish";
        String s2="Shodhnani";
//        String s3 =s1+ " " + s2;
        System.out.println(s1+s2);
//        System.out.println(s3);

        System.out.println(s1.toLowerCase());

        StringBuilder sb= new StringBuilder("Balu");
        sb.setCharAt(0, 'P');
        System.out.println(sb);

    }


}
