package lec4;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        while(row<=n){
            int i =1;
            while(i<=n){
                if (i==row || i+row==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
