package lec4;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = n;
        int space =1;
        while(row<=2*n-1){
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            if (row<n){
                space+=2;
                star--;

            }else{
                space-=2;
                star++;
            }

            row++;
            System.out.println();
        }
    }
}
