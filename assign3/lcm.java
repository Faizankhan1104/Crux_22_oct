package assign3;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int lcm = (a*b)/GCD(a,b);
        System.out.println(lcm);
    }


    public static int GCD(int divisor, int divident){

        while (divident % divisor != 0){
            int rem = divident%divisor;
            divident =divisor;
            divisor = rem;
        }
        return divisor;
    }
}
