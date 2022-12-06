package assign3;

import java.util.Scanner;

public class shoping_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int M = in.nextInt();
            int N = in.nextInt();
            int Harshit =0;
            int Aayush =0;
            int cur =1;
            while (true){
                Aayush+=cur;
                if (Aayush>M) {
                    System.out.println("Harshit");
                    break;
                }
                cur++;
                Harshit+=cur;
                if (Harshit>N ){
                    System.out.println("Aayush");
                    break;
                }
                cur++;

            }


        }
    }
}
