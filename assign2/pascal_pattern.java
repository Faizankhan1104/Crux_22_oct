package assign2;

import java.util.Scanner;
public class pascal_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int row =0;
        int star =1;
        while (row<n){
            int i =0;
            int val = 1;
            while (i<star){
                System.out.print(val+" ");
                val = ((row-i)*val/(i+1));
                i++;
            }
            System.out.println();
            row++;
            star++;
        }
    }
}
