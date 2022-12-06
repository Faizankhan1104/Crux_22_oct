package lec4;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = n/2+1;
        int space =-1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if (row == n|| row==1) {
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }

            if (row<=n/2){
                space+=2;
                star--;

            }else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
        }
    }
}
