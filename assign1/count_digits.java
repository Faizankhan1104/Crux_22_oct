package assign1;
import java.util.*;

public class count_digits {
        public static void main(String args[]) {
            Scanner in  = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int rem,  count = 0;
            while( a >0 ){
                rem = a%10;

               if (rem == b){
                   count++;
               }
               a/=10;

            }
            System.out.println(count);
        }
    }

