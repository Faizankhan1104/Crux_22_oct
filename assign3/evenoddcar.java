package assign3;

import java.util.Scanner;

public class evenoddcar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i > 0 ; i--) {
            int num = in.nextInt();
            int sum =0;
            int odd =0,even =0;
            while (n > 0) {
                int rem = n%10;
                sum+=rem;
                if (rem % 2 == 0) {
                    even=sum;
                }else {
                    odd=sum;
                }
                n/=10;
            }
            if(even% 4==0 || odd%3==0 ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
