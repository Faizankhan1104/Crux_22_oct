package assign2;

import java.util.Scanner;

public class pattern_rombus {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int row =1;
    int star = 1;
    int space = n-1;
    int digit = 1;
    while (row<=2*n){
        int i = 1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        int j = 1;
        int val =digit;
        while(j<=star){
            System.out.print(val +" ");
            if (j<=star/2) {
                val++;
            }else{
                val--;
            }
            j++;
        }
        if(row<n){
            star+=2;
            space--;
            digit++;
        }else{
            star-=2;
            space++;
            digit--;
        }

        System.out.println();
        row++;
       }
    }
}
