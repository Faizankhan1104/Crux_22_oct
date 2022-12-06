package Lec_10;

public class array2demo {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 1};
        int [] arr2 = {20, 13, 4, 19};
        System.out.println(arr[0]+" "+arr2[0]);
        swap(arr, arr2);
        System.out.println(arr[0]+" "+arr2[1]);

    }
    private static void swap(int[] arr, int[] arr2) {
        int [] temp = arr;
        arr = arr2;
        arr2 = temp;
    }

}
