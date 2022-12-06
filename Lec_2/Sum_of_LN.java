package Lec_2;

import java.util.Scanner;

public class Sum_of_LN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
