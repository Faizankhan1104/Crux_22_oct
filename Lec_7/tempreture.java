package Lec_7;

import java.util.Scanner;

public class tempreture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        int s = in.nextInt();
        int i=min;
        while (i<= max) {
           int c = (int) ((5.0/9)*(i-32));
            i+=s;
            System.out.println(i+"\t"+c);
        }
        System.out.println();
    }
}
