package assign2;

import java.util.Scanner;

public class pattern_mountain {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int row = 1;
            int star =1;
            int space =2*n-3;
            while (row<=n){
                int j=1;
                int val =1;
                while(j<=2*star-1){
                    System.out.print(val+" ");
                    if (star<n) {
                        val++;
                    }
                    else{
                        val--;
                    }
                    j++;
                }
                int k=1;
                while(k<=space){
                    System.out.print("  ");
                    k++;
                }
//                int i=1;
//                int val =star;
//                if (star == n){
//                    val=star-1;
//                    i=2;
//                }
//                while(i<=star){
//                    System.out.print(val+" ");
//                    val--;
//                    i++;
//                }
                if (star<=n){
                    star++;
                }else{
                    star--;
                }
                row++;
                space-=2;
                System.out.println();
            }
        }
    }

