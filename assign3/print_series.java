package assign3;

import java.util.Scanner;

public class print_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int j =1;
        for (int i = 1; i <=n ;i++ ) {

            if ((3 * j + 2) % m == 0) {
                j++;
            }
            System.out.print((3 * j + 2)+"\n");
            j++;
        }
    }
}
