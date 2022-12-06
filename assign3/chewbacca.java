package assign3;

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long rev =0;
        int pos=0;
        while (n > 0) {
            long rem = (int) n%10;
            long x = 9-rem;
            if (x<rem){
                rev = (long)(rev+x*Math.pow(10, pos));
            } else if (x>rem) {
                rev = (long)(rev+rem*Math.pow(10, pos));
                
            } else if (x==0) {
                
            }
            pos++;
            n/=10;
        }
        System.out.println(rev);
    }
}
