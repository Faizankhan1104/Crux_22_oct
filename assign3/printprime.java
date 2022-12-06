package assign3;

import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
                int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            int fact =0;
            for (int j = 2; j < i; j++) {

                if (i % j==0) {
                    fact++;
                    break;
                }
            }
            if (fact == 0) {
                System.out.print(i+"\n");
            }
        }
            }
        }
