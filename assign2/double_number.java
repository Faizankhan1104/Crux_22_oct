package assign2;

import java.util.Scanner;

public class double_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row=1;
        int digit = 1;
        int space = n-1;
        int sp2 =-1;
        while(row<=n){
            int i = 1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            int val = digit;
            while (j <= digit) {
                System.out.print(val+" ");
                if (j<=digit){
                    val--;
                }else{
                    val++;
                }
                j++;
            }
            int l =1;
            while (l<=sp2){
                System.out.print("  ");
                l++;
            }
            int k =1;
            if (row == n|| row==1) {
                k=2;
            }
            int val2=1;
            while (k<=digit){
                System.out.print(val2+" ");
                val2++;
                k++;
            }
            if (row<=n/2){
                digit++;
                space-=2;
                sp2+=2;
            }else {
                digit--;
                space+=2;
                sp2-=2;
            }
            System.out.println();
            row++;
        }
    }
}
