package Lec1;

public class Max_num {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 20;
        if (a>b && a>c){
            System.out.println("A is greater");
        } else if (b>a && b>c) {
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}
