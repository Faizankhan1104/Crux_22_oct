package assign3;

import java.util.Scanner;

public class anytoany {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int source = in.nextInt();
        int destination = in.nextInt();
        int o = in.nextInt();
        int anytodc = bintodc(o,source);
        System.out.println(anytoany(anytodc,destination));
    }
    public static int anytoany(int des,int sec){
        int sum = 0, mul=1;
        while (des > 0) {
            int rem = des%sec;
            sum = sum+mul*rem;
            des/=sec;
            mul = mul*10;
        }
        return sum;
    }

      public static int bintodc(int n ,int source){
        int sum = 0, mul=1;
        while (n > 0) {
            int rem = n%10;
            sum = sum+mul*rem;
            n/=10;
            mul = mul*source;
        }
        return sum;
    }
}
