package ex_16_Arrays;

public class Sum_of_Arrays_For_Each {
    public static void main(String[] args) {
        int [] arr = { 23, 12, 13};

        int sum = 0;

//        for( int i=0;i<arr.length;i++)
//            sum = sum+ arr[i];
//
//        System.out.println(sum);

        for(int n : arr)
        {
            sum =sum+n;
        }
        System.out.println("sum of arr numbers is : " +sum);
    }

}
