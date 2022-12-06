package Lec_10;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        linear(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void linear(int [] arr ){
        for (int i = 0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
