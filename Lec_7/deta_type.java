package Lec_7;

import java.util.Scanner;

public class deta_type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, mul=1;
        while (n > 0) {
            int rem = n%8;
            sum = sum+mul*rem;
            n/=8;
            mul = mul*10;
        }
        System.out.println(sum);
    }
}
