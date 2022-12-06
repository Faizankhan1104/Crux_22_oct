package assign2;

import java.util.Scanner;

public class invert_glass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =1;
        int star = 1;
        int space = 2*n-1;
        int digit =n;
        while (row<=2*n+1){
            int i =1;
            int val =n;
            while(i<=star){
                System.out.print(val+" ");
                val--;
                i++;
            }
            int j =1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            int val1 =digit;
            if (digit==0 || row==n+1) {
                val1 = 1;
                k=2;
            }
            while (k <= star) {
                System.out.print(val1+" ");
                val1++;
                k++;
            }
            if(row<=n){
                star++;
                space-=2;
                digit--;
            }else{
                star--;
                space+=2;
                digit++;
            }
            System.out.println();
            row++;
        }

    }
}
