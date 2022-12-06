import java.util.Scanner;

public class isArmstrong {
    public static boolean isArm(int n){
        int temp =n;
        int sum = 0;
        int c = (int)Math.log10(n)+1;
        while (n>0){
            int digit = n%10;
            sum+=(int)(Math.pow(digit, c));
            n/=10;
        }
        return sum == temp;

    }
//    public static int countdigit(int a ){
//        int sum =0;
//        while(a>0) {
//            sum++;
//            a/=10;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArm(n));
    }
}
