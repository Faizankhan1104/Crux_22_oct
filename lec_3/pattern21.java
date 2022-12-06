package lec_3;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        int space =2*n-3;
        while(row<=n){
            int j =1;
            while (j<=row){
                System.out.print("* ");
                j++;
            }
            int k =1;
            while (k<=space){
                System.out.print("  ");
                k++;
            }
            int i=1;
            if (row ==n){
                i =2;
            }
            while(i<=row){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            row++;
            star++;
            space-=2;
        }
    }
}
