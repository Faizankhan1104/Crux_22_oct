package lec4;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        while(row<=n){
            int i =1;
            while(i<=n){
                if (i==1||i==n || row==1||row==n){
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
