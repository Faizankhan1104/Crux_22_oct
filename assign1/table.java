package assign1;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; n*i <=m*n ; i++) {
            System.out.println(n*i);
        }
    }
}
