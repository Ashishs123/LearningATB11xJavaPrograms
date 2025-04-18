package ex_16_Arrays;

public class Max_Min_Practice {

    public static void main(String[] args) {

        int[] arr = {3, 4, 6, 13, 13, 7, 8,3, 10, 5};
        int max = max_arr(arr);
        System.out.println(max);

        int min = min_arr(arr);
        System.out.println(min);
    }


    private static int max_arr(int[] arr) {
        int max = arr[0];
for(int i=0;i<arr.length;i++) {
    if (arr[i]>max)
   max= arr[i];
}
return max;
}

    private static int min_arr(int[] arr) {
        int min =arr[0];
        for(int i=0;i<arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    }
