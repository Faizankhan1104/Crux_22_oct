package Lec1;

public class Grade {
    public static void main(String[] args) {
        int marks = 58;
        if(marks>=70){
            System.out.println("Grade A");
        }
        else if(marks<70 && marks>=60){
            System.out.println("Grade B");
        }
        else if(marks<60 && marks>=50){
            System.out.println("Grade C");
        }
        else if(marks<50 && marks>=40){
            System.out.println("Grade D");
        }
        else if(marks<40 && marks>=35){
            System.out.println("Grade E");
        }else{
            System.out.println("F");
        }
    }
}
