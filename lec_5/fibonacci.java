package lec_5;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0,b=1,i=1;

        while (i<=n){
            int c = a+b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(a);
    }
}
