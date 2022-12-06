package lec_5;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divisor = in.nextInt();
        int divident = in.nextInt();

        while (divident % divisor != 0){
            int rem = divident%divisor;
            divident =divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
