package assign3;

import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumodd =0,sumeven=0,pos =1;
        while (n > 0) {
            int rem = n%10;
            if (pos%2!=0){
                sumodd = sumodd+rem;
            }else{
                sumeven+=rem;
            }
            pos++;
            n/=10;
        }
        System.out.println(sumodd);
        System.out.println(sumeven);
    }
}
