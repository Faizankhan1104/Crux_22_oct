package Lec_10;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 6};
        int n = 4;
        System.out.println(linear(arr,n));
    }
    public static int linear(int []arr ,int n){
        for (int i = 0; i< arr.length; i++){
            if (arr[i]==n) {
                return i;
            }
        }
        return -1;
    }
}
