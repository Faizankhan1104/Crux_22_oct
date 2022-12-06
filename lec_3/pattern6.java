package lec_3;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =0;
        int star = 1;
        int space = n-1;
        while(row<=n){
            int i =0;
            while(i<=space){
                System.out.print("  ");
                i++;

            }
            int j =1;
            while(j<=star){
                if (j%2==0){
                    System.out.print("! ");
                }else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;
        }
    }
}
