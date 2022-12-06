package Lec_2;
import java.util.Scanner;

public class Check_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=2;
        int fact =0;
        while (i<n){
            if (n%i ==0){
            fact++;
                break;
            }
            i++;
        }
        if (fact>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }

    }
}
