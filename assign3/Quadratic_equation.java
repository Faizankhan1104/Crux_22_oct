package assign3;

import java.util.Scanner;

public class Quadratic_equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d = (b*b)-(4*a*c);
        int r1 = (int) (-b+Math.sqrt(d))/(2*a);
        int r2 = (int)(-b-Math.sqrt(d))/(2*a);
        int first ;
        int sec;
        if (r1>r2){
            first = r2;
            sec = r1;
        }else{
            first = r1;
            sec = r2;
        }
        if (d>0){
            System.out.println("Real and Distinct");
            System.out.println(first+" "+ sec);
        } else if (d==0){
            System.out.println("Real and Equal");
            System.out.println(first+" "+ sec);
        }else {
            System.out.println("Imaginary");
        }
    }
}
