package Lec_10;

public class Max_val {
    public static void main(String[] args) {

    int[] arr = {2, 3, 1, 4, 85, 15};
        System.out.println(linear(arr));
}
    public static int linear(int []arr ){
        int max = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
