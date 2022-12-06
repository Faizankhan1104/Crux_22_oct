package assign3;

import java.util.Scanner;

public class replaceall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum =0l;
        long pos =0l;
        if (n == 0) {
            sum =5;
        }
        while (n > 0) {
            long rem = n%10;
            if (rem == 0)
                rem =5;

            sum = (long)(sum+rem*Math.pow(10, pos));
            pos++;
            n/=10;
        }
        System.out.println(sum);
    }
}
