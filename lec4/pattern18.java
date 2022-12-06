package lec4;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        int space =n/2;
        while (row<=n){
            int i =1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j <= star) {
                System.out.print("* ");
               j++;
            } if (row<=n/2){
                space--;
                star+=2;
            }else{
                star-=2;
                space++;
            }
            System.out.println();
            row++;
        }
    }
}
