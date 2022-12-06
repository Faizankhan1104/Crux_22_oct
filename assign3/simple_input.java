package assign3;

import java.util.Scanner;

public class simple_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        while (true) {
            int n = in.nextInt();
            sum+=n;
            if (sum<0){
                break;
            }
            System.out.println(n);
        }
    }
}
