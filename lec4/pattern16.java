package lec4;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = n;
        int space =n-1;
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
                space--;
                star--;

            }else{
                space++;
                star++;
            }

            row++;
            System.out.println();
        }
    }

}
