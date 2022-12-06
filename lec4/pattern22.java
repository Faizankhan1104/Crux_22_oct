package lec4;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row = 1;
        int star = 1;
        int space = n/2;

        while (row<=n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <=star) {
                System.out.print("* ");
                System.out.print("  ");
                j++;
            }

            int l = 1;
            while(l<=star){
                System.out.print("  ");
                System.out.print("* ");
                l++;
            }
            if(row<= n/2){
                star++;
                space--;
            }else{
                star--;
                space++;
            }

            System.out.println();
            row++;
        }

    }
}
