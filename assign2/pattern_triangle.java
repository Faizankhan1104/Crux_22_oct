package assign2;

import java.util.Scanner;
public class pattern_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        int space = n-1;
        while (row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val =row;
            int digit =row;
            while(j<=star){
                System.out.print(val +" ");
                if (digit<star) {
                    val++;
                }else{
                    val--;
                }
                digit++;
                    j++;
            }

            System.out.println();
            row++;
            star+=2;
            space--;
        }
    }
}
