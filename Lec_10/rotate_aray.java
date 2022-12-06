package Lec_10;

public class rotate_aray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        rotate(arr,3);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int [] arr,int n){
        n=n%arr.length;
        while (n > 0) {
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j] = arr[j + 1];
                if (j == arr.length - 1) {
                    arr[j] = arr[arr.length - 1];
                }

            }
        }
    }
}
