package assign3;

import java.util.Scanner;

public class boston {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (sumOfDigit(n) == boston(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public static int boston(int n){

        int sum=0;
        for (int i = 2; i <=n ; i++) {

            while (n%i == 0) {
                    sum = sum + sumOfDigit(i);
                    n /= i;
                }
        }
        return sum;
    }
    public static int sumOfDigit(int n){
        int sum1 = 0;
        while (n > 0) {
            int rem = n % 10;
            sum1 += rem;
            n /= 10;
        }
        return sum1;
    }
}