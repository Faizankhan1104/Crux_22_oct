package lec4;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
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
                star++;

            }else{
                space++;
                star--;
            }

            row++;
            System.out.println();
        }
    }
}
