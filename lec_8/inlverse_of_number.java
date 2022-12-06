package lec_8;

import java.util.Scanner;

public class inlverse_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum =0,pos =1;
        while (n > 0) {
            long rem = n%10;
            sum = (long)(sum+pos*Math.pow(10, rem-1));
            pos++;
            n/=10;
        }
        System.out.println(sum);
    }
}
