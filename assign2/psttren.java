package assign2;

import java.util.Scanner;

public class psttren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        int space = n;
        while (row<=n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
           int val = star;
            while (j <= star) {
                System.out.print(val+" ");
                j++;
                val--;
            }
            System.out.println();
            row++;
            star++;
            space--;

        }
    }
}