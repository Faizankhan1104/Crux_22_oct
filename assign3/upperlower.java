package assign3;

import java.util.Scanner;

public class upperlower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if (ch <= 'Z' && ch >= 'A') {
            System.out.println("UPPERCASE");
        } else if (ch<= 'z'&& ch>= 'a') {
            System.out.println("lowercase");
        }else {
            System.out.println("Invalid");
        }
    }
}
