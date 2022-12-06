package lec_3;

import java.util.Scanner;

public class print_star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row = 1,star=n;
        while(row<=n) {
            int i =1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
