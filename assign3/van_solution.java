package assign3;

import java.util.Scanner;

public class van_solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            int a = in.nextInt();
            System.out.println(bintodc(a));
        }
    }
        public static int bintodc(int n){
            int sum = 0, mul=1;
            while (n > 0) {
                int rem = n%10;
                sum = sum+mul*rem;
                n/=10;
                mul = mul*2;
            }
            return sum;
    }
}
