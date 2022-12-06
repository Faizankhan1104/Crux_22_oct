package assign2;

import java.util.Scanner;

public class hollow_rombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row = 1;
        int space =n-1;
        while (row<=n){
            int i =1;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            int j =1;
            while(j<=n){
                if(row==1|| row==n || j==1 || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            row++;
            space--;
        }
    }
}
