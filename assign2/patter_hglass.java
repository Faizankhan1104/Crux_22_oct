package assign2;

import java.util.Scanner;

public class patter_hglass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        int digit = 1;
        while (row<=2*n+1){
            int i = 1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            int val =star;
            int val1 = digit;
            while (j <= 2*star+1) {
                if (val<0){
                    System.out.print(val1+"1 ");
                }
                System.out.print(val+" ");
                if (star<0){
                    val++;
                    val1--;
                }else{
                    val--;
                    val1++;
                }
                j++;
            }
            if(row<=n){
                star--;
                space++;
                digit--;
            }else{
                star++;
                space--;
                digit++;
            }
            System.out.println();
            row++;
        }
    }

}
